/*
========================================
ReactJS ES6 (ECMAScript 2015)
========================================

Definition:
- ES6 (ECMAScript 2015) is the 6th version of JavaScript, released in 2015.
- It introduced modern JavaScript features that make code shorter, cleaner, and easier to write.
- React mainly uses ES6 syntax.

Why ES6?
- Cleaner and shorter code.
- Better readability.
- Easier development.
- Supports modern JavaScript features.

How ES6 Works?
- Developers write code using ES6 syntax.
- Babel converts ES6 code into ES5 for browser compatibility.
- Webpack bundles all JavaScript files into a single bundle.js file.

Development Flow:
ES6 Code (.js)
      ↓
    Babel
      ↓
 ES5 Compatible Code
      ↓
   Webpack
      ↓
   bundle.js
      ↓
   Browser

----------------------------------------
1. let Keyword
----------------------------------------

Definition:
- Used to declare variables.
- Block Scoped (works only inside {}).
- Cannot be accessed outside its block.

Features:
- Block Scope.
- Can be reassigned.
- Prevents accidental access outside the block.

Difference:
var
- Function Scoped.
- Accessible outside loop.
- Can cause bugs.

let
- Block Scoped.
- Accessible only inside block.
- Safer than var.

Example:
for(let i=0;i<5;i++){
   console.log(i);
}
// console.log(i); // Error

----------------------------------------
2. const Keyword
----------------------------------------

Definition:
- Used to declare constants.
- Block Scoped.
- Value cannot be reassigned.

Features:
- No reassignment.
- Safer for fixed values.
- Used for constants.

Important:
- Object properties can be changed.
- Array elements can be changed.
- Only the reference cannot be reassigned.

Example:
const PI = 3.14;
// PI = 10; // Error

const obj = {name:"IT"};
obj.name = "CSE";   // Allowed

----------------------------------------
3. for...of Loop
----------------------------------------

Definition:
- Used to iterate over iterable objects.

Works With:
- Arrays
- Strings
- Maps
- Sets

Syntax:
for(let item of collection){
   // use item
}

Example:
let colors = ["Red","Blue","Green"];

for(let color of colors){
   console.log(color);
}

----------------------------------------
4. Template Literals
----------------------------------------

Definition:
- Used to create strings using backticks (` `).
- Supports multiline strings.
- Supports variable interpolation.

Features:
- Backticks (` `)
- Multiline strings
- ${} for variables and expressions

Example:
let name = "Vishal";

console.log(`Hello ${name}`);

----------------------------------------
5. Arrow Functions
----------------------------------------

Definition:
- Short and modern way of writing functions.
- Widely used in React.

Syntax:

Normal Function:
function add(a,b){
   return a+b;
}

Arrow Function:
const add = (a,b) => {
   return a+b;
}

Short Form:
const add = (a,b) => a+b;

Advantages:
- Less code.
- Easy to read.
- Commonly used with map(), filter(), reduce().
- Very useful in React components.

Example:
arr.map(item => item + 1);

----------------------------------------
Quick Revision
----------------------------------------

ES6 = Modern JavaScript (2015)

let
- Block Scoped
- Can reassign

const
- Block Scoped
- Cannot reassign reference

for...of
- Iterates over arrays, strings, etc.

Template Literals
- Backticks (` `)
- ${} for variables
- Multiline strings

Arrow Function
- Short function syntax
- () => {}
- Common in React

Interview Points:
- ES6 was released in 2015.
- React heavily uses ES6 features.
- Babel converts ES6 to ES5.
- Webpack bundles JavaScript files.
- let and const are block scoped.
- const object properties can be modified.
- for...of iterates over iterable objects.
- Template literals use backticks (`).
- Arrow functions provide shorter syntax.
*/

/*
========================================
React JSX (JavaScript XML)
========================================

Definition:
- JSX (JavaScript XML) is a syntax extension for JavaScript used in React.
- It allows writing HTML-like code inside JavaScript.
- JSX makes UI code more readable and easier to maintain.
- Browsers cannot understand JSX directly.

Example:
const element = <h1>Hello, World!</h1>;

----------------------------------------
Why JSX?
----------------------------------------

- Makes UI code simple and readable.
- Combines HTML and JavaScript in one file.
- Supports dynamic content easily.
- Improves React component development.

----------------------------------------
How JSX Works?
----------------------------------------

1. Write JSX in React component.
2. Babel converts JSX into JavaScript.
3. React.createElement() creates React Elements.
4. React builds the Virtual DOM.
5. React updates the Real DOM efficiently.

Flow:

JSX Code
   ↓
Babel
   ↓
React.createElement()
   ↓
React Element (Virtual DOM)
   ↓
React compares changes
   ↓
Real Browser DOM

Example:

JSX:
const element = <h1>Hello</h1>;

After Babel:
const element = React.createElement(
   "h1",
   null,
   "Hello"
);

----------------------------------------
What is Babel?
----------------------------------------

Definition:
- Babel is a JavaScript compiler.
- It converts modern JavaScript (ES6, JSX) into browser-compatible JavaScript (ES5).

Why Babel?
- Browsers cannot understand JSX.
- Babel translates JSX before execution.

----------------------------------------
Uses of JSX
----------------------------------------

1. Embedding JavaScript Expressions

- Use {} to insert JavaScript inside JSX.

Example:
const name = "Vishal";

<h1>Hello, {name}</h1>

----------------------------------------
2. Using Attributes
----------------------------------------

- Similar to HTML but follows JavaScript rules.

Common Attributes:

HTML        JSX
-------------------------
class       className
for         htmlFor
style       Object

Example:
<img src="img.png" alt="Image" />

----------------------------------------
3. Passing Children
----------------------------------------

Definition:
- Components can receive nested elements called children.
- Access using props.children.

Example:

<Welcome>
   <h1>Hello</h1>
   <p>Welcome</p>
</Welcome>

Inside Component:
props.children

----------------------------------------
4. JSX Represents Objects
----------------------------------------

- JSX is converted into JavaScript objects.
- These objects represent Virtual DOM elements.

Example:

<button>Click</button>

becomes

React.createElement(
   "button",
   null,
   "Click"
);

React Element Object contains:
- type
- props
- children

----------------------------------------
Advantages of JSX
----------------------------------------

- Easy to read.
- HTML-like syntax.
- Supports JavaScript expressions.
- Reusable components.
- Faster UI development.
- Better code organization.

----------------------------------------
Quick Revision
----------------------------------------

JSX = JavaScript XML

Purpose:
- Write HTML inside JavaScript.

JSX Flow:
JSX
↓
Babel
↓
React.createElement()
↓
Virtual DOM
↓
Real DOM

Important Points:
- JSX is not HTML.
- Browsers cannot understand JSX directly.
- Babel converts JSX into JavaScript.
- {} is used for JavaScript expressions.
- class → className
- for → htmlFor
- Components receive child elements using props.children.
- JSX creates Virtual DOM objects.

Interview Points:
- JSX stands for JavaScript XML.
- JSX is a syntax extension, not a new language.
- Babel converts JSX into JavaScript.
- React.createElement() is generated from JSX.
- JSX improves readability and maintainability.
- JSX ultimately creates Virtual DOM elements.
*/