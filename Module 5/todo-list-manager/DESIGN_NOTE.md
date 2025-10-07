# Design Note - To-Do List Manager

## MVC Architecture Implementation

**Model (TaskModel.java):**
Uses ObservableList<String> to store tasks, enabling automatic UI updates through JavaFX's property binding system. Methods provide clean interface for task manipulation without exposing internal implementation.

**View (TaskView.java):**
Purely UI-focused with styled components and intuitive layout using VBox/HBox. Provides getter methods for controller access while maintaining encapsulation. ListView naturally displays the observable list.

**Controller (TaskController.java):**
Acts as mediator between model and view. Binds ListView items directly to model's ObservableList for automatic synchronization. Uses Bindings.size() to automatically update task count label, eliminating manual count management. Handles all user interactions (add, remove, reset) and includes Enter key support for better UX.

**Extra Credit Implementation:**
TaskApp includes file persistence using BufferedReader/Writer. Tasks are loaded from tasks.txt on startup and saved automatically on application exit, ensuring data persistence across sessions.

**Benefits:**
Observable collections eliminate manual UI updates, property binding ensures consistency, and separation of concerns makes testing and maintenance straightforward.
