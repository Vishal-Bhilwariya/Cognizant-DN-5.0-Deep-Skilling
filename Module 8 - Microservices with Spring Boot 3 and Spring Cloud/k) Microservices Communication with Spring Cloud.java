/*

    # Inter-Service Communication Patterns :
     - Inter-Service Communication Pattern defines how microservices exchange information to complete a business process.

       Why do we need it?
        Imagine an E-Commerce application.
        Customer places an order.
        The Order Service cannot complete everything alone.

        It needs to communicate with:
            Inventory Service
            Payment Service
            Notification Service

    Communication Types
     Synchronous
        Waits for response.
        Examples:
            REST
            gRPC
            
     Asynchronous
        Doesn't wait.
        Examples:
            Kafka
            RabbitMQ
        
    Advantages
        Business collaboration
        Independent services
        Better scalability
        Distributed architecture

    # Spring Cloud OpenFeign :
    - OpenFeign is a Declarative REST Client provided by Spring Cloud.
    - It allows one microservice to call another without writing manual HTTP client code.

    What does "Declarative" mean?
        Normally, to call another service, developers write lots of HTTP client code.
    
        With OpenFeign, we simply declare an interface.
        
        Spring generates the implementation automatically.
       
    SYNTAX :
        @FeignClient(name = "payment-service")
        public interface PaymentClient {
            @GetMapping("/payment/{id}")
            Payment getPayment(@PathVariable Long id);
        }

    Annotation Explanation
        Name	                Description	Purpose	Example
        @FeignClient	        Declares Feign Client	Calls another Microservice	@FeignClient(name="payment-service")
        name	                Service Name in Eureka	Finds Service	payment-service
        @GetMapping	HTTP GET	Fetch Data	@GetMapping("/payment/{id}")
        @PathVariable	        Reads URL Value	Passes Parameter	Long id

    Real-Life Analogy
     Personal Assistant
        Instead of calling someone yourself, you tell your assistant,
        "Please contact the Payment Department."

        The assistant handles everything.
        OpenFeign works exactly like that assistant.

    Advantages
        Less code
        Automatic REST calls
        Integrates with Eureka
        Better readability
        Easy maintenance

    # Service Orchestration :
    - In Orchestration, one central service controls the complete workflow.

    Why do we need it?
        Suppose customer places an order.
        One service decides:
            Reserve Inventory
            Process Payment
            Send Notification

        Everything is centrally controlled.

    Advantages
        Centralized control
        Easier debugging
        Predictable workflow
        
    Disadvantages
        Single Point of Failure
        Tight coupling

    # Service Choreography :
    - In Choreography, there is no central controller.
    - Every service reacts independently to events.

    Advantages
        Loose coupling
        Better scalability
        Independent services
        
    Disadvantages
        Hard debugging
        Difficult monitoring
        Complex event flow
    Orchestration vs Choreography
        Orchestration	        Choreography
        Central Controller	    No Controller
        Easy Monitoring	        Hard Monitoring
        Tight Coupling	        Loose Coupling
        Easier Debugging	    Difficult Debugging
*/
