/*

    # What is a SonarQube Report?
     A SonarQube Report is a summary of the code analysis performed by SonarQube.
        It shows:
            Bugs
            Security Vulnerabilities
            Code Smells
            Coverage
            Duplicate Code
            Cyclomatic Complexity
            Quality Gate Status
            Simple Definition

        SonarQube Report = Health Report of your source code.

    Reading a SonarQube Report
     Suppose the dashboard shows:
            Project : Banking Application
            Quality Gate : FAILED
            --------------------------------
            Bugs               : 2
            Vulnerabilities    : 1
            Code Smells        : 18
            Coverage           : 68%
            Duplicate Code     : 5%
            Complexity         : High

            Let's understand each metric.

    Which Issues Should Be Fixed First?
        Priority	    Issue
        Highest	    Security Vulnerabilities
        High	    Bugs
        Medium	    Low Coverage
        Medium	    High Complexity
        Medium	    Duplicate Code
        Low	Minor   Code Smells / Comments

    Advantages of SonarQube Reports
        Detects problems early.
        Improves software quality.
        Improves security.
        Encourages better coding practices.
        Supports CI/CD automation.
        Saves maintenance cost.
*/