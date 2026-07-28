/*

    # Aspect-Oriented Programming (AOP) :
    - Aspect-Oriented Programming (AOP) is a programming paradigm that separates common functionalities (cross-cutting concerns) from the main business logic.

    Suppose you're building an Online Banking Application.
        You have methods like:
            Transfer Money
            Check Balance
            Deposit Money
            Withdraw Money

        Each method performs its own business logic.
        But before every operation, you also want to:
            Log the request
            Check user authentication
            Check authorization
            Measure execution time

        Without AOP, you'll write this code in every method.`
        With AOP, you write it once, and Spring automatically applies it wherever needed.

    Why Do We Need AOP?
     Imagine this code.
        public void transferMoney() {
            // Logging
            // Security Check
            // Business Logic
        }

     Another method:
        public void withdrawMoney() {
            // Logging
            // Security Check
            // Business Logic
        }

     Another:
        public void depositMoney() {
            // Logging
            // Security Check
            // Business Logic
        }

     Notice the repetition?
        The Logging and Security code is repeated everywhere.
        This is called a Cross-Cutting Concern.
    
    # Problem Without AOP :
        Transfer()
        │
        ├── Logging
        ├── Security
        └── Business Logic

        Withdraw()
        │
        ├── Logging
        ├── Security
        └── Business Logic

        Deposit()
        │
        ├── Logging
        ├── Security
        └── Business Logic
     Problems:
        Code duplication
        Hard maintenance
        Difficult debugging
        Changes required in many places
     Solution with AOP
        Write Logging and Security only once.
        Spring automatically applies them where required.
                        Logging
                           │
                           ▼
        Transfer()    Business Logic

        Withdraw()    Business Logic

        Deposit()     Business Logic

                           ▲
                           │
                       Security
     What is a Cross-Cutting Concern?
      -  A Cross-Cutting Concern is a functionality that is used across multiple parts of an application.

      Examples
        Cross-Cutting Concern	     Description
        Logging	                Record application activity
        Security	            Authentication & Authorization
        Transaction Management	Commit/Rollback database changes
        Exception Handling	    Handle errors
        Performance Monitoring	Measure execution time
        Caching	                Improve performance

    Advantages
        Eliminates duplicate code.
        Improves code readability.
        Better separation of concerns.
        Easier maintenance.
        Reusable common functionalities.
        Cleaner business logic.
*/