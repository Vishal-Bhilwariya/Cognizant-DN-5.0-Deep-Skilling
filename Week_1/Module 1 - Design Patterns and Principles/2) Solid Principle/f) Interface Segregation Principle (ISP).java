/*

# I — Interface Segregation Principle (ISP) :
A class should not be forced to implement methods that it does not need.

Instead of creating one large interface, create multiple small and specific interfaces.
Each class should implement only the interface it actually needs.

Why Do We Need ISP?
    Imagine you create one interface:
    interface Worker {
        void work();
        void eat();
        void sleep();
    }
Now suppose we have a Robot.
       Robot
        ↓
      Work ✅
      Eat ❌
      Sleep ❌

If Robot implements Worker, it is forced to implement:
    eat()
    sleep()
even though robots don't eat or sleep.

This is a violation of ISP.

Example : 
 Imagine a Restaurant Menu.
    Without ISP:
        Every customer receives a menu containing:
            Vegetarian
            Non-Vegetarian
            Chinese
            Italian
            Desserts
            Drinks
            Kids Menu
        Even if they only want coffee.
        Very confusing.
    With ISP:
        Separate menus.
            Coffee Menu 
            Dessert Menu
            Main Course Menu
            Kids Menu
        Customers choose only what they need.
        This is ISP.

Advantages
    Small, focused interfaces.
    No unnecessary methods.
    Easy maintenance.
    Better flexibility.
    Better code readability.
    Reduced coupling.
Disadvantages
    More interfaces need to be created.
    Slightly increases the number of files.
*/