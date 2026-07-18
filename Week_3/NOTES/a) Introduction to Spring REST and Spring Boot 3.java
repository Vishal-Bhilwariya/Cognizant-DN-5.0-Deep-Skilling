/*

    # Overview of RESTful Architecture : 
     
     REST - stands for Representational State Transfer.

        It is an architectural style used to build communication between client applications and servers over the Internet using HTTP.
        REST is not a language, not a framework, and not a protocol.
        It is simply a set of architectural principles.

        REST is a way of designing web applications so that different systems (mobile apps, websites, desktop applications, etc.) can communicate with each other easily.

    # Why do we need REST?
     - Before REST became popular, applications mainly used:
        Remote Procedure Calls (RPC)
        SOAP Web Services

     Problems:
        Complex
        Heavy XML messages
        Difficult to maintain
        Slow
        Tight coupling

     REST solved these problems by introducing:
        Simplicity
        Lightweight communication
        HTTP support
        JSON
        Scalability

    # Real World Example
     Imagine Swiggy.
        When you open the app,
            You request -> GET /restaurants
            Server returns -> Restaurant List

        When you place an order
            POST /orders
            Server creates order.

        When you cancel
            DELETE /orders/25

     Everything happens using HTTP.
    This is REST.


    # REST Architecture :
                        Internet

                      HTTP Request
            +------------------------------+
            |          Client              |
            |------------------------------|
            | Browser                      |
            | Mobile App                   |
            | React App                    |
            | Flutter App                  |
            +------------------------------+
                         |
                         |
                         V
            +------------------------------+
            |      REST API Server         |
            |------------------------------|
            | Spring Boot                  |
            | Controllers                  |
            | Services                     |
            | Repository                   |
            +------------------------------+
                         |
                         |
                         V
            +------------------------------+
            |        Database              |
            | MySQL / PostgreSQL           |
            +------------------------------+

    Internal Working

     Step 1 : Client sends HTTP Request
        GET /employees
            ↓
     Step 2 :  Spring Boot receives request
            ↓
     Step 3 : DispatcherServlet identifies matching controller
            ↓
     Step 4 : Controller calls Service
            ↓
     Step 5 : Service calls Repository
            ↓
     Step 6 : Repository fetches data
            ↓
     Step 7 : Response returned as JSON
            ↓
     Step 8 : Client receives JSON

    # REST Constraints :
    1. Client-Server - Client and Server are separate.
     Example
        React
          ↓
        Spring Boot
          ↓
        Database

     Advantage - Independent development.

    2. Stateless - Every request is independent.
                    Server remembers nothing.
     Example
        Request 1
            Login
              ↓
            Completed

        Request 2
            Get Employee
                ↓
            Must again send JWT Token

        Server stores no client session.

    3. Cacheable - Responses may be cached.
     Example
        GET Countries
        No need to request every time.

     Improves performance.

    4. Uniform Interface- Every REST API follows similar rules.
     Example
        GET /users
        POST /users
        PUT /users/10
        DELETE /users/10

     Easy to understand.

    5. Layered System - Client never knows whether request goes through:
        Load Balancer
            ↓
        Gateway
            ↓
        Security
            ↓
        Application
            ↓
        Database

    6. Code on Demand (Optional)
        Server may send executable code.
        Rarely used today.

    # HTTP Methods
        Method	Purpose
        GET	    Read Data
        POST	Create Data
        PUT	    Update Entire Resource
        PATCH	Partial Update
        DELETE	Delete Resource

    # URI Examples
        GET /students
        GET /students/10
        POST /students
        PUT /students/10
        DELETE /students/10
        
    # HTTP Status Codes
        Code	Meaning
        200	     OK
        201	     Created
        204	     No Content
        400	     Bad Request
        401	     Unauthorized
        403	     Forbidden
        404	     Not Found
        500	     Internal Server Error

    # Advantages
        Lightweight
        Easy to understand
        Platform independent
        Supports JSON
        Scalable
        Stateless
        Easy integration
        High performance

    # Introduction to Spring REST :
    - Spring REST is the Spring Framework's support for building RESTful web services. In Spring Boot 3, you typically create REST APIs using Spring MVC (or Spring Web) with annotations such as @RestController.

     Spring REST handles:
        Receiving HTTP requests
        Routing them to Java methods
        Converting Java objects to JSON (serialization)
        Converting JSON to Java objects (deserialization)
        Sending HTTP responses
        Why do we need Spring REST?

     Without Spring:
        You would manually parse HTTP requests.
        You would manually generate JSON.
        You would manually manage routing.

     Spring REST automates these tasks, allowing developers to focus on business logic.

    # Common Annotations
        Name            	Description	                          Purpose	                Example
        @RestController	    Marks a class as REST controller	Handles REST requests	@RestController
        @RequestMapping	    Maps base URL	                    Groups endpoints	    @RequestMapping("/api")
        @GetMapping	        Maps GET request	                Read data	            @GetMapping("/users")
        @PostMapping	    Maps POST request	                Create data	            @PostMapping("/users")
        @PutMapping	        Maps PUT request	                Update data	            @PutMapping("/users/{id}")
        @DeleteMapping	    Maps DELETE request	                Delete data	            @DeleteMapping("/users/{id}")

    # Benefits of Using Spring Boot for REST Services
     - Earlier (Spring Framework without Boot):
            Large XML configuration
            Manual dependency management
            Manual server setup
            Longer project setup time

        Spring Boot simplifies REST development.

    Major Benefits
        Benefit	                                Explanation
        Auto-Configuration	        Configures components automatically.
        Embedded Server	            Built-in Tomcat/Jetty/Undertow; no external deployment needed.
        Starter Dependencies	    One dependency pulls in all required libraries.
        Production Ready	        Includes Actuator, Metrics, Health Checks.
        JSON Support	            Jackson integrated by default.
        Faster Development	        Minimal boilerplate.
        Easy Testing	            Strong testing support with Spring Test and MockMvc.
        
    Enterprise Usage
        Spring Boot REST is widely used for:
            Banking APIs
            E-commerce platforms
            Healthcare systems
            Microservices
            Mobile backends
            Cloud-native applications

    # Setting up a Spring Boot Project for REST :
    Required Dependencies
        Dependency	                Purpose
        Spring Web	            Build REST APIs
        Spring Boot             Starter	Core Boot functionality
        Spring Boot             DevTools	Faster development
        Spring Data             JPA (optional)	Database access
        MySQL Driver(optional)	Connect to MySQL

    Basic Architecture
        src
         └── main
              ├── java
              │     ├── controller
              │     ├── service
              │     ├── repository
              │     ├── entity
              │     └── dto
              └── resources
                    └── application.properties

        Why this architecture?
            Controller → Receives HTTP requests.
            Service → Contains business logic.
            Repository → Communicates with the database.
            Entity → Represents database tables.
            DTO → Transfers data between client and server.
            This layered architecture improves maintainability and follows separation of concerns.

    # What's New in Spring Boot 3?
     - Spring Boot 3 is a major release built on Spring Framework 6.

     Important Changes
        Feature	                            Description
        Java 17+ Required	    Minimum supported Java version is 17.
        Jakarta EE 9	        Package names changed from javax.* to jakarta.*.
        Spring Framework 6	    Built on the latest Spring Framework.
        Improved Native Support	Better support for GraalVM native images.
        Better Observability	Enhanced metrics, tracing, and monitoring.
        Improved Performance	Optimizations across the framework.
        Security Updates	    Improved integration with Spring Security 6.

    EXAMPLE : 
        @RestController              // Marks this class as a REST Controller
        @RequestMapping("/api")      // Base URL for all endpoints
        public class EmployeeController {
            @GetMapping("/employees")   // Handles GET /api/employees
            public String getEmployees() {
                // Returns data directly in the HTTP response
                return "Employee List";
            }
        }

    # Overall Advantages
        Standard architecture for web APIs
        Loose coupling between client and server
        Easy integration with frontend and mobile applications
        High scalability due to stateless communication
        Strong ecosystem with Spring Boot
        Easy JSON processing
        Production-ready monitoring and security support
*/