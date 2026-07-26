/*

    # What is an Exception?
        An Exception is a runtime error that occurs while executing a PL/SQL program.
        If an exception occurs and is not handled, the program stops immediately.

        Examples:
            Dividing a number by zero
            Selecting data that does not exist
            Inserting duplicate values
            Invalid data conversion
    # Why Do We Need Exception Handling?
        Suppose you write a banking program.
        Withdraw Money
             ↓
        Check Balance
             ↓
        Balance Available?
             ↓
        Yes → Withdraw
        No → Show Error

        Without Exception Handling:
            Program crashes.
            User gets an error message.
            Remaining statements are not executed.

        With Exception Handling:
            Error is caught.
            Friendly message is displayed.
            Program continues gracefully.

    SYNTAX : 
        DECLARE
           -- Variable Declaration
        BEGIN
           -- Executable Statements
        EXCEPTION
           -- Error Handling
        END;

    CODE : 
        DECLARE
           -- Declare two variables
           num1 NUMBER := 10;
           num2 NUMBER := 0;
           result NUMBER;
        BEGIN
           -- This statement causes an exception
           result := num1 / num2;
           DBMS_OUTPUT.PUT_LINE(result);
        EXCEPTION
           -- Handle divide by zero error
           WHEN ZERO_DIVIDE THEN
              DBMS_OUTPUT.PUT_LINE('Error: Cannot divide by zero.');
        END;
        /
    OUTPUT:
        Error: Cannot divide by zero.
    # Java vs PL/SQL Comparison
        Java	    PL/SQL
        try	        BEGIN
        catch	    EXCEPTION
        throw	    RAISE
        finally	    No direct equivalent
        Exception	Exception

    # Predefined Exceptions
        These exceptions are already defined by Oracle.You only need to use their names.

        Exception	            Cause
        ZERO_DIVIDE	        Division by zero
        NO_DATA_FOUND	    SELECT returns no rows
        TOO_MANY_ROWS	    SELECT returns more than one row
        INVALID_NUMBER	    Invalid number conversion
        VALUE_ERROR	        Data type or size mismatch
        DUP_VAL_ON_INDEX	Duplicate value in a unique column
        CURSOR_ALREADY_OPEN	Cursor opened twice
        LOGIN_DENIED	    Invalid username/password
        STORAGE_ERROR	    Memory allocation error

    # User-Defined Exceptions :
    Sometimes Oracle has no predefined exception for your business rule. In that case,we create our own exception.
    Syntax:
        DECLARE
           -- Declare a user-defined exception
           my_exception EXCEPTION;
        BEGIN
           -- Raise the exception when a condition is met
           IF some_condition THEN
              RAISE my_exception;
           END IF;
        EXCEPTION
           -- Handle the user-defined exception
           WHEN my_exception THEN
              DBMS_OUTPUT.PUT_LINE('User-defined exception occurred.');
        END;
        /

    CODE:
        DECLARE
           age NUMBER := 15;
           invalid_age EXCEPTION;
        BEGIN
           IF age < 18 THEN
              RAISE invalid_age;
           END IF;
        EXCEPTION
           WHEN invalid_age THEN
              DBMS_OUTPUT.PUT_LINE('Not Eligible');
        END;
        /

    # RAISE Keyword :
    - Used to explicitly raise an exception.
    - Can raise predefined or user-defined exceptions.
    - Syntax:
        RAISE exception_name;
    - CODE : 
        IF salary < 0 THEN
           RAISE invalid_salary;
        END IF;
    # Advantages
        Prevents program crashes.
        Displays meaningful error messages.
        Makes programs more reliable.
        Easier debugging.
        Improves user experience.
    # Disadvantages
        Adds extra code.
        Incorrect exception handling may hide real problems.
        Overusing WHEN OTHERS can make debugging difficult

*/