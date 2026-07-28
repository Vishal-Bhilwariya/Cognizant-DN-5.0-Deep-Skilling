/*

    # First Understand the Problem
     Suppose your company has 10 Microservices.
        Login Service
        Order Service
        Payment Service
        Product Service
        Customer Service

        Now imagine every service asks the user to login separately.

        User
         ↓
        Login Service
        (Login Required)
            ↓
        Order Service
        (Login Again)
            ↓
        Payment Service
        (Login Again)
            ↓
        Inventory Service
        (Login Again)
            ↓
        Notification Service
        (Login Again)

    Imagine using Amazon like this.
        Open Orders → Login
        Open Payment → Login
        Open Cart → Login
        Open Profile → Login

        Impossible.

    Why do we need Centralized Authentication?
        Instead of every service authenticating users, we create one central authentication system.
                        User
                          │
                          ▼
               Authentication Server
                          │
                 User Verified
                          │
                Access Token Issued
                          │
            ┌─────────┬─────────┬─────────┐
            ▼         ▼         ▼
         Order     Payment   Inventory
         Service    Service    Service

        User logs in only once.
        All services trust the Authentication Server.

    # Centralized Authentication means Only one server is responsible for verifying the identity of every user.
      All Microservices trust this server.

    Advantages
        Single Login
        Better Security
        Easy User Management
        Easy password Change
        No Duplicate Login Logic
        Better Scalability
        Centralized User Database
        Easier Maintenance

    Disadvantages
        Authentication Server becomes critical.
        If it goes down, users cannot login.
        Therefore,companies deploy multiple Authentication Servers.
*/