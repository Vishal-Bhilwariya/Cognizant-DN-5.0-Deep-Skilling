/*

    # Before We Start
        Until now, our REST APIs have returned JSON.
        Example:
            {
                "id":101,
                "name":"Vishal"
            }

        But what if one client wants JSON, another wants XML, and another wants a custom format?

        Should we create different APIs?
         No. Instead, we use Content Negotiation.

    # What is Content Negotiation?
    - Content Negotiation is the process by which the client and server agree on the format of the request and response data.

     The client tells the server:
        "I want the response in this format."

        The server checks whether it supports that format.

        If yes → sends it.
        If not → returns an error.

    Imagine you visit a restaurant.
     The waiter asks: "Would you like tea or coffee?"

        You choose.
        The waiter serves only that drink.

     Similarly,
        Client chooses
            JSON
            XML
            PDF
            Custom Media Type

        Server sends the requested format.

    Why do we need Content Negotiation?
     Suppose one API serves:
        React Website
        Flutter App
        Banking Software
        Legacy Java Application

        Different applications may require different response formats.

        Without Content Negotiation
                ↓
        Need multiple APIs

        GET /employees/json
        GET /employees/xml

        Very bad design.

     Instead
        One API
        GET /employees

        Client chooses format.

    # Media Types 
    - A Media Type (also called MIME Type) tells the client what type of content is being sent.
    Example
        application/json means Response contains JSON.

    Common Media Types
        Media Type	        Description
        application/json	JSON Data
        application/xml	    XML Data
        text/plain	        Plain Text
        text/html	        HTML
        image/png	        PNG Image
        image/jpeg	        JPEG Image
        application/pdf	    PDF Document

    Why Media Types?
     Without media type, Browser cannot understand whether response is
        JSON
        XML
        PDF
        Image

    Example
        Server Response -> Content-Type: application/json

        Browser knows
            ↓
        JSON Response.

    # Using the Accept Header : 
    - The Accept Header is an HTTP request header used by the client to tell the server which response format it prefers.
    Syntax
        Accept: application/json
                or
        Accept: application/xml
        Example
            curl -H "Accept: application/json" http://localhost:8080/employees

    # Produces and Consumes :
    Produces
        Specifies "What format will this API return?"

     Example
        @GetMapping(produces="application/json")
        
    Consumes
        Specifies "What format can this API receive?"

     Example
        @PostMapping(consumes="application/json")
            
    Syntax
        @GetMapping(value="/employees",produces="application/json")
        @PostMapping(value="/employees",consumes="application/json")
        
    Syntax Table
        Name	    Description	            Purpose	            Example
        produces	Response Media Type	    Return Format	"application/json"
        consumes	Request Media Type	    Accepted Input	"application/json"
        
    Example
        @RestController
        @RequestMapping("/employees")
        public class EmployeeController {
            @GetMapping(produces = "application/json")
            public Employee getEmployee(){
                return new Employee(101,"Vishal");
            }

        }
     Output
        Response Header
        Content-Type: application/json
    
    # Producing Custom Media Type :
    - We can also define custom media types for our APIs.
    Example
        @GetMapping(value = "/employees", produces = {"application/vnd.company.employee-v1+json"})
        public Employee getEmployee(){
            return new Employee(101, "Vishal");
        }
*/