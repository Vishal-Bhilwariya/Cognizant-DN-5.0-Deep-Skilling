/*

    # Builder Pattern :
    - Builder Pattern is a Creational Design Pattern that constructs a complex object step by step instead of using a large constructor.
    
    # Why Do We Need Builder Pattern?
      Suppose we have a Student class.
        Student(
            String name,
            int age,
            String city,
            String college,
            String phone,
            String email,
            String address,
            String branch
        )

        Problems:
            Constructor becomes too long.
            Difficult to remember parameter order.
            Easy to pass incorrect values.
            Hard to maintain.
        Solution : Use Builder Pattern.

        Student student = new StudentBuilder()
                .setName("Vishal")
                .setAge(20)
                .setCity("Agra")
                .build();

        Much easier to read.

                Client
                   |
                   ▼
           StudentBuilder
            |     |      |
         setName setAge setCity
                   |
                   ▼
                build()
                   |
                   ▼
                Student
# CODE : 
Product Class
    class Student {
        String name;
        int age;
        String city;
        Student(StudentBuilder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.city = builder.city;
        }
        void display() {
            System.out.println(name + " " + age + " " + city);
        }
    }
Builder Class
    class StudentBuilder {
        String name;
        int age;
        String city;
        StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }
        StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        StudentBuilder setCity(String city) {
            this.city = city;
            return this;
        }
        Student build() {
            return new Student(this);
        }
    }
Main Class
    public class Main {
        public static void main(String[] args) {
            Student student = new StudentBuilder()
                    .setName("Vishal")
                    .setAge(20)
                    .setCity("Agra")
                    .build();
            student.display();
        }
    }

Output : Vishal 20 Agra

Advantages
    Easy to create complex objects.
    Improves readability.
    Avoids constructors with many parameters.
    Supports optional parameters.
    Easy to maintain.
    Reduces parameter-order mistakes.
Disadvantages
    Requires an extra Builder class.
    More code for very simple objects.
*/