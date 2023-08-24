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

    int userInputId;
    String userNameInput;
    double englishGradeInput;
    double mathGradeInput;
    double scienceGradeInput;

    public void editStudentRecord() {
        while (true) {
            // get student ArrayList containing all student records
            ArrayList<Student> students = recordMenu.getStudentDtoArrayList();

            try {
                System.out.println("Enter student ID that you want to change details: ");
                userInputId = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter new name: ");
                userNameInput = scanner.nextLine();

                System.out.println("Enter new English score: ");
                englishGradeInput = Double.parseDouble(scanner.nextLine());

                System.out.println("Enter new Maths score: ");
                mathGradeInput = Double.parseDouble(scanner.nextLine());

                System.out.println("Enter new Science score: ");
                scienceGradeInput = Double.parseDouble(scanner.nextLine());

//                for (Student student : students) {
//                    if (userInputId == student.getUserId()) {
//                        student.setName(userNameInput);
//                        student.setEnglishGrade(englishGradeInput);
//                        student.setMathGrade(mathGradeInput);
//                        student.setScienceGrade(scienceGradeInput);
//                    }
//                }

            } catch (Exception e) {
                System.out.println("try again");
            }
            break;
        }
    }
}
