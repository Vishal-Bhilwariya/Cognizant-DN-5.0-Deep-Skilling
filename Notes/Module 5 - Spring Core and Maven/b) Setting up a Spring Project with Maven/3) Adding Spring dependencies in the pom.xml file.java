/*

# What is a Dependency?
- A dependency is an external library or framework that your project requires to perform certain tasks.

# What is pom.xml?
- The pom.xml file is the heart of every Maven project.
It tells Maven:
    Which libraries are needed.
    Which version of each library to use.
    How to build the project.
Think of it as the instruction file for Maven.

# Where Do We Add Dependencies?
Inside the <dependencies> tag.
    <dependencies>

    </dependencies>
This section contains all the libraries your project requires.

# Adding the Spring Dependency :
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>6.1.10</version>
    </dependency>
</dependencies>

# Understanding Every Tag :
1) <dependencies> : Contains all dependencies used by the project.
    <dependencies>
        Spring
        JUnit
        MySQL Driver
    </dependencies>

2) <dependency> : Represents a single library.
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>6.1.10</version>
    </dependency>
    It means we are adding the "spring-context" library to our project.

3) <groupId> : Represents the organization or group that created the library.
    <groupId>org.springframework</groupId>
    It means the Spring Framework is developed by the organization "org.springframework".

4) <artifactId> : Represents the specific library or module you want to use.
    <artifactId>spring-context</artifactId>
    It means we want to use the "spring-context" module of the Spring Framework.
    
    Spring has many libraries:
        spring-core
        spring-context
        spring-web
        spring-beans

5) <version> : Represents the specific version of the library you want to use.
    <version>6.1.10</version>
    It means we want to use version 6.1.10 of the "spring-context" library.

# What Happens After Saving?
    Save pom.xml
          │
          ▼
    Maven Reads File
          │
          ▼
    Checks Local Repository
          │
          ▼
    If Missing
          │
          ▼
    Downloads Library
          │
          ▼
    Adds Library to Project

    This usually happens automatically in IDEs like IntelliJ IDEA and Eclipse.

Example :
    <project>
        <modelVersion>4.0.0</modelVersion>
        <groupId>com.cognizant</groupId>
        <artifactId>SpringDemo</artifactId>
        <version>1.0</version>
    
        <!-- List of all required libraries -->
        <dependencies>
            <!-- Spring Context Library -->
            <dependency>
                <!-- Organization -->
                <groupId>org.springframework</groupId>
                <!-- Library Name -->
                <artifactId>spring-context</artifactId>
                <!-- Version -->
                <version>6.1.10</version>
            </dependency>
        </dependencies>
    </project>

# Advantages
    Automatic library download
    Easy version management
    No manual JAR copying
    Faster project setup
    Better dependency management
*/