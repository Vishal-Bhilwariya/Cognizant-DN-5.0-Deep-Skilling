/*

# What does "Configuring Maven" mean?
Configuring Maven means telling Maven:
    Which libraries (dependencies) the project needs.
    Which Java version to use.
    How to build the project.
    How to package the application.

  This information is written inside the pom.xml file.

# Configuring Java Version:
Suppose your project uses Java 17.
Inside pom.xml:
    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>
What do these tags mean?
        Tag                     	Purpose
maven.compiler.source	Java version used to write the code
maven.compiler.target	Java version for the compiled bytecode

This tells Maven: "Compile this project using Java 17."

# Configuring Dependencies
 We've already learned this.

 Example:
    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>6.1.10</version>
        </dependency>
    </dependencies>
This tells Maven: Download the Spring Context library.



*/