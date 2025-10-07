package tempconverter;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * View class for Temperature Converter
 * Contains all UI components
 */
public class TempView {
    private VBox root;
    private TextField celsiusField;
    private TextField fahrenheitField;
    private Button resetButton;

    public TempView() {
        initializeComponents();
        layoutComponents();
    }

    private void initializeComponents() {
        // Text fields
        celsiusField = new TextField("0.0");
        celsiusField.setPrefWidth(150);
        
        fahrenheitField = new TextField("32.0");
        fahrenheitField.setPrefWidth(150);

        // Reset button
        resetButton = new Button("Reset");
        resetButton.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white; -fx-font-weight: bold;");
    }

    private void layoutComponents() {
        // Title
        Label titleLabel = new Label("Temperature Converter");
        titleLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        // Instructions
        Label instructionsLabel = new Label("Enter temperature in either field to convert");
        instructionsLabel.setStyle("-fx-font-size: 12px; -fx-text-fill: gray;");

        // Grid for input fields
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(15);
        grid.setAlignment(Pos.CENTER);

        Label celsiusLabel = new Label("Celsius (°C):");
        celsiusLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");
        
        Label fahrenheitLabel = new Label("Fahrenheit (°F):");
        fahrenheitLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");

        grid.add(celsiusLabel, 0, 0);
        grid.add(celsiusField, 1, 0);
        grid.add(fahrenheitLabel, 0, 1);
        grid.add(fahrenheitField, 1, 1);

        // Button row
        HBox buttonRow = new HBox();
        buttonRow.setAlignment(Pos.CENTER);
        buttonRow.getChildren().add(resetButton);

        // Main layout
        root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(30));
        root.getChildren().addAll(
            titleLabel,
            instructionsLabel,
            grid,
            buttonRow
        );

        root.setStyle("-fx-background-color: #f5f5f5;");
    }

    public VBox getRoot() {
        return root;
    }

    public TextField getCelsiusField() {
        return celsiusField;
    }

    public TextField getFahrenheitField() {
        return fahrenheitField;
    }

    public Button getResetButton() {
        return resetButton;
    }
}
