/*
========================================
React Keys
========================================

Definition:
- A Key is a unique identifier used by React to identify elements in a list.
- Keys help React detect which items are added, removed, or updated.
- Mainly used while rendering lists with map().

Why Keys?
- Faster rendering.
- Efficient DOM updates.
- Prevents unnecessary re-rendering.
- Maintains component state correctly.

----------------------------------------
Syntax
----------------------------------------

items.map(item =>
   <li key={item.id}>
      {item.name}
   </li>
);

----------------------------------------
How React Uses Keys
----------------------------------------

Old List
     ↓
New List
     ↓
Compare Keys
     ↓
Find Changes
     ↓
Update Only Changed Elements

----------------------------------------
Choosing a Key
----------------------------------------

Best Choice:
- Database ID
- Unique ID
- UUID

Example:
<li key={user.id}>{user.name}</li>

----------------------------------------
Using Index as Key
----------------------------------------

Example:
items.map((item,index)=>
   <li key={index}>{item}</li>
);

Problems:
- Wrong when list order changes.
- Problems when items are inserted/deleted.
- Can lose component state.
- Causes unnecessary re-rendering.

Use index only when:
- List is static.
- Items never change order.
- No add/delete operations.

----------------------------------------
Keys with Components
----------------------------------------

Key should be assigned where the component is created, not inside the component.

Correct:

items.map(item =>
   <MenuItem
      key={item.id}
      item={item}
   />
);

Wrong:

function MenuItem(props){
   return (
      <li key={props.item.id}>
         {props.item.name}
      </li>
   );
}

----------------------------------------
Uniqueness of Keys
----------------------------------------

- Keys must be unique within the same list.
- Keys do NOT need to be globally unique.
- Different lists can reuse the same keys.

Example:

List 1:
1,2,3

List 2:
1,2,3

✔ Valid

----------------------------------------
Keys vs Props
----------------------------------------

Props
- Pass data to components.
- Accessible inside component.
- Control component behavior.

Keys
- Identify list elements.
- Used internally by React.
- Cannot be accessed using props.
- Improve rendering performance.

----------------------------------------
Best Practices
----------------------------------------

✔ Use unique IDs.
✔ Keep keys stable.
✔ Avoid random keys.
✔ Avoid index unless list is static.
✔ Place key on the component returned by map().

----------------------------------------
Quick Revision
----------------------------------------

React Key
- Unique identifier for list items.

Purpose:
- Track added, removed, and updated elements.

Best Key:
- Database ID
- Unique ID

Avoid:
- Array index (for dynamic lists)

Key Rules:
- Unique within one list.
- Not globally unique.
- Used only by React.
- Not available as props.

Interview Points:
- Keys improve React's reconciliation process.
- Keys help React update only changed elements.
- Never use random values as keys.
- Prefer unique IDs over array indexes.
- Keys are different from props.
*/

/*
========================================
React Lists
========================================

Definition:
- React Lists are used to display multiple items dynamically from an array or object.
- Lists are usually created using the map() method.
- Every list item should have a unique key.

Why Use Lists?
- Display dynamic data.
- Reduce duplicate code.
- Improve reusability.
- Efficient UI updates.

----------------------------------------
Creating Lists
----------------------------------------

Syntax:

items.map(item =>
   <li key={item.id}>
      {item}
   </li>
);

Example:

const fruits = ["Apple","Banana","Cherry"];

<ul>
{
   fruits.map((fruit,index)=>
      <li key={index}>{fruit}</li>
   )
}
</ul>

----------------------------------------
How map() Works
----------------------------------------

Array
   ↓
map()
   ↓
Each Item
   ↓
JSX Element
   ↓
Displayed on Screen

----------------------------------------
Lists with Objects
----------------------------------------

Example:

const users = [
   {id:1,name:"John",age:20},
   {id:2,name:"Alex",age:25}
];

users.map(user =>
   <li key={user.id}>
      {user.name}
   </li>
);

----------------------------------------
Importance of Key
----------------------------------------

- Every list item needs a unique key.
- React uses keys to identify changed items.
- Improves rendering performance.
- Prevents unnecessary re-rendering.

Best Practice:
✔ Use unique id.
✘ Avoid array index for dynamic lists.

----------------------------------------
Conditional Rendering in Lists
----------------------------------------

- Display items based on a condition.

Example:

users.map(user =>
   user.age > 30
      ? <p key={user.id}>Above 30</p>
      : <p key={user.id}>Below 30</p>
);

----------------------------------------
Lists with Click Events
----------------------------------------

- Each item can handle user interaction.

Example:

items.map(item =>
   <button
      key={item.id}
      onClick={() => handleClick(item)}
   >
      {item.name}
   </button>
);

----------------------------------------
Advantages
----------------------------------------

- Dynamic UI generation.
- Less code.
- Reusable components.
- Better readability.
- Efficient rendering using keys.

----------------------------------------
Best Practices
----------------------------------------

✔ Use map() for rendering lists.
✔ Use unique keys.
✔ Use object IDs whenever possible.
✔ Keep list components small and reusable.
✔ Avoid using array index unless the list is static.

----------------------------------------
Quick Revision
----------------------------------------

React List
- Displays multiple items dynamically.

Method Used:
- map()

Key Purpose:
- Identify each list item.
- Improve rendering performance.

Best Key:
- Unique ID

Can Use:
- Arrays
- Objects

Supports:
- Conditional Rendering
- Click Events
- Dynamic Data

Interview Points:
- React Lists are created using map().
- Every list item should have a unique key.
- Keys help React update only changed elements.
- Prefer unique IDs over array indexes.
- Lists can render arrays, objects, and interactive elements.
*/