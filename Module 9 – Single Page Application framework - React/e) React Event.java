/*
========================================
React Events
========================================

Definition:
- React Events handle user interactions like clicks, typing, form submission, keyboard and mouse actions.
- React uses a Synthetic Event system that works consistently across all browsers.

Syntax:
<element onEvent={handlerFunction} />

Example:
<button onClick={handleClick}>Click</button>

----------------------------------------
Common React Events
----------------------------------------

onClick
- Triggered when an element is clicked.

onChange
- Triggered when input value changes.

onSubmit
- Triggered when a form is submitted.

onKeyDown
- Triggered when a key is pressed.

onKeyUp
- Triggered when a key is released.

onMouseEnter
- Triggered when mouse enters an element.

----------------------------------------
How Event Handling Works
----------------------------------------

1. User performs an action.
2. React detects the event.
3. Event handler function executes.
4. Component state/UI updates if required.

Flow:

User Action
     ↓
React Event
     ↓
Event Handler
     ↓
State Update (Optional)
     ↓
UI Re-render

----------------------------------------
1. Adding Event Handlers
----------------------------------------

- Event handlers are added using camelCase.
- Pass the function reference, not the function call.

Example:
<button onClick={handleClick}>
   Click
</button>

Correct:
onClick={handleClick}

Wrong:
onClick={handleClick()}

----------------------------------------
2. Reading Props in Event Handlers
----------------------------------------

- Event handlers can access component props.
- Useful when parent sends data to child.

Example:
function Child(props){
   return (
      <button onClick={() => alert(props.name)}>
         Click
      </button>
   );
}

----------------------------------------
3. Passing Event Handlers as Props
----------------------------------------

- Parent can pass an event handler to Child.
- Child calls that function when an event occurs.

Parent:
<Child onClickHandler={handleClick} />

Child:
<button onClick={props.onClickHandler}>
   Click
</button>

Benefits:
- Parent controls logic.
- Child becomes reusable.

----------------------------------------
4. Naming Event Handler Props
----------------------------------------

Use meaningful names like:
- onClickHandler
- onSubmitHandler
- onChangeHandler

This improves readability.

----------------------------------------
Event Propagation
----------------------------------------

Definition:
- Event propagation is how an event moves through elements.

Default:
- React follows Event Bubbling.
- Event moves from Child → Parent.

Example:

Parent
 └── Child(Button)

Click Child
      ↓
Child Handler
      ↓
Parent Handler

Stop Bubbling:
event.stopPropagation();

----------------------------------------
Prevent Default Behavior
----------------------------------------

Definition:
- Prevents browser's default action.

Method:
event.preventDefault();

Common Uses:
- Stop page refresh on form submit.
- Prevent default link navigation.
- Custom form validation.

Example:
function handleSubmit(event){
   event.preventDefault();
}

----------------------------------------
React Event Object
----------------------------------------

- Every event handler receives an event object.

Example:
function handleClick(event){
   console.log(event.target);
}

Useful Methods:
- event.preventDefault()
- event.stopPropagation()

Useful Property:
- event.target

----------------------------------------
Advantages of React Events
----------------------------------------

- Cross-browser compatibility.
- Easy event handling.
- Cleaner syntax.
- Better performance using Synthetic Events.
- Easy integration with React state.

----------------------------------------
Quick Revision
----------------------------------------

React Events
- Handle user interactions.

Syntax:
onEvent={handlerFunction}

Important Events:
- onClick
- onChange
- onSubmit
- onKeyDown
- onKeyUp
- onMouseEnter

Pass Handler:
onClick={handleClick}

Pass to Child:
<Child onClickHandler={handleClick} />

Event Bubbling:
Child → Parent

Stop Bubbling:
event.stopPropagation()

Prevent Default:
event.preventDefault()

Interview Points:
- React uses Synthetic Events.
- Event names are written in camelCase.
- Pass function reference, not function call.
- Parent can pass event handlers to child using props.
- event.preventDefault() stops default browser behavior.
- event.stopPropagation() stops event bubbling.
*/