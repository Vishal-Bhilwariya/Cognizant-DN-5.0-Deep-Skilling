/*

    # What is SonarQube Architecture?
     SonarQube Architecture is the internal structure of SonarQube that describes how different components work together to analyze source code and generate quality reports.
     It consists of several components:
        Web Server
        Compute Engine
        Search Server (Elasticsearch)
        SonarQube Scanner (Client)
        SonarQube Server
        Database
     Each component has a specific responsibility.

    Think of SonarQube as a company.
        A company has different departments:
            Reception
            Employees
            Records Department
            Search Department

        Similarly, SonarQube also has different components.
        Each component performs one job.
        Together they produce the final code quality report.

    Why do we need an Architecture?
     Imagine SonarQube was just one huge Java program.
        It would have to:
            Receive analysis requests
            Analyze millions of lines of code
            Store reports
            Search reports
            Show dashboards

        All inside one program.

        Problems:
            Slow
            Difficult to maintain
            Difficult to scale
            Difficult to update

        Therefore SonarQube divides responsibilities into separate components.
        This follows one of the software engineering principles you've already studied: Single Responsibility Principle (SRP)
        Each component has one primary responsibility.

    # Understanding Each Component :
    a) Web Server - The Web Server provides the SonarQube user interface (UI) that developers access through a browser.
        It handles:
            User requests
            API calls
            Dashboard access
        It is built using the Java web framework, Spring Boot.

        It Provides the web interface.
         It shows:
            Dashboard
            Issues
            Metrics
            Quality Gate
            Reports

         Whenever you open SonarQube in a browser:   http://localhost:9000
            You're communicating with the Web Server.

    b) Compute Engine - The Compute Engine is the processing unit (brain) of SonarQube.
                        After the Scanner uploads analysis data, the Compute Engine processes it.
         Responsibilities:
            Process analysis reports
            Calculate metrics
            Apply quality rules
            Determine Quality Gate status
            Prepare final results

        Without the Compute Engine, SonarQube cannot produce meaningful reports.
        It receives data from the scanner and processes it.

    c) Search Server (Elasticsearch) - SonarQube uses Elasticsearch to provide fast searching and filtering of analysis results.
        Imagine a project with:
            20 million lines of code
            50,000 issues

         Searching directly in the database would be slow.
        Instead, SonarQube uses Elasticsearch.
            Its job is:
                Index reports
                Enable very fast searching
                Support dashboard filters

    d) SonarQube Scanner (Client) - The SonarQube Scanner is the client that reads your source code and sends analysis data to the SonarQube Server.
        The Scanner is a tool that:
            Runs on the developer's machine or build server
            Collects source code
            Sends it to the Web Server for analysis
        It supports multiple languages and build tools.
        Think of it as: The messenger.
            It does not store reports.
            It does not generate dashboards.
            It simply sends analysis information.

    e) SonarQube Server
        The SonarQube Server is the main server that:
            Stores configuration
            Manages users and permissions
            Coordinates between components
        It acts as the central hub.

    f) Database - The Database stores all SonarQube information permanently.
        The Database stores:
            Configuration settings
            User information
            Analysis results
            Quality gate status
        Commonly uses H2 (for testing) or PostgreSQL (for production).
        Source code is NOT stored here. Only metadata and analysis results are stored.

    # How Components Work Together
        1. Developer runs the SonarQube Scanner.
        2. Scanner sends code to the Web Server.
        3. Web Server forwards the task to the Compute Engine.
        4. Compute Engine analyzes the code.
        5. Results are stored in the Database.
        6. Elasticsearch indexes the data for fast search.
        7. Users access the dashboard via the Web Server.

    Advantages
        Modular architecture
        Easy to maintain
        Easy to scale
        Faster searching with Elasticsearch
        Efficient background processing
        Better separation of responsibilities
        Supports enterprise-sized projects

*/