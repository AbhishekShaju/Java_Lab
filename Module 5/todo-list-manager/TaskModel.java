package todolist;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Model class for To-Do List Manager
 * Maintains the list of tasks
 */
public class TaskModel {
    private final ObservableList<String> tasks;

    public TaskModel() {
        this.tasks = FXCollections.observableArrayList();
    }

    public ObservableList<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        if (task != null && !task.trim().isEmpty()) {
            tasks.add(task.trim());
        }
    }

    public void removeTask(String task) {
        if (task != null) {
            tasks.remove(task);
        }
    }

    public void resetTasks() {
        tasks.clear();
    }

    public int getTaskCount() {
        return tasks.size();
    }
}
