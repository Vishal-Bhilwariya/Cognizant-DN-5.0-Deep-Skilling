/*

    # What are Comments?
        Comments are notes written in the source code to help developers understand the purpose or logic of the code.
        The compiler ignores comments—they are only for humans.

    What is Insufficient Comments?
        Insufficient Comments means the code lacks necessary explanations where they would help developers understand complex logic.

        It does not mean: "Every line must have a comment."
        Instead, it means: Important or complex code should be explained when the code itself isn't clear enough.

    Why do we need Comments?
     Imagine you wrote a project today.
        After 6 months, you open the same project.
        You see this:
            calculate();
            process();
            execute();

        You may even ask yourself: "Why did I write this logic?"

        Comments help both:
            Yourself (future maintenance)
            Other developers

    Why does SonarQube check Comments?
     Large enterprise projects may contain millions of lines of code.
        New developers join the project regularly.

        Without comments in important areas:
            Understanding business logic becomes difficult.
            Maintenance takes longer.
            Bugs are harder to fix.

        So SonarQube encourages meaningful documentation.

    When Should You Write Comments?
     Good places to comment:
        Complex business logic
        Important algorithms
        Workarounds
        Public APIs
        Classes and methods used by other developers

    When Should You Avoid Comments?
     Avoid comments for code that is already obvious.
     Bad Example
        // Increment i
        i++;

        The code already explains itself.

    Does SonarQube Check Comment Coverage?
        Yes, SonarQube can check:
            Public classes without documentation
            Public methods without JavaDoc (depending on configured rules)
            Missing documentation in important code areas

        However, it does not require comments for every line.
        The exact rules depend on the project's Quality Profile.

    Advantages
        Improves readability.
        Helps new developers understand the code.
        Simplifies maintenance.
        Documents business rules.
        Improves long-term maintainability.
*/