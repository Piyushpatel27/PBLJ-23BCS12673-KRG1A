//package labmst.ques2;
import java.util.*;

class EmptyListException extends Exception {
    public EmptyListException(String message) {
        super(message);
    }
}

public class studentList {
    private ArrayList<String> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter student name to add: ");
        String name = sc.nextLine();
        students.add(name);
        System.out.println(name + " added successfully.");
    }

    public void removeStudent() {
        System.out.print("Enter student name to remove: ");
        String name = sc.nextLine();
        if (students.remove(name)) {
            System.out.println(name + " removed successfully.");
        } else {
            System.out.println(name + " not found in the list.");
        }
    }


    public void displayStudents() {
        try {
            if (students.isEmpty()) {
                throw new EmptyListException("Student list is empty!");
            }
            Collections.sort(students);
            System.out.println("Students: " + students);
        } catch (EmptyListException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void menu() {
        int choice=0;
        do {
            System.out.println("\n--- Student List Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 1-4.");
                continue;
            }

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        studentList list = new studentList();
        list.menu();
    }
}


