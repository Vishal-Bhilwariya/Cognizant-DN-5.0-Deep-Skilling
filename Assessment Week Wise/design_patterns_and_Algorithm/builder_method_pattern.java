public class builder_method_pattern {
    static class Burger {

        private String bun;
        private String patty;
        private String cheese;
        private String sauce;
        private Burger(BurgerBuilder builder) {
            this.bun = builder.bun;
            this.patty = builder.patty;
            this.cheese = builder.cheese;
            this.sauce = builder.sauce;
        }
        public void showBurger() {
            System.out.println("Burger Details:");
            System.out.println("Bun : " + bun);
            System.out.println("Patty : " + patty);
            System.out.println("Cheese : " + cheese);
            System.out.println("Sauce : " + sauce);
        }
        static class BurgerBuilder {

            private String bun;
            private String patty;
            private String cheese;
            private String sauce;

            public BurgerBuilder setBun(String bun) {
                this.bun = bun;
                return this;
            }

            public BurgerBuilder setPatty(String patty) {
                this.patty = patty;
                return this;
            }

            public BurgerBuilder setCheese(String cheese) {
                this.cheese = cheese;
                return this;
            }

            public BurgerBuilder setSauce(String sauce) {
                this.sauce = sauce;
                return this;
            }

            public Burger build() {
                return new Burger(this);
            }
        }
    }

    public static void main(String[] args) {

        Burger burger = new Burger.BurgerBuilder()
                .setBun("Wheat Bun")
                .setPatty("Veg Patty")
                .setCheese("Cheddar")
                .setSauce("Mayonnaise")
                .build();

        burger.showBurger();
    }
}

/*
Simple Definition

Builder Pattern is a creational design pattern that constructs a complex object step by step,
 allowing you to create different versions of the same object.

Easy to Remember

"Build the object step by step instead of passing everything to one constructor."

Why do we need Builder Pattern?

Imagine you have a Student class.

Student s = new Student(
    "Mohit",
    21,
    "Mathura",
    "CSE",
    8.5,
    "Java",
    "GLA University",
    true
);
Problem
Too many constructor parameters.
Difficult to remember their order.
Hard to read.
Easy to make mistakes.

Builder Pattern solves this problem.

Real-Life Example
🍔 Burger at McDonald's

When you order a burger, you choose:

Bun ✔
Patty ✔
Cheese ✔
Lettuce ✔
Sauce ✔
Extra Cheese (Optional)
Coke (Optional)

The burger is built step by step.

You don't have to choose every ingredient.

This is exactly the Builder Pattern.

Customer
     ↓
Burger Builder
     ↓
Add Bun
     ↓
Add Patty
     ↓
Add Cheese
     ↓
Add Sauce
     ↓
Build Burger
Another Real-Life Example

🏠 Building a House

You build it step by step:

Foundation
Walls
Doors
Windows
Roof
Paint

Builder Pattern is a creational design pattern that constructs a complex object step by step
 instead of using a constructor with many parameters. It improves code readability and supports 
 optional fields. A real-life example is ordering a burger at a restaurant, where the burger is
  assembled by adding ingredients one by one before serving the final product.

*/
