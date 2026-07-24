/*

    We know:
        OAuth2 gives an Access Token.
        OIDC gives an ID Token.

     Now the question is: Who creates these tokens?
        The answer is: Authorization Server

     Another question: Who checks whether these tokens are valid?
        The answer is: Resource Server

    # Authorization Server
     The Authorization Server is responsible for:
        Authenticating users
        Verifying credentials
        Generating Tokens
        Issuing Tokens

        It is the "Login Server" of the system.

    Suppose you login using Google.
     Google checks
        Username
        Password

     If everything is correct,
        Google generates
            Access Token
            ID Token

        Google acts as the Authorization Server.

    Why do we need Authorization Server?
     Without it, every microservice would need to
        Store users
        Verify passwords
        Generate tokens

        This creates duplicate work.
        Instead, one server handles authentication for everyone.

    Responsibilities
    Authorization Server is responsible for:
        User Authentication
        Token Generation
        Token Expiration
        Refresh Tokens
        User Identity

    Advantages
        Centralized authentication
        Secure login
        Easy user management
        Standard OAuth2 implementation
        Supports SSO

    # Resource Server :
    - The Resource Server hosts protected APIs.
    - It validates incoming tokens before allowing access.

    Suppose
        Payment Service has ; POST /payment
        Only authenticated users should access it.
        Payment Service checks the Access Token.

        If valid, request is processed.
        Otherwise, request is rejected.

    Responsibilities
        Resource Server
            Protects APIs
            Validates JWT
            Checks Expiration
            Checks User Roles
            Grants or Denies Access

    Advantages
    Protects APIs
    Secure communication
    Easy access control

    Authorization Server vs Resource Server
        Authorization Server	    Resource Server
        Authenticates User	        Validates Token
        Creates Tokens	            Checks Tokens
        Issues JWT	                Reads JWT
        Login	                    API Access
        Stores Users	            Protects APIs
*/