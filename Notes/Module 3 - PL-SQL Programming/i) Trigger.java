/*

    # What is a Trigger?
    - A Trigger is a stored PL/SQL program that is automatically executed when a specific event occurs on a database table or view.

    - A Trigger is a PL/SQL block that runs automatically in response to database events like INSERT, UPDATE, or DELETE.

    # Why Do We Need Triggers?
        Suppose an Employee table stores employee details.
        Whenever a new employee is added, you also want to:
            Save the action in a log table.
            Record the date and time.
            Record who inserted the data.

        Without a Trigger:
            INSERT Employee
                ↓
            Write Another SQL
                ↓
            Insert into Log Table

        The programmer must remember to write both queries.

        Solution
            Use a Trigger.

            INSERT Employee
                ↓
            Trigger Executes Automatically
                ↓ 
            Log Table Updated

        No extra SQL is required.

        INSERT / UPDATE / DELETE
                  |
                  ▼
              Trigger Fires
                  |
        Execute PL/SQL Code
                  |
        Complete Operation

    # Syntax of a Trigger:
        CREATE OR REPLACE TRIGGER trigger_name
        BEFORE | AFTER | INSTEAD OF
        INSERT | UPDATE | DELETE
        ON table_name
        BEGIN
            -- Trigger Code
        END;
        /

    # Types of Triggers:
        1. BEFORE Trigger - Executes before the triggering event.
                - Executes before an INSERT, UPDATE, or DELETE operation.
                - Used for:
                    Validation
                    Data checking
                    Preventing invalid data
            Example : 
                CREATE OR REPLACE TRIGGER check_salary
                BEFORE INSERT
                ON Employee
                FOR EACH ROW
                BEGIN
                   -- Validate salary
                   IF :NEW.salary < 0 THEN
                      RAISE_APPLICATION_ERROR(-20001,
                      'Salary cannot be negative');
                   END IF;
                END;
/
        2. AFTER Trigger - Executes after the triggering event.
                - Executes after an INSERT, UPDATE, or DELETE operation.
                - Used for:
                    Logging
                    Auditing
                    Updating related tables
            Example : 
                CREATE OR REPLACE TRIGGER log_employee_insert
                AFTER INSERT
                ON Employee
                FOR EACH ROW
                BEGIN
                   INSERT INTO Employee_Log(emp_id, action_date)
                   VALUES(:NEW.emp_id, SYSDATE);
                END;
        3. INSTEAD OF Trigger - Used for views, executes instead of the triggering event.
                - Used with updatable views.
                - Allows custom logic when inserting/updating/deleting from a view.
            Example :
                CREATE OR REPLACE TRIGGER employee_view_trigger
                INSTEAD OF INSERT
                ON Employee_View
                BEGIN
                   INSERT INTO Employee(name, salary)
                   VALUES(:NEW.name, :NEW.salary);
                END;

    # Special Variables in Triggers :
     a) :NEW - Refers to the new values being inserted or updated in the table.
     b) :OLD - Refers to the old values being updated or deleted from the table

    # Advantages
        Executes automatically.
        Enforces business rules.
        Maintains data integrity.
        Useful for auditing and logging.
        Reduces duplicate code.
    # Disadvantages
        Difficult to debug.
        Hidden execution may confuse developers.
        Too many triggers can reduce performance.
        Multiple triggers on the same table may become difficult to manage.
*/