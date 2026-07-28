/*

# What is BeanFactory?
- BeanFactory is the simplest container in Spring Framework.
  
  BeanFactory is the basic implementation of the Spring IoC Container.
    Its main responsibility is to:
        Create Beans
        Manage Beans
        Return Beans when requested

   Think of BeanFactory as a warehouse manager.
     The warehouse has many products (Beans).
     It doesn't unpack everything immediately.
     Instead, it waits until someone asks: "Give me Product A."
     Only then does it prepare and deliver the product.
     This behavior is called Lazy Loading.
    
    Why Do We Need BeanFactory?
    Before Spring:
        Developers manually created every object.
            Student student = new Student();
            Teacher teacher = new Teacher();

        As applications grew, object management became difficult.
        Spring introduced BeanFactory to centralize object creation and management.

    What Makes BeanFactory Special?
        Lazy Loading: Objects are created only when needed.
        Memory Efficient: Saves memory by not creating unnecessary objects.
        Simple: Basic functionality without advanced features.

    Example
        Suppose your application has:
            Student Bean
            Teacher Bean
            Employee Bean
            Library Bean

            Application starts.
            Does BeanFactory create all four Beans immediately?
            No.
            It waits.

        Suppose the application requests:
            getBean("student");
        Only then:
            Student Bean Created

        The other Beans are not created yet.

    Bean Factory :
        Application Starts
                │
                ▼
        BeanFactory Created
                │
                ▼
        No Beans Created Yet
                │
                ▼
        getBean("student")
                │
                ▼
        Student Bean Created
                │
                ▼
        Returned to Application

    # Creating BeanFactory 
     Older Spring versions: 
      Resource resource = new ClassPathResource("beans.xml"); // Loads the XML configuration file.
      BeanFactory factory =   new XmlBeanFactory(resource); // Creates the BeanFactory.

      Getting a bean : Student student = (Student) factory.getBean("student"); // When this line executes, BeanFactory creates the Bean if it hasn't already been created.

    Code Example :
    1) Student.java 
        public class Student {
            public Student() {
                System.out.println("Student Bean Created");
            }
        }
    2) bean.xml
        <beans>
            <bean
                id="student"
                class="com.demo.Student"/>
        </beans>
    3) Main.java
        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        // Bean created here (Lazy Loading)
        Student student = (Student) factory.getBean("student");

    Output : 
        Student Bean Created

# Advantages
    Uses less memory initially.
    Creates objects only when required.
    Suitable for lightweight applications.
    Faster startup for applications with many Beans.
*/