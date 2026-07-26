/*

# Command Pattern :
 - Command Pattern encapsulates a request (action) as an object, separating the object that requests an action from the object that performs it.

 Suppose you press the Power Button on a TV remote.
 The remote does not know how the TV turns on.
    It simply sends a command.
        Remote
        ↓
        Power Command
        ↓
        TV
        ↓
      Turns ON

    The Remote (sender) and TV (receiver) are independent.

    Without Command Pattern
        if(button.equals("ON"))
            tv.on();
        else if(button.equals("OFF"))
            tv.off();
        else if(button.equals("VOLUME"))
            tv.volume();

    Problems:
        Large if-else blocks.
        Tight coupling.
        Difficult to add new commands.
        Hard to implement Undo/Redo.
    Solution
        Each action becomes a separate command object.
        Power Command
        Volume Command
        Mute Command
        Channel Command

        Adding a new command requires creating only one new class.

        User
        ↓
        Remote (Invoker)
        ↓
        PowerCommand
        ↓
        TV (Receiver)

Advantages
    Loose coupling.
    Easy to add new commands.
    Supports Undo/Redo.
    Supports logging and queuing.
    Follows Open/Closed Principle.
    Better code organization.
Disadvantages
    Requires many command classes.
    Slightly increases project complexity.
    More files to manage.


*/