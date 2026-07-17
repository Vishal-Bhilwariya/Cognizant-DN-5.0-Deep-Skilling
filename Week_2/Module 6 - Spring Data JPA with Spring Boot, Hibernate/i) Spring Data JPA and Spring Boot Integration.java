/*

    # What is Spring Data JPA and Spring Boot Integration?
    - Spring Boot Integration means automatically configuring Spring Data JPA, Hibernate, and the Database Connection with minimal manual configuration.
    Instead of manually configuring dozens of classes, Spring Boot does it automatically.

    # Why Do We Need Integration?
     Before Spring Boot, developers had to configure:
        DataSource
        Hibernate
        EntityManager
        Transaction Manager
        Repository Scanner
        Database Driver

        All manually.
     With Spring Boot
        Developer
            ↓
        Add Dependencies
            ↓
        Configure application.properties
            ↓
        Run Application
 
       Spring Boot does the rest.

    # What is Auto-Configuration?
     - Auto-Configuration is a Spring Boot feature that automatically configures the application based on the dependencies available in the project.

    Example
        Suppoe your project contains:
            Spring Data JPA Dependency
            MySQL Driver

        Spring Boot automatically configures:
            DataSource
            Hibernate
            EntityManager
            Transaction Manager
            Repository Beans

        without writing configuration classes.

    # What is a DataSource?
     - A DataSource is an object responsible for establishing and managing connections to the database.

        DataSource = A connection provider between the application and the database.

        Without a DataSource, the application cannot communicate with the database.

    # Customizing DataSource Configuration
        Spring Boot allows developers to configure the DataSource using properties.

        Common configurations include:
            Database URL
            Username
            Password
            JDBC Driver
            Connection Pool settings

        These values are usually stored in application.properties.

    # Externalizing Configuration        
     - Externalizing Configuration means keeping configuration values outside the Java code.
        Instead of writing:
            Username = root
            Password = root
                inside Java classes,

        they are stored in application.properties or application.yml
        
    Why Externalize Configuration?
        Imagine changing the database password.

        Without external configuration:

            Open Java Code
                ↓
            Modify Password
                ↓
            Compile Again

        With external configuration:
            Open application.properties
                ↓
            Change Password
                ↓
            Restart Application

        Much easier.

    # What is application.properties?
     - It is the default configuration file in Spring Boot.
        Stores:
            Database URL
            Username
            Password
            Port Number
            Hibernate Properties
            Logging Configuration

        Location
            src
            └── main
                 └── resources
                        └── application.properties

    # Common Configuration Properties
        Property	                                   Purpose
        spring.datasource.url	                    Database URL
        spring.datasource.username	                Database Username
        spring.datasource.password	                Database Password
        spring.datasource.driver-class-name	        JDBC Driver
        spring.jpa.hibernate.ddl-auto	            Schema Management
        spring.jpa.show-sql	                        Display SQL Queries
        server.port	                                Application Port

    # Managing Multiple Data Sources
    - Spring Boot supports multiple data sources.
    Useful when an application needs to connect to more than one database.

    Example:
        One DataSource for Employee Data
        Another DataSource for Inventory Data

    Why Multiple Data Sources?
        Large enterprise applications often separate data.

     Example:
        Employee Database
            ↓
          MySQL
        -------------------
        Payroll Database
            ↓
         Oracle

        Different databases handle different business modules.

    Advantages of Multiple Data Sources
        Better scalability
        Better security
        Database separation
        Improved performance
        Independent maintenance

    # Real-Life Analogy
     - Imagine a company.
        Instead of keeping everything in one room, there are separate departments.

        Company
            ↓
        HR Department
        Finance Department
        Sales Department

      Similarly, an application can use:
        Application
            ↓
        MySQL
        Oracle
        PostgreSQL
     Different databases serve different purposes.

    Advantages
     1) Spring Boot Integration
            Minimal configuration.
            Automatic bean creation.
            Faster development.
            Easy integration with Spring Data JPA.
            Less boilerplate code.
     2) External Configuration
            Easy maintenance.
            Better security.
            Environment-specific settings.
            No code modification for configuration changes.
     3) Multiple Data Sources
            Better scalability.
            Independent databases.
            Improved organization.
            Enterprise-ready architecture.


    */