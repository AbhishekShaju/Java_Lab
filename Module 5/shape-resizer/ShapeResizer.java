package shaperesizer;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShapeResizer extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Shape Resizer");

        // UI Controls
        Circle circle = new Circle(50);
        circle.setFill(javafx.scene.paint.Color.DODGERBLUE);
        circle.setStroke(javafx.scene.paint.Color.BLACK);

        Slider slider = new Slider(10, 100, 50);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(10);
        slider.setBlockIncrement(5);

        Label radiusLabel = new Label();

        // Binding: Circle radius bound to slider value
        circle.radiusProperty().bind(slider.valueProperty());

        // Binding: Label text bound to slider value (rounded)
        radiusLabel.textProperty().bind(
            slider.valueProperty().asString("Radius: %.0f")
        );

        // Layout
        VBox root = new VBox(20, circle, slider, radiusLabel);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        // Scene and Stage
        Scene scene = new Scene(root, 400, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
