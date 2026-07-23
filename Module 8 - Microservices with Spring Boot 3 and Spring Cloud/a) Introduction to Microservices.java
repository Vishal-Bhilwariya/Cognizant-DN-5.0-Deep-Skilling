/*

    # What are Microservices?
     - Microservices is an architectural style where a large application is divided into multiple small, independent services, and each service performs one specific business function.
        Each microservice:
            Has a single responsibility
            Runs independently
            Can be developed independently
            Can be deployed independently
            Communicates with other services through APIs or messages

    Imagine you are building an Amazon-like application.
     - Instead of creating one huge Spring Boot application containing:
        Login
        Product
        Order
        Payment
        Delivery
        Notification

     You create separate Spring Boot applications.
        Login Service
        Product Service
        Order Service
        Payment Service
        Delivery Service
        Notification Service

        Each is called a Microservice.
        Together they behave like one application.

    # Why do we need Microservices?
        To understand this, first understand the problem.

        Imagine an Online Shopping Website
        Initially, 10 developers build this application.
        Everything is inside one project.

            Shopping Application
            │
            ├── Login
            ├── Products
            ├── Orders
            ├── Payments
            ├── Delivery
            ├── Notification

        Initially everything works fine.
        After 5 years...

        Now:
            100 developers
            Millions of users
            Hundreds of features

      Problems begin.
        Problem 1 — Huge Project
            The application becomes very large.
            One Project
                ↓
            50 lakh lines of code

            Finding bugs becomes difficult.
            Understanding code becomes difficult.
            New developers need months to understand it.

        Problem 2 — Deployment Problem
            Suppose you only change: Notification Module
            Even then, You must deploy the entire application.
            Changed
                ↓
            Notification
                ↓
            Deploy Everything

            Waste of time.

        Problem 3 — Scaling Problem
            Suppose during Diwali,
            Search receives huge traffic.
            Search 500000 Requests
            But Login receives only:
            1000 Requests
            Still, Entire application must be scaled.
            Huge infrastructure cost.

        Problem 4 — One Bug Can Affect Everything
            Suppose Payment crashes.
            Sometimes the whole application goes down because everything is tightly connected.

            
        Solution
            Split the application.
            Each feature becomes one independent service.
        That is Microservices.

    # Diagram
        Monolithic Architecture
                           Users
                             │
                             ▼
              +--------------------------------+
              |      One Spring Boot App       |
              |--------------------------------|
              | Login                          |
              | Product                        |
              | Order                          |
              | Payment                        |
              | Delivery                       |
              | Notification                   |
              +--------------------------------+
                             │
                             ▼
                      One Database
        
        Microservices Architecture
                             Users
                               │
                               ▼
                         API Gateway
              ┌──────────┼──────────┐
              ▼          ▼          ▼
         Login Service Product Service Order Service
                                       │
                                       ▼
                              Inventory Service
                                       │
                                       ▼
                              Payment Service
                                       │
                                       ▼
                           Notification Service

        Each service usually has its own database.

    Advantages
     Business Advantages
        Faster development
        Faster deployment
        Independent teams
        Easy maintenance
        Better scalability
        Fault isolation
        Easier technology upgrades
        Cloud-friendly architecture
     Technical Advantages
        Independent deployment
        Independent databases
        Better modularity
        Better CI/CD support
        Easier testing of individual services
*/