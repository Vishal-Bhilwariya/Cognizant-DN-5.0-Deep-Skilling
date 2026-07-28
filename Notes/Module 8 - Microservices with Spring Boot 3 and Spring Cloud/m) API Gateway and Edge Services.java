/*

    # What is an API Gateway? 
    - An API Gateway is the single entry point for all client requests in a Microservices Architecture.
    - It receives every client request and forwards it to the correct microservice.

    Instead of the client directly calling different services, the client sends every request to API Gateway.
    API Gateway decides which service should receive the request.

    Advantages
        Single Entry Point
        Better Security
        Request Routing
        Centralized Authentication
        Load Balancing
        
    # Spring Cloud Gateway :
    - Spring Cloud Gateway is the official API Gateway provided by Spring Cloud.
    It performs:
        Routing
        Filtering
        Authentication
        Rate Limiting
        Load Balancing
        Logging

    Why do we need Spring Cloud Gateway?
    - Instead of writing routing logic manually, Spring Cloud Gateway automatically manages request routing.

     Real-Life Analogy
       Traffic Police
        Traffic Police directs vehicles to different roads.
        Similarly,
        Spring Cloud Gateway directs requests to different services.

    Advantages
        Easy Routing
        Built-in Filters
        Eureka Integration
        Better Performance
        Centralized Security

    # Edge Services :
    - Edge Services are services that interact directly with external clients.
    - API Gateway is the most common Edge Service.

    # Routing :
    - Routing means forwarding a request to the correct microservice.

    Example
        /products
            ↓
        Product Service
        
        /orders
            ↓
        Order Service

    # Filtering :
    - Filtering means processing a request before or after routing. 
    
    Types of Filters
        Pre-Filters : Process request before routing.
            Examples
                Authentication
                Logging
                Token Validation
        Post-Filters : Process response after routing.
            Examples
                Response Logging
                Header Modification
                Compression

    Real-Life Analogy
     Airport Security
        Before boarding, security checks your passport.
        After landing, immigration checks documents.
        Similarly, Gateway filters process requests before and after routing.

    Advantages
        Cleaner architecture
        Better security
        Centralized logging
        Easy monitoring

    # Load Balancing in API Gateway :
    - Load Balancing distributes requests among multiple service instances.
   
    Why do we need it?
     Suppose Payment Service has three instances.
        Payment-1
        Payment-2
        Payment-3

     Instead of sending every request to Payment-1, Gateway distributes them.

    Advantages
        Better Performance
        High Availability
        Better Scalability
        Prevents Overloading

    # Resilience Patterns in API Gateway :
    - Resilience Patterns keep the system running even when some services fail.
    - Common Patterns:
        Circuit Breaker - Stops repeated failures.
        Retry - Retries temporary failures.
        Timeout - Sets time limits.(Stops waiting after a certain time.)
        Fallback - Provides alternative response.

    Real-Life Analogy
      Hospital Emergency Plan
        If one doctor is unavailable,another doctor handles the patient.
        The hospital continues working.

    Advantages
        High Availability
        Better Reliability
        Better User Experience
        Prevents Cascading Failures
*/