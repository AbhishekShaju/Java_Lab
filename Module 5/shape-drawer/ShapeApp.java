package shapedrawer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main Application class for Shape Drawer
 * Connects Model, View, and Controller following MVC pattern
 */
public class ShapeApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create Model
        ShapeModel model = new ShapeModel();

        // Create View
        ShapeView view = new ShapeView();

        // Create Controller (connects Model and View)
        ShapeController controller = new ShapeController(model, view);

        // Setup Scene and Stage
        Scene scene = new Scene(view.getRoot(), 600, 550);
        primaryStage.setTitle("Shape Drawer Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
