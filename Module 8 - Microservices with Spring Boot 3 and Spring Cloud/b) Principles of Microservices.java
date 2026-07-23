/*

    # Single Responsibility Principle (SRP) :
    - A Microservice should perform only one business function.
    - Each service should have one and only one responsibility.

    Why do we need SRP?
     Imagine Amazon.
        Suppose Payment Service contains:
            Payment
            Login
            Notifications
            Orders

        Now the Payment Team wants to update payment logic.

        They accidentally affect Login.
        Result: Unexpected bugs.

     With SRP,
        Payment Service
            ↓
        Only Payment

        No other functionality is affected.

    # Decentralized Data Management 
    - Each Microservice should own its own database.
    - No service should directly access another service's database.

    Why do we need it?
     Imagine:
        Order Service
            ↓
        Shared Database
            ↑
        Payment Service

        Now Payment changes a table.
        Order Service breaks.
        Both become tightly coupled.

     Instead,
        Order Service
            ↓
        Order Database

        Payment Service
            ↓
        Payment Database

        Each service manages its own data.

    Real-Life Analogy
     Different Bank Departments
        Loan Department
            ↓
        Own records

        Accounts Department
            ↓
        Own records

        HR Department
            ↓
        Own records

        Nobody edits another department's files directly.

        Advantages
            Loose coupling
            Independent schema changes
            Better security
            Easier scaling
            Independent backups
            Better fault isolation

    Continuous Delivery & Deployment (CD/CD)
        Every microservice should be deployable independently.
        A new version of one service should not require deploying the entire application.

      Why do we need it?
        Suppose only Notification changes.

        Monolith
            Deploy
            Entire Application

        Microservices
            Deploy
            Only Notification Service

        Much faster.

    Real-Life Analogy
     Mobile Apps
        WhatsApp receives an update.
        Instagram does not.
        Each app updates independently.

     Similarly,
        Each Microservice is deployed independently.

    Advantages
        Faster releases
        Less downtime
        Smaller deployments
        Easier rollback
        Lower deployment risk

    # Scalability & Flexibility
     Each Microservice should scale independently based on demand.

     Why do we need it?
      Suppose
            Search receives
            10 lakh requests.
            Payment receives
            1000 requests.

         Monolith
            Scale Everything
            Waste of money.

         Microservices
            Scale Only
            Search Service

        Very efficient.

    Advantages
        Better performance
        Lower infrastructure cost
        High availability
        Better cloud utilization
        Supports millions of users
*/