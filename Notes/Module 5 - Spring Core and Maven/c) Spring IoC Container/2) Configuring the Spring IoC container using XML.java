/*

# What is XML?
- XML (eXtensible Markup Language) is a markup language used to store and organize data.

    Unlike Java, XML does not contain business logic. It only contains configuration.

    Think of XML as an instruction sheet.

    Example:
        Teacher
           ↓
        Class Monitor
            ↓
        "Take attendance."

    The teacher is not doing the work.

    The teacher is giving instructions.

    Similarly,
    The XML file doesn't create objects itself.

    It tells Spring: "Create this object."

# What is XML Configuration?
- XML Configuration means writing instructions in an XML file to tell Spring:
    Which objects (Beans) to create.
    Which classes those objects belong to.
    How those objects are related. 

# Why Do We Need XML Configuration?
- Before Spring introduced annotations like @Component and @Configuration, the main way to configure Spring was XML.
  Instead of writing Java code like: new Student();
  Developers wrote configuration in XML.
  Spring would then create the object automatically.

Example :
    Imagine you're ordering furniture.
        You don't build the furniture yourself.
        You fill out an order form:
            Chair
            Table
            Bed

        The furniture company reads the form and delivers the items.

    Similarly:
        Java Classes = Furniture
        beans.xml = Order Form
        Spring = Furniture Company

# What is beans.xml?
- It is the configuration file used by Spring.

Example:
    Project
    │
    ├── src
    │
    ├── main
    │
    ├── resources
    │      │
    │      └── beans.xml

    Usually, it is stored inside: src/main/resources because Spring automatically searches for configuration files there.

# Structure of beans.xml
    <?xml version="1.0" encoding="UTF-8"?> // XML Declaration
    // version="1.0" -> Specifies the version of XML being used.
    // encoding="UTF-8" -> Specifies the character encoding used in the XML file.
    <beans>
        //This is the root element.
        //Every Bean must be written inside this tag.
        //Think of it as a container for all Bean definitions.
    </beans>

# The <bean> Tag 
Suppose we have a Java class named Student.java. 
    public class Student {

    }
We want Spring to create an object of this class.
    <bean id="student" class="com.example.Student">
        // id="student" -> This is the unique name of the bean. It is used to reference the bean in the Spring container.
        // class="com.example.Student" -> This specifies the fully qualified name of the Java class for which we want to create a bean.

# Complete XML Example :
Java Class :
    public class Student {
        private String name;
        private int age;

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
beans.xml :
    <?xml version="1.0" encoding="UTF-8"?>
    <beans>
        <bean id="student" class="com.example.Student">
            <property name="name" value="John Doe"/>
            <property name="age" value="20"/>
        </bean>
    </beans>

At startup:
Spring reads the beans.xml file and creates the Student object with the specified properties.
AND internally behaves like:
    Student student = new Student();
    student.setName("John Doe");
    student.setAge(20);

# Advantages
     Centralized configuration.
     No need to write new repeatedly.
     Easy to modify configuration without changing Java code.
     Suitable for large enterprise applications (especially older Spring projects).
*/