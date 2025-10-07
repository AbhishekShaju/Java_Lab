package fontstyler;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontStyler extends Application {

    private Label sampleLabel;
    private ChoiceBox<String> styleChoiceBox;
    private Slider fontSizeSlider;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Font Styler");

        // UI Controls
        sampleLabel = new Label("Sample Text - Change My Style!");
        sampleLabel.setFont(Font.font("System", 16));

        Label styleLabel = new Label("Font Style:");
        styleChoiceBox = new ChoiceBox<>();
        styleChoiceBox.getItems().addAll("Normal", "Bold", "Italic", "Bold Italic");
        styleChoiceBox.setValue("Normal");

        Label sizeLabel = new Label("Font Size:");
        fontSizeSlider = new Slider(10, 36, 16);
        fontSizeSlider.setShowTickLabels(true);
        fontSizeSlider.setShowTickMarks(true);
        fontSizeSlider.setMajorTickUnit(5);
        fontSizeSlider.setBlockIncrement(1);

        Label sizeValueLabel = new Label();
        sizeValueLabel.textProperty().bind(
            fontSizeSlider.valueProperty().asString("Size: %.0f")
        );

        // Behavior: Update font when style changes
        styleChoiceBox.valueProperty().addListener((obs, oldVal, newVal) -> {
            updateFont();
        });

        // Behavior: Update font when size changes
        fontSizeSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            updateFont();
        });

        // Layout
        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(
            sampleLabel,
            styleLabel,
            styleChoiceBox,
            sizeLabel,
            fontSizeSlider,
            sizeValueLabel
        );

        // Scene and Stage
        Scene scene = new Scene(root, 400, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateFont() {
        String style = styleChoiceBox.getValue();
        double size = fontSizeSlider.getValue();

        FontWeight weight = FontWeight.NORMAL;
        FontPosture posture = FontPosture.REGULAR;

        switch (style) {
            case "Bold":
                weight = FontWeight.BOLD;
                break;
            case "Italic":
                posture = FontPosture.ITALIC;
                break;
            case "Bold Italic":
                weight = FontWeight.BOLD;
                posture = FontPosture.ITALIC;
                break;
            default:
                // Normal style
                break;
        }

        sampleLabel.setFont(Font.font("System", weight, posture, size));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
