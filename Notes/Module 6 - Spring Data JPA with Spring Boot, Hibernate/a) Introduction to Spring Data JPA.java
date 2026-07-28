/*

    What is Persistence?
    - Persistence means storing data permanently so that it is available even after the application is closed.
    
    Why Do We Need Persistence?
        - To store data permanently.
        - To retrieve data later.
        - To maintain data across application sessions.
        - To ensure data is not lost when the application crashes or restarts.

    Example:

        You create an account on Amazon.
        Your details remain stored even after:
            Closing the application
            Restarting your phone
            Logging in next week

        That permanent storage is called Persistence.

    What is a Database?
        A database stores information in an organized manner.

     Example:
        Employee Table

        ID	    Name	    Salary
        101	    Rahul   	50000
        102	    Amit	    70000

     Databases like:
        MySQL
        Oracle
        PostgreSQL
        SQL Server

        store data permanently.

    Problem Before JPA
    Earlier, Java developers used JDBC (Java Database Connectivity).
        With JDBC developers had to:
            Write SQL manually
            Open database connection
            Close connection
            Handle exceptions
            Convert ResultSet into Java Objects
            Maintain repetitive code

    What is ORM?
    - ORM (Object Relational Mapping) is a technique that maps Java objects to database tables automatically.
    - Instead of working with rows and columns, developers work with Java objects.

    Suppose English-speaking people want to talk to Japanese-speaking people.
     They need a translator.
        English Person
              │
        Translator
              │
        Japanese Person

     Similarly,
        Java Objects
              │
            ORM
              │
        Database Tables

     ORM acts as the translator.

    # What is JPA? 
    - Java Persistence API is a Java Specification that defines standard rules for storing Java objects into relational databases.

    Important Point
     JPA is:
        ❌ Not a Framework
        ❌ Not a Library
        ✅ A Specification

     Think of JPA as a rule book.
        It defines:
            How objects should be stored
            How objects should be retrieved
            Standard interfaces
            Standard annotations
        It does not contain the actual implementation.

    Real-Life Analogy
        Suppose the Government creates traffic rules.

        The rules specify:
            Drive on the left
            Wear helmet
            Stop at red signal

        But the Government doesn't drive your vehicle.

        Similarly,
        JPA creates the rules.
        Someone else implements them.

    Who Implements JPA?
        Since JPA is only a specification, an implementation is required.

    Popular implementations:
        Implementation	Company
        Hibernate	Red Hat
        EclipseLink	Eclipse Foundation
        OpenJPA	Apache

    Among them,  Hibernate is the most popular JPA implementation.

    # What is Hibernate?
    - Hibernate is an ORM Framework.
      It implements every rule defined by JPA.

     Hibernate automatically:
        Generates SQL
        Maps objects
        Executes queries
        Converts ResultSet into Objects
        Manages caching
        Optimizes database operations

     Without Hibernate:
        Developer
             ↓
        Writes SQL

     With Hibernate:
        Developer
             ↓
        Java Object

        Hibernate
        SQL Generated Automatically

    What is Spring Data JPA?
        Spring Data JPA is a Spring Framework module built on top of JPA.
        It further reduces the amount of code developers write.
        Instead of interacting directly with JPA's EntityManager, developers usually work with repository interfaces such as JpaRepository.

     What Spring Data JPA Adds
     - JPA already provides object-relational mapping.
     - Spring Data JPA adds:
        Repository abstraction
        Ready-made CRUD operations
        Automatic query generation
        Pagination support
        Sorting support
        Integration with Spring Boot

    # Why Was Spring Data JPA Introduced?
    - Even with JPA, developers still had to:
        Create EntityManager
            Write JPQL queries
            Manage repetitive CRUD code
            Write DAO (Data Access Object) classes
        Spring Data JPA removes much of this repetitive work by providing repository interfaces and convention-based query creation.

    # Advantages of Spring Data JPA
     1) Less Boilerplate Code - Most common database operations are already available.

     2) Automatic CRUD Operations
        Supports common operations such as:
            Save
            Find
            Update
            Delete
        without requiring repetitive data-access code.

     3) Automatic Query Generation - Spring Data JPA can derive queries from repository method names.

     4) Better Readability- Business logic remains clean because database-related code is minimized.

     5) Faster Development- Developers spend more time implementing business features rather than repetitive persistence code.

     6) Easier Maintenance - Centralized repositories make the application easier to understand and maintain.

     7) Database Independence- Applications can work with different relational databases by changing configuration rather than rewriting large amounts of code.

     8) Enterprise Ready
        Widely used in:
            Banking
            Healthcare
            E-Commerce
            ERP Systems
            Insurance
            Logistics

    # Advantages in Spring Boot
        Spring Boot makes Spring Data JPA even easier through Auto Configuration.

     Benefits include:
        Automatic configuration
        Embedded server support
        Simple dependency management
        Externalized configuration (application.properties / application.yml)
        Easy integration with Hibernate
        Production-ready features
        Rapid application development


        */