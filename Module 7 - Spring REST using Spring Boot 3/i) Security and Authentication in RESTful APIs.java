/*

    # Before We Start
     Imagine you have created an Employee REST API.

     Your endpoints are:
        GET    /employees
        POST   /employees
        PUT    /employees/{id}
        DELETE /employees/{id}

     Without security,
        Anyone on the internet can:
            View employee data 
            Delete employees 
            Modify salaries 
            Create fake employees 

        This is a huge security risk.

        We need a mechanism to answer two questions:
            Who are you? (Authentication)
            What are you allowed to do? (Authorization)

        This is where Spring Security comes in.

    # Spring Security : 
    - Spring Security is a powerful Spring Framework module used to secure Spring applications by providing:
        Authentication
        Authorization
        Password Encryption
        Session Management
        CSRF Protection
        JWT Support
        OAuth2 Support

    Think of Spring Security as the security guard of a company.
        Before anyone enters,

        The guard asks:
            Who are you?
            If identity is verified,
         The guard checks
            Which rooms can you enter?
            Exactly how Spring Security works.

    Spring Security Components
        Component	                        Purpose
        Security Filter Chain	    Intercepts every request
        Authentication Manager	    Verifies user identity
        UserDetailsService	        Loads user information
        Password Encoder	        Encrypts passwords
        Security Context	        Stores authenticated user

    # Authentication:
    Authentication means: Verifying the identity of the user.

    Question answered:
        Who are you?

    Example
        Login Screen
            Username
            Password

        System verifies credentials.

        If correct
            ↓
        User authenticated.

    Authentication Methods
            Method	                Description
        Username & Password	        Most common
        JWT Token	                Modern REST APIs
        OAuth2	                    Google, GitHub Login
        LDAP	                    Enterprise Authentication
        API Key	                    Machine-to-Machine APIs

    # Authorization
    Authorization means: Checking what an authenticated user is allowed to do.

    Question answered: What can you access?

     Example
        Users
        ADMIN
        EMPLOYEE
        CUSTOMER

    Permissions
        ADMIN Can Delete
        EMPLOYEE Cannot Delete

    # Token-Based Authentication (JWT) : 
    JWT (JSON Web Token) is a compact, secure token used for authentication in REST APIs.

    Instead of storing user sessions on the server, the server issues a token.
    The client sends this token with every request

    Why JWT?
        REST APIs are stateless.
        Server should not remember users.
        JWT solves this.

    Login Flow :
        Client
          ↓
        Username
        Password
          ↓
        Server
          ↓
        Authentication
          ↓
        JWT Generated
          ↓
        Client Stores Token
          ↓
        Future Requests
          ↓
        Authorization Header
          ↓
        Server Verifies Token
          ↓
        Access Granted

    JWT Structure
     A JWT has 3 parts.
      1) Header
         Contains
            Token Type
            Algorithm

         Example
            {
                "alg":"HS256",
                "typ":"JWT"
            }
        
      2) Payload
            Contains user information.

         Example
            {
                "username":"Vishal",
                "role":"ADMIN"
            }
                
      3) Signature
            Used to verify token authenticity.
            Prevents tampering.

    # Session vs JWT
        Session	                        JWT
        Server stores session	Client stores token
        Stateful	            Stateless
        More Memory	            Less Memory
        Traditional Web Apps	REST APIs

    # Cross-Origin Resource Sharing (CORS) :
    - CORS (Cross-Origin Resource Sharing) is a browser security mechanism that controls whether one website can access resources from another origin.
    
    - Origin = Protocol + Host + Port
    Why CORS?
        Browser Security
        Prevents malicious sites from accessing your API
        Example
            Website A (http://localhost:3000)
            tries to call
            API B (http://localhost:8080)

            CORS prevents this unless allowed.

    CORS Configuration
        Enable CORS in Spring Boot
            @CrossOrigin(origins = "http://localhost:3000")
            @GetMapping("/employees")
            public List<Employee> getAllEmployees(){
                return employeeService.getAllEmployees();
            }

    Advantages
        Strong application security.
        Stateless authentication with JWT.
        Fine-grained access control using roles.
        Easy integration with frontend applications.
        Suitable for microservices.
        Browser security through CORS.
        
    Disadvantages
        Security configuration can be complex.
        JWT tokens must be protected on the client.
        Incorrect CORS configuration may expose APIs.
        Token revocation requires additional strategies
*/