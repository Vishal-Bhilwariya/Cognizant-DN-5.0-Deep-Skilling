/*

    # Before We Start
     - Until now, our REST APIs returned only data.
        Example:
            {
                "id":101,
                "name":"Vishal",
                "email":"v@gmail.com"
            }

        Suppose the client now wants to:
            Update Employee
            Delete Employee
            View All Employees

        Question: How does the client know which API to call next?

        Usually, the developer reads API documentation.
        HATEOAS removes this dependency.
        The server itself tells the client: "Here are the next actions you can perform."

        This is the core idea of HATEOAS.

    # Understanding HATEOAS
     HATEOAS stands for: Hypermedia As The Engine Of Application State

     It is a REST architectural principle where the server includes hyperlinks (links) inside the response so that clients can discover available actions dynamically.
     Instead of sending only data, the server sends:
        Data
        Related Links
        Possible Next Actions

    Imagine visiting an e-commerce website.
    After viewing a product, the page automatically shows:
        Add to Cart
        Buy Now
        Similar Products
        Reviews

        The website guides your next action.
        HATEOAS works exactly the same way.

    # Why do we need HATEOAS?
     Without HATEOAS:
        Client must know
            GET /employees
            GET /employees/101
            PUT /employees/101
            DELETE /employees/101

        These URLs are usually hardcoded.

        If an endpoint changes,
                ↓
        Client application breaks.

     With HATEOAS
        Server returns
            {
               "id":101,
               "name":"Vishal",
               "_links":{
                  "self":"/employees/101",
                  "update":"/employees/101",
                  "delete":"/employees/101",
                  "allEmployees":"/employees"
               }
            }

        Client simply follows the links.

    Why is it called "Engine of Application State"?
    - The state of the client changes based on the links received from the server.

     Example
        Login
          ↓
        Dashboard
          ↓
        Employee List
          ↓
        Employee Details
          ↓
        Update Employee
          ↓
        Delete Employee

     At every step, the server tells the client what can be done next.

     Therefore, Hypermedia drives the application state.

    # Real-Life Analogy
     Imagine entering a shopping mall.
        Near the entrance you see
            ← Food Court
            → Parking
            ↑ Cinema
            ↓ Exit

        You don't ask someone where to go.
        The mall provides navigation.
        HATEOAS provides navigation inside APIs.

    # Traditional REST vs HATEOAS :
    Traditional REST
        Client knows all URLs in advance.
        Server sends only data.
        No dynamic discovery.
        Harder to evolve APIs.

        Response :  {
                       "id":101,
                       "name":"Vishal"
                    }
    HATEOAS
        Client discovers URLs dynamically.
        Server sends data + links.
        Easy API evolution.
        More self-documenting.

        Response : {
                   "id":101,
                   "name":"Vishal",
                   "_links":{
                      "self":"/employees/101",
                      "update":"/employees/101",
                      "delete":"/employees/101",
                      "allEmployees":"/employees"
                   }
                }

    # Hypermedia -> Hypermedia means: Data + Links + Actions

    Instead of only
     Employee Data
        we return
            Employee Data
                +
            Links
                +
        Possible Operations

    # Hypermedia Components
        Component	        Purpose
        Resource	        Actual Data
        Link	            URL
        Relation (rel)	    Meaning of Link
        HTTP                Method	Action
        Representation	    JSON/XML
        
    # Common Link Relations (rel)
        Relation	    Meaning
        self	        Current Resource
        next	        Next Resource
        prev	        Previous Resource
        update	        Update Resource
        delete	        Delete Resource
        collection	    Entire Collection

    # Spring HATEOAS
     Spring Boot provides a separate library: Spring HATEOAS

     It helps generate hyperlinks automatically.

     o Main Classes
        Class	                    Purpose
        EntityModel<T>	            Wraps one resource with links
        CollectionModel<T>	        Wraps multiple resources
        RepresentationModel<T>	    Base model for hypermedia
        Link	                    Represents a hyperlink
        
     o Syntax
        EntityModel -> EntityModel<Employee>
        
     o Syntax Table
        Name	                Description	              Purpose               	Example
        EntityModel	        Single resource wrapper	    Add links	            EntityModel<Employee>
        CollectionModel	    Collection wrapper	        Add links to list	    CollectionModel<Employee>
        Link                Hyperlink object    	    Navigation	            Link.of()

     o Example :
        @RestController
        public class EmployeeController {
            @GetMapping("/employees/{id}")
            public EntityModel<Employee> getEmployee(@PathVariable Long id){

                Employee employee = new Employee(id,"Vishal");

                // Wrap employee inside EntityModel
                EntityModel<Employee> model = EntityModel.of(employee);

                return model;
            }
        }

     o Adding Links
        @RestController
        public class EmployeeController {
            @GetMapping("/employees/{id}")
            public EntityModel<Employee> getEmployee(@PathVariable Long id){

                Employee employee = new Employee(id, "Vishal");

                // Wrap employee inside EntityModel
                EntityModel<Employee> model = EntityModel.of(employee);

                // Add custom links
                model.add(Link.of("/employees/" + id).withSelfRel());
                model.add(Link.of("/employees").withRel("allEmployees"));

                return model;
            }
        }

    # Building Hypermedia-Driven APIs:
    - A Hypermedia API is an API where responses contain enough links for clients to continue interacting with the application without hardcoding endpoint URLs.

    Consuming Hypermedia APIs :
    - A client consumes a HATEOAS API by reading the links from the response instead of constructing URLs manually.

    Example
     Server Response
        {
            "id":101,
            "_links":{
            "update":{
            "href":"/employees/101"
            }
        }

     Client reads
        update
          ↓
        Uses

        PUT /employees/101
        without hardcoding the URL.

    Advantages
        Self-discoverable APIs.
        Reduced dependency on documentation.
        Easier API evolution.
        Better client-server decoupling.
        Dynamic navigation.
        Supports REST maturity level 3 (Richardson Maturity Model).
        
    Disadvantages
        Larger response size.
        More complex implementation.
        Not required for every REST API.
        Many public APIs choose simpler REST without HATEOAS.
*/