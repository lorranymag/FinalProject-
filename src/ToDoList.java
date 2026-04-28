import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> completed = new ArrayList<>();

        System.out.println("Welcome to the To-Do List.");
        System.out.println("You may add, remove and edit your list");
        System.out.println("When you are done, you can check off your tasks and manage your to-do list.");

    while(true){
        System.out.println("Here is your menu options:");
        System.out.println("1. Add a task");
        System.out.println("2. View tasks");
        System.out.println("3. Mark a task as completed");
        System.out.println("4. Exit");
        System.out.print("Please enter your choice: ");
        int choice = input.nextInt();
        input.nextLine(); 

    if (choice == 1) {
            System.out.println("Enter your task: ");
            String task = input.nextLine();
            tasks.add(task);
            completed.add(false);
            }
    else if (choice == 2) {
            System.out.println("Your tasks:");
            for (int i = 0; i < tasks.size(); i++) {
            String status = completed.get(i) ? "[✔]" : "[ ]";
            System.out.println((i + 1) + ". " + status + " " + tasks.get(i));
                }   
            }
    else if (choice == 3) {
            System.out.println("Enter the number of the task you completed: ");
            int taskNumber = input.nextInt();
            if (taskNumber > 0 && taskNumber <= tasks.size()) {
                completed.set(taskNumber - 1, true);
                System.out.println("Task marked as completed.");
                }
            }
    else if (choice == 4) {
            System.out.println("Exiting the To-Do List. Goodbye!");
            break;
            }
        }
        input.close();
    }
}