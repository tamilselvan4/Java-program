package Tasks.todoApp;

public class TodoItem {
    private String task;
    private boolean completed;

    public TodoItem(String task) {
        this.task = task;
        this.completed = false;
    }

    public String getTask() {
        return task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        completed = true;
    }

    @Override
    public String toString() {
        return "[" + (completed ? "X" : " ") + "] " + task;
    }
}
