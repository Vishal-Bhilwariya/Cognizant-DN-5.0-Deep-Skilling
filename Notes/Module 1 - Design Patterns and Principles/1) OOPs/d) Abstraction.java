/*

 # Abstraction :
 -> Abstraction is the process of hiding unnecessary implementation details and showing only the essential features to the user.

    In Abstraction:
        The user knows what an object does.
        The user does not need to know how it does it.

    In simple words :  Abstraction = Hide "How", Show "What".
    
    Example:
        When you drive a car, you press the accelerator to increase speed.
        You don't need to know how the engine works internally.
        You just see the result: the car moves faster.

    Why Do We Need It?
        Problem Without Abstraction :
            Imagine driving a car. To start the car, if you had to:
                Check fuel injection
                Control piston movement
                Manage spark plugs
                Adjust engine timing
        Driving would become extremely difficult.

        Users don't need all these internal details.
        They only need:
            Start the car
            Drive
            Stop the car
            Solution
        Abstraction hides the complex internal working and exposes only the necessary operations.
    
    Why Used in Real Projects?
        In real projects, abstraction helps in:
        Simplifying complex systems
        Improving security (hiding sensitive data)
        Enhancing maintainability
        Promoting reusability
        Reducing complexity
    
    Why Is It Important?
        Large applications contain thousands of classes.
        Developers don't need to know the internal implementation of every class.
        They only need to know:
            Which method to call
            What result it returns
        This makes software:
            Easier to use
            Easier to maintain
            Less error-prone

                    User
                      |
                      v
                Press Power Button
                      |
                      v
            -----------------------------
            |    Hidden Implementation  |
            | - Circuit Processing      |
            | - Power Management        |
            | - Display Initialization  |
            -----------------------------
                      |
                      v
                  TV Turns ON

    Real-Life Analogy
        ATM Machine
            When you insert a card and enter your PIN:
                You see the options: Balance, Withdraw, Deposit.
                You don’t see:
                    How the database is connected
                    How the money is transferred
                    How the PIN is encrypted
            This is abstraction in action!
    Advantages :
        Reduces complexity.
        Makes code easier to understand.
        Protects implementation details.
        Improves maintainability.
        Allows implementation changes without affecting users (as long as the interface remains the same).
    Disadvantages :
        Can introduce performance overhead due to indirection.
        May make debugging slightly harder.
        Overuse can lead to less efficient code.
    Applications :
        Abstraction is widely used in:
            Banking Systems
            Payment Gateways
            Mobile Applications
            Operating Systems
            Web Applications
            Cloud Services
            APIs
            Database Drivers

    Understand Abstraction by CODE :
        // Abstract class (Cannot create its object directly)
        abstract class Animal {
            // Abstract method
            // It has no implementation here.
            // Every child class MUST provide its own implementation.
            abstract void sound();
        }

        // Dog class inherits Animal class
        class Dog extends Animal {
            // Overriding the abstract method
            @Override
            void sound() {
                System.out.println("Dog barks");
            }
        }

        // Main class
        public class Main {
            public static void main(String[] args) {
                // Parent class reference pointing to Child class object
                // Object of Dog is created here
                Animal a = new Dog();
                // Calls the Dog class implementation of sound()
                a.sound();
            }
        }
*/