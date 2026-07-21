/*

    # Before We Start
        In Spring MVC, we learned that a Controller receives user requests and returns a View (JSP, Thymeleaf).
        In Spring REST, the Controller receives requests but returns data (JSON/XML) instead of a webpage.

        This is the biggest conceptual difference.

    # Creating a Basic REST Controller:
    - A REST Controller is a Java class that handles HTTP requests and returns data (usually JSON) directly to the client.
    - Spring provides the @RestController annotation for this purpose.

    Imagine your application is a restaurant.
        Customer → Client
        Waiter → REST Controller
        Chef → Service Layer
        Kitchen → Database

     The waiter accepts the order and returns the food.

    Similarly, The REST Controller:
        Receives requests
        Calls business logic
        Returns data

    # Why do we need a REST Controller?
     Without a controller:
        Client doesn't know where to send requests.
        Spring cannot identify request handlers.
        No communication between client and server.

        The controller acts as the entry point of every REST API.

    # Important Annotation
        @RestController

     This annotation combines:
        @Controller + @ResponseBody

     Meaning:
        This class is a controller.
        Every method returns data directly.

     Instead of View , it returns JSON

    # Syntax
        @RestController
        public class EmployeeController{

        }
        
     Syntax Breakdown
        Name	               Description	                     Purpose	                    Example
        @RestController	    Marks class as REST Controller	Handles REST requests	        @RestController
        class	            Creates Java class	            Controller class	            class EmployeeController
        public	            Accessible everywhere	        Spring can access controller	public class

    # REST Controller vs Normal Controller
        Controller	         RestController
        Returns View	    Returns JSON/XML
        Used for Web Pages	Used for APIs
        Uses View Resolver	Doesn't use View Resolver
        JSP/Thymeleaf	    React/Flutter/Angular/Mobile

    # Defining Request Mappings :
    A Request Mapping tells Spring: "When this URL is requested, execute this Java method."
        It maps
            URL
             ↓
        Java Method

    Why do we need Request Mapping?
     - Suppose your application has
        Employees
        Students
        Products
        Orders

     - Spring must know which method should execute.
     - Request Mapping performs this routing.

    # Types of Request Mapping
        Annotation	        Purpose
        @RequestMapping	Generic Mapping
        @GetMapping	    GET Request
        @PostMapping	POST Request
        @PutMapping	    PUT Request
        @DeleteMapping	DELETE Request
        @PatchMapping	PATCH Request

    # @RequestMapping
        Used at
            Class Level
            Method Level
        Example
            @RestController

            @RequestMapping("/employees")
            public class EmployeeController{

            }

        Every endpoint now starts with /employees

    # Handling HTTP Methods :
    1) GET Request -> Used to retrieve data. 
                        @GetMapping
        Example
            @RestController
            public class EmployeeController {
                // Executes when GET /employees is called
                @GetMapping("/employees")
                public String getEmployees(){
                    // Returns data to client
                    return "Employee List";
                }
            }

    2) POST Request -> Used to create new data.
                        @PostMapping
        Example
            @RestController
            public class EmployeeController {
                // Executes when POST /employees is called
                @PostMapping("/employees")
                public String createEmployee(){
                    // Creates new employee
                    return "Employee Created";
                }
            }

    3) PUT Request -> Used to update entire resource.
                        @PutMapping
        Example
            @RestController
            public class EmployeeController {
                // Executes when PUT /employees is called
                @PutMapping("/employees")
                public String updateEmployee(){
                    // Updates employee
                    return "Employee Updated";
                }
            }

    4) DELETE Request -> Used to delete data.
                        @DeleteMapping
        Example
            @RestController
            public class EmployeeController {
                // Executes when DELETE /employees is called
                @DeleteMapping("/employees")
                public String deleteEmployee(){
                    // Deletes employee
                    return "Employee Deleted";
                }
            }

    5) PATCH Request -> Used to partially update data.
                        @PatchMapping
        Example
            @RestController
            public class EmployeeController {
                // Executes when PATCH /employees is called
                @PatchMapping("/employees")
                public String partialUpdateEmployee(){
                    // Partially updates employee
                    return "Employee Partially Updated";
                }
            }

    # Returning JSON Responses :
    - REST APIs usually return JSON because it is:
        Lightweight
        Human-readable
        Language-independent
        Easy to parse

    Why JSON?
        Suppose Java returns - Employee
        React cannot understand Java objects.

     Spring converts
        Employee Object
            ↓
          JSON
            ↓
        React

        This conversion is called Serialization.

    Example : 
         1) // Simple Java class
            class Employee {
                private int id;
                private String name;
                // Constructors, getters and setters
            }

         2) @RestController
            public class EmployeeController {
                @GetMapping("/employee")
                public Employee getEmployee() {
                    // Returning a Java object
                    return new Employee(101, "Vishal");
                }
            }
        Output
            {
              "id": 101,
              "name": "Vishal"
            }
    How did JSON appear?
        The controller returned a Java object.
        Spring Boot invoked Jackson automatically.
        Jackson serialized the object into JSON.
        The JSON was written into the HTTP response body.

        You don't manually write JSON in most Spring Boot applications

    # Advantages
        Clear separation between client and server.
        Annotation-based configuration reduces boilerplate.
        Automatic URL routing.
        Automatic JSON conversion using Jackson.
        Easy integration with frontend frameworks (React, Angular, Vue) and mobile apps (Flutter, Android, iOS).
        Easy to test using Postman, MockMvc, or integration tests.
        Foundation for Microservices.
*/