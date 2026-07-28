/*

    # What is Duplicate Code?
     - Duplicate Code means the same or very similar code is written in multiple places within a project.
     - Instead of writing the logic once and reusing it, developers copy and paste the same code.

    Why do developers create Duplicate Code?
        Usually, developers create duplicate code because:
            They want a quick solution.
            Copy-paste is easier than creating a reusable method.
            They don't know about code reusability.
            Large teams accidentally implement the same logic in different classes.
        Initially, it seems faster, but later it becomes difficult to maintain.

    Why is Duplicate Code a Problem?
     Imagine the same code is copied into 10 different files.
     Now suppose there is a bug in that code.
     You must fix it 10 times instead of just once.
        This increases:
            Maintenance effort
            Chances of missing one copy
            Bugs
            Development time
        This is why SonarQube reports duplicate code.

    Enterprise Example
     Suppose an e-commerce application calculates discounts.
     Instead of writing:
        Discount calculation in Order Service
        Discount calculation in Cart Service
        Discount calculation in Checkout Service

     the company creates a single: DiscountService
        Every module calls this service.

    Benefits:
        One implementation
        Easy maintenance
        Fewer bugs
    
    How to Reduce Duplicate Code?
        Common techniques include:
            Create reusable methods
            Create utility/helper classes
            Use inheritance (when appropriate)
            Use composition
            Follow the DRY Principle
    DRY Principle
        One of the most important software engineering principles.

        DRY = Don't Repeat Yourself

        Meaning:Every piece of knowledge or logic should have one authoritative implementation.

    Advantages of Removing Duplicate Code
        Easier maintenance
        Less code to manage
        Fewer bugs
        Better readability
        Faster updates
        Improved code quality
        Better SonarQube score
*/  