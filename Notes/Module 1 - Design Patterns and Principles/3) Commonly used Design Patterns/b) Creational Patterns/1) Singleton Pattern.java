/*

    # Singleton Pattern :
    - Singleton Pattern is a Creational Design Pattern that ensures only one object of a class is created throughout the application and provides a global point of access to that object.

    EXAMPLE : 
        Student s1 = new Student();
        Student s2 = new Student();
        Two different objects are created.

        But in Singleton,
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Both variables point to the same object.

    # Why Do We Need Singleton?
        Imagine a Printer in an office.
        
        If every employee creates their own printer object,
            Employee 1 → Printer
            Employee 2 → Printer
            Employee 3 → Printer
        Many printers are created.
        Waste of memory.

        Instead,
        Everyone should use the same printer.
            Employee 1 ──┐

            Employee 2 ──┼──► Printer

            Employee 3 ──┘

        Only one printer exists.

    # UML DIAGRAM : 
            +----------------------------+
            |        Singleton           |
            +----------------------------+
            | - instance : Singleton     |
            +----------------------------+
            | - Singleton()              |
            | + getInstance()            |
            +----------------------------+

    # CODE :
        class Singleton {
            // Step 1: Create a static variable to hold the single object
            private static Singleton instance;

            // Step 2: Make constructor private
            private Singleton() {
                System.out.println("Singleton Object Created");
            }

            // Step 3: Public method to return the single object
            public static Singleton getInstance() {

                // Create object only once
                if (instance == null) {
                    instance = new Singleton();
                }

                return instance;
            }
        }

        public class Main {
            public static void main(String[] args) {
                Singleton s1 = Singleton.getInstance();
                Singleton s2 = Singleton.getInstance();
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s1 == s2);
            }
        }
*/