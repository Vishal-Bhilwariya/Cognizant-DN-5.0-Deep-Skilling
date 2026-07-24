/*

    # What is JWT? 
    - JWT (JSON Web Token) is a secure token used to exchange user information between systems.
       It proves that:
        User is authenticated
        User is authorized
       without sending the username and password every time.

    Normally, you login once.

     After login, the server gives you a JWT.
     Whenever you access another API, you send only the JWT.
        You do NOT send your username and password again.

    Advantages
        No repeated login
        Stateless Authentication
        Faster API requests
        Easy to scale
        Perfect for Microservices

    # Structure of JWT :
    - JWT has three parts : Header.Payload.Signature

    Example : xxxxx.yyyyy.zzzzz ( The dot (.) separates each part. )
    
    # How it works ?
    - When a user logs in successfully, the server generates a JWT and sends it to the client.
    - The client stores the JWT (usually in localStorage or sessionStorage).
    - For subsequent requests, the client includes the JWT in the Authorization header.
    - The server validates the JWT on each request to ensure the user is authenticated and authorized.

    Header : Header stores information about the token.

     Example
        {
          "alg":"HS256",
          "typ":"JWT"
        }
        
     Meaning
        Field	Description
        alg	    Encryption/Signing algorithm
        typ	    Token Type (JWT)
        Memory  Trick

        Header
            ↓
        How JWT is protected.

    Payload : Payload stores user information.
     Example
        {
           "username":"Vishal",
           "role":"ADMIN",
           "email":"abc@gmail.com"
        }
        These values are called Claims.

     Types of Claims
      a) Registered Claims - Standard fields
        Examples
                sub
                iss
                exp
                aud
        
      b) Public Claims - Application-specific
        Example
            role
            department
        
       c) Private Claims - Custom values
        Example
            college
            employeeId
            branch

    Signature : Signature protects JWT.
        If anyone changes the Payload,
        Signature becomes invalid.
        Request is rejected.

    Real-Life Analogy
        Principal's Signature
        Anyone can write a certificate.
        But only the Principal's signature proves it is genuine.
        Signature works the same way.

    Access Token vs Refresh Token
        Access Token	    Refresh Token
        Short Life	        Long Life
        Access APIs	        Generate New Access Token
        Sent with Every     Request	Used Occasionally
        Expires Quickly	    Expires Later

    JWT vs Session Authentication
        JWT	                        Session
        Stateless	                Stateful
        Server stores nothing	    Server stores Session
        Better Scalability	        Limited Scalability
        Best for APIs	            Best for Traditional Web Apps
        Ideal for Microservices	    Better for Monolithic Apps
*/