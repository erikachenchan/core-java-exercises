package sortGrade.view;


import sortGrade.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class RecordMenu {

    String userNameInput;
    double englishGradeInput, mathGradeInput, scienceGradeInput, filipinoGradeInput, mapehGradeInput;
    double calculateGrade;

    // instantiate with an empty arrayList
    private final ArrayList<Student> studentDtoArrayList = new ArrayList<>();
    private final Scanner scanner;

    // returns the studentDtoArrayList variable, which is an ArrayList containing student records */
    public ArrayList<Student> getStudentDtoArrayList() {
        return studentDtoArrayList;
    }

    // RecordMenu constructor to create scanner as constructor parameter to instantiate
    // the instance variable of recordMenu scanner.
    public RecordMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void openRecordMenu() {

        while (true) {
            try {
                // * Initialize the studentDtoArrayList as a new ArrayList

                System.out.println("Enter name: ");
                // this.scanner
                userNameInput = this.scanner.nextLine();
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

                // add new objects to studentDtoArraylist
                studentDtoArrayList.add(new Student(userNameInput, englishGradeInput, mathGradeInput, scienceGradeInput, filipinoGradeInput, mapehGradeInput));

                calculateGrade = englishGradeInput + mathGradeInput + scienceGradeInput + filipinoGradeInput + mapehGradeInput;

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
