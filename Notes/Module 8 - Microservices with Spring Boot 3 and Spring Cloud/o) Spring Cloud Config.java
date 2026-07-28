/*

    # What is Externalized Configuration? 
    - Externalizing configuration means storing configuration details outside the application code.
    - Instead of storing configuration inside every microservice, we keep it in one central location.
    
    Why?
        Flexibility
        Environment-specific settings
        Security (secrets not in code)

    Why do we need it?
      Without Externalized Configuration
        Order Service
             ↓
        application.properties
        
        Payment Service
             ↓
        application.properties
        
        Inventory Service
             ↓
        application.properties

        Every project stores its own configuration.
        Changing one property means changing every project.

     With Externalized Configuration
             Config Server
                application.properties
                        │
              ┌─────────┼──────────┐
              ▼         ▼          ▼
           Order    Payment   Inventory

        Only one place to manage configuration.

    Real-Life Analogy
        Car Settings
        Instead of hardcoding seat position, mirror angle in car design,
        These are adjustable externally.

    Advantages
        Easy Updates
        Environment Flexibility
        Security
        Reusability

    # Spring Cloud Config :
    - Spring Cloud Config provides a central Config Server that stores configuration for all Microservices.
    
    Where does Config Server store configurations?
     Usually
        Git Repository
        Local Files
        File System
        Vault
        Database

        Most companies use Git.

     Why Git?
        Because Git provides
            Version Control
            History
            Rollback
            Team Collaboration
        
    Real-Life Analogy
     Google Drive
        Instead of everyone storing files separately, everyone downloads the latest file from Google Drive.
        Config Server behaves similarly.

    Advantages
        Central Management
        Git Integration
        Version Control
        Easy Deployment
        Better Consistency

    # Dynamic Configuration Updates :
    Problem
     Suppose discount=10%
     Company decides discount=20%

     Without Dynamic Refresh
        Restart Application.
        Very bad.

     With Dynamic Refresh
        Update Config
            ↓
        Refresh
            ↓
        New Value Used
            ↓
        No Restart

    Refresh Mechanism
        Spring Boot provides : /actuator/refresh
        This refreshes configuration without restarting the application.

    Real-Life Analogy
        Live News Channel
        News updates instantly.
        You don't restart the TV.
        Configuration also updates dynamically.
        
    Advantages
        No Downtime
        Faster Updates
        Better User Experience
        Easy Maintenance

    # Managing Configuration for Different Environments :
    - Different environments (dev, test, prod) often need different configurations.

    Example
        Dev
            URL = http://localhost:8080
            DB = dev_db

        Test
            URL = http://test-server:8080
            DB = test_db

        Prod
            URL = http://prod-server:8080
            DB = prod_db

    How?
        Spring Cloud Config supports profiles.
        Each environment has its own config file.

        application-dev.yml
        application-test.yml
        application-prod.yml

    Real-Life Analogy
        Menu in a Restaurant
        Different menus for different times.
        Same restaurant, different dishes.

    Advantages
        Environment Isolation
        Easy Testing
        Secure Deployments
        Scalable Configurations
*/