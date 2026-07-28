/*

    # What is a Code Smell?
        A Code Smell is not a bug.
        It is a warning sign that indicates the code is poorly designed or difficult to maintain.

        The code may work correctly today, but its design suggests that it could become difficult to modify, understand, or extend in the future.

        Code Smell = Code that works, but is written in a poor way.

    What is Spaghetti Code (Spaghetti Design)?
        Spaghetti Code is code that has become so tangled and disorganized that it is difficult to understand or modify.
        It contains:
            Deeply nested if-else
            Long methods
            Large classes
            Repeated code
            Poor variable names
            Mixed responsibilities

        It resembles a plate of spaghetti—everything is tangled together.

    Why do we need to identify Code Smells?
     Imagine two methods.
        Method A
          calculateTax()
        15 lines
        Easy to understand.

        Method B
           processEverything()
        800 lines
        Contains:
            Login
            Payment
            Database
            Email
            Validation
            Report generation
        All inside one method.

      Which one is easier to maintain?
        Obviously, Method A.

        SonarQube identifies methods like Method B as Code Smells.

    Real-Life Analogy
      Imagine a bedroom.
     a) Clean Room
        Everything has its place.

        Easy to find things.

     b) Messy Room
        Clothes
        Books
        Laptop
        Shoes

        Everything is scattered.
        Finding anything becomes difficult.
        The room still works.
        But it's poorly organized.
        That is exactly what a Code Smell is.

    Example
      Smelly Code
        public void process(){
            int a=10;
            int b=20;
            if(a>5){
                if(b>15){
                    if(a<b){
                        System.out.println("Done");
                    }
                }
            }
        }
        Problems:
            Poor variable names
            Deep nesting

        The program works.

        But the design is poor.

     Better Version
        public void process(){
            int age = 10;
            int marks = 20;
            if(age > 5 && marks > 15 && age < marks){
                System.out.println("Done");
            }
        }

        Much easier to read.

    How to Remove Code Smells?
        Break large methods into smaller ones.
        Use meaningful variable names.
        Remove unused code.
        Remove duplicate code.
        Reduce nesting.
        Follow SOLID principles.
        Refactor regularly.
        
    Advantages of Removing Code Smells
        Easier maintenance
        Better readability
        Easier debugging
        Easier testing
        Better teamwork
        Higher code quality
        Better SonarQube report
*/