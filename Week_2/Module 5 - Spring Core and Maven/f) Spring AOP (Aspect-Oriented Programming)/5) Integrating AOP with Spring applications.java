/*

    # Integrating AOP with Spring applications
    - Integrating AOP with Spring means configuring Spring so that Aspects automatically execute along with your application's 
      business methods.

    Simply creating an Aspect is not enough.
     Spring must know:
        Which class is an Aspect?
        Which methods contain Advice?
        When should Advice execute?

        To do this, we enable AOP in Spring.

    Why Do We Need Integration?
     Suppose you write:
        @Aspect
        public class LoggingAspect {

        }
        Will Spring automatically execute it?
         No.

        Spring must first be told: "Enable AOP support."

        That's why we use: @EnableAspectJAutoProxy

    Complete Example 
     a) Business Class
            import org.springframework.stereotype.Component;
            @Component
            public class BankService {
                public void transferMoney() {
                    System.out.println("Money Transferred");
                }
            }
     b) Aspect Class
            import org.aspectj.lang.annotation.Aspect;
            import org.aspectj.lang.annotation.Before;
            import org.springframework.stereotype.Component;

            @Aspect                 // Marks this class as an Aspect
            @Component              // Registers it as a Spring Bean
            public class LoggingAspect {
                // Executes before transferMoney()
                @Before("execution(* transferMoney(..))")
                public void log() {
                    System.out.println("Logging Before Transfer");
                }
            }
     c) Configuration Class
            import org.springframework.context.annotation.ComponentScan;
            import org.springframework.context.annotation.Configuration;
            import org.springframework.context.annotation.EnableAspectJAutoProxy;

            @Configuration                  // Java Configuration class
            @ComponentScan("com.demo")      // Scan Spring Beans
            @EnableAspectJAutoProxy         // Enable Spring AOP
            public class AppConfig {

            }
     d) Main Class
            import org.springframework.context.ApplicationContext;
            import org.springframework.context.annotation.AnnotationConfigApplicationContext;

            public class Main {
                public static void main(String[] args) {
                    // Create Spring IoC Container
                    ApplicationContext context =
                        new AnnotationConfigApplicationContext(AppConfig.class);
                    // Get BankService Bean
                    BankService bankService = context.getBean(BankService.class);
                    // Call business method
                    bankService.transferMoney();
                }
            }
    Output
            Logging Before Transfer
            Money Transferred

    Notice that:
            You never called: log();

            Spring automatically executed it.


Advantages
    Easy integration with Spring.
    No changes to business classes.
    Centralized logging and security.
    Better code reuse.
    Cleaner architecture.
*/