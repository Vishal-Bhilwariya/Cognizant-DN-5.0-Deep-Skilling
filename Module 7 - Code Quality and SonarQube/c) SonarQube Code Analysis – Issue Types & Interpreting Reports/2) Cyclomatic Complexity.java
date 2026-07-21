/*

    # Cyclomatic Complexity – How it is Measured and What the Threshold Means
    Cyclomatic Complexity is a software metric used to indicate the number of linearly independent paths through a program's source code.

    Cyclomatic Complexity tells us how difficult a piece of code is to understand, test, and maintain.
    The more decision points your code has, the higher the complexity.
    
    How is Cyclomatic Complexity Measured?
     The basic idea is simple.
        Every decision point increases complexity.
        Examples of decision points:
            Statement	Increases Complexity?
            if	                 Yes
            else if              Yes
            for	                 Yes
            while	             Yes
            do-while	         Yes
            switch	             Yes
            catch	             Yes
            Simple statement	 No

        Graphically, it's calculated as:
            V(G) = E - N + 2P
            Where:
                E = Number of edges
                N = Number of nodes
                P = Number of connected components

    Example :
        public void exampleMethod() {
        if (condition1) {           // +1
            for (int i = 0; i < 10; i++) {   // +1
                if (condition2) {       // +1
                    doSomething();
                }
            }
        } else if (condition3) {    // +1
            while (condition4) {        // +1
                doSomethingElse();
            }
        }
    }

    Total Complexity = 5

    Thresholds:
        Low: 1-10
        Medium: 11-20
        High: 21-50
        Very High: 50+

    What is Threshold?
        A Threshold is the maximum acceptable limit.
        For Cyclomatic Complexity, the threshold tells us: "Beyond this value, the code is becoming too complex."
    
    Why do we need Cyclomatic Complexity?
        Imagine two methods.
        Method A
            20 lines
            No if
            No loops
            Easy to understand.

        Method B
            20 lines
            Contains:
                5 if
                2 for
                3 switch
                2 while

        Even though both have 20 lines, Method B is much harder to:
                Read
                Debug
                Test
                Modify
            That's why companies measure complexity.

    A high cyclomatic complexity indicates:
        Harder to test
        Harder to maintain
        More prone to bugs
        Difficult to understand

    SonarQube sets thresholds to flag methods with high complexity.

    Example:
        public void complexMethod() {
            if (a > 0) {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
        }

    This method has multiple nested conditions and loops, leading to high complexity.

    SonarQube will flag this and suggest simplification.

    How to Reduce Complexity:
        Break down large methods
        Remove unnecessary nesting
        Use early returns
        Extract logic into smaller methods

    Why It Matters:
        Easier testing
        Better maintainability
        Reduced bug risk
        Clearer code structure

    Advantages of Measuring Complexity
        Improves maintainability
        Easier testing
        Better readability
        Reduces bugs
        Encourages cleaner design
        Helps identify methods that should be refactored
*/