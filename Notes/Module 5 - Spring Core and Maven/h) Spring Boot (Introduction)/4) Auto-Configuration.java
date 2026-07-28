/*

    # Auto-Configuration :
    - Auto-Configuration is a Spring Boot feature that automatically configures the application based on the dependencies available in the project.

    Real-Life Analogy
        Imagine checking into a hotel.

     Traditional Spring:
        You have to request separately:
            Room
            Wi-Fi
            Towels
            Breakfast

     Spring Boot:
        You book the room.
        Everything is already prepared.

    Role of @EnableAutoConfiguration
    Spring Boot provides: @EnableAutoConfiguration

    Its purpose is:  Automatically configure Spring Beans based on the project dependencies

    How Does Spring Boot Decide What to Configure?
    Spring Boot checks:
        Project Starts
            ↓
        Check Dependencies
            ↓
        Check Classpath
            ↓
        Dependency Found?
              │
         ┌────┴────┐
         │         │
        Yes        No
         │         │
         ▼         ▼
        Configure  Ignore

    
Advantages
     Reduces manual configuration.
     Saves development time.
     Less boilerplate code.
     Faster application setup.
     Easy dependency-based configuration
*/