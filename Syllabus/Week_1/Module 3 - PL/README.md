# Module 3 – PL-SQL Programming

---

## PL/SQL

| # | Topic | Description |
|---|-------|-------------|
| a | Introduction to PL/SQL | SQL = querying & manipulating data. PL/SQL = SQL + Programming Features (variables, loops, conditions, functions, procedures, exception handling). Formula: PL/SQL = SQL + Programming. Syntax: DECLARE → BEGIN → EXCEPTION → END. Example: `DBMS_OUTPUT.PUT_LINE('Hello, PL/SQL!')`. Java vs PL/SQL comparison. Advantages: business logic in DB, performance, security, error handling. |
| b | PL/SQL Environment | Platform to write, compile and execute PL/SQL code. Components: Oracle Database, PL/SQL Engine, SQL Engine, Client Tools (SQL Developer, SQL*Plus, TOAD). PL/SQL Engine handles programming logic; SQL Engine handles SQL statements. Block structure: DECLARE → BEGIN → EXCEPTION → END. Sections: DECLARE (optional — variables, constants, cursors, exceptions), BEGIN (mandatory — executable statements), EXCEPTION (optional — error handling), END (mandatory). Anonymous Block (no name, one-time use, not stored) vs Named Block (Procedure/Function/Package, stored, reusable). Java vs PL/SQL: JVM ↔ PL/SQL Engine, JDBC ↔ SQL Engine. |
| c | Basic PL/SQL Syntax | Building blocks: Variables, Data Types, Assignment, Output. Variable declaration syntax: `variable_name data_type [:= initial_value]`. Assignment operator `:=`. Output: `DBMS_OUTPUT.PUT_LINE()`. Concatenation: `\|\|`. Full PL/SQL Delimiters table (`:=`, `=`, `\|\|`, `%`, `;`, `/`, `..`, `=>`, `<>`, `--`, `/* */`). Data Types: NUMBER(p,s), VARCHAR2(n), CHAR(n), DATE, BOOLEAN. |
| d | Control Structures | Statements that control the flow of execution. Decision Making: IF, IF-ELSE, ELSIF, CASE. Looping: LOOP (with `EXIT WHEN`), WHILE LOOP, FOR LOOP (`FOR i IN 1..5`). Each with syntax and code examples (grade checker, CASE on grade, LOOP/WHILE/FOR printing 1–5). |
| e | Error Handling | Exception = runtime error. Without handling: program crashes. With handling: error caught, friendly message shown, program continues. Syntax: EXCEPTION section with `WHEN exception_name THEN`. Java vs PL/SQL: try↔BEGIN, catch↔EXCEPTION, throw↔RAISE. Predefined Exceptions: ZERO_DIVIDE, NO_DATA_FOUND, TOO_MANY_ROWS, INVALID_NUMBER, VALUE_ERROR, DUP_VAL_ON_INDEX, etc. User-Defined Exceptions: declare with `EXCEPTION`, raise with `RAISE`. RAISE keyword: explicitly raises predefined or user-defined exceptions. |
| f | Cursors | Pointer to the result set of an SQL query — processes rows one at a time. Types: Implicit Cursor (auto-created by Oracle for SELECT INTO, INSERT, UPDATE, DELETE) and Explicit Cursor (declared and managed by programmer). Explicit Cursor steps: DECLARE → OPEN → FETCH → CLOSE. Cursor Attributes: `%ISOPEN`, `%FOUND`, `%NOTFOUND`, `%ROWCOUNT`. |
| g | Procedures and Functions | Procedure: named PL/SQL block that performs a task, stored in DB, reusable, no return value. Function: same but must return exactly one value using `RETURN`. Parameter types: IN (pass value in), OUT (return value out), IN OUT (both directions). Syntax: `CREATE OR REPLACE PROCEDURE/FUNCTION`. Advantages: Code Reusability, Modular Programming, Better Performance, Improved Security. |
| h | Packages | Container that groups related Procedures, Functions, Variables, Constants, Cursors, Exceptions under one name. Two parts: Package Specification (declarations, visible — acts like interface) and Package Body (implementations, hidden). Calling: `package_name.procedure_name`. Example: BankPackage with deposit(), withdraw(), checkBalance(). Advantages: organization, reusability, security, faster execution (loaded once into memory). |
| i | Triggers | Stored PL/SQL block that executes automatically on a database event (INSERT, UPDATE, DELETE). Types: BEFORE Trigger (validation, data checking), AFTER Trigger (logging, auditing), INSTEAD OF Trigger (used with views). Syntax: `CREATE OR REPLACE TRIGGER ... BEFORE\|AFTER\|INSTEAD OF ... ON table_name`. Special variables: `:NEW` (new values), `:OLD` (old values). |

---

## Interview Questions
- PL/SQL related Q&A
