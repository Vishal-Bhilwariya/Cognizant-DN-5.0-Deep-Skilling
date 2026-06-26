/*

  # UML (Unified Modeling Language) :
   - UML (Unified Modeling Language) is a standard visual language used to design, visualize, and document software systems 
      before writing the actual code.
   - UML is not a programming language but a modeling language.
   - It is used to create diagrams that represent different aspects of a system.
   - Instead of writing code first, developers create diagrams to show:
      Classes
      Objects
      Relationships
      Flow of execution
      System architecture
     Think of UML as the blueprint of software, just like an architect creates a blueprint before constructing a building.
   
  Without UML: 
    Imagine building a hospital management system with 100 developers.
    Everyone writes code differently.
    
  With UML:
    Everyone understands:
      Which classes exist.
      How classes communicate.
      Which class inherits another.
      Which methods belong to which class.

    So UML improves:
      Communication
      Planning
      Documentation
      Development
  
  # UML diagrams are categorized into two types:
        1. Structural Diagrams : These show the structure of the software.
            They answer: "What components does the system have?"
            Examples:
                Class Diagram
                Object Diagram
                Component Diagram
                Deployment Diagram
                Package Diagram

        2. Behavioral Diagrams : These show the behavior of the software.
            They answer: "How does the system work?"
            Examples:
                Use Case Diagram
                Sequence Diagram
                Activity Diagram
                State Machine Diagram
                Communication Diagram
                Timing Diagram
                Interaction Overview Diagram

    # UML Class Diagram :
     - The most commonly used UML diagram.
      - Represents the structure of a system.
      - Shows classes, attributes, methods, and relationships between classes.
      - Helps in understanding the static structure of the system.

      Syntax of a Class in UML:
          +---------------------+
          |      ClassName      |
          +---------------------+
          | - attribute1: type  |
          | - attribute2: type  |
          +---------------------+
          | + method1(): return |
          | + method2(): return |
          +---------------------+

          Legend:
              + Public
              - Private
              # Protected
              ~ Package-private

      Example:
          +-------------------------------+
          |         Student               |
          +-------------------------------+
          |     - name: String            |
          |     - age: int                |
          +-------------------------------+
          | + getName(): String           |
          | + setName(name: String): void |
          +-------------------------------+

  # Association in UML :
  -> Association is a relationship between two classes or two objects where they are connected to each other to perform some 
      task.
      Association simply means: "Two classes know each other or work together."
  Note - Neither class owns the other. They are just connected.

  Example : 
  Imagine a Student and a Teacher.
      A student studies under a teacher.
      A teacher teaches many students.
    They are related.
    But,
      Student can exist without Teacher.
      Teacher can exist without Student.
    So they are simply associated.

    
*/