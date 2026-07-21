/*

    # What is sonar.host.url? 
     - sonar.host.url is a configuration property that tells the SonarQube Maven Plugin where the SonarQube Server is running.
        
      sonar.host.url = Address of the SonarQube Server.
      Think of it as the destination address where Maven should send the analysis results.

    Why do we need it?
        Suppose you have installed the SonarQube Maven Plugin.
        Now Maven knows how to perform SonarQube analysis.
        But one question remains: "Where should I send the analysis report?"

        Without a server address, Maven has no destination.
        So we configure: sonar.host.url=http://localhost:9000

        Now Maven knows exactly where to send the analysis.

    # Local vs Enterprise Server
     1) Local Development
        When SonarQube is installed on your own computer:   sonar.host.url=http://localhost:9000

        Here:
            localhost → Your own machine
            9000 → Default SonarQube port
        
     2) Enterprise Environment
        Companies usually have a centralized SonarQube server.

        Example: sonar.host.url=http://sonarqube.company.com:9000
        Every developer sends reports to the same server.
        This allows managers and teams to monitor code quality for all projects in one place.

    # Implementation
        You can configure it like this: sonar.host.url=http://localhost:9000
        
        Understanding the Parts
        Property	            Meaning
        sonar.host.url	SonarQube Server address
        http://	        Communication protocol
        localhost	    Local machine
        9000	        Default SonarQube port

        You don't need to memorize the exact syntax. Just remember its purpose.

    # What are Proxy Settings?
     A Proxy Server is an intermediate server between your computer and another server.
        Instead of connecting directly:
          Computer
            ↓
          SonarQube Server

        The request goes through:
            Computer
                ↓
            Proxy Server
                ↓
            SonarQube Server

    Why do companies use a Proxy?
        Large organizations often block direct internet or network access for security reasons.
         A proxy helps:
            Monitor traffic
            Improve security
            Control access
            Log requests

    Real-Life Analogy
     Without Proxy:
        You
         ↓
        Teacher

     With Proxy:
        You
         ↓
        Class Monitor
         ↓
        Teacher

     The class monitor forwards your message.
     Similarly, a proxy forwards network requests.

    Advantages
     sonar.host.url
        Identifies the SonarQube Server.
        Enables communication between Maven and SonarQube.
        Supports both local and remote servers.
        
     Proxy
        Improves security.
        Controls network access.
        Required in some corporate environments.
*/