/*

    # What is a Build?
    - A build is a process of converting source code into a standalone form that can be run on a computer. It typically 
      involves compiling the code, packaging it into an executable format, and sometimes running tests to ensure the code 
      works as expected.
      
    # What is a Build Tool?
    - A build tool is a software application that automates the process of building software. It helps developers manage 
      dependencies, compile code, run tests, and package the application for deployment. Build tools can also provide features
      like versioning, continuous integration, and deployment automation.

    # What is Maven?
    - Maven is a popular build automation tool used primarily for Java projects. It simplifies the build process by providing 
      a standard way to manage project dependencies, compile code, run tests, and package applications. 
      Maven uses a Project Object Model (POM) file to define the project's structure, dependencies, and build configuration.

    Think of Maven as a Project Manager.
        You tell Maven: "I want to build my project."
        Maven replies:"Don't worry! I'll compile your code, download required libraries, run tests, package your application, and prepare it for deployment."

    # Why do we need Maven?
     - Before Maven existed, Java development involved many manual tasks.

     Let's understand the problems.
        Problem 1: Manual Library Management
            Suppose you want to use the Spring Framework.

            Without Maven:
                Search for the Spring JAR files online.
                Download each JAR manually.
                Copy them into your project.
                Repeat this for every library.

            Now imagine your project requires 50 libraries.
            This becomes tedious and error-prone.

        Problem 2: Dependency Conflicts
            Sometimes one library requires another library.

            Example:
                Spring
                   │
                   ├── Library A
                   ├── Library B
                   └── Library C

            Without Maven, you would have to identify and download all of these manually.
            Maven resolves these transitive dependencies automatically.

            We'll learn more about transitive dependencies in later topics.

        Problem 3: Manual Build Process
            Developers had to:
                Compile code
                Run tests
                Create JAR files

            Doing these tasks manually for every project wastes time.

        Problem 4: Different Project Structures
            Every developer organized projects differently.

            Example:
             Developer A
                Java Files
                Images
                XML

             Another developer:
                Source
                Classes
                Resources

            No standard structure existed.
            Maven introduced a standard directory structure that all Java developers follow.

     # Why Companies Use Maven
        Companies use Maven because it:
            Saves development time
            Reduces manual work
            Keeps projects organized
            Makes teamwork easier
            Ensures everyone uses the same library versions

    # Working
        Let's see how Maven works.

        Step 1 : Developer creates a Maven project.
          ↓
        Step 2 : Developer specifies required libraries.
          ↓
        Step 3 : Maven checks the pom.xml file.
          ↓
        Step 4 : Maven downloads missing libraries from a repository.
          ↓
        Step 5 : Maven compiles the Java code.
          ↓
        Step 6 : Maven runs tests.
          ↓
        Step 7 : Maven packages the application into a JAR or WAR file.

    # Diagram
                        Developer
                            │
                            │
                  Creates Maven Project
                            │
                            ▼
                       pom.xml File
                            │
                            ▼
                         Maven
                 ┌────────┼────────┐
                 │        │        │
                 ▼        ▼        ▼
         Download   Compile   Run Tests
        Libraries     Code
                 │
                 ▼
            Package Project
                 │
                 ▼
           Runnable Application

    # Imagine you're organizing a college fest.
    - Without a coordinator, you have to:
        Book the venue
        Arrange food
        Invite guests
        Handle decorations
        Manage the budget
       Doing everything yourself is difficult.
     Now imagine you hire an event manager.
        You simply tell them: "Organize the fest."

        The event manager takes care of everything.

        Maven is like that event manager.

        You focus on writing code, while Maven handles the project-building tasks.
        
    Code : mvn - This is the command-line interface for Maven. You can use it to run various Maven commands, such as compile, package, test, and more. The mvn command reads the pom.xml file to understand the project's structure and dependencies.

        Some common Maven commands are:
           1) mvn compile 
            - This command tells Maven to compile the Java source code into class files.
              It looks at the pom.xml file to know what to compile and where to put the compiled files.
           2) mvn package
            - This command tells Maven to package the compiled code into a distributable format, like a JAR or WAR file.
              It uses the information in the pom.xml file to determine how to package the application.

    # Advantages
        Automates repetitive build tasks
        Downloads dependencies automatically
        Provides a standard project structure
        Makes collaboration easier
        Simplifies version management
        Integrates well with IDEs and CI/CD tools

*/