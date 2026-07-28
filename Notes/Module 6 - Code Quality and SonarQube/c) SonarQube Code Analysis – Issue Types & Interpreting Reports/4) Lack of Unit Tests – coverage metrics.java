/*

    # What is Unit Test Coverage?
        Unit Test Coverage (Code Coverage) is a metric that tells us how much of our source code is executed when unit tests run.
        Coverage = Percentage of code tested by unit tests.

    Suppose your application contains 100 lines of code.
        Your JUnit tests execute 80 of those lines.
        Then: Coverage = 80%
        This means 80% of your code has been tested, while 20% has never been executed by the tests.

    Why do we need Coverage?
    Imagine you build a car.
        You test:
            Engine 
            Brakes 
            Steering 
        Would you confidently sell the car?
        No.
        The same idea applies to software.
        If large parts of your code are never tested:
            Hidden bugs may exist.
            Changes can break functionality without being noticed.
            Developers have less confidence in the code.
        That's why companies measure coverage.

    Why does SonarQube check Coverage?
     SonarQube itself does not run unit tests.
        Instead:
            JUnit (or another testing framework) runs the tests.
            A coverage tool (such as JaCoCo) measures which lines were executed.
            SonarQube reads the coverage report and displays it.

    How is Coverage Measured?
    The basic idea is:
        Coverage (%) = (Tested Code / Total Code) × 100

    Advantages
        Improves confidence in the code.
        Helps identify untested areas.
        Encourages writing unit tests.
        Reduces the risk of regressions.
        Improves overall software quality.
*/