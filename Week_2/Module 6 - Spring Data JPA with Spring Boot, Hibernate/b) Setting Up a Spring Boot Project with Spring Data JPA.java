/*

    # What is Setting Up a Spring Boot Project with Spring Data JPA?
    - It is the process of configuring a Spring Boot application so that it can communicate with a relational database using Spring Data JPA.

    In simple words,
        We prepare the project by adding the required libraries (dependencies) and database configuration so the application can perform database operations.

    Creating a Spring Boot Project
    - A Spring Boot project can be created using:
        Spring Initializr 
        IntelliJ IDEA
        Eclipse (STS)
        VS Code
    - Most companies use Spring Initializr

    Information Required While Creating Project
    Field	           Description	        Example
    Project	        Build Tool	            Maven
    Language	    Programming Language	Java
    Spring Boot     Version	Boot Version	3.x.x
    Group	        Organization Name	    com.cognizant
    Artifact	    Project Name        	employee-management
    Name	        Application Name	    employee-management
    Packaging	    Output Format	        Jar
    Java Version	Java Version	        17

    Required Dependencies
    - For Spring Data JPA applications, the common dependencies are:

        Dependency	                Purpose
        Spring Web	            Build REST/Web applications
        Spring Data             JPA	Database access using JPA
        MySQL Driver	        Connect to MySQL
        Spring Boot DevTools	Automatic restart during development

    What is a Dependency?
    - A Dependency is an external library required by the project.
    - Instead of writing everything ourselves, we use ready-made libraries.

    # Spring Data JPA Dependency
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>

    Explanation
            Tag	                    Description	                       Purpose
        <dependency>	    Defines a dependency	            Adds a library to the project
        <groupId>          	Organization providing the library	Identifies the vendor
        <artifactId>	    Library name	                    Identifies the specific dependency

    # Why is spring-boot-starter-data-jpa called a Starter?
     - A Starter is a pre-configured dependency provided by Spring Boot.
     - Instead of adding many libraries separately, one starter automatically includes all required JPA-related libraries.
        
     Example:
        Instead of buying:
            Rice
            Dal
            Sabzi
            Roti
        You order a Thali.

        Similarly,spring-boot-starter-data-jpa already includes everything needed for JPA.

    # MySQL Driver Dependency
    Example:
        <!-- MySQL JDBC Driver -->
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
        </dependency>
        
    Why is it Required?
     - Spring Boot cannot communicate directly with MySQL.
        The JDBC Driver acts as a translator.
            Spring Boot
                  │
            MySQL Driver
                  │
            MySQL Database

        Without the driver, the application cannot establish a database connection.        
        
    # What is application.properties?
     - application.properties is the default configuration file in Spring Boot.
        It stores configuration such as:
            Database URL
            Username
            Password
            Server Port
            Hibernate Properties
            Logging Configuration

     Location:
        src
         └── main
              └── resources
                     └── application.properties

    # Database Configuration
        Example:
            # Database URL
            spring.datasource.url=jdbc:mysql://localhost:3306/employee_db

            # Database Username
            spring.datasource.username=root

            # Database Password
            spring.datasource.password=root

            # JDBC Driver
            spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
        
        Explanation
            Property	                           Purpose
            spring.datasource.url	            Database location
            spring.datasource.username	        Database username
            spring.datasource.password	        Database password
            spring.datasource.driver-class-name	JDBC Driver class

    Hibernate Configuration
     - Common properties:
            spring.jpa.hibernate.ddl-auto=update
            spring.jpa.show-sql=true
            spring.jpa.properties.hibernate.format_sql=true
            
     Explanation
           Property	                Description
        ddl-auto=update	    Automatically updates database tables according to entity changes
        show-sql=true	    Displays generated SQL queries in the console
        format_sql=true	    Formats SQL output for better readability

    What is ddl-auto?
     - DDL stands for Data Definition Language.
        It controls how Hibernate manages the database schema.

        Common values:
            Value	                Meaning
            none	        No schema changes
            validate	    Validates existing schema only
            update	        Updates tables without deleting data
            create	        Drops and recreates tables on startup
            create-drop	    Creates tables on startup and drops them on shutdown

    Real-Life Analogy
    - Imagine you want to visit a friend.
        You need:
            Address
            Vehicle
            Driver

     Similarly,
        Spring Boot needs:
            Database URL
            JDBC Driver
            Username & Password

    Without any one of them,    the connection cannot be established.

    Dependency vs Driver
        Dependency	                         Driver
        External library	        Specific library for database communication
        Adds project functionality	Connects application to database
        Example: Spring Data JPA	Example: MySQL Connector/J
        
    application.properties vs application.yml
        application.properties	        application.yml
        Key-value format	            YAML format
        Easier for beginners	          Cleaner for large projects
        Widely used in tutorials	    Common in enterprise applications
        
*/