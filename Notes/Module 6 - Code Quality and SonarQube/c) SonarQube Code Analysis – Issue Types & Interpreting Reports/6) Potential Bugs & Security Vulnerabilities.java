/*

    # What is a Potential Bug?
        A Potential Bug is a piece of code that may cause incorrect behavior, runtime exceptions, or unexpected results.
        It is called "potential" because SonarQube predicts that the code could fail, even if it hasn't failed yet.

        Potential Bug = Code that may behave incorrectly or crash in the future.

    # What is a Security Vulnerability?
     A Security Vulnerability is a weakness in the code that an attacker could exploit to:
        Access unauthorized data
        Modify information
        Execute malicious actions
        Compromise the application

        Security Vulnerability = A security weakness that attackers can exploit.

    Why do we need to detect them?
     Imagine a banking application.
        If there's a bug:
            Money Transfer
                 ↓
            Wrong Amount Calculated

        Customers lose money.

        If there's a security vulnerability:
                Hacker
                  ↓
                Steals Customer Data

        The company may suffer financial and reputational damage.
        That's why SonarQube checks both.

    Why does SonarQube detect these?
        SonarQube scans your source code and compares it against predefined rules.
        It looks for patterns that commonly lead to:
            Runtime errors
            Logical mistakes
            Security attacks

        It warns developers before the application is deployed.

    Examples of Potential Bugs
     Null Pointer Exception
        String name = null;
        System.out.println(name.length());

        Problem: name is null.
        Calling length() causes: NullPointerException

        SonarQube warns you about this.

    Examples of Security Vulnerabilities
     SQL Injection 
        One of the most common interview questions.
        Bad

        String query = "SELECT * FROM users WHERE id=" + userInput;

        If the user enters malicious SQL, the query can be manipulated.
        Better

        Use Prepared Statements or parameterized queries.

    Real-Life Analogy
     Potential Bug
        Imagine a bridge with a small crack.
        People may cross it today.
        But one day it may collapse.
        That crack is like a Potential Bug.

     Security Vulnerability
        Imagine your house.
        The main door has no lock.
        Nothing has been stolen yet.
        But anyone can enter.
        That's a Security Vulnerability.

    Enterprise Usage
        In companies like Cognizant, SonarQube runs during the CI/CD pipeline.
        If it detects:
            Critical Bugs
            Critical Security Vulnerabilities

        the Quality Gate may fail.

    Advantages of Detecting Them Early
        Prevents application crashes.
        Improves reliability.
        Protects sensitive data.
        Reduces production issues.
        Saves debugging time.
        Improves customer trust.
*/