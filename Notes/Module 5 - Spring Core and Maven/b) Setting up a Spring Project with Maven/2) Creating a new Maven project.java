/*

# What is a Maven Project?
- A Maven Project is simply a Java project that uses Maven to:
    Build the project
    Manage dependencies
    Maintain a standard folder structure
    Package the application
    
     Maven Project = Java Project + Maven

# Suppose you want to build a Spring application.
You have two choices:
  Without Maven
    Create folders manually
    Download libraries manually
    Manage versions manually
    Compile manually
    Lots of manual work.

   With Maven
    Create Maven Project
            ↓
    Everything is organized automatically

    Maven creates the project with a standard structure.

# Working : 
 Step 1 : Open Eclipse IDE
 Step 2 : Click on File → New → Maven Project
 Step 3 : Enter project details.
    Example:
            Field   	      Example	  Purpose
            Name	        SpringDemo	Project name
            Location	    D:\Projects	Where the project will be stored
            JDK	            Java 17	    Java version used
            Build System	Maven	    Use Maven to manage the projec
 Step 4 : Maven creates the project.
 Step 5 : It automatically creates the standard folder structure.
 Step 6 : Now you can start writing Java code.

# Standard Directory Structure
SpringDemo
│
├── src
│   │
│   ├── main
│   │     │
│   │     ├── java
│   │     │      └── Java Source Code ( Contains all Java source files )
│   │     │
│   │     └── resources
│   │            └── Properties, XML, Images
│   │
│   └── test
│         │
│         └── java
│                └── Test Classes( Used for unit testing )
│
├── pom.xml 
│
└── target ( Created automatically after building the project. Contains: Compiled classes , JAR/WAR file , Temporary build files)

# pom.xml File - The heart of the Maven project.
    - Contains project configuration
    - Lists dependencies
    - Defines build settings

    Example:
    <project>
        <modelVersion>4.0.0</modelVersion>
        <groupId>com.howtodoinjava</groupId>
        <artifactId>demo</artifactId>
        <version>0.0.1-SNAPSHOT</version>

        <dependencies>
            <!-- Add dependencies here -->
        </dependencies>
    </project>

# Benefits
    - Standardized project layout
    - Automatic dependency management
    - Easy build process
    - Simple project creation
    - Consistent project structure across teams

*/