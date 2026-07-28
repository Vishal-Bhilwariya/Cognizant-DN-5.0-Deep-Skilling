/*

    # What is Request and Response Handling? 
    - Request and Response Handling is the process of:
    - 
    - Receiving data from the client
    - Processing the request
    - Executing business logic
    - Returning an appropriate response to the client
    - 
    - It is one of the core responsibilities of a REST Controller.

    # Why do we need it?
     - Whenever a client calls an API, it may send:
        User ID
        Product ID
        Login credentials
        Employee details
        Search keywords

     Spring must know:
        Where the data came from
        How to convert it into Java objects
        How to send the response back

     Without Request Handling:
        No API can receive user input.

     Without Response Handling:
        Client never receives useful information.

    # Handling Path Variables :
    - Path Variables are values that are part of the URL path.
    - They are used to identify specific resources.
    - Example: /employees/123
        Here, 123 is a path variable representing an employee ID.
    - In Spring, we use @PathVariable to extract these values.
    - Example:
        @GetMapping("/employees/{id}")
        public Employee getEmployeeById(@PathVariable Long id) {
            return employeeService.getEmployeeById(id);
        }

    Real Life Analogy
     Imagine a hotel.
        Room Number
            101
            102
            103
        
     If someone says
        "Take me to Room 103"

        Room Number is the Path Variable.

    # Handling Query Parameters
     - A Query Parameter is additional information sent after ? in the URL.
        
     Example : /products?category=Laptop
        
     Why do we need Query Parameters?
        Used for
            Searching
            Filtering
            Sorting
            Pagination

        Example : /search?name=Vishal
                  /products?page=2
                  /products?sort=price

    Example :
        @GetMapping("/search")
        public String search(
            // Reads value after '?'
            @RequestParam String name){
            return "Searching : " + name;
        }
    Output :
        Request : GET /search?name=Vishal
        Response : Searching : Vishal

    Path Variable vs Query Parameter
        Path Variable	                    Query Parameter
        Mandatory resource identifier	Optional additional information
        Part of URL path	               Comes after ?
        /employees/10	                    /employees?page=2
        Used to identify a resource	    Used for filtering/searching

    # Request Body Processing :
     The Request Body contains data sent by the client.

    Usually JSON

    Why do we need Request Body?
        Suppose user registration

        Client sends
            {
                "name":"Vishal",
                "age":22
            }

        This data is inside the Request Body.

     Syntax Table
        Name	          Description	    Purpose	                        Example
        @RequestBody	Reads JSON Body	Convert JSON → Java Object	@RequestBody Employee emp
        
    Example
        @PostMapping("/employees")
        public String saveEmployee(
            // Converts JSON into Employee object
            @RequestBody Employee employee){
            return employee.getName();
        }

        JSON Request
        {
            "id":101,
            "name":"Vishal"
        }
        
    Output  :  Vishal

    Serialization vs Deserialization
        Serialization       	    Deserialization
        Java Object → JSON	    JSON → Java Object
        Response	            Request
        While Sending	        While Receiving

    # Form Data Processing :
    Sometimes data comes from HTML Forms instead of JSON.

     Example
        <form>
            Name
            Email
            Password
        </form>
        
    Types
     1. URL Encoded
        name=Vishal
        age=22
        
     2. Multipart Form Data
        Used for
            Image Upload
            PDF Upload
            Resume Upload
            Spring Annotation

        Usually @RequestParam or @ModelAttribute
        
      Example
        @PostMapping("/register")
        public String register(
            @RequestParam String name,
            @RequestParam int age){
            return "Registered";
        }

    Comparison
        JSON Body	            Form Data
        API Clients	        HTML Forms
        @RequestBody	    @RequestParam / @ModelAttribute
        Structured JSON	    Key-Value Pairs

    # Customizing Response Status & Headers
     A REST API should return:
        Correct Status Code
        Proper Headers
        Response Body

        This tells the client whether the request succeeded or failed.

    # Exception Handling in REST Controllers :
    An Exception is an unexpected error that occurs during request processing.
        
    Example
        Employee not found
        Database Error
        Invalid Input
        Divide by Zero

    Why do we need Exception Handling?
     Without handling
        500 Internal Server Error
        Huge Stack Trace

        User gets confusing errors.

     Instead
        Return
            {
                "message":"Employee Not Found"
            }

    Common Annotations
    Annotation	                    Purpose
    @ExceptionHandler	    Handle specific exceptions inside a controller
    @ControllerAdvice	    Global exception handling across controllers
    @RestControllerAdvice	Global exception handling for REST APIs (returns JSON)

    # Advantages
        Clean request processing.
        Automatic data binding.
        Automatic JSON conversion.
        Better API design.
        Flexible HTTP response customization.
        Centralized error handling.
        Improved client experience with meaningful error messages.
        Easier maintenance in enterprise applications.
*/