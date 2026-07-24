/*

    # Database per Service :
    - Each Microservice should have its own dedicated database.
    - No other microservice should directly read or write its database.

    Imagine an E-Commerce application.
     Instead of one database, each service owns its own.

        Order Service
              │
         Order Database

        Payment Service
              │
        Payment Database

        Inventory Service
              │
        Inventory Database

        Notification Service
              │
        Notification Database

        Each service controls its own data.

    Why do we need Database per Service?
     Suppose all services share one database.
        Order Service
                │
        Payment Service
                │
        Inventory Service
                │
         Shared Database

    Problems:
        Tight coupling
        One schema change affects everyone
        Difficult deployment
        Poor scalability
        Security issues

    # Event Sourcing :
    - Instead of storing only the current state, store every event that happened.
      The current state can always be recreated from those events.

      Traditional Database
       Suppose a bank account.
        Balance today:
            Balance = ₹7000
            Only current value is stored.

        You don't know how it became ₹7000.

      Event Sourcing
        Instead, store every event.

        Account Created
            ↓
        ₹5000 Deposited
            ↓
        ₹2000 Deposited
            ↓
        ₹1000 Withdrawn
            ↓
        ₹1000 Deposited

        Now current balance can always be calculated.

    Why do we need Event Sourcing?
        Suppose customer says "I lost ₹500."

        How will you investigate?
        Traditional database - Only latest balance exists.
                Impossible to trace history.

        Event Sourcing - Complete history is available.

    Advantages
        Complete audit history
        Easy debugging
        Event replay
        Better analytics
        Supports Event-Driven Architecture
        
    Disadvantages
        Complex implementation
        Large storage requirement
        Harder querying

    # CQRS (Command Query Responsibility Segregation) :
    - CQRS separates 'Write Operations' and 'Read Operations' into different models.

    Why do we need CQRS?
      Traditional application
        One Database
            ↓
        Reads
            ↓
        Writes

        Both operations use the same model.
        Heavy read traffic slows writes.
        Heavy writes slow reads.
        CQRS separates them.

    ASCII Diagram
                 Client

            ┌────────────┐

            ▼            ▼

    Command Model   Query Model

            │            │

            ▼            ▼

     Write Database  Read Database

    Command -> Command changes data.
        Examples:
            Insert
            Update
            Delete
        
    Query ->     Query only reads data.
        Examples:
            Search
            Get Details
            View Products

    Advantages
        Better performance
        Better scalability
        Faster reads
        Independent optimization
        Easier maintenance
*/