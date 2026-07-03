class Singleton_pattern {

    static class Logger {

        private static Logger instance;

        private Logger() {
            System.out.println("Logger object created");
        }

        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        public void log(String message) {
            System.out.println("Log: " + message);
        }
    }

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First Message");
        logger2.log("Second Message");

        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Multiple instances created.");
        }
    }
}
/*
Simple Definition

Singleton Pattern is a creational design pattern that ensures 
only one object of a class is created and provides a global access
 point to that object.

 Easy to Remember

"One Class → One Object → Used Everywhere."

Real-Life Example: Printer in an Office 🖨️

Imagine an office has 100 employees but only one printer.

Every employee sends print requests to the same printer.
No matter who prints, the printer object is the same.
Creating multiple printers would waste money and create confusion.

Another Real-Life Example
Database Connection
Logger
Configuration Manager

There should be only one instance throughout the application.

Singleton Pattern is a creational design pattern that ensures 
only one object of a class exists and provides a global access 
point to that object. A real-life example is an office printer 
where all employees use the same printer instead of creating a new one.



*/