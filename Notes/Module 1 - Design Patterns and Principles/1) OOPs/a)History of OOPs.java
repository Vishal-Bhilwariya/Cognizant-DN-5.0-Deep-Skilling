/*
    # History Of OOPs :
    -> The History of Programming refers to how programming languages have evolved over time to make software development easier,
       faster, and more efficient.

       Programming languages evolved in this order:
        o Machine Language (1GL)
        o Assembly Language (2GL)
        o Procedural Language (3GL)
        o Object-Oriented Programming (OOP)
        
       Each new generation was created to solve the problems of the previous one.

       Explanation
            Imagine humans and computers trying to communicate.
            Initially, humans had to speak exactly in the computer's language (0s and 1s). This was extremely difficult.
            So, better languages were created step by step until we reached Object-Oriented Programming (OOP), where programs are written using objects that represent real-world things.

        Why Do We Need It?
          Earlier programming languages had many limitations:
            o Very difficult to write
            o Hard to understand
            o Time-consuming
            o Difficult to debug
            o Large programs became impossible to manage
            o Reusing code was almost impossible
          As software became larger (banking, hospitals, social media, e-commerce), better programming methods became necessary.
        
        Why It Is Used in Real Projects
            Modern companies like Cognizant build huge applications.

            Example:
                Banking Software
                Hospital Management
                Amazon
                Facebook
                Uber
            Such applications may contain millions of lines of code.
            Without OOP, maintaining such software would be extremely difficult
        
        1. Machine Language (First Generation Language - 1GL) 
            -> The first generation of programming languages is called Machine Language.
            -> It is the only language that a computer can understand directly.
            -> It consists of binary digits (0s and 1s).
            -> Each instruction is represented by a unique binary number.
            -> It is very difficult for humans to read and write.
            -> It is also known as Low-Level Language.
            -> It is machine-dependent, meaning the same program won't work on different machines.
            -> It is very fast and efficient.
           Example:
                10100011
                11001100
                00110011
                11001100
            Advantages
                Fast execution
                No compiler needed
                Direct hardware communication
            Disadvantages
                Very difficult
                Error-prone
                Hard to debug
                Machine dependent
                Not reusable

            Why Did We Move to Assembly Language? 
             Problem - Humans cannot remember long binary numbers.
             Solution - Use English-like words.
        
        2. Assembly Language (Second Generation Language - 2GL)
            -> Second-generation languages are called Assembly Languages.
            -> They use mnemonics (English-like words) instead of binary numbers.
            -> Example: ADD, SUB, MOV, etc.
            -> They are still machine-dependent.
            -> They require an assembler to convert them into machine language because CPU only understand binary.
            -> They are easier to write and understand than machine language.
            -> Example:
                    MOV A, B     ; Move value from B to A
                    ADD A, C     ; Add value of C to A
                    HLT          ; Halt the program
            Working
                    Programmer
                         |
                    Assembly Code
                         |
                    Assembler
                         |
                    Machine Code
                         |
                    CPU
            Advantages
                Easier to write and understand
                Relatively fast execution
                Direct hardware control
            Disadvantages
                Still machine-dependent
                Requires assembler
                Difficult to maintain large programs
                Not reusable
            
            Why Did We Move to Procedural Languages?
                As software became larger, Assembly Language was still too complex.
                Need:
                    English-like syntax
                    Easy coding
                    Faster development

        3. Procedural Language (Third Generation Language - 3GL)
            -> Third-generation languages are called Procedural Languages.
            -> They use English-like syntax, making them easier to write and understand.
            -> Examples: C, C++, Java, Python, PHP, JavaScript, etc.
            -> They are platform-independent (can run on different machines with proper compilers/interpreters).
            -> They are easier to debug and maintain.
            -> They support code reusability through functions and libraries.
            -> Example (C):
                    #include <stdio.h>
                    int main() {
                        printf("Hello World");
                        return 0;
                    }
            Idea - Instead of writing one huge program,divide it into functions.
            Example:
                        main()         
                        ↓
                        login()
                        ↓
                        calculate()
                        ↓
                        display()
            Working
                    Programmer
                         |
                    Procedural Code
                         |
                    Compiler/Interpreter
                         |
                    Machine Code
                         |
                    CPU
            Languages:
                C
                Pascal
                BASIC
                FORTRAN
            Advantages
                Easy to write and understand
                Platform-independent
                Faster development
                Good for small to medium projects
            Disadvantages
                Difficult to manage large applications
                Code reusability is limited
                Not ideal for complex, large-scale software
                Hard to maintain as projects grow

            Why Did We Move to OOP?
                Procedural languages worked well for small projects but failed with large ones.
                Problems with Procedural Languages:
                    o Data was not secure
                    o Data and functions are separate
                    o Difficult to manage large codebases
                    o Code reuse is limited
                    o Large projects became messy
                In OOP 
                     Need:
                        Better security
                        Better code organization
                        Code reuse
                        Easier maintenance

                Need for a better approach that models real-world entities and relationships.

        4. Object-Oriented Programming (OOP)
            -> OOP is a programming paradigm that organizes code around objects and classes.
            -> It models real-world entities as objects that contain both data (attributes) and behavior (methods).
            -> Key Features:
                o Class
                o Object
                o Encapsulation
                o Abstraction
                o Inheritance
                o Polymorphism
            -> Examples: Java, C++, Python, C#, Ruby, etc.
            -> Advantages:
                o Better code organization
                o Reusability
                o Maintainability
                o Real-world modeling
            -> Disadvantages:
                o Steeper learning curve
                o Overhead for small projects
                o Can be slower than procedural code

            Summary of Evolution:
                1GL (Machine Language) → 2GL (Assembly) → 3GL (Procedural) → 4GL (OOP)

            Why OOP is Best for Large Applications:
                o Real-world modeling
                o Reusability
                o Maintenance
                o Team collaboration

     | Real-Life Analogy |
      Imagine cooking.

        Machine Language
            You must tell every tiny movement:
                Pick spoon
                Move hand
                Rotate spoon

            Very difficult.
        
        Assembly Language
            Use short commands:
                Stir
                Mix
                Cook
            Better.
              
        Procedural Programming
            Write recipes.
            Example:
                Boil Rice()
                Cook Curry()
                Serve Food()

        OOP 
            Now think in terms of objects:
                Chef
                ↓
                Utensils
                ↓
                Ingredients
                ↓
                Customer
            Each object knows its own responsibilities.

    # Applications
        Language	            Applications
        Machine Language	    Firmware, embedded hardware
        Assembly Language	    Device drivers, operating systems, microcontrollers
        Procedural Language	    System software, scientific applications, utilities
        OOP	                    Enterprise software, banking systems, web applications, Android apps, games, desktop applications
            
*/  