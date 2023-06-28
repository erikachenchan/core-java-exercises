package sortGrade;


import sortGrade.view.MainMenu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenuView = new MainMenu(scanner);
        mainMenuView.printExitMessage();
    }
}
