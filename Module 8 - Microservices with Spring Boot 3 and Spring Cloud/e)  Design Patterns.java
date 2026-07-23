/*

    # Service Registry & Discovery Pattern :
    -The Service Registry & Discovery Pattern allows microservices to register themselves and discover other services dynamically without hardcoding IP addresses.
    
    Why do we need it?
     Suppose you have: Order Service
     It needs to call: Payment Service

    Initially Payment Service runs on 192.168.1.20
    Later it is redeployed and moves to 192.168.1.45
    If Order Service has the old IP stored, communication fails.
    Hardcoding addresses is impossible in large systems.

    Real-Life Analogy
        Phone Contact List
        You don't remember everyone's phone number.
        You search their name in your contacts.
        Similarly, Microservices search the Service Registry.

    Advantages
        No hardcoded IP addresses
        Dynamic discovery
        Easy scaling
        Easier deployments
        Fault tolerance

    # Circuit Breaker Pattern :
        The Circuit Breaker Pattern prevents repeated requests to a failed service.
        It stops unnecessary network calls until the failed service recovers.

    Why do we need it?
     Suppose:
        Order Service
            ↓
        Payment Service

        Payment Service crashes.

    Without Circuit Breaker:
        Order
         ↓
        Payment
         ↓
        Retry
         ↓
        Payment
         ↓
        Retry
         ↓
        Payment 
         ↓
        Retry...

        Thousands of useless requests overload the system.

        Solution

        Circuit Breaker temporarily blocks requests.

    Real-Life Analogy
        Electrical Circuit Breaker
        When there is an electrical fault, the breaker disconnects power to protect the system.
        After the fault is fixed, power is restored.

        Microservices use the same idea.

    Advantages
        Prevents cascading failures
        Improves availability
        Faster recovery
        Protects resources
        Better user experience

    # API Composition Pattern
     API Composition combines data from multiple microservices into one response.

     Why do we need it?
        Suppose the UI needs:
            Customer Details
            Order Details
            Payment Status

     Each belongs to a different service.
        
     Without API Composition:
        UI
        ↓
        Customer Service
            ↓
        Order Service
            ↓
        Payment Service

        Three network calls.

    Instead,
        UI makes one request.

        API Composer collects everything.

    Real-Life Analogy
     Restaurant Waiter
        You order:
            Pizza
            Cold Drink
            Dessert
        Different departments prepare them.
        The waiter brings everything together.
        The waiter acts like an API Composer.

    Advantages
        Fewer client requests
        Better performance
        Simpler frontend
        Reduced network traffic

    # Saga Pattern
     The Saga Pattern maintains data consistency across multiple microservices when each service has its own database.

     Why do we need it?
        Remember: Every service owns its own database.
        Suppose: Customer buys a laptop.

     Step 1
        Order Service
        Order Created
        
     Step 2
        Payment Service
        Payment Failed

     Now:
        Order exists,
        Payment doesn't.

        The system becomes inconsistent.

    Solution
        Saga coordinates multiple services.
        If one step fails, previous successful steps are compensated (rolled back logically).

    Real-Life Analogy
     Travel Booking
        Booking a trip:
            Flight 
            Hotel 
            Payment 

        Instead of keeping flight and hotel bookings, everything is cancelled.
        That's Saga.

    Advantages
        Data consistency
        Distributed transactions
        Reliable workflows
        Failure recovery
*/