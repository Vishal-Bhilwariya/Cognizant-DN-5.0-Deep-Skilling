/*

    # What is Hibernate?
        Hibernate is an ORM (Object Relational Mapping) Framework that implements the JPA Specification.
        
        Hibernate = A framework that converts Java Objects into Database Records and Database Records into Java Objects.

        It acts as a bridge between:
            Java Application
            Relational Database

    # What is the Relationship Between Spring Data JPA and Hibernate?
        Many beginners get confused between these two.

        Remember:
            Spring Data JPA simplifies database operations.
            JPA defines the rules (Specification).
            Hibernate implements those rules.

    Responsibilities
        Technology	    Responsibility
        Spring Boot	    Auto Configuration
        Spring Data     JPA	Simplifies database access
        JPA	Defines     persistence standards
        Hibernate	    Implements JPA and generates SQL
        Database	    Stores data

    # Why Do We Need Hibernate?
     Without Hibernate, developers manually write:
        SQL
        JDBC code
        Object mapping
        Connection handling

     With Hibernate, it automatically:
        Maps objects to tables
        Generates SQL
        Executes queries
        Manages caching
        Handles transactions (with Spring)
        Supports lazy loading

    # Hibernate-Specific Features
    - Although Spring Data JPA hides most complexities, Hibernate provides many advanced features.

        Important Features
        Feature	                                    Purpose
        Automatic SQL Generation    	Generates SQL automatically
        Dirty Checking	                Detects changed objects automatically
        Caching	                        Improves performance
        Lazy Loading	                Loads data only when required
        Eager Loading	                Loads data immediately
        Batch Processing	            Executes multiple operations efficiently
        HQL	                            Hibernate Query Language
        Dialect Support	                Supports different databases

    # Dirty Checking :
    Hibernate automatically detects changes made to managed entities.
    If an object changes, Hibernate updates the database automatically when the transaction is committed.

    Example
      Employee Salary
        50000
          ↓
        60000
          ↓
        Hibernate Detects Change
            ↓
        UPDATE Query Generated

        Developer doesn't need to manually issue an update for every changed field.

    # Lazy Loading
        Lazy Loading loads related data only when it is actually needed.

     Example
        Employee
            ↓
        Department

        The Department data is fetched only when accessed.

      Why Use Lazy Loading?
        Advantages:
            Faster initial loading
            Lower memory usage
            Better performance

    # Eager Loading
     - Eager Loading loads related data immediately.

      Example
        Employee
            ↓
        Department

        Both are loaded together.

    # Caching
        Caching stores frequently used data temporarily.
        Instead of querying the database repeatedly, Hibernate retrieves data from cache when possible.

        Why Cache?
         Without Cache
            Application
                ↓
            Database
                ↓
            Database
                ↓
            Database

          Every request hits the database.

        With Cache
            Application
                ↓
            Cache
                ↓
            Database

        Database access is reduced.

    # Hibernate-Specific Annotations
     - Besides JPA annotations, Hibernate provides its own annotations.

        Common examples include:

        Annotation	                        Purpose
        @CreationTimestamp	Automatically stores creation timestamp
        @UpdateTimestamp	Automatically stores last update timestamp
        @DynamicInsert	    Generates INSERT SQL with only non-null columns
        @DynamicUpdate	    Updates only modified columns

    # Hibernate Dialect
     - A Dialect tells Hibernate which SQL syntax to generate for a particular database.
        Different databases have different SQL syntax.
        Examples:
            MySQL
            Oracle
            PostgreSQL
            SQL Server

        Hibernate generates SQL according to the configured Dialect.

    Why is Dialect Needed?
    Example:
        Limit query in MySQL- LIMIT 10

        limit query in Oracle - Uses a different syntax (such as FETCH FIRST in modern versions or other mechanisms in older versions).

        Hibernate handles these differences automatically through the configured Dialect.

    Hibernate Properties
     - Hibernate behavior can be customized using properties.

        Common properties:

        Property	            Purpose
        hibernate.dialect	    Database Dialect
        hibernate.show_sql	    Display generated SQL
        hibernate.format_sql	Format SQL output
        hibernate.hbm2ddl.auto	Database schema management

    # Batch Processing :
    - Hibernate supports batch processing to improve performance when dealing with large datasets.

        It groups multiple operations into batches and executes them together, reducing the number of database round trips.

        This is especially useful for:
            Bulk inserts
            Bulk updates
            Bulk deletes

        Example:
            Instead of executing 1000 individual INSERT statements,
            Hibernate can execute a single batched INSERT statement.

        Benefits:
            Reduced network overhead
            Improved throughput
            Better resource utilization

    # Real Life Example:
    Suppose a college admits 500 students.
        Without Batch Processing - Insert one student at a time.
        With Batch Processing - Insert all students together.

        Much faster.

    # HQL (Hibernate Query Language) :
    - It is similar to JPQL.
        Both use:
            Entity Names
            Entity Fields
        instead of database table names. 
    - HQL is similar to SQL but works with Java objects instead of database tables.

        Example:
            FROM Employee e WHERE e.salary > 50000

        Instead of:
            SELECT * FROM employee WHERE salary > 50000

        HQL is database-independent and object-oriented.

    # Advantages
        Hibernate
        Automatic SQL generation
        ORM support
        Database independence
        Automatic dirty checking
        Built-in caching
        Lazy loading support
        Batch processing
        Better performance
        Enterprise-ready
*/