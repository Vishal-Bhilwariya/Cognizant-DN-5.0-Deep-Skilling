/*

# Dependency Injection (DI) :
- Dependency Injection is a technique in which the required objects (dependencies) are provided to a class from outside instead of the class creating them itself.

    Suppose a class needs a database object.
    Without DI
        class StudentService {
            Database db = new Database();
        }
        StudentService creates the object itself.

    With DI
        Database db = new Database();
        StudentService service = new StudentService(db);
        Database object is provided from outside.

        This is Dependency Injection.

                  Client

                 |

         Dependency Injection

                 |

         MessageService

            ▲        ▲

            |        |

      EmailService  SMSService
    
    # Types of Dependency Injection : 
    1. Constructor Injectio :  Dependency is passed through the constructor.
                                Student(Database db)

    2. Setter Injection : Dependency is passed through a setter method.
                            setDatabase(Database db)
    Useful when the dependency is optional.

    3. Field Injection : Dependency is injected directly into the field.
    Example in Spring:
        @Autowired
        private Database database;
    Simple, but generally less preferred because it makes testing harder.

Advantages
    Loose Coupling
    Easy Testing (mock dependencies can be injected)
    Better Maintainability
    Easy to Replace Implementations
    Promotes Reusability
    Supports SOLID Principles
Disadvantages
    More interfaces and classes.
    Can be difficult to understand initially.
    Framework configuration may add complexity.


*/