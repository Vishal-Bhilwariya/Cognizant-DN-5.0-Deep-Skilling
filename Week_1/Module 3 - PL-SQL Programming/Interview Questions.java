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
*/