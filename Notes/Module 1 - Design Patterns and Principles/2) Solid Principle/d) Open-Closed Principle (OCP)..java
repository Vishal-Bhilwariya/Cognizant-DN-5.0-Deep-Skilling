/*

    # O — Open/Closed Principle (OCP) :
    - Software entities (classes, methods, modules) should be OPEN for extension but CLOSED for modification.

    When a new feature is required:
        Add new code (Extension)
        Do not modify existing, tested code
    This reduces bugs and keeps the software stable.

    Real-Life Example :
        Imagine a mobile phone.
        Initially,
        it has:
            Camera
            Gallery
            Calculator
        Tomorrow,
        you install: WhatsApp
        Did you modify Android's source code?
        No.
        You simply extended the phone by installing a new app.
        That is Open for Extension, Closed for Modification.
    Advantages
        Easy to add new features.
        Existing code remains safe.
        Reduces bugs.
        Easy maintenance.
        Better scalability.
        Better flexibility.
    Disadvantages
        More classes are created.
        Requires proper planning and abstraction.
*/