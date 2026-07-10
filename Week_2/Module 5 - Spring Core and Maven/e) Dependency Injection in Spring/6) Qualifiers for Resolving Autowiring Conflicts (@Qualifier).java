/*

    # Qualifiers for Resolving Autowiring Conflicts (@Qualifier) :
    - @Qualifier is a Spring annotation used along with @Autowired to specify which Bean should be injected when multiple Beans of the same type exist.

    Suppose you have two Engine Beans.
        PetrolEngine
        DieselEngine

        Now your Car needs an Engine.
        Spring asks: Which one should I use?
                    It cannot decide.

        So you tell Spring:

        @Qualifier("petrolEngine")
        Meaning: "Inject the PetrolEngine Bean."

    Why Do We Need @Qualifier?
        Suppose:

        Engine has two implementations.

        Engine
        │
        ├── PetrolEngine
        │
        └── DieselEngine

        Spring finds:
            PetrolEngine Bean
            DieselEngine Bean

        Both match the type Engine.

        Result: Spring throws an exception.

        Solution
        Use:
            @Autowired
            @Qualifier("petrolEngine")

        Now Spring knows exactly which Bean to inject.

    Real-Life Analogy
        Imagine you order:

        "Bring me a notebook."

        The shop has:
            Classmate Notebook
            Navneet Notebook

        The shopkeeper asks:
        Which one?
        You answer: "Navneet."

        Here:
            Notebook → Bean type
            Navneet → @Qualifier
    Advantages
        Resolves Bean ambiguity.
        Gives precise control over dependency injection.
        Prevents NoUniqueBeanDefinitionException.
        Useful when multiple implementations exist.
*/