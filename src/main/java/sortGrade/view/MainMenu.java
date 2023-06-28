package sortGrade.view;

import sortGrade.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
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
                    sortRecord();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
        }

    }

    public void sortRecord() {
        System.out.println("List of students");
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : students) {
            System.out.println("Name" + student.getName());
            System.out.println("Overall grade: " + student.calculateGrade());
        }
        System.out.println("test...");
        System.out.println(students); // test
    }

    private void enterRecord(Scanner scanner) {
        RecordMenu recordMenu = new RecordMenu(scanner);

    }

    private void printMainMenu() {
        System.out.println("1: Enter record");
        System.out.println("2: Sort Record");
    }

    public void printExitMessage() {
        System.out.println("Exiting..");
    }
}
