package tempconverter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main Application class for Temperature Converter
 * Connects Model, View, and Controller following MVC pattern
 */
public class TempApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create Model
        TempModel model = new TempModel();

        // Create View
        TempView view = new TempView();

        // Create Controller (connects Model and View)
        TempController controller = new TempController(model, view);

        // Setup Scene and Stage
        Scene scene = new Scene(view.getRoot(), 450, 350);
        primaryStage.setTitle("Temperature Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
