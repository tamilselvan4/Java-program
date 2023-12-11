package Tasks.todoApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class TodoItem {
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

class TodoList {
    private List<TodoItem> items;

    public TodoList() {
        this.items = new ArrayList<>();
    }

    public void addItem(String task) {
        TodoItem newItem = new TodoItem(task);
        items.add(newItem);
    }

    public void markAsCompleted(int index) {
        if (index >= 0 && index < items.size()) {
            items.get(index).markAsCompleted();
        }
    }

    public List<TodoItem> getItems() {
        return items;
    }
}

public class TodoAppGUI extends JFrame {
    private TodoList todoList;
    private DefaultListModel<TodoItem> listModel;
    private JList<TodoItem> todoListView;

    public TodoAppGUI() {
        todoList = new TodoList();
        listModel = new DefaultListModel<>();
        todoListView = new JList<>(listModel);

        initializeUI();
    }

    private void initializeUI() {
        setTitle("Todo List App");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton addButton = new JButton("Add Task");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = JOptionPane.showInputDialog("Enter task:");
                if (task != null && !task.trim().isEmpty()) {
                    todoList.addItem(task);
                    updateTodoListView();
                }
            }
        });

        JButton completeButton = new JButton("Mark as Completed");
        completeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = todoListView.getSelectedIndex();
                if (selectedIndex != -1) {
                    todoList.markAsCompleted(selectedIndex);
                    updateTodoListView();
                }
            }
        });

        panel.add(addButton, BorderLayout.NORTH);
        panel.add(new JScrollPane(todoListView), BorderLayout.CENTER);
        panel.add(completeButton, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    private void updateTodoListView() {
        listModel.clear();
        for (TodoItem item : todoList.getItems()) {
            listModel.addElement(item);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TodoAppGUI();
            }
        });
    }
}

