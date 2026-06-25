/*

Q1. What is Machine Language?
Answer: Machine Language is the lowest-level language that consists only of binary digits (0 and 1) and is directly understood by the CPU.

Q2. What is an Assembler?
Answer: An Assembler is a translator that converts Assembly Language into Machine Language.

Q3. What is Procedural Programming?
Answer: Procedural Programming is a programming paradigm where a program is divided into functions or procedures that perform specific tasks.

Intermediate
Q4. Why was OOP introduced?
Answer: OOP was introduced to overcome the limitations of Procedural Programming, such as poor code reusability, weak data security, and difficulty maintaining large applications.

Q5. Name two OOP languages.
Answer: Java and C++ (also Python and C# support OOP).

Scenario-Based
Q6. Your company is building a banking application with millions of lines of code. Which programming approach would you choose and why?
Answer: I would choose Object-Oriented Programming (OOP) because it provides modularity, code reusability, data security through encapsulation, easier maintenance, and better scalability for large applications.

Basic
Q7. What is a class?
Answer: A class is a blueprint or template that defines the properties (data) and behaviors (methods) of objects.

Q8. What is an object?
Answer: An object is a real instance of a class that contains actual data and can use the methods defined in the class.

Q9. Can we create multiple objects from one class?
Answer: Yes. One class can be used to create any number of objects.

Intermediate
Q10. Does a class occupy memory?
Answer: The class definition itself does not store data for instances. Memory is allocated when objects are created.

Q11. Why do we create classes?
Answer: Classes help organize code, promote reusability, improve maintainability, and model real-world entities.

Scenario-Based
Q12. You are developing a library management system. Which classes might you create?
Answer: Possible classes include:
        Book
        Student
        Librarian
        Library
        IssueRecord

Q13. What is Abstraction?
Answer:
Abstraction is the process of hiding implementation details and exposing only the essential features to the user.

Q14. Why is Abstraction important?
Answer:
It reduces complexity, improves maintainability, and allows users to interact with systems without understanding their internal implementation.

Intermediate
Q15. How is Abstraction achieved in Java?
Answer:
Java achieves abstraction primarily through abstract classes and interfaces.

Q16. What is hidden in Abstraction?
Answer:
The internal implementation or working logic is hidden from the user.

Scenario-Based
Q17. Your banking app has a transferMoney() method. Should users know how encryption, authentication, and server communication work?
Answer:
No. Users only need to know how to initiate the transfer and receive the result. The internal implementation should remain hidden. This is Abstraction.

Basic
Q18. What is Encapsulation?
Answer:
Encapsulation is the process of wrapping data and methods into a single class while protecting the data using access modifiers like private.

Q19. Why are variables declared private?
Answer:
To prevent direct access and unauthorized modification of data.

Intermediate
Q20. What are Getter and Setter methods?
Answer:
Getter → Reads the value.
Setter → Updates the value after validation.

Q21. How does Encapsulation improve security?
Answer:
It prevents direct access to important data and allows only controlled access through methods.

Scenario-Based
Q22.
Why should the salary of an employee be private?
Answer:
Because salary is sensitive information. It should only be accessed or modified through controlled methods to prevent unauthorized changes.

Basic
Q23. What is Inheritance?
Answer:
Inheritance is the mechanism by which one class acquires the properties and methods of another class.

Q24. Which keyword is used for inheritance?
Answer:extends

Q25. What is the Parent Class called?
Answer:Superclass or Base Class.

Q26. What is the Child Class called?
Answer:Subclass or Derived Class.

Intermediate
Q27. Why is Inheritance used?
Answer:
To promote code reusability, reduce duplication, and model "is-a" relationships.

Scenario-Based
Q28. You are creating an Employee Management System.
     Classes:
        Employee
        Manager
        Developer
        Tester
     Should inheritance be used?
Answer:
Yes.
Employee should be the parent class because all employees share common properties like name, ID, and salary.

Basic
Q29. What is Polymorphism?
Answer:
Polymorphism means One Name, Many Forms, where the same method name behaves differently depending on the context.

Q30. How many types of polymorphism are there in Java?
Answer:
Two:
        Compile-Time (Method Overloading)
        Runtime (Method Overriding)
Q31. What is Method Overloading?
Answer:
Having multiple methods with the same name but different parameter lists in the same class.

Q32. What is Method Overriding?
Answer:
When a child class provides its own implementation of a method defined in the parent class.

Intermediate
33. Why is Animal a = new Dog(); called Runtime Polymorphism?
Answer:
Because the method to execute is determined by the actual object (Dog) at runtime, not by the reference type (Animal).

Scenario-Based
Q34. Your payment application supports UPI, Credit Card, and Net Banking.
Should you create:
        payUPI()
        payCard()
        payBank()

        or

        pay()
Answer:
Use a common method pay() and implement different behavior in different payment classes. This is runtime polymorphism.

Basic
Q35. What are Access Modifiers?
Answer:
Access modifiers are keywords that control the visibility and accessibility of classes, methods, variables, and constructors.

Q36. How many access modifiers are there in Java?
Answer:
        Four:
                private
                default
                protected
                public
Q37. Which modifier provides the highest level of security?
Answer: private

Q38. Which modifier allows access from anywhere?
Answer: public

Scenario-Based
Q39. Your class contains a user's password.
Which access modifier should you use?
Answer:
private, because passwords should not be directly accessible from outside the class.


*/