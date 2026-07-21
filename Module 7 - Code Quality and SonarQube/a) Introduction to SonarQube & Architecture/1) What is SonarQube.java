/*

    # What is SonarQube?
     - SonarQube is an open-source code quality inspection tool that automatically analyzes your source code and identifies issues such as:
        Bugs 
        Security Vulnerabilities
        Code Smells
        Duplicate Code
        High Complexity
        Low Test Coverage

        It helps developers write clean, secure, maintainable, and reliable code.

     SonarQube is like an automatic code reviewer that checks your code before it reaches production.
     Think of it as Grammarly, but for programming code.

    Suppose you wrote a Java program.
        It compiles.
        It runs.
        It gives the correct output.

        Does that mean the code is perfect?
        No.

        It may still have:
            unnecessary code
            repeated code
            security issues
            poor naming
            very complex methods
            bad design

        Humans may miss these issues during code reviews.
        SonarQube checks them automatically.

    # Why do we need SonarQube?
     Before SonarQube existed...

        Developers had to:
            review thousands of lines manually
            search for bugs
            verify coding standards
            detect duplicate code
            estimate code quality
        This consumed a lot of time.
        As software projects grew, manual reviews became impractical.
        SonarQube automates much of this work.

    Real-World Usage
     Large companies use SonarQube to:
        Maintain coding standards
        Reduce bugs
        Improve security
        Keep code easy to maintain
        Prevent poor-quality code from being released

        This is why SonarQube is commonly integrated into enterprise CI/CD pipelines.

    Benefits of SonarQube
        Benefit	                        Explanation
        Detects Bugs	            Finds possible programming mistakes before release.
        Improves Security	        Identifies security vulnerabilities.
        Better Maintainability	    Encourages clean, readable code.
        Detects Duplicate Code	    Reduces copy-paste issues.
        Measures Complexity	        Highlights code that is hard to understand or maintain.
        Team Standards	            Ensures all developers follow consistent coding practices.
        Saves Review Time	        Automates many checks that would otherwise be manual.
        CI/CD Integration	        Can automatically analyze code during builds and deployments.

    Code Example (Interview-Oriented)
     Suppose a developer writes:
        public void process() {
            int a = 10;      // Used
            int b = 20;      // Unused variable
            if(a > 5) {
                if(a > 8) {
                    if(a > 9) {
                        System.out.println("Hello");
                    }
                }
            }
        }

     SonarQube may report:
        Unused variable (b)
        High complexity due to nested if statements
        Suggestion to simplify the method

        The code still runs, but SonarQube highlights areas for improvement.

    Output (if applicable)
     There is no console output.

     Instead, SonarQube generates a report that may look like:
        Project Status
        Bugs : 2
        Security Issues : 1
        Code Smells : 15
        Duplicated Code : 4%
        Coverage : 82%
        Quality Gate : Passed

        This report helps the team decide what needs attention.

    # Advantages
        Improves software quality.
        Finds bugs early.
        Detects security vulnerabilities.
        Promotes clean code practices.
        Reduces maintenance costs.
        Integrates well with CI/CD pipelines.
        Supports many programming languages.
        Useful for both individual developers and large teams.
*/