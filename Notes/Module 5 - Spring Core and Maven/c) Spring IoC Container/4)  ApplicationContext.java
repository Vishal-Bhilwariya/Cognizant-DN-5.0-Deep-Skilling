/*

# What is ApplicationContext?
- ApplicationContext is an implementation of the Spring IoC Container.

    It is responsible for:
        Creating Beans
        Managing Beans
        Providing Beans whenever required

Think of ApplicationContext as the manager of all Spring Beans.
Whenever your application needs an object, it asks the ApplicationContext, not the programmer.


# Why Do We Need ApplicationContext?
    Without ApplicationContext:
        You create every object manually.

        Student student = new Student();
        Teacher teacher = new Teacher();
        Course course = new Course();

        As the application grows, this becomes difficult to maintain.

    With ApplicationContext:
           Developer
              │
        Requests Student Bean
              │
              ▼
        ApplicationContext
              │
        Returns Student Bean

        You don't create objects yourself.
        ApplicationContext provides them.

                    beans.xml
                        │
                        ▼
        +----------------------------------+
        |      ApplicationContext          |
        |----------------------------------|
        | Reads XML                        |
        | Creates Beans                    |
        | Stores Beans                     |
        | Manages Beans                    |
        +----------------------------------+
                        │
                        ▼
                  Java Application

    Creating an ApplicationContext
    - In XML-based Spring applications: ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Understanding Every Part :
            a) ClassPathXmlApplicationContext: It is a class that implements the ApplicationContext interface. It reads the XML 
                                                configuration file from the classpath.
            b) "beans.xml": It is the name of the XML configuration file that contains the definitions of the beans.
            c) ApplicationContext context: It is a reference variable of type ApplicationContext that holds the instance of the 
                                            ApplicationContext.
            d) new : It is a keyword in Java that is used to create new objects. In this case, it is used to create a new instance 
                                            of the ClassPathXmlApplicationContext class.

  Getting a Bean
    Suppose beans.xml contains:
        <bean id="student" class="com.demo.Student"/>
    Retrieve it like this:
        Student student = context.getBean("student", Student.class);

    What Happens Internally?
        Application Starts
                │
                ▼
        ApplicationContext Created
                │
                ▼
        Reads beans.xml
                │
                ▼
        Creates Student Bean
                │
                ▼
        Stores Student Bean
                │
                ▼
        getBean("student")
                │
                ▼
        Returns Student Object
    
    # Why Do We Use getBean()?
    - To retrieve a bean from the Spring IoC Container.
    Because the Bean is already created by Spring.

    Instead of:
        Student student = new Student();

    We write:
        Student student = context.getBean("student", Student.class);

    Notice  : No new Student(). Spring already created the object.

# Code Example:
1) Student.java
        public class Student {
            public void display() {
                System.out.println("Hello from Student Bean");
            }
        }
2) beans.xml
        <beans>
            <bean
                id="student"
                class="com.demo.Student"/>
        </beans>
3) Main.java
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

        public class Main {
            public static void main(String[] args) {
                ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
                Student student = context.getBean("student", Student.class);
                student.display();
            }
        }

    OUTPUT  : Hello from Student Bean

# Advantages
    Automatically creates Beans
    Manages Bean lifecycle
    Supports dependency injection
    Easier maintenance
    Better for enterprise applications
    Supports events, internationalization, and resource loading
*/