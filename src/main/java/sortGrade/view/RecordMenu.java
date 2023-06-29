package sortGrade.view;


import sortGrade.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class RecordMenu {
    // * ArrayList to store student records
    private ArrayList<Student> studentDtoArrayList;

    // * returns the studentDtoArrayList variable, which is an ArrayList containing student records
    public ArrayList<Student> getStudentDtoArrayList() {
        return studentDtoArrayList;
    }

    public RecordMenu(Scanner scanner) {

        String userNameInput;
        double englishGradeInput, mathGradeInput, scienceGradeInput, filipinoGradeInput, mapehGradeInput;
        double calculateGrade;

        while (true) {
            try {
                // * Initialize the studentDtoArrayList as a new ArrayList
                studentDtoArrayList = new ArrayList<>();

                System.out.println("Enter name: ");
                userNameInput = scanner.nextLine();
                System.out.println("Enter English score");
                englishGradeInput = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter Maths score");
                mathGradeInput = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter Science score");
                scienceGradeInput = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter Filipino score");
                filipinoGradeInput = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter MAPEH score");
                mapehGradeInput = Integer.parseInt(scanner.nextLine());


                if (userNameInput.equals("")) {
                    break;
                }
                if (englishGradeInput == 0 || mathGradeInput == 0 || scienceGradeInput == 0 || filipinoGradeInput == 0 || mapehGradeInput == 0) {
                    break;
                }

                studentDtoArrayList.add(new Student(userNameInput, englishGradeInput, mathGradeInput, scienceGradeInput, filipinoGradeInput, mapehGradeInput));

                //Calculate grade
                calculateGrade = englishGradeInput + mathGradeInput + scienceGradeInput + filipinoGradeInput + mapehGradeInput;

                // average
                double averageGrade = (calculateGrade / 5);
                System.out.println(userNameInput + " overall grade is " + averageGrade);

                if (averageGrade < 50) {
                    System.out.println(userNameInput + "failed all the modules");
                } else {
                    System.out.println(userNameInput + " passed all the modules");
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("try again!");
            }
            break;
        }
    }

}
