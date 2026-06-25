/*

# Encapsulation :
-> Encapsulation is the process of wrapping data (variables) and methods (functions) together into a single unit (class) and 
   protecting the data from unauthorized access.
   ( Encapsulation = Data + Methods + Data Hiding )

  Problem Without Encapsulation 
    Consider a Bank Account.
        class BankAccount {
            String name;
            double balance;
        }
    Now anyone can write:
        BankAccount b = new BankAccount();
        b.balance = -100000;
    Now the account has a negative balance, which is incorrect.
    The data is not protected.
  Solution
    Make the variable private.
        private double balance;
    Now nobody can change it directly.

    Instead, provide methods like:
        deposit()
        withdraw()
        getBalance()
    These methods check whether the operation is valid before changing the data.
 
 Encapsulation consists of three parts :
  1) Make Variables Private
        private String name;
        private double balance;
     Private means:  the same class can access these variables directly.

  2) Provide Public Methods
     These methods control access.
        Example:
            setBalance()
            getBalance()
  3) Validate the Data
     Suppose someone tries:
        balance = -5000;
        The setter method can reject it.
        if(balance >= 0)
        Only valid values are accepted.

Advantages 
    Data Security: Sensitive data is hidden.
    Controlled Access: We can decide who can read or modify the data.
    Flexibility: We can change internal implementation without affecting users.
    Reusability: Encapsulated code can be reused easily.
    Debugging: Easier to find and fix errors.

Disadvantages
    Extra Code: More code is needed to implement encapsulation.
    Performance: Slight overhead due to method calls.
    Complexity: Can make simple tasks more complex for beginners.

Applications
    Used in GUI frameworks (like Java Swing).
    In database connectivity.
    In web development (e.g., REST APIs).

Example
    class Student {
        private String name;
        private int age;

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for age
        public int getAge() {
            return age;
        }

        // Setter for age
        public void setAge(int age) {
             // Validation
            if (age > 0) {
                this.age = age;
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Student s = new Student();
            s.setName("Alice");
            s.setAge(20);
            System.out.println(s.getName()); // Output: Alice
            System.out.println(s.getAge());  // Output: 20
        }
    }
*/