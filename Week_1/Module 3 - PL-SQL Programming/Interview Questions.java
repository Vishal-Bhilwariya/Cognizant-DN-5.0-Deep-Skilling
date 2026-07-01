/*

Q1. What is PL/SQL?
Answer:
PL/SQL is Oracle's procedural extension of SQL that combines SQL with programming features like variables, loops, conditions, procedures, and exception handling.

Q2. Why is PL/SQL used?

Answer:
PL/SQL is used to implement business logic, improve performance, handle errors, and create reusable database programs.

Q3. What does PL in PL/SQL stand for?

Answer:
Procedural Language.

Q4. Can SQL exist without PL/SQL?

Answer:
Yes. SQL is an independent language. PL/SQL is built on top of SQL.

Q5. Which database mainly uses PL/SQL?

Answer:
Oracle Database.

Q1. What is a PL/SQL Block?

Answer:
A PL/SQL Block is the basic unit of a PL/SQL program. It contains declarations, executable statements, exception handling, and an end statement.

Q2. Which sections of a PL/SQL block are mandatory?

Answer:

BEGIN
END
Q3. Which sections are optional?

Answer:

DECLARE
EXCEPTION
Q4. What is the difference between an Anonymous Block and a Named Block?

Answer:

Anonymous blocks are temporary and unnamed, whereas named blocks are stored in the database and can be reused.

Q5. Which engine executes SQL statements inside a PL/SQL program?

Answer:

The SQL Engine executes SQL statements, while the PL/SQL Engine executes procedural statements.

Q1. What is a variable in PL/SQL?

Answer:

A variable is a named memory location used to store data temporarily during the execution of a PL/SQL block.

Q2. Which operator is used for assignment in PL/SQL?

Answer:

:=
Q3. Which operator is used to join strings?

Answer:

||

(Concatenation Operator)

Q4. Which command prints output?

Answer:

DBMS_OUTPUT.PUT_LINE()
Q5. Difference between CHAR and VARCHAR2?
CHAR	VARCHAR2
Fixed Length	Variable Length
Wastes space if data is shorter	Uses only required space
Faster for fixed-size values	More flexible and commonly used

Q1. What are Control Structures?

Answer:

Control Structures control the flow of execution in a PL/SQL program by making decisions and repeating statements.

Q2. What is the difference between IF and CASE?
IF	CASE
Used for complex conditions	Used for multiple fixed choices
Supports logical operators	Better for comparing one value against many options
Q3. Difference between LOOP, WHILE LOOP, and FOR LOOP?
LOOP	WHILE LOOP	FOR LOOP
Exit condition written manually using EXIT WHEN	Checks condition before each iteration	Automatically controls the loop variable and range
Best when exit condition is dynamic	Best when number of iterations is unknown	Best when number of iterations is known
Q4. What does EXIT WHEN do?

Answer:

It terminates a LOOP when the specified condition becomes true.

Q5. Which loop is most commonly used?

Answer:

FOR LOOP, because it is simple and automatically manages the loop counter.

Q1. What is an Exception?

Answer:

An exception is a runtime error that interrupts the normal execution of a PL/SQL program.

Q2. What is the purpose of the EXCEPTION block?

Answer:

It handles runtime errors and prevents the program from terminating unexpectedly.

Q3. What is the difference between Predefined and User-Defined Exceptions?
Predefined Exception	User-Defined Exception
Already provided by Oracle	Created by the programmer
No declaration required	Must be declared
Example: ZERO_DIVIDE	Example: invalid_age
Q4. What is the use of RAISE?

Answer:

RAISE is used to manually trigger a user-defined exception.

Q5. What does WHEN OTHERS do?

Answer:

It catches all exceptions that are not handled by specific exception handlers.

Example:

EXCEPTION
   WHEN OTHERS THEN
      DBMS_OUTPUT.PUT_LINE('Unexpected Error');

Q1. What is a Cursor?

Answer:

A Cursor is a pointer to the result set of an SQL query that allows PL/SQL to process rows one at a time.

Q2. Why do we use Cursors?

Answer:

To process multiple rows returned by a query one by one.

Q3. What are the two types of Cursors?

Answer:

Implicit Cursor
Explicit Cursor
Q4. Difference between Implicit and Explicit Cursor?
Implicit Cursor	Explicit Cursor
Created automatically by Oracle	Created manually by the programmer
Used for single-row operations	Used for multiple-row queries
No OPEN/FETCH/CLOSE required	Requires OPEN, FETCH, and CLOSE
Q5. Name the four Cursor Attributes.

Answer:

%FOUND
%NOTFOUND
%ROWCOUNT
%ISOPEN
Q6. What is the correct order of Cursor Operations?

Answer:

OPEN

↓

FETCH

↓

CLOSE

Q1. What is a Procedure?

Answer:

A Procedure is a named PL/SQL block used to perform a specific task. It may or may not return values.

Q2. What is a Function?

Answer:

A Function is a named PL/SQL block that performs a task and must return one value using the RETURN statement.

Q3. Difference between Procedure and Function?
Procedure	Function
May or may not return a value	Must return exactly one value
Called as a statement	Can be used inside SQL expressions
Mainly performs actions	Mainly performs calculations and returns results
Q4. What are parameter modes?

Answer:

IN
OUT
IN OUT
Q5. Which parameter is used to return values?

Answer:

OUT

Q6. Can a Function be used inside a SQL query?

Answer:

Yes, if it meets Oracle's rules for SQL-callable functions.

Example:

SELECT square(5)
FROM dual;

Q1. What is a Package?

Answer:

A Package is a collection of related PL/SQL objects such as procedures, functions, variables, constants, and cursors stored together under one name.

Q2. What are the two parts of a Package?

Answer:

Package Specification
Package Body
Q3. What is Package Specification?

Answer:

Package Specification contains declarations of procedures, functions, variables, constants, and cursors.

Q4. What is Package Body?

Answer:

Package Body contains the implementation of procedures and functions declared in the specification.

Q5. Why do we use Packages?

Answer:

Organize related code.
Improve performance.
Increase reusability.
Improve security.
Simplify maintenance.
Q6. How do you call a package function?

Answer:

MathPackage.square(5);
*/