/*

    # What is a Join Point? 
    - A Join Point is a point during program execution where Spring AOP can apply Advice.
    - Examples:
        Method execution
        Exception handling
        Field access
        Object creation

     Suppose your application has:
        login()
        register()
        transferMoney()
        logout()

        Every method execution is a possible place where Spring can run Logging, Security, etc.
        Each of these possible places is called a Join Point.
       
    Application
        │
        ├── login()
        ├── register()
        ├── transferMoney()
        ├── withdrawMoney()
        ├── logout()

        Every method is a Join Point.

    # What is a Pointcut?
     - A Pointcut is an expression (rule) that selects which Join Points should execute the Advice.

        Imagine you have 100 methods.
            You don't want Logging on all of them.
            You only want Logging for:
                transferMoney()
                withdrawMoney()

        A Pointcut tells Spring: "Apply Advice only to these methods."
    Application
        │
        ├── login()
        ├── register()
        ├── transferMoney()   ✅ Selected
        ├── withdrawMoney()   ✅ Selected
        ├── logout()

        Only the selected methods receive the Advice.

            Application
                 │
                 ▼
            Join Points
            (All Methods)
                 │
                 ▼
            Pointcut
            (Select Methods)
                 │
                 ▼
            Advice
            (Logging / Security)
                 │
                 ▼
            Business Method Executes

    Advantages
        Fine-grained control over where Advice executes.
        Avoids unnecessary Advice execution.
        Improves performance by targeting only required methods.
        Keeps AOP configuration organized.
*/