/*

    # Introduction to API Documentation :
    - API Documentation is a structured description of a REST API that explains:
        Available endpoints
        HTTP methods
        Request parameters
        Request body
        Response body
        Status codes
        Authentication   
        Examples
     It acts as a user manual for developers.

     Imagine buying a new mobile phone.
        Inside the box, you receive a user manual explaining:
            How to switch it on
            How to charge it
            What each button does

        Similarly, API Documentation tells developers how to use your API.

    Why do we need API Documentation?
     Without documentation:
        Developers guess request formats
        Increased development time
        Integration becomes difficult.

     With documentation:
        Easy API usage
        Faster frontend-backend integration
        Better maintenance

    # API Documentation Contains
        Information	        Example
        Endpoint	      /employees
        HTTP Method	        GET
        Parameters	        id
        Request Body	    Employee JSON
        Response	        Employee JSON
        Status Code	        200, 404
        Authentication	    JWT Required

    # Swagger and OpenAPI
        Before understanding Swagger, let's understand OpenAPI.

     What is OpenAPI?
        OpenAPI Specification (OAS) is an industry standard specification used to describe REST APIs.

        It defines:
            API structure
            Endpoints
            Parameters
            Responses
            Authentication
        OpenAPI is a specification, not a software tool.

     What is Swagger?
        Swagger is a collection of tools used to create, visualize, and test APIs that follow the OpenAPI specification.

        Simply remember:
                OpenAPI
                    ↓
                Specification

                Swagger
                    ↓
                Implementation Tool
        
    Springdoc OpenAPI
        Modern Spring Boot 3 applications use: Springdoc OpenAPI instead of the older Swagger integration libraries.

        Springdoc automatically generates OpenAPI documentation.


    # Documenting REST APIs
        Springdoc reads Spring annotations.

        Example
            @RestController
            @GetMapping("/employees")
                    
        Automatically documents
            Endpoint
            Method
            Response Type

        Additional Documentation Annotations
            Annotation	        Purpose
            @Operation	        Describe API
            @Parameter	        Describe parameter
            @Schema	            Describe model
            @ApiResponse       	Describe response
            @Tag	            Group APIs
     
     Example :

            @RestController
            @Tag(name = "Employee Management", description = "Endpoints for managing employees")
            public class EmployeeController {
                @Operation(summary = "Get employee by ID", description = "Returns a single employee based on the provided ID")
                @ApiResponses(value = {
                    @ApiResponse(responseCode = "200", description = "Employee found"),
                    @ApiResponse(responseCode = "404", description = "Employee not found")
                })
                @GetMapping("/employees/{id}")
                public Employee getEmployee(@PathVariable Long id) {
                    // Implementation
                }
                @Operation(summary = "Create new employee", description = "Creates a new employee record")
                @PostMapping("/employees")
                public Employee createEmployee(@RequestBody Employee employee) {
                    // Implementation
                }
            }

    Generated Documentation
        Swagger UI automatically displays
        - All documented endpoints
        - Parameters
        - Request/Response examples
        - Try out functionality

    # Swagger UI
     Swagger UI is a web interface where developers can:
        View APIs
        Read documentation
        Send requests
        Test APIs
        View responses
     without Postman.

    Example
        Developer opens -> http://localhost:8080/swagger-ui/index.html and sees all APIs.
        
    # Generating API Documentation
        Springdoc automatically generates:

        OpenAPI JSON - /v3/api-docs
        Interactive UI - /swagger-ui/index.html

    # Best Practices
     Give Meaningful API Names

      Bad ->  /getData
      Good -> /employees
        
     Add Descriptions
        Explain
            Purpose
            Parameters
            Responses
            Document Status Codes

     Always explain
        200
        201
        400
        404
        500

     Include Examples
        Request
            {
                "id":101,
                "name":"Vishal"
            }

        Response
            {
                "id":101,
                "name":"Vishal"
            }

     Group APIs
        Example
            Employee APIs
            Order APIs
            Product APIs
        Keep Documentation Updated

     Documentation should always match the implementation.

    Advantages
        Automatic API documentation.
        Interactive API testing.
        Reduces developer confusion.
        Improves frontend-backend communication.
        Saves development time.
        Industry-standard documentation.
        
    Disadvantages
        Documentation must be kept synchronized with code and annotations.
        Publicly exposing Swagger UI in production may reveal API details.
        Sensitive endpoints should be secured or hidden.
 */