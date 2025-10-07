package shapedrawer;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.util.Random;

/**
 * Controller class for Shape Drawer Application
 * Handles user interactions and updates model and view
 */
public class ShapeController {
    private ShapeModel model;
    private ShapeView view;
    private Random random;

    public ShapeController(ShapeModel model, ShapeView view) {
        this.model = model;
        this.view = view;
        this.random = new Random();

        initializeBindings();
        initializeEventHandlers();
    }

    private void initializeBindings() {
        // Bind the ComboBox selection to the model's shape type
        view.getShapeComboBox().valueProperty().addListener((obs, oldVal, newVal) -> {
            model.setShapeType(newVal);
        });

        // Initialize model with current ComboBox value
        model.setShapeType(view.getShapeComboBox().getValue());
    }

    private void initializeEventHandlers() {
        // Draw Shape button action
        view.getDrawButton().setOnAction(event -> {
            drawShape();
        });

        // Clear All button action
        view.getClearButton().setOnAction(event -> {
            clearAllShapes();
        });
    }

    private void drawShape() {
        String shapeType = model.getShapeType();
        Shape shape = null;

        // Random position within the pane
        double maxX = view.getDrawingPane().getWidth() - 100;
        double maxY = view.getDrawingPane().getHeight() - 100;
        double x = random.nextDouble() * Math.max(maxX, 50) + 50;
        double y = random.nextDouble() * Math.max(maxY, 50) + 50;

        // Random color
        Color color = Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble());

        // Create shape based on type
        if ("Circle".equals(shapeType)) {
            Circle circle = new Circle(x, y, 30 + random.nextInt(30));
            circle.setFill(color);
            circle.setStroke(Color.BLACK);
            circle.setStrokeWidth(2);
            shape = circle;
        } else if ("Rectangle".equals(shapeType)) {
            Rectangle rectangle = new Rectangle(x, y, 40 + random.nextInt(60), 40 + random.nextInt(60));
            rectangle.setFill(color);
            rectangle.setStroke(Color.BLACK);
            rectangle.setStrokeWidth(2);
            shape = rectangle;
        }

        // Add shape to pane and update count
        if (shape != null) {
            view.getDrawingPane().getChildren().add(shape);
            model.incrementShapeCount();
            updateShapeCountLabel();
        }
    }

    private void clearAllShapes() {
        view.getDrawingPane().getChildren().clear();
        model.resetShapeCount();
        updateShapeCountLabel();
    }

    private void updateShapeCountLabel() {
        view.getShapeCountLabel().setText("Shapes Drawn: " + model.getShapeCount());
    }
}
