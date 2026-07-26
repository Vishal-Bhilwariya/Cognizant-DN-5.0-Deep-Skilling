/*

# L — Liskov Substitution Principle (LSP) :
- A child class should be able to replace its parent class without changing the correct behavior of the program

    If a class inherits another class, then the child class should behave like the parent.
    The program should work correctly even if the parent object is replaced by the child object.
    Formula : Child Class = Valid Substitute for Parent Class

    Example : 
                Animal
                   ▲
                   |
            ----------------
            |              |
           Dog            Cat
           Both Dog and Cat are valid Animals.
    Imagine you have:
         Animal
           ▲
           |
          Dog
    If Dog is an Animal, then wherever an Animal is expected, a Dog should work correctly.
        Example:
            Animal a = new Dog();
            a.sound();
        This works correctly.

    Now imagine:
          Bird
           ▲
           |
         Penguin
        If the Bird class has:
            fly();
        and Penguin cannot fly,
        then Penguin is not a proper substitute for Bird.

        This violates LSP.

    Advantages
        Correct inheritance hierarchy.
        Better code reliability.
        Prevents unexpected runtime errors.
        Improves maintainability.
        Makes polymorphism safe.
    Disadvantages
        Requires careful class design.
        Sometimes more classes are needed.
*/ 