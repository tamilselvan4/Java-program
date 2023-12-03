package Tasks.todoApp;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<TodoItem> items;

    public TodoList() {
        this.items = new ArrayList<>();
    }

    public void addItem(String task) {
        TodoItem newItem = new TodoItem(task);
        items.add(newItem);
    }

    public void displayList() {
        System.out.println("Todo List:");
        for (TodoItem item : items) {
            System.out.println(item.toString());
        }
    }

    public void markAsCompleted(int index) {
        if (index >= 0 && index < items.size()) {
            items.get(index).markAsCompleted();
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task index");
        }
    }
}
