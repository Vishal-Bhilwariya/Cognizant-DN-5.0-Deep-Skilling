/*

 # Polymorphism :
 -> Polymorphism means "One Name, Many Forms.
 The word comes from:
        Poly = Many
        Morph = Forms
 So, Polymorphism means one method can perform different actions depending on the object or parameters.

 Suppose there is a person.
    The same person can be:
        Son 👦
        Student 🎓
        Employee 💼
        Customer 🛒
    The person is one, but their roles (forms) are different.
    Similarly, in Java: One method name can behave differently in different situations.

 Problem Without Polymorphism
    Imagine different payment methods.
    Without polymorphism:
        payByUPI();
        payByCard();
        payByNetBanking();
      Different method names for the same operation.

 Solution
    Use one common method:
        pay();
      Depending on the object,
      pay() behaves differently.

    Example:
UPI
    pay()
    ↓
    UPI Payment
Credit Card
    pay()
    ↓
    Card Payment
Net Banking
    pay()
    ↓
    Net Banking Payment

Same method , Different behavior.

# There are two types of Polymorphism in Java. :
 1. Compile-Time Polymorphism ( Also called: Method Overloading or Static Polymorphism ) :
    -> Multiple methods have the same name but different parameter lists.
        The compiler determines which method to call.

    Example : 
            class Calculator {
                int add(int a, int b) {
                    return a + b;
                }
                int add(int a, int b, int c) {
                    return a + b + c;
                }
            }
            public class Main {
                public static void main(String[] args) {
                    Calculator c = new Calculator();
                    System.out.println(c.add(10, 20));
                    System.out.println(c.add(10, 20, 30));
                }
            }
 2. Runtime Polymorphism ( Also called: Method Overriding or Dynamic Polymorphism ) :
  -> A child class provides its own implementation of a method already defined in the parent class.
        The JVM decides which implementation to execute at runtime.
    Example : 
        class Animal {
            void sound() {
                System.out.println("Animal makes sound");
            }
        }
        class Dog extends Animal {
            @Override
            void sound() {
                System.out.println("Dog barks");
            }
        }
        public class Main {
            public static void main(String[] args) {
                Animal a = new Dog();
                a.sound();
            }
        }
  
Advantages
    Code Reusability
    Flexibility
    Easier Maintenance
    Better Readability
    Extensible Design
Disadvantages
    Can be confusing for beginners.
    Runtime polymorphism adds a small amount of dynamic dispatch overhead (usually negligible).

Applications
Used in:
    Banking Software
    Games
    Android Apps
    Payment Gateways
    Hospital Systems
    Enterprise Applications
*/