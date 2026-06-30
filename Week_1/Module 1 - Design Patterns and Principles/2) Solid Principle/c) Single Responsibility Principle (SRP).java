/*
    # S — Single Responsibility Principle (SRP)
    - A class should have only one responsibility (one job) and only one reason to change.

    A class should perform only one specific task.
        If a class performs multiple tasks, it violates SRP.
    Formula
        One Class = One Responsibility = One Reason to Change

    Why Do We Need SRP?
        Imagine a class called Employee.
         It does everything.
            Stores employee details
            Calculates salary
            Saves data to database
            Sends email
            Generates reports
        Employee Class
            ↓
        Store Data
            ↓
        Calculate Salary
            ↓
        Save to Database
            ↓
        Send Email
            ↓
        Generate Report

        Problem?
            If email logic changes,
            Employee class changes.
            If database changes,
            Employee class changes.
            If salary changes,
            Employee class changes.
         One class has many reasons to change.
         This violates SRP.

Without SRP : One class -> Many responsibilities.
    +-----------------------+
    |      Employee         |
    +-----------------------+
    | Store Data            |
    | Calculate Salary      |
    | Save Database         |
    | Send Email            |
    | Generate Report       |
    +-----------------------+

With SRP : Each class has one responsibility.
                 Employee
                     |
        -----------------------------
        |       |        |          |
    Salary   Database   Email    Report
    Service   Service   Service   Service

# Advanatages : 
    Easy Maintenance
    Easy Debugging
    Easy Testing
    Better Code Reusability
    Less Coupling
    Clean Code
    Easier Team Collaboration
# Disadvantages
    More classes are created.
    Small projects may seem to have extra files.

However, for large projects, SRP is highly beneficial
*/