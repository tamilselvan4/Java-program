package Tasks.todoApp;

import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    todoList.addItem(task);
                    break;
                case 2:
                    todoList.displayList();
                    break;
                case 3:
                    System.out.print("Enter the index of the task to mark as completed: ");
                    int index = sc.nextInt();
                    todoList.markAsCompleted(index);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

