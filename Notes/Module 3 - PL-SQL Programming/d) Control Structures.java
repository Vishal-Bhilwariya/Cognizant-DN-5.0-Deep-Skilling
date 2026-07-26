/*

    # What are Control Structures?
     - Control Structures are statements that control the flow of execution of a PL/SQL program.
        They help the program make decisions and repeat tasks.

        There are two main types:
            Decision Making
            IF
            IF-ELSE
            ELSIF
            CASE
        Looping
            LOOP
            WHILE LOOP
            FOR LOOP

    Syntax of IF Statement:
        IF condition THEN
            -- Statements to execute if condition is true
        END IF;
    Syntax of IF-ELSE Statement:
        IF condition THEN
            -- Statements to execute if condition is true
        ELSE
            -- Statements to execute if condition is false
        END IF;
    Syntax of ELSIF Statement:
        IF condition1 THEN
            -- Statements to execute if condition1 is true
        ELSIF condition2 THEN
            -- Statements to execute if condition2 is true
        ELSE
            -- Statements to execute if none of the conditions are true
        END IF;
    Syntax of CASE Statement:
        CASE expression
            WHEN value1 THEN
                -- Statements to execute if expression equals value1
            WHEN value2 THEN
                -- Statements to execute if expression equals value2
            ELSE
                -- Statements to execute if expression doesn't match any of the values
        END CASE;
    Syntax of LOOP Statement:
        LOOP
            -- Statements to execute repeatedly
            EXIT WHEN condition; -- Optional exit condition
        END LOOP;
    Syntax of WHILE LOOP Statement:
        WHILE condition LOOP
            -- Statements to execute repeatedly while condition is true
        END LOOP;
    Syntax of FOR LOOP Statement:
        FOR counter IN initial_value..final_value LOOP
            -- Statements to execute repeatedly for each value in the range
        END LOOP;

    Example : 
     1) 
        DECLARE
           marks NUMBER := 75;        
        BEGIN
           -- Check first condition
           IF marks >= 90 THEN
              DBMS_OUTPUT.PUT_LINE('Grade A');
           -- Check second condition
           ELSIF marks >= 75 THEN
              DBMS_OUTPUT.PUT_LINE('Grade B');
           -- Remaining cases
           ELSE
              DBMS_OUTPUT.PUT_LINE('Grade C');
           END IF;
        END;
        /
     2) 
        DECLARE
           grade CHAR(1) := 'A';
        BEGIN
           -- Compare grade value
           CASE
              WHEN grade = 'A' THEN
                 DBMS_OUTPUT.PUT_LINE('Excellent');
              WHEN grade = 'B' THEN
                 DBMS_OUTPUT.PUT_LINE('Very Good');
              ELSE
                 DBMS_OUTPUT.PUT_LINE('Good');
           END CASE;
        END;
        /
     3)
        DECLARE
           i NUMBER := 1;
        BEGIN
           LOOP
              -- Print current value
              DBMS_OUTPUT.PUT_LINE(i);
              -- Increase value
              i := i + 1;
              -- Exit when i becomes greater than 5
              EXIT WHEN i > 5;
           END LOOP;
        END;
        /
     4) 
        DECLARE
           i NUMBER := 1;
        BEGIN
           WHILE i <= 5 LOOP
              -- Print current value
              DBMS_OUTPUT.PUT_LINE(i);
              -- Increase value
              i := i + 1;
           END LOOP;
        END;
        /
     5)
        DECLARE
           i NUMBER;
        BEGIN
           FOR i IN 1..5 LOOP
              -- Print current value
              DBMS_OUTPUT.PUT_LINE(i);
           END LOOP;
        END;
        /
*/