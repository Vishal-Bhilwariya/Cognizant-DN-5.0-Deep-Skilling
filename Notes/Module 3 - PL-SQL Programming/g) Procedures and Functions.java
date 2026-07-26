/*

    # What is a Procedure?
        A Procedure is a named PL/SQL block that performs a specific task.
        It is stored permanently in the Oracle database and can be called whenever needed.
        
        A Procedure is a reusable program used to perform one or more operations.

     Syntax:
        CREATE OR REPLACE PROCEDURE procedure_name IS
        BEGIN
           -- Executable Statements
        END;
        /
    # What is a Function?
        A Function is also a named PL/SQL block, but it must return exactly one value using the RETURN statement.
        
        A Function is a reusable program that performs a task and always returns a value.

     Syntax:
        CREATE OR REPLACE FUNCTION function_name RETURN data_type IS
        BEGIN
           -- Executable Statements
           RETURN value;
        END;
        /
    # Why Do We Need Procedures and Functions?
        - To avoid code duplication.
        - To improve code organization and readability.
        - To enhance maintainability of the code.
        - To allow for modular programming.

    Example  :
    1)  -- Create a procedure
        CREATE OR REPLACE PROCEDURE greet
        IS
        BEGIN
           -- Print greeting message
           DBMS_OUTPUT.PUT_LINE('Welcome to PL/SQL');
        END;
        /
        -- Execute the procedure
        BEGIN
           greet;
        END;
        /

    2) -- Create a function
        CREATE OR REPLACE FUNCTION add_numbers(a NUMBER, b NUMBER) RETURN NUMBER
        IS
        BEGIN
           -- Return the sum of a and b
           RETURN a + b;
        END;
        /
        -- Execute the function
        DECLARE
           result NUMBER;
        BEGIN
           result := add_numbers(10, 20);
           DBMS_OUTPUT.PUT_LINE('Sum: ' || result);
        END;
        /

    # Parameters in PL/SQL :
    a) IN Parameter :
        - Used to pass values to the procedure or function.
        - The value of an IN parameter cannot be changed inside the procedure or function.
        - Data goes from the calling environment to the procedure/function.
                Main Program
                ↓
                Procedure
        - Example:
            CREATE OR REPLACE PROCEDURE greet_user(name IN VARCHAR2)
            IS
            BEGIN
               DBMS_OUTPUT.PUT_LINE('Hello, ' || name);
            END;
            /
            -- Execute the procedure
            BEGIN
               greet_user('Vishal');
            END;
            /
    b) OUT Parameter :
        - Used to return values from the procedure to the calling environment.
        - Data goes from the procedure/function to the calling environment.
                Procedure
                    ↓
                Main Program
        - Example:
            CREATE OR REPLACE PROCEDURE get_user_info(user_id IN NUMBER, user_name OUT VARCHAR2)
            IS
            BEGIN
               SELECT name INTO user_name FROM users WHERE id = user_id;
            END;
            /
            -- Execute the procedure
            BEGIN
               get_user_info(1, :user_name);
            END;
            /
    C) IN OUT Parameter :
        - Used to pass values to the procedure and return modified values back to the calling environment.
        - Data goes both ways between the calling environment and the procedure/function.
                Main Program
                    ↕
                Procedure
        - Example:
            CREATE OR REPLACE PROCEDURE update_salary(emp_id IN NUMBER, salary IN OUT NUMBER)
            IS
            BEGIN
               UPDATE employees SET salary = salary + 1000 WHERE id = emp_id;
               SELECT salary INTO salary FROM employees WHERE id = emp_id;
            END;
            /
            -- Execute the procedure
            DECLARE
               emp_salary NUMBER := 50000;
            BEGIN
               update_salary(1, emp_salary);
               DBMS_OUTPUT.PUT_LINE('Updated Salary: ' || emp_salary);
            END;
            /

    Advantages
        Code Reusability
        Modular Programming
        Easy Maintenance
        Better Performance (stored in database)
        Improved Security
        Reduces Duplicate Code
    Disadvantages
        More difficult to debug than simple SQL.
        Requires database privileges.
        Too many procedures/functions can make maintenance harder if poorly organized.
*/
