/*
========================================
React Conditional Rendering
========================================

Definition:
- Conditional Rendering means displaying different UI based on a condition.
- React automatically updates the UI whenever state or props change.
- No need to manually show/hide HTML elements.

Why Use It?
- Show or hide components.
- Display different content based on state.
- Improve user experience.
- Create dynamic user interfaces.

----------------------------------------
How It Works
----------------------------------------

Condition
    ↓
Check true/false
    ↓
Render matching JSX
    ↓
React updates UI

----------------------------------------
1. Using if...else
----------------------------------------

- Best for complex conditions.

Example:

if(isPacked){
   return <p>Book ✔</p>;
}

return <p>Book</p>;

----------------------------------------
2. Using Ternary Operator ( ? : )
----------------------------------------

Syntax:
condition ? JSX1 : JSX2

Example:

return (
   <h1>
      {isLoggedIn ? "Welcome" : "Please Login"}
   </h1>
);

Best For:
- Two possible outputs.

----------------------------------------
3. Using Logical AND (&&)
----------------------------------------

Syntax:
condition && JSX

- Renders JSX only if condition is true.

Example:

{
   hasNotification &&
   <p>New Notification</p>
}

Best For:
- Show something only when condition is true.

----------------------------------------
4. Using Switch Statement
----------------------------------------

- Useful for multiple conditions.

Example:

switch(status){

case "loading":
   return <p>Loading...</p>;

case "success":
   return <p>Success</p>;

case "error":
   return <p>Error</p>;

default:
   return <p>Unknown</p>;
}

----------------------------------------
5. Conditional Rendering in Lists
----------------------------------------

- Used with map() to display selected items.

Example:

items.map(item =>
   item.includes("a")
      ? <p>{item}</p>
      : null
);

----------------------------------------
6. Conditional Rendering with State
----------------------------------------

- UI changes based on component state.

Example:

if(isLoading){
   return <h1>Loading...</h1>;
}

return <h1>Data Loaded</h1>;

----------------------------------------
Common Use Cases
----------------------------------------

1. Login / Logout
- Show Login button.
- Show Profile after login.

2. Loading Screen
- Display Loading...
- Show data after fetching.

3. Error Handling
- Show error message if request fails.

4. Notifications
- Show notification only when available.

5. User Roles
- Different UI for Admin and User.

----------------------------------------
Best Practices
----------------------------------------

- Keep conditions simple.
- Avoid deeply nested ternary operators.
- Use if...else for complex logic.
- Break large conditions into separate components.
- Use early return for better readability.

----------------------------------------
Comparison
----------------------------------------

if...else
- Best for complex logic.

Ternary (? :)
- Best for two choices.

&& Operator
- Best for showing one element only.

Switch
- Best for multiple conditions.

----------------------------------------
Quick Revision
----------------------------------------

Conditional Rendering
- Show different UI based on conditions.

Methods:
- if...else
- Ternary (? :)
- Logical AND (&&)
- Switch
- map()
- State-based rendering

Common Uses:
- Login/Logout
- Loading Screen
- Error Messages
- Notifications
- Role-based UI

Interview Points:
- Conditional Rendering displays UI based on state or props.
- Ternary operator is used for two outcomes.
- && renders JSX only when the condition is true.
- Switch is preferred for multiple conditions.
- React automatically re-renders UI when state changes.
*/