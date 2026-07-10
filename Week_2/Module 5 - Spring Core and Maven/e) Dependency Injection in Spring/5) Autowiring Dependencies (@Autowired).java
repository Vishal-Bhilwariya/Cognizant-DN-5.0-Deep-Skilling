/*

    # Autowiring Dependencies (@Autowired) : 
    - @Autowired is a Spring annotation used to automatically inject a required Bean into another Bean.

        Before @Autowired, if a Car needed an Engine, we had to configure it manually.
        XML Constructor Injection : <constructor-arg ref="engine"/>
        or
        XML Setter Injection : <property name="engine" ref="engine"/>

        Spring required explicit configuration.

        With @Autowired, Spring does this automatically.

            @Autowired
            private Engine engine;

        Spring says: "I will find the Engine Bean and inject it automatically."

    Real-Life Analogy
        Imagine a hotel.
        You book a room.

        You don't bring:
            Bed
            Chair
            AC
            TV

        The hotel automatically provides them.

        Mapping:

        Real Life	                Spring
        Hotel	                Spring IoC Container
        Room	                Car Bean
        Furniture	            Dependencies
        Automatic Room Setup	@Autowired

    # Ways to Use @Autowired : 
    1. Field Injection
        @Component
        public class Car {
            @Autowired
            private Engine engine;
        }

        Spring injects the dependency directly into the field.

    2. Setter Injection
        @Component
        public class Car {
            private Engine engine;
            @Autowired
            public void setEngine(Engine engine) {
                this.engine = engine;
            }
        }

        Spring calls the setter automatically.

    3. Constructor Injection ⭐ (Recommended)
        @Component
        public class Car {
            private final Engine engine;
            @Autowired
            public Car(Engine engine) {
                this.engine = engine;
            }
        }

        In modern Spring (4.3+), if a class has only one constructor, @Autowired can even be omitted.

        @Component
        public class Car {
            private final Engine engine;
            public Car(Engine engine) {
                this.engine = engine;
            }
        }

        Spring still performs constructor injection automatically.

Advantages
     Automatic dependency injection.
     Less XML configuration.
     Cleaner code.
     Easier maintenance.
     Widely used in Spring Boot.
*/