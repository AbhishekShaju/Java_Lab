package todolist;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * View class for To-Do List Manager
 * Contains all UI components
 */
public class TaskView {
    private VBox root;
    private TextField taskInputField;
    private Button addButton;
    private Button removeButton;
    private Button resetButton;
    private ListView<String> taskListView;
    private Label taskCountLabel;

    public TaskView() {
        initializeComponents();
        layoutComponents();
    }

    private void initializeComponents() {
        // Input field for new tasks
        taskInputField = new TextField();
        taskInputField.setPromptText("Enter a new task...");
        taskInputField.setPrefWidth(300);

        // Buttons
        addButton = new Button("Add");
        addButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
        
        removeButton = new Button("Remove Selected");
        removeButton.setStyle("-fx-background-color: #f44336; -fx-text-fill: white; -fx-font-weight: bold;");
        
        resetButton = new Button("Reset");
        resetButton.setStyle("-fx-background-color: #ff9800; -fx-text-fill: white; -fx-font-weight: bold;");

        // ListView to display tasks
        taskListView = new ListView<>();
        taskListView.setPrefHeight(300);

        // Label for task count
        taskCountLabel = new Label("Total Tasks: 0");
        taskCountLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");
    }

    private void layoutComponents() {
        // Input row
        HBox inputRow = new HBox(10);
        inputRow.setAlignment(Pos.CENTER);
        inputRow.getChildren().addAll(taskInputField, addButton);
        HBox.setHgrow(taskInputField, Priority.ALWAYS);

        // Button row
        HBox buttonRow = new HBox(10);
        buttonRow.setAlignment(Pos.CENTER);
        buttonRow.getChildren().addAll(removeButton, resetButton);

        // Status row
        HBox statusRow = new HBox();
        statusRow.setAlignment(Pos.CENTER);
        statusRow.getChildren().add(taskCountLabel);

        // Main layout
        root = new VBox(15);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(
            new Label("To-Do List Manager"),
            inputRow,
            taskListView,
            buttonRow,
            statusRow
        );

        // Style the title
        ((Label) root.getChildren().get(0)).setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
    }

    public VBox getRoot() {
        return root;
    }

    public TextField getTaskInputField() {
        return taskInputField;
    }

    public Button getAddButton() {
        return addButton;
    }

    public Button getRemoveButton() {
        return removeButton;
    }

    public Button getResetButton() {
        return resetButton;
    }

    public ListView<String> getTaskListView() {
        return taskListView;
    }

    public Label getTaskCountLabel() {
        return taskCountLabel;
    }
}
