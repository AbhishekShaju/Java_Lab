package todolist;

import javafx.beans.binding.Bindings;

/**
 * Controller class for To-Do List Manager
 * Handles user interactions and connects model with view
 */
public class TaskController {
    private final TaskModel model;
    private final TaskView view;

    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;

        initializeBindings();
        initializeEventHandlers();
    }

    private void initializeBindings() {
        // Bind ListView items to model's ObservableList
        view.getTaskListView().setItems(model.getTasks());

        // Bind task count label to the size of the tasks list
        view.getTaskCountLabel().textProperty().bind(
            Bindings.concat("Total Tasks: ", Bindings.size(model.getTasks()))
        );
    }

    private void initializeEventHandlers() {
        // Add button action
        view.getAddButton().setOnAction(event -> {
            addTask();
        });

        // Also allow Enter key to add task
        view.getTaskInputField().setOnAction(event -> {
            addTask();
        });

        // Remove button action
        view.getRemoveButton().setOnAction(event -> {
            removeSelectedTask();
        });

        // Reset button action
        view.getResetButton().setOnAction(event -> {
            resetAllTasks();
        });
    }

    private void addTask() {
        String task = view.getTaskInputField().getText();
        if (task != null && !task.trim().isEmpty()) {
            model.addTask(task);
            view.getTaskInputField().clear();
            view.getTaskInputField().requestFocus();
        }
    }

    private void removeSelectedTask() {
        String selectedTask = view.getTaskListView().getSelectionModel().getSelectedItem();
        if (selectedTask != null) {
            model.removeTask(selectedTask);
        }
    }

    private void resetAllTasks() {
        model.resetTasks();
        view.getTaskInputField().clear();
    }
}
