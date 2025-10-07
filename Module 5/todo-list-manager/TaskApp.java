package todolist;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Main Application class for To-Do List Manager
 * Connects Model, View, and Controller following MVC pattern
 * EXTRA CREDIT: Saves and loads tasks from file
 */
public class TaskApp extends Application {
    private static final String TASKS_FILE = "tasks.txt";
    private TaskModel model;

    @Override
    public void start(Stage primaryStage) {
        // Create Model
        model = new TaskModel();

        // Load saved tasks (Extra Credit)
        loadTasksFromFile();

        // Create View
        TaskView view = new TaskView();

        // Create Controller (connects Model and View)
        TaskController controller = new TaskController(model, view);

        // Setup Scene and Stage
        Scene scene = new Scene(view.getRoot(), 500, 500);
        primaryStage.setTitle("To-Do List Manager");
        primaryStage.setScene(scene);
        
        // Save tasks on exit (Extra Credit)
        primaryStage.setOnCloseRequest(event -> {
            saveTasksToFile();
        });
        
        primaryStage.show();
    }

    /**
     * EXTRA CREDIT: Load tasks from file on startup
     */
    private void loadTasksFromFile() {
        File file = new File(TASKS_FILE);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (!line.trim().isEmpty()) {
                        model.addTask(line.trim());
                    }
                }
            } catch (IOException e) {
                System.err.println("Error loading tasks: " + e.getMessage());
            }
        }
    }

    /**
     * EXTRA CREDIT: Save tasks to file on exit
     */
    private void saveTasksToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TASKS_FILE))) {
            for (String task : model.getTasks()) {
                writer.write(task);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving tasks: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
