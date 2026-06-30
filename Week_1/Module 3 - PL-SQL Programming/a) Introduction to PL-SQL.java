/*

    # What is SQL?
     - SQL (Structured Query Language) is a language used to communicate with a database.
        Using SQL, we can:
            Create tables
            Insert records
            Update records
            Delete records
            Retrieve (fetch) data
        Example:
            SELECT * FROM Student;
        This command fetches all records from the Student table.

    # What is PL/SQL?
    -> PL/SQL (Procedural Language/Structured Query Language) is Oracle's extension of SQL.
     It combines:
        SQL (Database Operations)
        Procedural Programming (Logic)

    This means PL/SQL can perform database operations and programming tasks such as:
        Variables
        Loops
        Conditions
        Functions
        Procedures
        Exception Handling
    Formula : PL/SQL = SQL + Programming Features

    # Why Do We Need PL/SQL?
        Suppose we want to:
            Check if a student's marks are greater than 40.
            If yes, display "Pass".
            Otherwise, display "Fail".
            Can SQL do this easily?
        SQL is mainly designed to query and manipulate data.
        Complex programming logic becomes difficult.
        PL/SQL solves this problem.

    # Importance of PL/SQL in Database Management
        PL/SQL helps us:
            Write business logic inside the database.
            Improve performance by reducing communication between the application and database.
            Handle errors using exception handling.
            Create reusable procedures and functions.
            Improve security by restricting direct table access.

    SYNTAX : 
        DECLARE
           -- Variable Declaration
        BEGIN
           -- Executable Statements
        EXCEPTION
           -- Error Handling
        END;

    Example : 
        -- BEGIN marks the start of the executable section
        BEGIN
           -- Print a message on the output screen
           DBMS_OUTPUT.PUT_LINE('Hello, PL/SQL!');
        -- END marks the end of the PL/SQL block
        END;
    /
    Output : Hello, PL/SQL!
    Explanation
        BEGIN → Starts the executable block.
        DBMS_OUTPUT.PUT_LINE() → Displays output.
        'Hello, PL/SQL!' → Message to print.
        END; → Ends the block.
        / → Executes the PL/SQL block in Oracle tools like SQL*Plus or SQL Developer.
   # Java vs PL/SQL Comparison
            Java	                                           PL/SQL
        General-purpose programming language	Database programming language
        Runs on JVM	                            Runs inside Oracle Database
        Used to build applications	            Used to write database logic
        Supports variables, loops, methods	    Supports variables, loops, procedures
        Can connect to many databases	        Works specifically with Oracle Database

    # Advantages
        Supports programming logic.
        Improves database performance.
        Reduces network traffic.
        Supports exception handling.
        Creates reusable procedures and functions.
        More secure than executing raw SQL repeatedly.
    # Disadvantages
        Works primarily with Oracle Database.
        Requires knowledge of SQL first.
        More complex than basic SQL for simple tasks.
        Less portable to non-Oracle databases.
*/