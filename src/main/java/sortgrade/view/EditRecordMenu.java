package sortgrade.view;

import sortgrade.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class EditRecordMenu {
    private RecordMenu recordMenu = new RecordMenu(new Scanner(System.in));
    private ArrayList<Student> students;

    private final Scanner scanner;

    public EditRecordMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void editStudentRecord() {
        // Retrieve student record from RecordMenu.java and display them
        students = recordMenu.getStudentDtoArrayList();

//        while (true) {
//            try {
//                System.out.println("Enter student ID that you want to change details: ");
//                // update the grade and new total grades
//
//            } catch (Exception e) {
//                System.out.println("Try again");
//            }
//            break;
//        }
    }
}
