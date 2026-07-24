/*

    # Overview of Spring Security :
    - Spring Security is a powerful security framework provided by Spring that helps secure Spring Boot applications.
      It provides:
        Authentication
        Authorization
        Password Encryption
        Session Management
        CSRF Protection
        OAuth2 Support
        JWT Integration

    Why do we need Spring Security?
     Suppose you create a REST API.
        GET /users
        POST /payment
        DELETE /products
        
        Without security, anyone can access these APIs.
        Very dangerous.
        Spring Security protects these APIs.
    Advantages
        Secure APIs
        Built-in Authentication
        Built-in Authorization
        Password Encryption
        OAuth2 Support
        Easy integration

    # Securing Microservices using Spring Security :
    - Each microservice should protect its own APIs.
      Even if services communicate internally, requests must still be authenticated and authorized.

    Why do we need it?
     Suppose
        Order Service
             ↓
        Payment Service

        If Payment Service accepts every request, any attacker could send fake payment requests.
        Spring Security verifies the request before processing it.

    Real-Life Analogy
     Bank Locker
        Even inside the bank, you still need your locker key.
        Being inside the building doesn't automatically give access.

        Similarly, one microservice must authenticate before accessing another.

    Advantages
        Secure service communication
        Prevents fake requests
        Protects internal APIs
        Improves trust between services

    # Authentication & Authorization in a Microservices Environment :
     Authentication
        Verifies Who is making the request?
        Usually done using:
            Username & Password
            JWT Token
            OAuth2 Token
        
     Authorization
        Checks What resources can this user access?

        Example
             Customer
                ↓
             View Products
             Order Products

            Admin
                Manage Products
                Delete Users
                View Reports

    Real-Life Analogy
     Airport
        Passport Check
            ↓
        Authentication

        Boarding Pass
            ↓
        Authorization

    Advantages
        Role-based access
        Secure APIs
        Better control
        Protects sensitive data

    # Configuring Security for RESTful APIs :
    - REST APIs should never be publicly accessible unless intentionally designed.
    - Spring Security secures REST endpoints.

    Why do we need it?
        Suppose API : DELETE /users
        Without security,anyone can delete users.
        Very dangerous.

    Advantages
        Protects APIs
        Role-based access
        Prevents unauthorized requests
        Secure communication
*/