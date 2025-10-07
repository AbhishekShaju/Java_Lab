# Color Switcher App

This is a simple JavaFX application that demonstrates how to toggle the color of a rectangle between two colors using a button. The application is structured using the Model-View-Controller (MVC) design pattern.

## Project Structure

```
color-switcher-app
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── example
│       │           └── colorswitcher
│       │               ├── Main.java
│       │               └── MainController.java
│       └── resources
│           └── com
│               └── example
│                   └── colorswitcher
│                       └── MainView.fxml
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository** or download the project files.
2. **Open the project** in your favorite IDE that supports Java and JavaFX.
3. **Ensure you have JavaFX set up** in your environment. You may need to download the JavaFX SDK and configure it in your IDE.
4. **Build the project** using Maven. You can do this by running the following command in the project root directory:
   ```
   mvn clean install
   ```
5. **Run the application**. You can execute the `Main` class to start the Color Switcher app.

## Usage

- When you run the application, you will see a rectangle displayed on the screen along with a button labeled "Switch Color."
- Clicking the button will toggle the rectangle's color between two predefined colors and update the label to reflect the current color.

## Dependencies

This project uses Maven for dependency management. The required JavaFX libraries are specified in the `pom.xml` file. Make sure to check the `pom.xml` for any additional dependencies that may be required for your setup.