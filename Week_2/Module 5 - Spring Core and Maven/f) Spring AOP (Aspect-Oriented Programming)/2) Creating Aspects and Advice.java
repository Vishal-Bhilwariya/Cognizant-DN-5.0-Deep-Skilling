/*

    # What is an Aspect?
    -  An Aspect is a class that contains cross-cutting concerns like logging, security, or transaction management.
    
      Suppose you have a Banking application.
        BankService
            You want Logging for every method.

        Instead of writing Logging inside every service method,create one separate class.

        LoggingAspect : This class contains all logging logic.

        That class is called an Aspect.
    Aspect = Where the common code is written.

    # Real-Life Analogy
     Imagine a movie theater.
        Before the movie starts, an advertisement is shown.
        Advertisement
            ↓   
        Movie

        After the movie ends, feedback is collected.
        Movie
            ↓
        Feedback

        Mapping
        Movie Theater	    Spring AOP
        Advertisement	    Before Advice
        Movie	            Business Method
        Feedback	        After Advice
        Theater Manager	    Aspect

    Creating an Aspect
    Spring provides: @Aspect

     Example
        @Aspect
        @Component
        public class LoggingAspect{

        }

    # What is Advice?
     - Advice is the action performed by an Aspect at a specific time.

        Examples:
            Before method execution
            After method execution
            Around method execution
            Easy Sentence
        Advice = When that common code executes.

    Advice tells Spring when to execute the code.

     Spring provides five main types.
            Advice	        
        1) @Before	- Runs  Before method execution
                @Before(...)
                public void log(){
                    System.out.println("Logging Before");
                }
        2) @After  - Runs  After method execution (whether success or exception)
                @After(...)
                public void log(){
                    System.out.println("Logging After");
                }
        3) @AfterReturning - Runs 	After successful execution
                @AfterReturning(...)
                public void success(){
                    System.out.println("Success");
                }
        4) @AfterThrowing - Runs 	After an exception occurs
                @AfterThrowing(...)
                public void error(){
                    System.out.println("Exception Occurred");
                }
        5) @Around	   -     Runs Before and after the method
                @Around(...)
                public Object execute(){
                    System.out.println("Before");
                    System.out.println("After");
                }

    Advantages
        Removes duplicate code.
        Better separation of concerns.
        Easier maintenance.
        Centralized logging and security.
        Cleaner business logic.
*/