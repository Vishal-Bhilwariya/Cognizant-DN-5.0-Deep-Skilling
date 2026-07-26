/*

    # What is Basic PL/SQL Syntax?
    - PL/SQL Syntax refers to the rules and structure used to write a PL/SQL program.
    - In this topic, we'll learn:
        Variables
        Data Types
        Assigning Values
        Printing Output
      These are the building blocks of every PL/SQL program.

    # Why Do We Need Variables?
        Imagine you want to store:
            Student Name
            Student Age
            Salary
            Marks
        Without variables,you cannot store or manipulate data.
        
        Example:
            Suppose you calculate an employee's salary.
            Basic Salary = 40000
            Bonus = 5000
            Total Salary = ?
            To store these values, we need variables.
            DECLARE
              ↓
            Variable
              ↓
            Assign Value
              ↓
            Use Variable
              ↓
            Print Output

    # How to Declare a Variable?
        - A variable is a named storage location in memory that holds a value.
        - To declare a variable, we use the DECLARE section of a PL/SQL block.
        - Syntax:
            DECLARE
               variable_name data_type [NOT NULL] [:= initial_value];
        - Example:
            DECLARE
               student_name VARCHAR2(20); // DECLARATION
               student_age NUMBER(3);
               student_grade CHAR(1) := 'A';  // Initialization
               // := → Assignment Operator
               BEGIN
                   DBMS_OUTPUT.PUT_LINE('Student Name: ' || student_name); // PRINTING OUTPUT
                   DBMS_OUTPUT.PUT_LINE('Student Age: ' || student_age);
                   DBMS_OUTPUT.PUT_LINE('Student Grade: ' || student_grade);
                END;
                /

# PL/SQL Delimiters

| Delimiter | Name | Description / Use | Example |
| :-------- | :--- | :---------------- | :------ |
| `+` | Addition Operator | Adds two numbers. | `a + b` |
| `-` | Subtraction / Negation Operator | Subtracts numbers or changes the sign of a number. | `a - b`, `-10` |
| `*` | Multiplication Operator | Multiplies two numbers. | `a * b` |
| `/` | Division / Execute Operator | Divides numbers. Also executes a PL/SQL block after `END;` in SQL*Plus or SQL Developer. | `a / b`, `END; /` |
| `%` | Attribute Indicator | Accesses attributes like `%TYPE`, `%ROWTYPE`, `%FOUND`, `%NOTFOUND`. | `salary%TYPE` |
| `' '` | Character String Delimiter | Encloses string values. | `'Vishal'` |
| `.` | Component Selector | Accesses object fields, record fields, or package members. | `emp.name` |
| `( )` | Expression / Parameter Delimiter | Groups expressions and passes function/procedure parameters. | `SUM(salary)` |
| `:` | Host Variable Indicator | Refers to variables declared outside the PL/SQL block. | `:salary` |
| `,` | Item Separator | Separates variables, parameters, or values. | `a, b, c` |
| `"` | Quoted Identifier Delimiter | Encloses identifiers containing spaces or reserved words. | `"Employee Name"` |
| `=` | Equal To Operator | Compares two values for equality. | `age = 20` |
| `@` | Remote Access Indicator | Accesses database objects through a database link. | `employee@HR_DB` |
| `;` | Statement Terminator | Marks the end of a PL/SQL statement. | `age := 20;` |
| `:=` | Assignment Operator | Assigns a value to a variable. | `age := 20;` |
| `=>` | Association Operator | Passes values to named parameters in procedures/functions. | `display(age => 20)` |
| `||` | Concatenation Operator | Joins two or more strings into one string. | `'Hello ' || name` |
| `**` | Exponentiation Operator | Raises a number to a power. | `2 ** 3` |
| `<< >>` | Label Delimiter | Defines labels for loops or PL/SQL blocks. | `<<loop1>>` |
| `/* ... */` | Multi-line Comment | Used to write comments spanning multiple lines. | `/* Comment */` |
| `--` | Single-line Comment | Used to write a comment on one line. | `-- Variable Declaration` |
| `..` | Range Operator | Specifies a range, mainly in `FOR` loops. | `FOR i IN 1..10` |
| `<` | Less Than Operator | Checks whether the left value is smaller. | `a < b` |
| `>` | Greater Than Operator | Checks whether the left value is greater. | `a > b` |
| `<=` | Less Than or Equal To | Checks whether the left value is smaller than or equal to the right value. | `a <= b` |
| `>=` | Greater Than or Equal To | Checks whether the left value is greater than or equal to the right value. | `a >= b` |
| `<>` | Not Equal To Operator | Checks whether two values are different. | `a <> b` |
| `!=` | Not Equal To Operator | Alternative notation for "Not Equal To". | `a != b` |
| `~=` | Not Equal To Operator | Another alternative notation for "Not Equal To". | `a ~= b` |
| `^=` | Not Equal To Operator | Another alternative notation for "Not Equal To". | `a ^= b` |

---

## ⭐ Most Important Delimiters for Interviews

| Delimiter | Purpose |
| :-------- | :------ |
| `:=` | Assigns a value to a variable. |
| `=` | Compares two values. |
| `||` | Concatenates (joins) strings. |
| `%` | Accesses attributes like `%TYPE`, `%ROWTYPE`, `%FOUND`. |
| `;` | Ends a PL/SQL statement. |
| `/` | Executes a PL/SQL block. |
| `' '` | Represents a string literal. |
| `--` | Starts a single-line comment. |
| `/* ... */` | Creates a multi-line comment. |
| `..` | Defines a range in loops. |
| `=>` | Passes named parameters. |
| `<>` | Checks whether two values are not equal. |

    # PL/SQL Data Types :
    1. NUMBER - Used to store numeric values (integers, decimals). 
                {Syntax: NUMBER(p,s) - precision and scale, Example: 10, 3.14, -5}
    2. VARCHAR2 - Used to store variable-length character strings. 
                {Syntax: VARCHAR2(n), Example: 'Hello', 'PL/SQL'}
    3. CHAR - Used to store fixed-length character strings. 
                {Syntax: CHAR(n), Example: 'A', 'B'}
    4. DATE - Used to store date and time values. 
                {Syntax: DATE, Example: '2023-10-01', '2023-10-01 12:00:00'}
    5. BOOLEAN - Used to store logical values (TRUE, FALSE, NULL). 
                {Syntax: BOOLEAN, Example: TRUE, FALSE}
*/