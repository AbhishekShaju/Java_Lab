# Design Justification - Shape Drawer Application

## MVC Architecture Implementation

**Model (ShapeModel.java):**
The model maintains the application's core data - the current shape type as an ObjectProperty<String> and a counter for shapes drawn. This separation ensures data integrity and allows the controller to update the shape type without directly manipulating UI components.

**View (ShapeView.java):**
The view is purely concerned with UI layout and component initialization. It provides getter methods for all interactive components, allowing the controller to attach event handlers without the view needing to know about business logic. This promotes reusability and testability.

**Controller (ShapeController.java):**
The controller acts as the mediator between model and view. It binds the ComboBox to the model's shape type property, handles button click events, creates shapes with random positions and colors, and updates the UI. This centralization of logic makes the application easier to maintain and extend.

**Benefits:**
- Clear separation of concerns makes each component easier to understand and modify
- The model can be tested independently of UI components
- UI changes don't require modifications to business logic
- The controller can be easily extended to support additional shapes or features
