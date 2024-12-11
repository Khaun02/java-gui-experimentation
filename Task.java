public class Task {
    private String name;
    private String dueDate;
    private String priority;
    private boolean isCompleted;

    // Constructor, getters, setters, and methods

    public Task(String name, String dueDate, String priority, boolean isCompleted) {
        this.name = name;
        this.dueDate = dueDate;
        this.priority = priority;
        this.isCompleted = isCompleted;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    public String getDueDate() {
        return this.dueDate;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    public String getPriority() {
        return this.priority;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
    public boolean getIsCompleted() {
        return this.isCompleted;
    }
}
