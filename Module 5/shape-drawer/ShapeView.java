package shapedrawer;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * View class for Shape Drawer Application
 * Contains all UI components
 */
public class ShapeView {
    private BorderPane root;
    private ComboBox<String> shapeComboBox;
    private Button drawButton;
    private Button clearButton;
    private Pane drawingPane;
    private Label shapeCountLabel;

    public ShapeView() {
        initializeComponents();
        layoutComponents();
    }

    private void initializeComponents() {
        // ComboBox for shape selection
        shapeComboBox = new ComboBox<>();
        shapeComboBox.getItems().addAll("Circle", "Rectangle");
        shapeComboBox.setValue("Circle");

        // Buttons
        drawButton = new Button("Draw Shape");
        clearButton = new Button("Clear All");

        // Drawing pane
        drawingPane = new Pane();
        drawingPane.setStyle("-fx-background-color: #f0f0f0; -fx-border-color: black; -fx-border-width: 2;");
        drawingPane.setPrefSize(500, 400);

        // Label for shape count
        shapeCountLabel = new Label("Shapes Drawn: 0");
        shapeCountLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");
    }

    private void layoutComponents() {
        // Top controls
        HBox topControls = new HBox(15);
        topControls.setAlignment(Pos.CENTER);
        topControls.setPadding(new Insets(10));
        topControls.getChildren().addAll(
            new Label("Select Shape:"),
            shapeComboBox,
            drawButton,
            clearButton
        );

        // Bottom status
        HBox bottomStatus = new HBox();
        bottomStatus.setAlignment(Pos.CENTER);
        bottomStatus.setPadding(new Insets(10));
        bottomStatus.getChildren().add(shapeCountLabel);

        // Center drawing area
        VBox centerBox = new VBox(drawingPane);
        centerBox.setAlignment(Pos.CENTER);
        centerBox.setPadding(new Insets(10));

        // Main layout
        root = new BorderPane();
        root.setTop(topControls);
        root.setCenter(centerBox);
        root.setBottom(bottomStatus);
    }

    public BorderPane getRoot() {
        return root;
    }

    public ComboBox<String> getShapeComboBox() {
        return shapeComboBox;
    }

    public Button getDrawButton() {
        return drawButton;
    }

    public Button getClearButton() {
        return clearButton;
    }

    public Pane getDrawingPane() {
        return drawingPane;
    }

    public Label getShapeCountLabel() {
        return shapeCountLabel;
    }
}
