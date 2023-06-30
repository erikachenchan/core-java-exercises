package sortGrade.view;

import sortGrade.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    /**
     * Create Instance Variable for main menu,
     * this means it has one recordMenu instance
     * you can retain all the attributes from that recordmenu
     * instance with a single object instance.
     */
    private RecordMenu recordMenu = new RecordMenu(new Scanner(System.in));
    private ArrayList<Student> students;

    public MainMenu(Scanner scanner) {
        int usersChoice;
        boolean exit = false;
        while (!exit) {
            printMainMenu();
            System.out.println("Please enter your choice: ");
            while (true) {
                try {
                    usersChoice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("");
                    System.out.println("You enter an invalid choice, please try again");
                    System.out.println("");
                    printMainMenu();
                }
            }
            switch (usersChoice) {
                case 1:
                    recordMenu.openRecordMenu();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
//                    editRecord();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
        }

    }

    public void displayStudents() {
        System.out.println("Student Records");

        // Retrieve student record from RecordMenu.java and display them
        students = recordMenu.getStudentDtoArrayList();

        if (students == null) {
            System.out.println("No Student Found");
        } else {
            for (Student student : students) {
                System.out.println("=== " + student.getName() + " grade details ===");
                System.out.println("Name: " + student.getName());
                System.out.println("Overall grade: " + student.calculateGrade());
                System.out.println();
            }
        }
    }


    private void printMainMenu() {
        System.out.println("1: Enter Record");
        System.out.println("2: Display Record");
        System.out.println("3: Sort Record");
        System.out.println("4: Exit program");

    }

    public void printExitMessage() {
        System.out.println("Exiting..");
    }
}
