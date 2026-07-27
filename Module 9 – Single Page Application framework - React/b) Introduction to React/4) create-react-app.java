/*

create-react-app (CRA) is an official tool (created by the React team) that automatically creates a complete React project with the required configuration.

Instead of manually setting up:
    React
    Babel
    Webpack
    Development Server
    Package Management

    CRA does everything for you with a single command.
    Imagine you want to build a house.

    Without CRA:
        You would first arrange:
            Bricks
            Cement
            Sand
            Electric wiring
            Plumbing
            Paint
        One by one.

    With CRA:
        You receive a ready-made house structure.
        Now you only decorate and build your application

    Why do we need create-react-app?
        Suppose CRA didn't exist.
        To start React manually, you'd have to install and configure:
            React
            ReactDOM
            Babel
            Webpack
            Dev Server
            ESLint
            Package Manager
            Folder Structure
        This setup can take a long time and is easy to misconfigure.
        CRA automates all of this.

    Prerequisites
        Before creating a React project, you need Node.js.

        What is Node.js?
        Node.js is a JavaScript runtime that lets you run JavaScript outside the browser and provides tools such as npm.

        Installing Node.js also installs npm.
        Verify Installation
        Open Command Prompt or VS Code Terminal.
        node -v

        Example Output: v22.5.1

        Check npm: npm -v

        Example: 10.8.2

        If both commands work, you're ready.

    Project Creation
        Command : npx create-react-app my-app

        Let's understand every keyword.

        Keyword	            Description	                        Purpose	                                               Example
        npx	Node Package      Execute	            Runs a package without permanently installing it globally	npx create-react-app
        create-react-app	React project generator	Creates a complete React application	                    create-react-app my-app
        my-app	               Project name	        Folder where the project will be created	                student-portal
        The above command will create a folder named my-app with the following structure:

        my-app/
        ├── README.md
        ├── node_modules/  -> Contains all installed libraries.
        ├── package.json   -> Contains project metadata and dependencies.
        ├── package-lock.json -> Locks dependency versions for consistency.
        ├── public/ ->  Static files like HTML, images, etc.
        │   ├── index.html -> Main HTML file for the app.
        │   └── favicon.ico -> Favicon for the app.
        └── src/ -> Source code files.
            ├── App.css -> Styles for the main App component.
            ├── App.js -> Main React component.
            ├── App.test.js -> Test file for App component.
            ├── index.js -> Entry point of the React app.
            ├── index.css -> Global styles for the app.
            └── logo.svg -> Logo image.

        
        Why npx and not npm?
        npm - Used to install packages.
        Example: npm install axios
        This adds Axios to your project.

        npx - Used to execute packages.
        Example: npx create-react-app my-app

        It downloads the package (if necessary), runs it, and then exits.
        For CRA, npx is preferred because you always get the latest version.

Advantages
     Quick project setup
     No manual Webpack configuration
     No Babel configuration
     Standard folder structure
     Development server included
     Beginner-friendly
     Suitable for learning and many existing projects
*/