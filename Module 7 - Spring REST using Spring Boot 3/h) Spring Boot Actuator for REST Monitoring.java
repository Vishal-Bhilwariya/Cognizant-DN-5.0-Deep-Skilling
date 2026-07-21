/*

    # Before We Start
     - Imagine your Spring Boot application is deployed in production.
        Thousands of users are using your API.

        Suddenly:
            API becomes slow.
            Database connection fails.
            Server memory reaches 95%.
            Application crashes.

        Question: How will you know what happened?
        You cannot keep checking logs manually every minute.

        You need a tool that tells you:
            Is the application running?
            How much memory is being used?
            How many HTTP requests are coming?
            Is the database connected?
            What is the application's health?

        This is exactly why Spring Boot Actuator exists.

    # What is Spring Boot Actuator? 
    - Spring Boot Actuator is a production-ready monitoring and management module that provides endpoints to monitor, manage, and inspect a running Spring Boot application.
    
     It exposes information such as:
        Application Health
        Metrics
        Environment
        Beans
        Mappings
        Logging
        Thread Information

    Think of Actuator as a dashboard for your Spring Boot application.
     Just like a car dashboard shows:
        Fuel
        Speed
        Engine Temperature

     Actuator shows:
        Memory
        CPU
        Health
        Requests
        Database Status

    # Why do we need Actuator?
     Without Actuator:
        No idea whether the application is healthy.
        Difficult to troubleshoot production issues.
        Hard to monitor performance.

     With Actuator:
        Monitor application health.
        Detect problems early.
        Collect metrics.
        Help DevOps teams.

    # Real-Life Analogy
     Imagine a hospital.
        Doctor doesn't guess a patient's condition.

     Doctor checks:
        Heart Rate
        Blood Pressure
        Oxygen Level
        Temperature

     Similarly,
     Actuator checks:
        JVM Memory
        CPU Usage
        Disk Space
        Database Health

    # Integrating Spring Boot Actuator :
    - Dependency
        Simply add: " spring-boot-starter-actuator "" to the project.

        Spring Boot automatically configures Actuator.

    # Monitoring and Managing RESTful Services :
    - Actuator exposes predefined Endpoints.
    - These endpoints provide monitoring information.

     What is an Endpoint?
     - An Endpoint is a URL exposed by Actuator to monitor or manage the application.

    Example : /actuator/health
        
    Common Actuator Endpoints
        Endpoint	                Purpose
        /actuator	                Lists available endpoints
        /actuator/health	        Application health
        /actuator/info	            Application information
        /actuator/metrics	        Performance metrics
        /actuator/env	            Environment properties
        /actuator/beans	            Spring Beans
        /actuator/mappings	        Request mappings
        /actuator/loggers	        Logging configuration
        /actuator/threaddump       	Thread information
        /actuator/heapdump	        JVM heap dump

    # Health Endpoint :
    - Checks whether the application is healthy.
    - Example
        GET /actuator/health

        Response
            {
              "status": "UP"
            }

        Possible values

        Status	        Meaning
        UP	            Healthy
        DOWN	        Application problem
        OUT_OF_SERVICE	Maintenance mode
        UNKNOWN	        Status unavailable
            
    # Metrics Endpoint
     Shows application statistics.

     Example : GET /actuator/metrics

    Response contains
        JVM Memory
        CPU
        HTTP Requests
        Database Connections
    
    # Info Endpoint :
    - Displays custom application information.
    - Useful for showing version, build date, etc.
    Example : GET /actuator/info   

        Response :
            {
                "app": {
                    "name": "Employee Management System",
                    "version": "1.0.0"
                }
            }

    # Exposing Custom Metrics
     - A Metric is a measurable value representing the application's behavior or performance.

     Examples:
        Number of API requests
        Memory usage
        Active users
        Database queries
        Why Custom Metrics?

     Suppose you own an e-commerce application.
        You want to monitor:
            Orders per minute
            Successful payments
            Failed logins
        These are business-specific metrics.

    # Metric Types
        Metric	                   Purpose
        Counter	                Counts events
        Gauge	                Current value
        Timer	                Response time
        Distribution Summary	Statistical values

    Example
     Imagine Login API

        Every login
            ↓
        Counter increases

      Login Count
        100
        101
        102

    Enterprise Usage
     Large companies monitor
        Payment Success Rate
        Failed Transactions
        User Registrations
        Order Count
      using custom metrics.

    # Securing Actuator Endpoints :
    Why Security?
        Imagine exposing /actuator/env

        It may reveal
            Database URL
            Server Configuration
            Environment Variables

        Very dangerous.

    Solution
        Secure endpoints. Only administrators should access them.

    Security Methods
        Authentication
        Authorization
        Spring Security
        Role-based Access

    # Customizing Actuator Endpoints :
    - Spring Boot allows developers to choose:
        Which endpoints are exposed
        Which endpoints are hidden
        
     Why Customize?
        Not every endpoint should be public.

     Example
        Allowed
            health
            info

        Hidden
            heapdump
            env
            beans

    Configuration
        Example 
            1) management.endpoints.web.exposure.include=health,info
                Only
                    Health
                    Info
                will be accessible.
            2) Hide all : management.endpoints.web.exposure.exclude=*

    Customize Base Path
     Default : /actuator
     Can become : /manage
        using management.endpoints.web.base-path=/manage

    Advantages
        Production-ready monitoring.
        Easy health checks.
        Performance monitoring.
        Supports DevOps tools.
        Exposes application metrics.
        Helps diagnose issues quickly.
        Easily integrates with monitoring platforms like Prometheus and Grafana.
        
    Disadvantages
        Sensitive endpoints can expose internal information.
        Additional configuration is required for security.
        Some endpoints may slightly increase resource usage.
        Misconfiguration can create security risks.
        */