/*

What is a Component?
A Component is an independent, reusable piece of UI (User Interface).
Think of a component as a building block of a React application.
Instead of writing one huge webpage, React divides the webpage into many small pieces.

Imagine you are building Amazon.

Does Amazon have only one HTML page?

No.

It contains:

Logo
Search Bar
Navigation Bar
Product Card
Cart
Footer

Each of these can become a separate React Component.
Instead of writing
Amazon Website
React thinks like this
Amazon Website
│
├── Header
├── SearchBar
├── Navbar
├── ProductList
│      ├── ProductCard
│      ├── ProductCard
│      └── ProductCard
├── Cart
└── Footer

Every box is a component.

# Why do we need Components?
Imagine your website has 500 pages.
Every page has
    Header
    Footer
    Navigation Bar

Without React
You write Header
500 times.
If company changes logo...
You edit
500 files.


With Components
<Header />
One Header Component
Used everywhere.
Change once
Updated everywhere.

Benefits
    Reusability
    Less Code
    Easy Maintenance
    Better Team Collaboration

# Functional Components :
A Functional Component is a JavaScript function that returns JSX (UI).
It is the modern and recommended way of writing React components.

Syntax
function ComponentName(){
    return(
        JSX
    );
}
Understanding Every Keyword
Keyword	        Description	            Purpose	                Example
function	    JavaScript keyword  	Creates component	    function App()
App	            Component Name	        Identifies component	App
return	        Returns UI	            What browser displays	return (...)
JSX	            HTML-like syntax	    UI description	        <h1>Hello</h1>


# Class Components :
Before React Hooks existed,developers wrote Components using JavaScript Classes.

A Class Component is a JavaScript Class that extends React.Component and renders UI using a render() method.
Today, Functional Components are preferred for most new React development, but understanding Class Components is useful because:
Many legacy enterprise projects still use them.
Interviewers may ask about the difference.

import React, { Component } from "react";
class App extends Component{
    render(){
        return(
            <h1>Hello React</h1>
        );
    }
}
export default App;

# Component Constructor - Only Class Components have a constructor.
A Constructor is a special method in a class that initializes the object.
In React, the constructor is used to initialize the component's state and bind event handlers.

import React, { Component } from "react";

class App extends Component {
  constructor(props) {
    super(props);
    // Initialize state
    this.state = {
      count: 0,
    };
    // Bind event handlers
    this.handleClick = this.handleClick.bind(this);
  }

  handleClick() {
    this.setState({ count: this.state.count + 1 });
  }

  render() {
    return (
      <div>
        <p>Count: {this.state.count}</p>
        <button onClick={this.handleClick}>Increment</button>
      </div>
    );
  }
}

export default App;


Why super(props)?
The class extends React.Component.
Calling super(props) invokes the constructor of the parent class and ensures this.props is initialized correctly.
Without calling super(...), you cannot use this inside the constructor.


# Minimal Practical Example :
Let's build our first component-based UI.

App.js
function Header(){
    return(
        <h2>GLA University</h2>
    );
}

function Footer(){
    return(
        <p>Copyright 2026</p>
    );
}

function App(){
    return(
        <div>
            <Header />
            <h1>Welcome Vishal</h1>
            <Footer />
        </div>
    );
}

export default App;

Internal Working
App()
↓
Header()
↓
Returns

GLA University
↓
Footer()
↓
Returns

Copyright
↓
React Combines Output
↓
Browser Displays Page

Output
GLA University
Welcome Vishal
Copyright 2026

Notice how we created three components instead of writing everything in one block.
This is the essence of React's component-based architecture.

Advantages

    Reusable UI
    Easy Maintenance
    Better Readability
    Faster Development
    Independent Components
    Easy Testing
    Enterprise Friendly
*/