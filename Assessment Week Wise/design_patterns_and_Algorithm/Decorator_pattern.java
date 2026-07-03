public class Decorator_pattern {

    // Component
    interface Coffee {
        String getDescription();
        int getCost();
    }

    // Concrete Component
    static class SimpleCoffee implements Coffee {

        @Override
        public String getDescription() {
            return "Simple Coffee";
        }

        @Override
        public int getCost() {
            return 100;
        }
    }

    // Decorator
    static abstract class CoffeeDecorator implements Coffee {

        protected Coffee coffee;

        public CoffeeDecorator(Coffee coffee) {
            this.coffee = coffee;
        }
    }

    // Concrete Decorator
    static class MilkDecorator extends CoffeeDecorator {

        public MilkDecorator(Coffee coffee) {
            super(coffee);
        }

        @Override
        public String getDescription() {
            return coffee.getDescription() + " + Milk";
        }

        @Override
        public int getCost() {
            return coffee.getCost() + 20;
        }
    }

    // Concrete Decorator
    static class SugarDecorator extends CoffeeDecorator {

        public SugarDecorator(Coffee coffee) {
            super(coffee);
        }

        @Override
        public String getDescription() {
            return coffee.getDescription() + " + Sugar";
        }

        @Override
        public int getCost() {
            return coffee.getCost() + 10;
        }
    }

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();

        coffee = new MilkDecorator(coffee);

        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println("Total Cost = ₹" + coffee.getCost());
    }
}


/*
Decorator Pattern
Simple Definition

Decorator Pattern is a structural design pattern that allows us to add new functionality
 to an object dynamically without modifying its existing code.

Easy to Remember

"Decorator adds extra features to an object without changing the original object."

Why do we need Decorator Pattern?

Suppose you have a Coffee.

Initially, it is just Simple Coffee.

Now a customer wants:

Coffee + Milk ☕🥛
Coffee + Sugar ☕🍬
Coffee + Milk + Sugar ☕🥛🍬
Coffee + Milk + Chocolate ☕🥛🍫

Instead of creating many classes like:

MilkCoffee
SugarCoffee
ChocolateCoffee
MilkSugarCoffee
MilkChocolateCoffee

we simply decorate the coffee by adding features one by one.

This is the Decorator Pattern.

Real-Life Example
☕ Coffee Shop

You order a coffee.

The shop asks:

Do you want Milk?

✔ Yes

Do you want Sugar?

✔ Yes

Do you want Chocolate?

✔ Yes

The coffee is decorated with extra ingredients.

Simple Coffee
      ↓
+ Milk
      ↓
+ Sugar
      ↓
+ Chocolate
      ↓
Final Coffee

The original coffee remains the same.

Only new features are added.

Another Real-Life Example
🍕 Pizza Toppings

Start with:

Pizza

Now add:

Pizza
   ↓
+ Cheese
   ↓
+ Olives
   ↓
+ Corn
   ↓
+ Paneer

The base pizza doesn't change.

You're simply decorating it with toppings.

Decorator Pattern is a structural design pattern that allows us to add new functionality
 to an object dynamically without modifying its existing code. A real-life example is ordering 
 coffee where you can add milk, sugar, or chocolate to the same coffee without changing the original coffee.
*/