/*

    # What is a Quality Profile?
     - A Quality Profile is a collection of coding rules that SonarQube uses to analyze your source code.

        Think of it as a rulebook that tells SonarQube: "These are the rules you should check while analyzing my code."


        Quality Profile = Rules to check code.

        Why do we need it?
        Different organizations follow different coding standards.

        For example:
            Company A requires every public method to have comments.
            Company B doesn't enforce comments but has strict security rules.

        Instead of using the same rules for everyone, SonarQube allows organizations to create custom rule sets.
        
        Example - Suppose your Java project has these rules:
                    Variable names must be meaningful.
                    No unused variables.
                    Avoid duplicate code.
                    Maximum method length = 50 lines.

        These rules together form a Quality Profile.

    Imagine a school exam.
     - Before checking answer sheets, the teacher prepares a marking scheme.
        That marking scheme tells the teacher:
            What is correct.
            What is wrong.
            How many marks to deduct.

        That marking scheme is like a Quality Profile.

    # What is a Quality Gate?
     - A Quality Gate is a set of conditions that determines whether the analyzed project passes or fails the quality check.

        Quality Gate = Pass or Fail decision.

     Why do we need it?
        Imagine SonarQube finds:
            100 Bugs
            50 Security Issues
            200 Code Smells

        Should the project still be deployed?
            Maybe not.

        A Quality Gate decides whether the project meets the minimum quality standards.

    Example 
       A Quality Gate might require:
            Bugs = 0
            Security Vulnerabilities = 0
            Code Coverage ≥ 80%
            Duplicated Code < 3%

        If all conditions are met:  Quality Gate Passed
        Otherwise: Quality Gate Failed

    Difference Between Quality Profile and Quality Gate
        Quality Profile	                        Quality Gate
        Collection of rules	                Collection of conditions
        Used during code analysis	        Used after analysis
        Decides what to check	            Decides whether to pass or fail
        Example: "No unused variables"	    Example: "No bugs allowed"

    Example
        Suppose SonarQube has these rules:
        Quality Profile
            ✔ No unused variables
            ✔ No duplicate code
            ✔ Method length < 50 lines
            ✔ Follow naming conventions

        After checking, SonarQube finds:
            Bugs = 1
            Coverage = 85%
            Duplicated Code = 2%

        Now the Quality Gate evaluates:
            Bugs must be 0 
            Coverage ≥ 80% 
            Duplicated Code < 3% 

        Final Result: QUALITY GATE FAILED

        Even though most conditions passed, one failed condition caused the Quality Gate to fail.

*/