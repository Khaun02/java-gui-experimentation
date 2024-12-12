import java.util.ArrayList;

public class TaskTracker {
    private ArrayList<Task> tasks;

    public TaskTracker() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void saveTasksToFile(String filePath) {
        // Save tasks to a file
    }

    public void loadTasksFromFile(String filePath) {
        // Load tasks from a file
    }
}