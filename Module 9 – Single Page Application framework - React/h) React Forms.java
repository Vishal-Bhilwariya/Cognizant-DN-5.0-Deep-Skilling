/*
========================================
React Forms
========================================

Definition:
- React Forms are used to collect user input such as text, numbers, emails, passwords, etc.
- In React, form data is usually controlled using state.
- React updates the UI whenever form data changes.

Why React Forms?
- Manage user input easily.
- Validate input.
- Submit data to server.
- Keep UI synchronized with data.

----------------------------------------
Controlled vs Uncontrolled Components
----------------------------------------

Controlled Component
- Input value is controlled by React state.
- Uses value and onChange.
- Most commonly used.

Uncontrolled Component
- Input value is managed by the DOM.
- Uses refs to access values.
- Less commonly used.

----------------------------------------
Handling Input
----------------------------------------

Flow:

User Types
      ↓
onChange Event
      ↓
Update State
      ↓
Component Re-renders
      ↓
Updated Input Value

Example:

const [name, setName] = useState("");

<input
   value={name}
   onChange={(e) => setName(e.target.value)}
/>

----------------------------------------
Submitting Forms
----------------------------------------

- Forms are submitted using onSubmit.
- Prevent page reload using event.preventDefault().

Example:

function handleSubmit(event){
   event.preventDefault();
   console.log("Form Submitted");
}

<form onSubmit={handleSubmit}>
   ...
</form>

----------------------------------------
Common Form Elements
----------------------------------------

1. Input

<input
   value={value}
   onChange={handleChange}
/>

2. Textarea

<textarea
   value={bio}
   onChange={handleChange}
/>

3. Select

<select
   value={role}
   onChange={handleChange}
>
   <option>Developer</option>
</select>

----------------------------------------
Handling Multiple Inputs
----------------------------------------

- Store all form values in one state object.
- Use a single onChange handler.

Example:

const [formData, setFormData] = useState({
   username:"",
   email:"",
   age:""
});

const handleChange = (e)=>{
   const {name,value}=e.target;

   setFormData(prev=>({
      ...prev,
      [name]:value
   }));
};

Benefits:
- Less code.
- Easy to manage.
- Scalable for large forms.

----------------------------------------
Important Properties
----------------------------------------

value
- Current input value.

onChange
- Triggered when input changes.

onSubmit
- Triggered when form is submitted.

name
- Identifies the input field.

----------------------------------------
Advantages
----------------------------------------

- Better control over form data.
- Easy validation.
- Dynamic form updates.
- Improved user experience.
- Seamless integration with React state.

----------------------------------------
Best Practices
----------------------------------------

✔ Use controlled components.
✔ Use onChange for every input.
✔ Always call event.preventDefault() in onSubmit.
✔ Use one state object for multiple fields.
✔ Validate data before submitting.

----------------------------------------
Quick Revision
----------------------------------------

React Forms
- Collect user input.

Controlled Component
- Managed by React state.

Important Events
- onChange
- onSubmit

Important Methods
- useState()
- event.preventDefault()

Common Elements
- input
- textarea
- select

Multiple Inputs
- One state object.
- One handleChange() function.

Interview Points:
- React forms are usually controlled components.
- onChange updates state.
- onSubmit handles form submission.
- event.preventDefault() prevents page reload.
- Multiple fields are commonly managed using a single state object.
*/