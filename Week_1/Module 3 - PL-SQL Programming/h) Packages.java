/*

    # What is a Package?
    - A Package is a collection (group) of related PL/SQL objects stored together under a single name.
    - A package can contain:
        Procedures
        Functions
        Variables
        Constants
        Cursors
        Exceptions
    Simple Definition:
        A Package is a container that groups related PL/SQL procedures, functions, variables, and other objects into one unit.

    # Why Do We Need Packages?
        - To organize and manage related PL/SQL code.
        - To promote code reusability and modularity.
        - To improve performance by loading related code together.
        - To enhance security by controlling access to package components.
        
        Imagine a Banking System.
            Without Packages:
                deposit()
                withdraw()
                checkBalance()
                transferMoney()
                calculateInterest()
            All procedures exist separately.

            Problems:
                Difficult to manage.
                Difficult to find related code.
                Poor organization.
            Solution
                Create one package.

                Bank Package
                │
                ├── deposit()
                ├── withdraw()
                ├── transferMoney()
                ├── checkBalance()
                └── calculateInterest()
                Everything related to banking is stored together.

    SYNTAX :
        Package Specification
            CREATE OR REPLACE PACKAGE package_name
            IS
               -- Variable Declaration
               -- Procedure Declaration
               -- Function Declaration
            END package_name;
            /

        Package Body
            CREATE OR REPLACE PACKAGE BODY package_name
            IS
               -- Procedure Implementation
               -- Function Implementation
            END package_name;
            /

    Example : 
        Package Specification
            CREATE OR REPLACE PACKAGE bank_package
            IS
               PROCEDURE deposit(amount NUMBER);
               PROCEDURE withdraw(amount NUMBER);
               FUNCTION checkBalance RETURN NUMBER;
            END bank_package;
            /

        Package Body
            CREATE OR REPLACE PACKAGE BODY bank_package
            IS
               PROCEDURE deposit(amount NUMBER)
               IS
               BEGIN
                  -- Deposit logic here
               END;

               PROCEDURE withdraw(amount NUMBER)
               IS
               BEGIN
                  -- Withdraw logic here
               END;

               FUNCTION checkBalance RETURN NUMBER
               IS
                  balance NUMBER;
               BEGIN
                  -- Check balance logic here
                  RETURN balance;
               END;
            END bank_package;
            /

        Calling a Package Function
            DECLARE
               current_balance NUMBER;
            BEGIN
               -- Call the checkBalance function from the bank_package
               current_balance := bank_package.checkBalance;
               DBMS_OUTPUT.PUT_LINE('Current Balance: ' || current_balance);
            END;
            /

    # Package Specification vs Package Body
    Package Specification	        Package Body
    Contains declarations	        Contains implementations
    Visible to users	            Hidden from users
    Acts like an interface	        Acts like the actual code
    Mandatory	                    Optional (only if implementation exists)

    # Advantages
        Groups related procedures and functions.
        Improves code organization.
        Supports code reusability.
        Better security.
        Faster execution (package is loaded once into memory).
        Easier maintenance.
        Supports information hiding.
    Disadvantages
        Large packages become difficult to maintain.
        Changes may require recompilation.
        Beginners may find package structure confusing.
*/