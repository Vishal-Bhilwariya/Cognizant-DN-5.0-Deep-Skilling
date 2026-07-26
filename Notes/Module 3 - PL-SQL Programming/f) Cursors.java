/*

    # What is a Cursor?
    - A Cursor is a pointer (reference) to the result set returned by an SQL query.
    - It allows PL/SQL to process query results one row at a time.

    A Cursor is a mechanism used to retrieve and process rows returned by an SQL query one by one.
    
   # Why Do We Need Cursors?
    - Suppose the Employee table contains:

        Emp_ID	 Name	Salary
        101	    Vishal	50000
        102	    Rahul	60000
        103	    Aman	55000

    Query: SELECT * FROM Employee;
    This query returns 3 rows.

    Question: How will PL/SQL process each row individually?
    Answer: Using a Cursor.

    Without a cursor:
        You cannot process multiple rows one by one.
        Business logic becomes difficult.

    Types of Cursors:
        1. Implicit Cursors
        2. Explicit Cursors

    1. Implicit Cursors:
        - Automatically created by Oracle for all SQL statements.
        - No need to declare or manage them manually.
        - Examples: SELECT INTO, INSERT, UPDATE, DELETE.
    CODE :DECLARE
           emp_name VARCHAR2(20);
        BEGIN
           -- Oracle automatically creates an implicit cursor
           SELECT name
           INTO emp_name
           FROM Employee
           WHERE emp_id = 101;
           DBMS_OUTPUT.PUT_LINE(emp_name);
        END;
        /

    2. Explicit Cursors:
        - Declared and managed by the programmer.
        - Used when you need more control over processing rows.
        - Steps:
            a. Declare the cursor
            b. Open the cursor
            c. Fetch data from the cursor
            d. Close the cursor

    Example of Explicit Cursor:
        DECLARE
            CURSOR emp_cursor IS
                SELECT emp_id, emp_name FROM employees;
            emp_record emp_cursor%ROWTYPE;
        BEGIN
            OPEN emp_cursor;
            LOOP
                FETCH emp_cursor INTO emp_record;
                EXIT WHEN emp_cursor%NOTFOUND;
                DBMS_OUTPUT.PUT_LINE(emp_record.emp_name);
            END LOOP;
            CLOSE emp_cursor;
        END;

    # Cursor Operations :
    1) OPEN - Initializes the cursor and executes the SQL query.
            Syntax: OPEN cursor_name;
    2) FETCH - Retrieves the next row from the cursor into variables.
            Syntax: FETCH cursor_name INTO variable1, variable2, ...;
    3) CLOSE - Closes the cursor and releases the resources.
            Syntax: CLOSE cursor_name;
    
    # Cursor Attributes :
    - %ISOPEN : Checks if the cursor is open.
    - %FOUND : Returns TRUE if the last FETCH found a row.
    - %NOTFOUND : Returns TRUE if the last FETCH did not find a row.
    - %ROWCOUNT : Returns the number of rows processed so far.

    COMPLETE CODE : 
        DECLARE
           -- Variable to store employee name
           emp_name VARCHAR2(20);
           -- Declare an explicit cursor
           CURSOR emp_cursor IS
              SELECT name FROM Employee;
        BEGIN
           -- Execute the query
           OPEN emp_cursor;
           -- Fetch first row into variable
           FETCH emp_cursor INTO emp_name;
           -- Print fetched value
           DBMS_OUTPUT.PUT_LINE(emp_name);
           -- Release cursor resources
           CLOSE emp_cursor;
        END;
        /

    Advantages
        Processes multiple rows one by one.
        Improves control over query results.
        Useful for complex business logic.
        Supports row-by-row processing.
        Makes data processing flexible.
    Disadvantages
        Slower than set-based SQL operations.
        Consumes memory.
        Requires manual management (OPEN, FETCH, CLOSE).
        Incorrect handling may cause resource leaks.
*/