/*

    # Running Maven Sonar Goals :
    - mvn clean verify sonar:sonar 
        Command	            Purpose
        mvn	            Starts Maven
        clean	        Removes old build files
        verify	        Compiles and tests the project
        sonar:sonar	    Runs SonarQube analysis

    This command tells Maven to perform three tasks in sequence:
        clean → Remove old build files.
        verify → Build the project and run tests.
        sonar:sonar → Analyze the code using SonarQube.

    mvn clean verify sonar:sonar is a Maven command that cleans the project, verifies it, and then sends it to SonarQube for code quality analysis.

    Why do we use all three together?
     Imagine you are submitting an assignment to your teacher.

     Would you submit:
        Old version
        Without checking mistakes

        No.

     You would:
        Throw away the old copy.
        Check the assignment.
        Submit the final version.

        The Maven command follows the same idea.

    # Understanding Each Goal :
    Goal 1: clean
        What is it?
        clean removes the previous build files.

        These files are usually stored inside the: target/ folder.

     Why is it needed?
        Suppose yesterday you built your project.
        Today you modified some code.
        If old compiled files remain, they may cause confusion or unexpected behavior.
        So Maven starts with a clean state.
        Before
            Project
             ├── src
             ├── pom.xml
             └── target (old files)

                ↓
            mvn clean
                ↓
            Project
             ├── src
             └── pom.xml

    Goal 2: verify
     What is it?
        verify checks whether the project is valid.
        It performs tasks such as:
            Compile the source code
            Run unit tests
            Verify the project can be built successfully

        If something fails here, SonarQube analysis should not continue.

        Why?

        Imagine your project doesn't even compile.
        There is no point analyzing its code quality before fixing the compilation errors.

    Goal 3: sonar:sonar
     What is it?
        This goal starts the SonarQube analysis.
        It tells the SonarQube Maven Plugin: "Analyze this project and send the results to the SonarQube Server."

        The plugin:
            Reads source code
            Collects project information
            Sends data to the SonarQube Server
        The Compute Engine on the server then processes the analysis and generates the report.

    Advantages
        Ensures a fresh build.
        Prevents analysis of outdated files.
        Verifies the project before analysis.
        Automates code quality checks.
        Integrates easily with CI/CD.
*/