# Module 3 – PL-SQL Programming

---

## PL/SQL

| # | Topic | Description |
|---|-------|-------------|
| a | Introduction to PL/SQL | SQL = querying & manipulating data. PL/SQL = SQL + Programming Features (variables, loops, conditions, functions, procedures, exception handling). Formula: PL/SQL = SQL + Programming. Syntax: DECLARE → BEGIN → EXCEPTION → END. Example: `DBMS_OUTPUT.PUT_LINE('Hello, PL/SQL!')`. Java vs PL/SQL comparison. Advantages: business logic in DB, performance, security, error handling. |
| b | PL/SQL Environment | Platform to write, compile and execute PL/SQL code. Components: Oracle Database, PL/SQL Engine, SQL Engine, Client Tools (SQL Developer, SQL*Plus, TOAD). PL/SQL Engine handles programming logic; SQL Engine handles SQL statements. Block structure: DECLARE → BEGIN → EXCEPTION → END. Sections: DECLARE (optional — variables, constants, cursors, exceptions), BEGIN (mandatory — executable statements), EXCEPTION (optional — error handling), END (mandatory). Anonymous Block (no name, one-time use, not stored) vs Named Block (Procedure/Function/Package, stored, reusable). Java vs PL/SQL comparison: JVM ↔ PL/SQL Engine, JDBC ↔ SQL Engine. |
| c | Basic PL/SQL Syntax | Building blocks: Variables, Data Types, Assignment, Output. Variable declaration syntax: `variable_name data_type [:= initial_value]`. Assignment operator `:=`. Output: `DBMS_OUTPUT.PUT_LINE()`. Concatenation: `\|\|`. PL/SQL Delimiters — full table of all operators and symbols (`:=`, `=`, `\|\|`, `%`, `;`, `/`, `..`, `=>`, `<>`, `--`, `/* */`). Data Types: NUMBER(p,s), VARCHAR2(n), CHAR(n), DATE, BOOLEAN. |

---

## Interview Questions
- PL/SQL related Q&A
