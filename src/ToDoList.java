import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> completed = new ArrayList<>();

        System.out.println("Welcome to the To-Do List.");
        System.out.println("You may add, remove and edit your list.");
        System.out.println("When you are done, you can check off your tasks.");

        while (true) {
            System.out.println("\nHere are your menu options:");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark a task as completed");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice: ");

            int choice;
            try {
                choice = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                input.nextLine(); // clear bad input
                System.out.println("Please enter a number between 1 and 5.");
                continue;
            }

            if (choice == 1) {
                System.out.print("Enter your task: ");
                String task = input.nextLine().trim();
                if (task.isEmpty()) {
                    System.out.println("Task cannot be empty!");
                } else {
                    tasks.add(task);
                    completed.add(false);
                    System.out.println("Task added!");
                }

            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks yet. Add one first!");
                } else {
                    System.out.println("\nYour tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        String status = completed.get(i) ? "[✔]" : "[ ]";
                        System.out.println((i + 1) + ". " + status + " " + tasks.get(i));
                    }
                }

            } else if (choice == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to mark. Add a task first!");
                } else {
                    System.out.print("Enter the number of the task you completed: ");
                    int taskNumber = input.nextInt();
                    input.nextLine();
                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        completed.set(taskNumber - 1, true);
                        System.out.println("Task marked as completed!");
                    } else {
                        System.out.println("Invalid task number. Please try again.");
                    }
                }

            } else if (choice == 4) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to delete.");
                } else {
                    System.out.print("Enter the number of the task to delete: ");
                    int taskNumber = input.nextInt();
                    input.nextLine();
                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        System.out.println("Deleted: " + tasks.get(taskNumber - 1));
                        tasks.remove(taskNumber - 1);
                        completed.remove(taskNumber - 1);
                    } else {
                        System.out.println("Invalid task number. Please try again.");
                    }
                }

            } else if (choice == 5) {
                System.out.println("Exiting the To-Do List. Goodbye!");
                break;

            } else {
                System.out.println("Invalid option. Please enter 1 through 5.");
            }
        }

        input.close();
    }
}
