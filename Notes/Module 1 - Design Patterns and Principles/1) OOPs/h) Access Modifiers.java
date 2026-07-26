/*

 # Access Modifiers : 
 -> Access Modifiers are keywords in Java that control where a class, variable, method, or constructor can be accessed.
   ( Access Modifiers decide "Who can access my data or methods? )
    
   Imagine your house has different rooms.
        Living Room → Anyone can enter.
        Bedroom → Only family members.
        Locker → Only you.
        Office Meeting Room → Only employees of your company.
    Similarly, Java provides different levels of access.


    # Types of Access Modifiers in Java :

    1. Private :
        -> The most restrictive access level.
        -> Members (variables or methods) declared as private can only be accessed within the same class.
        -> They are hidden from outside the class.

        Example :
            class Student {
                private String name;  // Private variable
                private void display() {  // Private method
                    System.out.println(name);
                }
            }

    2. Default (Package-private) :
        -> No explicit modifier.
        -> Members are accessible only within the same package.
        -> If no access modifier is specified, it's default.

        Example :
            class Student {
                String name;  // Default access
                void display() {  // Default access
                    System.out.println(name);
                }
            }

    3. Protected :
        -> Accessible within the same package and also by subclasses (even if they are in different packages).
        -> Not accessible from outside the package unless subclass.

        Example :
            class Student {
                protected String name;  // Protected variable
                protected void display() {  // Protected method
                    System.out.println(name);
                }
            }

    4. Public :
        -> Most permissive access level.
        -> Members declared as public can be accessed from anywhere.

        Example :
            public class Student {
                public String name;  // Public variable
                public void display() {  // Public method
                    System.out.println(name);
                }
            }

    # Summary Table :

    | Modifier    | Same Class | Same Package | Subclass | Different Package |
    |-------------|------------|--------------|----------|-------------------|
    | private     | Yes        | No           | No       | No                |
    | default     | Yes        | Yes          | No       | No                |
    | protected   | Yes        | Yes          | Yes      | No                |
    | public      | Yes        | Yes          | Yes      | Yes               |

    # Best Practices :
    -> Use private for encapsulation.
    -> Use protected carefully, mainly for inheritance.
    -> Use public for methods that need to be accessed externally.
    -> Avoid using default (package-private) unless necessary.

    # Real-Life Analogy :
    -> Think of a car’s engine.
        - The engine itself is private (only the mechanic can see it).
        - The steering wheel is public (everyone can use it).
        - The dashboard controls might be protected (only drivers

    Example:
        class Student { 
            private int age = 20;
            // Getter method
            public int getAge() {
                return age;
            }
        }
        public class Main {
            public static void main(String[] args) {
                Student s = new Student();
                // Cannot access directly
                // System.out.println(s.age);
                // Access through public method
                System.out.println(s.getAge());
            }
        }

    Advantages
        Data Security
        Controlled Access
        Supports Encapsulation
        Better Code Organization
        Prevents Unauthorized Access
    Disadvantages
        Incorrect use may restrict necessary access.
        Beginners often get confused between default and protected.


*/