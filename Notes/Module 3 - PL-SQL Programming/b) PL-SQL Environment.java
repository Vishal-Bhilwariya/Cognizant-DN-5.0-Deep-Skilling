/*

    # What is PL/SQL Environment? 
    - PL/SQL Environment is a platform where we can write, compile, and execute PL/SQL code.
    - It provides an interface to interact with the database and run PL/SQL programs.
        It consists of:
            Oracle Database
            PL/SQL Engine
            SQL Engine
            Client Tool (SQL Developer, SQL*Plus, TOAD)

    When you write a PL/SQL program, it is executed inside the Oracle Database.
    The PL/SQL Engine processes the programming part, while the SQL Engine executes SQL statements

    # Why Do We Need PL/SQL Environment?
    - Suppose you write this program:
        BEGIN
           DBMS_OUTPUT.PUT_LINE('Hello');
        END;
        /
     Questions:
        Who executes it?
        Who prints the output?
        Who executes SQL statements?

        The answer is the PL/SQL Environment.
        It provides everything required to execute PL/SQL programs.

             Programmer
                  |
                  ▼
         PL/SQL Program
                  |
                  ▼
          Oracle Database
          ┌──────────────┐
          │ PL/SQL Engine│
          └──────┬───────┘
                 |
      SQL Statements Only
                 |
                 ▼
           SQL Engine
                 |
                 ▼
            Database Tables
                 |
                 ▼
              Result

                    Java	                        PL/SQL
    main() method is the entry point	BEGIN...END block is the executable section
    JVM executes Java code	            PL/SQL Engine executes PL/SQL code
    JDBC executes SQL queries	        SQL Engine executes SQL queries
    Runs outside the database	        Runs inside Oracle Database

    # PL/SQL Block Structure :
    - A PL/SQL program is called a Block.
        There are 4 sections.
             DECLARE
               ↓
             BEGIN
               ↓
            EXCEPTION
               ↓
              END

     CODE :
        -- DECLARE section is optional
        DECLARE
           -- Declare a variable
           student_name VARCHAR2(20);
        BEGIN
           -- Assign a value to the variable
           student_name := 'Vishal';
           -- Print the variable value
           DBMS_OUTPUT.PUT_LINE(student_name);
        -- EXCEPTION section is optional
        EXCEPTION
           -- Handle unexpected errors
           WHEN OTHERS THEN
              DBMS_OUTPUT.PUT_LINE('Some Error Occurred');
        -- End of PL/SQL Block
        END;
        /

        A) Declare Section : 
            - This section is optional.
            - It is used to declare variables, constants, cursors, and user-defined exceptions.
            - Syntax : 
                DECLARE
                   -- Variable Declaration
                   variable_name datatype [NOT NULL] [:= initial_value];
                   -- Constant Declaration
                   constant_name CONSTANT datatype := value;
                   -- Cursor Declaration
                   CURSOR cursor_name IS SELECT_statement;
                   -- User-defined Exception Declaration
                   exception_name EXCEPTION;
            - Example : 
                DECLARE
                   student_name VARCHAR2(20);
                   student_age NUMBER(3);
                   student_grade CONSTANT CHAR(1) := 'A';
                   CURSOR student_cursor IS SELECT * FROM students;
                   student_exception EXCEPTION;
        B) Begin Section :
            - This section is mandatory.
            - It contains the executable statements of the PL/SQL block.
            - Syntax :
                BEGIN
                   -- Executable Statements
                END;
                /
            - Example :
                BEGIN
                   DBMS_OUTPUT.PUT_LINE('Hello, PL/SQL!');
                END;
        C) Exception Section :
            - This section is optional.
            - It is used to handle exceptions (errors) that occur during the execution of the PL/SQL block.
            - Syntax :
                EXCEPTION
                   -- Exception Handling Statements
            - Example :
                EXCEPTION
                   WHEN OTHERS THEN
                      DBMS_OUTPUT.PUT_LINE('Some Error Occurred');
        D) End Section :
            - This section is mandatory.
            - It marks the end of the PL/SQL block.
            - Syntax :
                END;
                /
            - Example :
                END;
                /
            +---------------------------+
            | DECLARE (Optional)        |
            | Variables, Constants      |
            +---------------------------+
                        |
                        ▼
            +---------------------------+
            | BEGIN (Mandatory)         |
            | Executable Statements     |
            +---------------------------+
                        |
                        ▼
            +---------------------------+
            | EXCEPTION (Optional)      |
            | Error Handling            |
            +---------------------------+
                        |
                        ▼
            +---------------------------+
            | END (Mandatory)           |
            +---------------------------+

    # Anonymous Block vs Named Block :
     1) Anonymous Block :
        - A PL/SQL block without a name is called an Anonymous Block.
        - It is used for one-time execution of code.
        - Example :
            BEGIN
               DBMS_OUTPUT.PUT_LINE('Hello, PL/SQL!');
            END;
            /
        Characteristics
            No name
            Executes immediately
            Not stored
            Cannot be reused
     2) Named Block :
        - A PL/SQL block with a name is called a Named Block.
        - It can be a Procedure, Function, or Package.
        - Example :
            CREATE OR REPLACE PROCEDURE greet_student IS
            BEGIN
               DBMS_OUTPUT.PUT_LINE('Hello, Student!');
            END;
            /
        Characteristics
            Has a name
            Can be stored in the database
            Can be reused
            Can accept parameters

    
*/