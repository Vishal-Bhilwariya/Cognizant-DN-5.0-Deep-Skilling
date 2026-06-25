/*

# What is a Class? 
-> A Class is a blueprint or template used to create objects.
    It defines:
        Data (Attributes/Properties) – What an object has.
        Methods (Functions/Behaviors) – What an object can do.

    A class itself does not occupy memory for individual instances until objects are created.

# What is an Object?
-> An object is an instance of a class. It represents a real-world entity and has its own state and behavior.
    An object occupies memory when created.
    
    Objects have:
        State (values of attributes)
        Behavior (methods)
        Identity (unique reference)

Example:
    When an engineer designs a house, the design is the Class.
    The actual houses built using that design are Objects.
# Example:

class Student {
    // Attributes
    String name;
    int age;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object
        Student s1 = new Student();
        
        // Setting values
        s1.name = "Alice";
        s1.age = 20;
        
        // Calling method
        s1.displayInfo();
    }
}

Why Do We Need It?
Problem Without Classes
    Imagine creating details for 100 students.

        Without classes:
            student1Name
            student1Roll
            student1Marks

            student2Name
            student2Roll
            student2Marks

            student3Name
            student3Roll
            student3Marks

        This becomes difficult to manage.
Solution 
    Classes help us avoid repetition.
    With classes:
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

    Each object holds data independently.
    One class → Many objects


# Components of a Class
A class contains two things :
    1. Fields (Variables)
        These store the data of the object.
        Example:
            String name;
            int age;

    2. Methods (Functions)
        These define the behavior of the object.
        Example:
            void displayInfo() { ... }

    Student s1 = new Student(); 
    // Student is the class
    // s1 is the object
    // new is the keyword used to create an object
    // Student() is the constructor

Diagram 
                CLASS
          +----------------+
          |    Student     |
          +----------------+
          | name           |
          | age            |
          | display()      |
          +----------------+
                  |
          Creates Objects
                  |
         -------------------
         |        |        |
         v        v        v
     +--------+ +--------+ +--------+
     |  s1    | |  s2    | |  s3    |
     | Vishal | | Rahul  | | Aman   |
     | 20     | | 21     | | 19     |
     +--------+ +--------+ +--------+

Adavantages of Using Classes and Objects
    Reusability: One class can be used to create many objects.
    Data Hiding: We can restrict access to data using access modifiers.
    Modularity: Code is organized into classes, making it easier to manage.
    Maintenance: Changes to one class do not affect others.
    Real-World Modeling: Classes help model real-world entities effectively.
Disadvantages of Using Classes and Objects
    Complexity: For small programs, using classes may seem overkill.
    Memory Overhead: Each object consumes memory.
    Learning Curve: Beginners may find it challenging to understand the concept initially.
Application
    Used in almost all modern programming languages for developing large-scale applications.
    Example: Android apps, web applications, games, desktop software.
*/