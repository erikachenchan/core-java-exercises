package sortgrade.view;


import sortgrade.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class EditRecordMenu {
    private RecordMenu recordMenu = new RecordMenu(new Scanner(System.in));
    private final Scanner scanner;

    public EditRecordMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void editStudentRecord() {

        // get student ArrayList containing all student records
        ArrayList<Student> students = recordMenu.getStudentDtoArrayList();

//        while (true) {
//            try {
//                System.out.println("Enter student ID that you want to change details: ");
//                int userInputId = Integer.parseInt(scanner.nextLine());
//
//                System.out.println("Enter new name: ");
//                String userNameInput = scanner.nextLine();
//
//                System.out.println("Enter new English score: ");
//                double englishGradeInput = Double.parseDouble(scanner.nextLine());
//
//                System.out.println("Enter new Maths score: ");
//                double mathGradeInput = Double.parseDouble(scanner.nextLine());
//
//                System.out.println("Enter new Science score: ");
//                double scienceGradeInput = Double.parseDouble(scanner.nextLine());
//
//
//                for (Student student : students) {
//                    //if user input is equal to user ID
//                    if (userInputId == student.getUserId()) {
//                        // update changes
//                        student.setName(userNameInput);
//                        student.setEnglishGrade(englishGradeInput);
//                        student.setMathGrade(mathGradeInput);
//                        student.setScienceGrade(scienceGradeInput);
//                    }
//                }
//
//            } catch (Exception e) {
//                System.out.println("try again");
//            }
//            break;
//        }
    }
}
