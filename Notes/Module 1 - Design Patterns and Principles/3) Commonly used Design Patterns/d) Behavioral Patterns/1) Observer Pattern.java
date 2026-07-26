/*

# Observer Pattern :
- Observer Pattern defines a one-to-many relationship where one object (Subject) automatically notifies all its dependent objects (Observers) whenever its state changes

    Imagine you subscribe to a YouTube channel.
    Whenever the creator uploads a new video,
    YouTube automatically sends a notification.
    You don't have to check manually.
    This is exactly how the Observer Pattern works.

                    Subject
              +----------------+
              | attach()       |
              | detach()       |
              | notify()       |
              +----------------+
                     ▲
                     |
          -------------------------
          |          |           |
          ▼          ▼           ▼
     Observer1   Observer2   Observer3

Advantages
    Loose coupling between Subject and Observers.
    Automatic notifications.
    Easy to add or remove observers.
    Supports Open/Closed Principle.
    Good for event-driven systems.
Disadvantages
    If there are too many observers, notifications may impact performance.
    Debugging notification chains can be difficult.
    Order of notifications may not always be guaranteed.

*/