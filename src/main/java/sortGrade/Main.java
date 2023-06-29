package sortGrade;



import java.util.Scanner;

import sortGrade.view.MainMenu;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenuView = new MainMenu(scanner);
        mainMenuView.printExitMessage();
    }
}
