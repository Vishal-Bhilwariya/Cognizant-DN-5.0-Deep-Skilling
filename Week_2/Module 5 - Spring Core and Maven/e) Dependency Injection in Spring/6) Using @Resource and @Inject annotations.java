/*

    # Using @Resource and @Inject annotations

    What is @Inject?
    - @Inject is a standard Java Dependency Injection annotation defined by JSR-330.
    - Spring supports it just like @Autowired.

    What is @Resource?
     - @Resource is a Jakarta annotation used for dependency injection.
     - Unlike @Autowired, it primarily injects Beans by their name.
 
    Why Do We Need Them?
        Spring has its own annotation: @Autowired
        But what if you want your code to follow Java standards instead of using Spring-specific annotations?
        Then you can use: @Inject or @Resource

        Spring understands these annotations and performs dependency injection.

    Real-Life Analogy
     Imagine a school.
     There are two students named:
        Rahul
        Rohit
     By Type (@Autowired / @Inject)
        Teacher says: "Call a student."
        If only one student matches, it's easy.
        If many match, confusion occurs.

     By Name (@Resource)
        Teacher says: "Call Rahul."
        No confusion.

    Syntax
        Using @Inject
            @Inject
            private Engine engine;
        
        Using @Resource
            @Resource(name = "petrolEngine")
            private Engine engine;

    Advantages
@Inject
    Java standard annotation.
    Portable across DI frameworks.
    Works well with Spring.
@Resource
    Good when you know the Bean name.
    Helps avoid ambiguity.
    Java standard (Jakarta EE).


*/