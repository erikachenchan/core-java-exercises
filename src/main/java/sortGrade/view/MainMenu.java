package sortGrade.view;

import sortGrade.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    // * Create Instance Variable
    private RecordMenu recordMenu;
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
                    enterRecord(scanner);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
//                    sortStudents();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
        }

    }

    public void displayStudents() {
        System.out.println("List of students");

        // * Retrieve student record from RecordMenu.java and display them
        students = recordMenu.getStudentDtoArrayList();

        if (students == null) {
            System.out.println("No Student Found");
        } else {
            for (Student student : students) {
                System.out.println("=== Student details ===");
                System.out.println("Name: " + student.getName());
                System.out.println("Overall grade: " + student.calculateGrade());
                System.out.println();
            }
        }
    }

    private void enterRecord(Scanner scanner) {
        recordMenu = new RecordMenu(scanner);
    }

    private void printMainMenu() {
        System.out.println("1: Enter Record");
        System.out.println("2: Display Record");
        System.out.println("3: Sort Record");
        System.out.println("4: Exit program");

    }

    public void printExitMessage() {
        System.out.println("Exiting....");
    }
}
