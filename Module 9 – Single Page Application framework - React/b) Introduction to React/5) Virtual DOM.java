/*

    # Virtual DOM :
    - The Virtual DOM (VDOM) is a lightweight JavaScript copy of the Real DOM that React keeps in memory.
    - React first updates the Virtual DOM, compares it with the previous Virtual DOM, identifies the differences, and then updates only the changed parts of the Real DOM.

    Imagine you're editing a large document.
     Instead of printing the entire document every time you make a small change:
        You first edit a digital copy.
        Compare the old and new copies.
        Print only the changed page.

        That's exactly what React does.

    Before Learning Virtual DOM
    First understand one important concept.
        What is DOM?
            DOM stands for Document Object Model.
            Whenever a browser loads an HTML page, it converts it into a tree-like structure.

        Example HTML
            <html>
                <body>
                    <h1>Hello</h1>

                    <button>Like</button>
                </body>
            </html>

        Browser converts it into
            Document
            │
            └── html
                 │
                 └── body
                      │
                      ├── h1
                      │     │
                      │   Hello
                      │
                      └── button
                             │
                           Like

            This structure is called the Real DOM.
            
    Problem with Real DOM
        Suppose your page contains
            Header
            Sidebar
            Products
            Footer
            Profile
            Notifications

        Now user clicks ❤️ Like

        Like count changes
        10
        ↓
        11

        Without React, JavaScript often manipulates the Real DOM directly.
        Updating the Real DOM is relatively expensive because the browser may need to:
            Recalculate layout
            Repaint parts of the screen
            Re-render affected elements

        Frequent direct updates can reduce performance in large applications.

    React's Solution
     React introduced:
        Virtual DOM

        Instead of updating the browser immediately:
        User Click
        ↓
        Virtual DOM Updates
        ↓
        Compare Old & New
        ↓
        Find Difference
        ↓
        Update Real DOM

    Important Terms
    Real DOM :Actual webpage displayed by the browser.
    Virtual DOM : Lightweight JavaScript representation kept by React.
    Diffing : Comparing the old Virtual DOM with the new Virtual DOM to detect changes.

    Advantages
        Faster UI updates
        Fewer DOM operations
        Better performance
        Efficient rendering
        Smooth user experience
        Ideal for large applications
*/