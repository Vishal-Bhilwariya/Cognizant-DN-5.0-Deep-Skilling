/*

    # What is a Maven Plugin?
        A Maven Plugin is a software component that adds extra functionality to Maven.

        By default, Maven knows how to:
            Compile Java code
            Download dependencies
            Run tests
            Package the application (JAR/WAR)

        If we want Maven to perform additional tasks, we add plugins.

        Examples:
            Compiler Plugin → Compiles Java code
            Surefire Plugin → Runs JUnit tests
            Spring Boot Plugin → Runs Spring Boot applications
            SonarQube Maven Plugin → Performs code analysis

    What is the SonarQube Maven Plugin?
        The SonarQube Maven Plugin allows Maven to communicate with the SonarQube Server and send your project's code for analysis.
        The SonarQube Maven Plugin is a bridge between Maven and SonarQube.
        Without this plugin, Maven has no idea what SonarQube is.

    Why do we need it?
     Let's understand the problem.
     Suppose you have a Spring Boot project.
        You execute: mvn clean install

     What does Maven do?
        Project
            ↓
        Compile
            ↓
        Run Tests
            ↓
        Create JAR
            ↓
        Finish

     Notice something?
         No code quality analysis.

     Why?
        Because Maven only knows its own lifecycle.
        It doesn't know:
            What SonarQube is.
            Where the SonarQube Server is.
            How to send analysis data.
        So we install the SonarQube Maven Plugin.

    Now Maven's workflow becomes:
        Project
           ↓
        Compile
           ↓
        Run Tests
           ↓
        Analyze Code (Sonar Plugin)
           ↓
        Send Report to SonarQube
           ↓
        Finish

    # Real-Life Analogy
     Imagine you want to send a parcel.
        You have:
            Parcel 
            Destination 
        But no courier.

        The parcel cannot reach the destination.
        Now you use a courier service.

    # Implementation :
    We add the plugin in the project's pom.xml.

     Example:
        <build>
            <plugins>
                <plugin>
                    <groupId>org.sonarsource.scanner.maven</groupId>
                    <artifactId>sonar-maven-plugin</artifactId>
                </plugin>
            </plugins>
        </build>
    
    Understanding the Tags
        Tag	                Purpose
        <build>	        Contains build configuration
        <plugins>	    Holds all Maven plugins
        <plugin>	    Defines one plugin
        <groupId>	    Organization providing the plugin
        <artifactId>	Name of the plugin

    Advantages
        Enables Maven to work with SonarQube.
        Automates code analysis.
        Fits naturally into the Maven build lifecycle.
        Supports CI/CD pipelines.
        Eliminates the need for manual code uploads.
*/