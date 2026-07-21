/*

    # What is Static Code Analysis?
     - Static Code Analysis is the process of examining the source code without executing (running) the program.
        A tool like SonarQube reads your .java, .js, .py, etc., files and checks whether the code follows predefined quality rules.

        Static Code Analysis means checking the code without running it.

    # What is Runtime Testing?
     - Runtime Testing means executing the application and observing whether it behaves correctly.

      Examples include:
        Unit Testing (JUnit)
        Integration Testing
        Functional Testing
        Manual Testing
        Simple Definition

      Runtime Testing means running the program and checking its behavior.

    # Why do we need both?
     Many beginners ask:
        "If I already have JUnit tests, why do I need SonarQube?"
        Because they solve different problems.
        Imagine this Java code:
            public int divide(int a, int b){
                return a / b;
            }

        Unit Test:  divide(10,2)
        Output: 5

        JUnit says: Test Passed

     But SonarQube may still report:
        Missing JavaDoc
        Poor variable naming
        Low test coverage
        Code smell
        Possible divide-by-zero risk

     So:
        JUnit checks behavior.
        SonarQube checks code quality.

    Real-Life Analogy
     Imagine buying a car.
     a) Static Inspection
            Mechanic checks:
                Engine
                Brake quality
                Tyres
                Wiring
                Oil
            The car never moves.
            This is Static Analysis.

     b) Road Test
            Now the mechanic drives the car.
            Checks:
                Speed
                Braking
                Steering
                Engine performance
            This is Runtime Testing.

    Exactly the same idea.

    # Advantages
      a) Static Code Analysis
        Finds problems before execution.
        Improves maintainability.
        Detects security issues early.
        Encourages clean code.
        Saves code review time.
        Works well in CI/CD pipelines.
     
      b) Runtime Testing
        Verifies actual program behavior.
        Detects runtime exceptions.
        Confirms business logic.
        Validates outputs.
        Ensures features work as expected.
*/