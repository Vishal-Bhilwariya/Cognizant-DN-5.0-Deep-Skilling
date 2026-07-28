/*

    # Spring Boot vs Spring Cloud
        Spring Boot	                                Spring Cloud
        Builds one application	            Connects multiple applications
        Focus on application development	Focus on distributed system management
        Standalone	                        Works with multiple services
        Creates REST APIs	                Manages communication, discovery, configuration, resilience

    # Introduction to Spring Cloud :
    - Spring Cloud is a collection of tools and libraries that help developers build, manage, and deploy Microservices.
    - It provides solutions for common distributed system problems.
    
    # Why do we need Spring Cloud?
     Suppose there are 50 microservices.
        Without Spring Cloud,you have to manually manage:
            Service locations
            Configuration files
            Communication
            Fault handling
            Load balancing
        This becomes extremely difficult.
        Spring Cloud automates these tasks.

    # Key Features of Spring Cloud
        1. Service Discovery
            - Automatically detects and registers services.
            - Example: Eureka Server.

        2. API Gateway
            - Single entry point for all clients.
            - Example: Spring Cloud Gateway.

        3. Configuration Management
            - Centralized configuration for all services.
            - Example: Spring Cloud Config.

        4. Load Balancing
            - Distributes requests across multiple instances.
            - Example: Ribbon.

        5. Circuit Breaker
            - Prevents cascading failures.
            - Example: Resilience4j or Hystrix.

        6. Distributed Tracing
            - Tracks requests across services.
            - Example: Zipkin.

        7. Security
            - Manages authentication and authorization.
            - Example: Spring Security OAuth2.

        8. Cloud Connectors
            - Integrates with cloud platforms.
            - Example: Cloud Foundry Connector.

        9. Monitoring and Metrics
            - Provides insights into service performance.
            - Example: Micrometer, Prometheus.

        10. Event-driven Architecture
            - Enables asynchronous communication.
            - Example: Spring Cloud Stream.

    # Benefits of Spring Cloud
        - Simplifies microservices development.
        - Enhances scalability and resilience.
        - Improves deployment flexibility.
        - Supports modern DevOps practices.
        - Reduces boilerplate code.
        - Facilitates integration with cloud platforms.
        - Provides standardized patterns for common issues.

    # Common Spring Cloud Components
        Component	            Purpose
        Eureka	                Service Discovery
        Zuul / Gateway	        API Gateway
        Config	                Configuration Management
        Hystrix	                Circuit Breaker
        OAuth2	                Security
        Stream	                Event-driven Messaging
        Gateway	                Routing and Filtering
        Vault	                Secret Management
        Jenkins / GitLab CI	    CI/CD Integration
        Terraform	            Infrastructure as Code
 
    Real-Life Analogy
     Office Management
        Employees can work individually.
        But, to run the company smoothly,

        you also need:
            Reception
            HR
            Security
            Administration

        Similarly, Spring Boot creates services.
        Spring Cloud manages them.
       
    # Configuring Microservices with Spring Cloud :
    - Instead of storing configuration inside every service,
    - Spring Cloud stores configuration centrally.

    Why do we need it?
     Suppose
        20 microservices have
            server.port
            database.url
            database.username
            database.password

        If the database password changes, you must edit 20 applications.
            Very difficult.

        Instead, Spring Cloud Config stores configuration in one place.
           
    Real-Life Analogy
     School Notice Board
        Instead of informing every student individually, the principal updates one notice board.
        Everyone reads the same information.

    Advantages
        Centralized configuration
        Easy updates
        Better consistency
        Easier maintenance
        
    # Service Discovery & Registration using Netflix Eureka :
    - Netflix Eureka is a Service Registry used by Spring Cloud.
    - It allows services to register themselves and discover other services automatically.

    Why do we need Eureka?
     Suppose
        Payment Service restarts.

        Old Address - 192.168.1.10
        New Address - 192.168.1.45

        Without Eureka, other services fail.
        With Eureka, Payment Service registers automatically.

        Other services always get the latest location.  

    Advantages
        Dynamic service discovery
        No hardcoded IPs
        Easy scaling
        Automatic registration
        High availability
*/