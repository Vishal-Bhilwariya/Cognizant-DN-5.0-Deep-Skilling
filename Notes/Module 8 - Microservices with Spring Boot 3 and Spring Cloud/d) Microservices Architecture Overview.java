/*

    # Components of Microservices Architecture
    - A Microservices Architecture is a collection of components that work together to run multiple independent microservices as a single application.

     Main Components
      A typical enterprise architecture contains:
            Client (Browser/Mobile)
                ↓
            API Gateway
                ↓
            Service Discovery
                ↓
            Microservices
                ↓
            Databases

      Additionally, in production we also have:
            Config Server
            Monitoring
            Logging
            Security
            Message Broker
            Circuit Breaker

            You'll study these later.

    Why do we need these components?
        Imagine Amazon has:
            Login Service
            Product Service
            Order Service
            Payment Service
            Inventory Service
            Shipping Service

        Without any architecture, the client would need to know the IP address of every service.
            Browser
                ↓
            Login → 192.168.1.20
                ↓
            Order → 192.168.1.25
                ↓
            Payment → 192.168.1.40

            This is difficult to manage.
            Instead, we introduce dedicated components.

    Diagram
                   Users
                     │
          Mobile / Web Browser
                     │
                     ▼
              +----------------+
              |   API Gateway  |
              +----------------+
                     │
                     ▼
         +-------------------------+
         |   Service Discovery     |
         +-------------------------+
          │        │         │
          ▼        ▼         ▼
   Login Service Product  Order Service
       │         Service        │
       ▼            │           ▼
 Login DB      Product DB   Order DB

    This is the basic Microservices Architecture.

    Real-Life Analogy
     Office Reception
        Imagine a company office.
        Visitors never directly enter different departments.
        They first go to the Reception Desk.
        Reception then directs them to:
            HR
            Finance
            IT
            Sales
        Here:
            Reception = API Gateway
            Employee Directory = Service Discovery
            Departments = Microservices

    # Service Discovery
     Service Discovery is a mechanism that helps microservices find and communicate with each other automatically.
        Why do we need it?
        Suppose Order Service wants to call Payment Service
        If Payment Service's IP changes:
        Old IP 192.168.1.10
        becomes
        New IP 192.168.1.25

     How will Order Service know?
        Hardcoding IP addresses is not practical.

     Solution
        Use Service Discovery.
        Every service registers itself.
        Payment Service
            ↓
        Registers
            ↓
        Service Discovery

     Now Order Service asks:
        Where is Payment Service?
        Service Discovery replies:
            Payment Service
                ↓
            192.168.1.25

        No hardcoded IPs required.

    Real-Life Analogy
        Mobile Contacts
        You don't remember everyone's phone number.
        You search the contact list.
        Similarly, Microservices search Service Discovery instead of remembering IP addresses.

    # API Gateway
     - An API Gateway is the single entry point for all client requests.
        Clients never directly access microservices.

     Why do we need it?
        Without API Gateway:
            Client
                ↓
            Login Service
                ↓
            Product Service
                ↓
            Payment Service
                ↓
            Order Service

        The client must know every service URL.
        This becomes difficult and insecure.

        With API Gateway:
            Client
                ↓
            API Gateway
                ↓
            Required Service

        Only one endpoint is exposed.

    Diagram
             Client
                │
                ▼
        +----------------+
        |  API Gateway   |
        +----------------+
         │      │      │
         ▼      ▼      ▼
      Login  Product  Order
      Service Service Service

    Responsibilities of API Gateway
        Request Routing
        Authentication
        Authorization
        Rate Limiting
        SSL Termination
        Request Logging
        Load Balancing
        Response Aggregation

        We'll study many of these later.

    Real-Life Analogy
            Airport Security
        Passengers don't directly enter aircraft.
        Everyone first passes through:
            Security
            Verification
            Gate

        Similarly,
        Every request first passes through API Gateway.
    
    # Load Balancing
     - Load Balancing distributes incoming requests among multiple instances of the same service.

     Why do we need it?
        Suppose Search Service receives: 10 Lakh Requests

        One server cannot handle all requests.
        Instead, Run multiple instances.

    Diagram
                 Users
                   │
                   ▼
            Load Balancer
          ┌──────┼──────┐
          ▼      ▼      ▼
     Search1 Search2 Search3

      Instead of one server becoming overloaded, traffic is shared.

    Common Algorithms
        Algorithm	                    Description
        Round Robin	            Requests go one by one to each server
        Least Connections	    Send request to the least busy server
        Random	                Random server selection
        Weighted Round Robin	Powerful servers receive more requests
        
    Real-Life Analogy
     Bank Counters
        Customers arrive.
        Manager sends them to:
            Counter 1
            Counter 2
            Counter 3
        No single counter becomes overloaded.

        That's Load Balancing.

    Advantages
        High Availability
        Better Performance
        Fault Tolerance
        Horizontal Scalability
        Better User Experience
*/