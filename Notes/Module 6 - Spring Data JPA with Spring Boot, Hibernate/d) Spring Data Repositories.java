/*

    # What is a Repository?
        A Repository is a Java interface that acts as a bridge between the Application and the Database.
        It is responsible for performing database operations like:
            Save
            Update
            Delete
            Find
            Search
        Instead of writing SQL, we call repository methods.
        Repository = Data Access Layer (DAL) that performs CRUD operations on the database.

    # Why Do We Need Repositories?
     - Before Spring Data JPA,
        Developers created DAO (Data Access Object) classes.

        DAO contained:
            SQL Queries
            JDBC Code
            Connection Handling
            ResultSet Mapping

        Problems:
            Large amount of code
            Difficult maintenance
            Duplicate logic
            Time consuming

        Spring Data JPA introduced Repositories, which provide ready-made database operations.

    Types of Spring Data Repositories
     - Spring Data JPA provides several repository interfaces.
        Repository
              │
              ├── CrudRepository
              │
              ├── PagingAndSortingRepository
              │
              └── JpaRepository

    (A) Repository
        Root (marker) interface.
        Defines the base for all repository types.
        Rarely used directly.
        
    (B) CrudRepository
        Provides basic CRUD operations.
        Examples:
            Save
            Find
            Delete
            Count
            Exists
        
    (C) PagingAndSortingRepository
        Extends CrudRepository.
        Adds:
            Pagination
            Sorting
        
    (D) JpaRepository ⭐
        Most commonly used.
        Extends:
            Repository
            CrudRepository
            PagingAndSortingRepository

        Provides:
            CRUD
            Pagination
            Sorting
            Batch Operations
            Flush Operations

    # Creating a Repository :
     Suppose we have an Entity:
        @Entity
        public class Employee{

        }

     Repository:
        public interface EmployeeRepository
                extends JpaRepository<Employee,Integer>{
        }

        Explanation
            Keyword	            Purpose
            interface	    Repository is an interface
            extends	        Inherits methods
            JpaRepository	Provides ready-made database methods
            Employee	    Entity class
            Integer	        Primary Key datatype
    
    What Does JpaRepository Provide?
     Without writing any code,
        You automatically get methods like:
            Method	            Purpose
            save()	        Insert/Update
            findById()	    Find by Primary Key
            findAll()	    Retrieve all records
            deleteById()	Delete record
            count()	        Count records
            existsById()	Check existence

        No implementation required.
        Spring automatically generates them.

    # Derived Query Methods :
    - Spring Data JPA can automatically generate SQL queries from method names.
    - This feature is called Query Method Derivation.
        Example: findByName()

        Spring understands:
            SELECT * FROM Employee
            WHERE name=?
        without writing SQL.

    Common Derived Query Keywords
        Method	        Meaning
        findBy	        Search
        existsBy	    Check existence
        countBy	        Count
        deleteBy	    Delete
        findFirstBy	    First Record
        findTopBy	    Top Record

    Conditions Supported
        Keyword	    SQL Meaning
        And	            AND
        Or	            OR
        Between	        BETWEEN
        LessThan	    <
        GreaterThan	    >
        Like	        LIKE
        StartingWith	Starts With
        EndingWith	    Ends With
        Containing	    Contains
        OrderBy	        ORDER BY

    Example : findByNameAndSalary()
    Equivalent SQL
        SELECT *
        FROM Employee
        WHERE name=?
        AND salary=?

    Advantages of Derived Queries
        No SQL writing
        Easy to understand
        Automatic implementation
        Less coding
        Faster development

    # What is @Query?
     - Sometimes method names become very long or cannot express complex logic.

        In such cases we use @Query.
        It allows us to write custom JPQL (or native SQL if configured).

        Example : @Query("SELECT e FROM Employee e")
        
     Why Use @Query?
        When:
            Complex query required
            Multiple joins
            Aggregation
            Custom filtering
            Method name becomes too lengthy

    Derived Query vs @Query
        Derived Query	        @Query
        Automatic	            Manual
        Based on method name	Query written by developer
        Simple queries	        Complex queries
        Less flexible	        More flexible

    # What is JPQL?
     - JPQL (Java Persistence Query Language) is the query language used by JPA.
        Difference:
            SQL uses:
                Tables
                Columns
            JPQL uses:
                Entities
                Entity fields
        Example
            SQL
                SELECT *
                FROM employee

            JPQL
                SELECT e
                FROM Employee e

        Notice:
            SQL → table name (employee)
            JPQL → Entity name (Employee)

    # Custom Query Methods
     - Sometimes neither derived queries nor simple repository methods are enough.
        Then developers create custom query methods.

        Examples include:
            Reports
            Joins
            Aggregation
            Group By
            Subqueries

        These are usually written using @Query (JPQL or native SQL) or custom repository implementations.
*/