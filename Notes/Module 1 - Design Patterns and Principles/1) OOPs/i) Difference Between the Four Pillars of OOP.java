/*

# Difference Between the Four Pillars of OOP
+----------------------+----------------------------------------------+--------------------------------------------+---------------------------------------------+----------------------------------------------+
| Feature              | Encapsulation                                | Inheritance                                | Polymorphism                                | Abstraction                                  |
+----------------------+----------------------------------------------+--------------------------------------------+---------------------------------------------+----------------------------------------------+
| Definition           | Wrapping data and methods into a single      | Acquiring the properties and methods       | One method behaves in multiple forms.       | Hiding implementation details and showing    |
|                      | class and protecting the data.               | of another class.                          |                                             | only essential features.                     |
+----------------------+----------------------------------------------+--------------------------------------------+---------------------------------------------+----------------------------------------------+
| Main Purpose         | Protect data (Data Hiding).                  | Reuse existing code.                       | Provide multiple behaviors using the        | Reduce complexity by hiding internal         |
|                      |                                              |                                            | same method name.                           | working.                                     |
+----------------------+----------------------------------------------+--------------------------------------------+---------------------------------------------+----------------------------------------------+
| Focus                | Who can access the data?                     | Reusing parent class features.             | One interface, many implementations.        | What to do, not how to do it.                |
+----------------------+----------------------------------------------+--------------------------------------------+---------------------------------------------+----------------------------------------------+
| Achieved Using       | private variables, Getter & Setter methods   | extends keyword                            | Method Overloading & Method Overriding      | Abstract Classes & Interfaces                |
+----------------------+----------------------------------------------+--------------------------------------------+---------------------------------------------+----------------------------------------------+
| Relationship         | Data + Methods in one class                  | Parent–Child (IS-A) relationship           | Same method, different behavior             | User interacts only with essential features  |
+----------------------+----------------------------------------------+--------------------------------------------+---------------------------------------------+----------------------------------------------+
| Data Hiding          | ✅ Yes                                       | ❌ No                                      | ❌ No                                       | ✅ Hides implementation                      |
+----------------------+----------------------------------------------+--------------------------------------------+---------------------------------------------+----------------------------------------------+
| Code Reusability     | Limited                                      | ✅ High                                    | ✅ High                                     | Moderate                                     |
+----------------------+----------------------------------------------+--------------------------------------------+---------------------------------------------+----------------------------------------------+
| Real-Life Example    | ATM protects account balance                 | Son inherits father's properties           | Same person is a Student, Employee, Son     | Driving a car without knowing engine details |
+----------------------+----------------------------------------------+--------------------------------------------+---------------------------------------------+----------------------------------------------+
| Example in Java      | private double balance;                      | class Dog extends Animal                   | Animal a = new Dog();                       | abstract class Animal {                      |
|                      |                                              |                                            |                                             |     abstract void sound();                   |
|                      |                                              |                                            |                                             | }                                            |
+----------------------+----------------------------------------------+--------------------------------------------+---------------------------------------------+----------------------------------------------+
| Interview Keyword    | Data Hiding                                  | Code Reusability                           | One Name, Many Forms                        | Hide HOW, Show WHAT                          |
+----------------------+----------------------------------------------+--------------------------------------------+---------------------------------------------+----------------------------------------------+


*/