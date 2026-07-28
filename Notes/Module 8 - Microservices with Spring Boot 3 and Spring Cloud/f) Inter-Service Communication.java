/*

    # Inter-Service Communication
        Inter-Service Communication is the process by which one microservice communicates with another microservice to complete a business operation.
        Unlike a Monolithic application (where classes call each other directly), microservices are separate applications running on different servers or containers. Therefore, they communicate over a network.

    Suppose a customer places an order.
     The Order Service cannot complete everything by itself.
        It needs help from:
            Inventory Service
            Payment Service
            Notification Service
        So the services communicate with each other.
    
    Why do we need it?
        A single business operation usually involves multiple services.
        Example:
            Order Service
                ↓
            Inventory Service
                ↓
            Payment Service
                ↓
            Notification Service

    Communication Types
        There are two major ways microservices communicate.
        Inter-Service Communication
                │
         ┌──────┴────────┐
         ▼               ▼
        Synchronous   Asynchronous

    # Synchronous Communication
        The sender sends a request and waits until the receiver responds.

    Types
        REST ( Representational State Transfer )
        gRPC ( Google Remote Procedure Call )

    REST
        Uses HTTP and JSON.
        Easy to understand and widely used.

    gRPC
        Uses HTTP/2 and Protocol Buffers.
        Faster than REST and mainly used for internal communication.

    Real-Life Analogy
        Phone Call
        You wait until the other person replies.

    Advantages
        - Immediate response
        - Easy implementation
        - Simple debugging
        - REST is widely supported
        - gRPC offers very high performance


    # Asynchronous Communication
        The sender sends a message and continues its work without waiting
        for the receiver.

    Types
        Message Queue
        Event Streaming

    Message Queue
        Examples:
            RabbitMQ
            ActiveMQ

        Usually one consumer processes one message.

    Event Streaming
        Examples:
            Apache Kafka
            Apache Pulsar

        One event can be consumed by multiple services.

    Real-Life Analogy
        Email
        You send the email and continue your work.
        The receiver reads it later.

    Advantages
        - Better scalability
        - Loose coupling
        - Reliable communication
        - Suitable for long-running tasks


    # Handling Failures & Retries
        In distributed systems, network failures are common.
        Microservices must know how to recover safely.

     Common Failures
        Network timeout
        Service unavailable
        Slow response
        Server crash
        Database unavailable
        
    Retry
        Instead of failing immediately, retry the request.

      Example
        Request
            ↓
        Failed
            ↓
        Retry
            ↓
        Retry
            ↓
        Success
        
     Why Retry?
        Sometimes failures are temporary.
     Example:
        Payment Service restarts.
        Retry after 2 seconds.
        Now it works.

     Retry Strategies
        Fixed Retry - Every 2 Seconds
        Exponential Backoff
            Retry 1 → 1 sec
            Retry 2 → 2 sec
            Retry 3 → 4 sec
            Retry 4 → 8 sec

        Very common in production.

    Fallback
        Suppose Payment Service is unavailable.
        Instead of crashing,

        show:
            Payment Service is temporarily unavailable.
            Please try again later.

        Better user experience.

    Circuit Breaker + Retry
        Often used together.

        Failure
         ↓
        Retry
        ↓
        Still Failed
        ↓
        Circuit Breaker Opens
        ↓
        Fallback Response
        
    Real-Life Analogy
        ATM

        ATM cannot contact the bank.
        It retries.
        If still unsuccessful,
        it shows: "Service Temporarily Unavailable"
        instead of crashing.

    Advantages
        Better reliability
        Better availability
        Better user experience
        Handles temporary failures
        
        
*/