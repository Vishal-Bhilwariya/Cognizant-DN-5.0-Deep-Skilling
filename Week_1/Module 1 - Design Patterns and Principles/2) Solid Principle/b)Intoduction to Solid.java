/*
# Problem Without Design Principles :
 - Without Design Principles, software becomes hard to understand, difficult to maintain, and expensive to modify.
 - Design Principles provide rules and best practices to write clean, flexible, reusable, and maintainable code.

 Imagine you build a Bank Management System.
    Initially, it has only one feature:
        Deposit Money

    Everything works fine.

    After a few months, the client asks for:
        Withdraw Money
        UPI Payment
        Credit Card Payment
        Loan Management
        Net Banking

    You keep adding code to the same class.

    After some time: One class becomes 2000+ lines long.

    Now the code becomes:
        Difficult to read
        Difficult to debug
        Difficult to test
        Difficult to modify

    This is called Poor Software Design.

    # Some Examples Problems Without Design Principles
        Problem 1: Code Duplication
            The same code is written again and again.
            Example
                class Car {
                    void start() {
                        System.out.println("Starting...");
                    }
                } 
                class Bike {
                    void start() {
                        System.out.println("Starting...");
                    }
                }
                Same logic is repeated.
                This increases maintenance effort
        Problem 2: Tight Coupling
            Two classes become highly dependent.
                Customer
                    |
                    ▼
                Payment
                    |
                    ▼
                Bank

            If the Bank class changes,
            Customer may also need changes.
            One small modification breaks multiple classes.
        Problem 3: Low Reusability
            Suppose login code exists only inside one class.

                EmployeeSystem
                    ↓
                Login Code

            Now another project needs login.
            You cannot reuse it easily.
            You rewrite it again.
        Problem 4: Difficult Maintenance
            Imagine a class with 5000 Lines
            Inside it:
                Login
                Payment
                Report
                Database
                Email
                Notifications
            Finding one bug becomes difficult.
        Problem 5: Difficult Testing
            Testing one method becomes difficult because every class depends on many other classes.    
            Small changes may break many test cases.
        Problem 6: Difficult Extension
            Suppose your payment application supports:
                UPI
            Tomorrow the client asks for:
                Credit Card

            If your code is poorly designed,
            you modify existing code.
            Now another feature breaks.
            This increases bugs.
    # Real-Life Analogy 
        Imagine a cupboard.
            Everything is stored in one drawer.
                Books
                Clothes
                Laptop
                Shoes
                Files
                Medicine
                Money
            Need a passport?
                You search everything.
                Very difficult.
                Now imagine an organized cupboard.
                Drawer 1 → Clothes
                Drawer 2 → Books
                Drawer 3 → Documents
                Drawer 4 → Electronics
                Everything is easy to find.
            Design Principles organize software in the same way.

    Why SOLID Was Introduced?
        To solve the problems of Poor Software Design
        By providing principles that lead to:
            Flexible Code
            Maintainable Code
            Scalable Code
            Reusable Code
            Testable Code
        SOLID Principles were introduced to solve these problems.    
            Problem	                SOLID Solution
        Large classes	    SRP (Single Responsibility Principle)
        Difficult extension	OCP (Open/Closed Principle)
        Wrong inheritance	LSP (Liskov Substitution Principle)
        Large interfaces	ISP (Interface Segregation Principle)
        Tight coupling	    DIP (Dependency Inversion Principle)
*/