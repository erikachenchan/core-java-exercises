package sortgrade;



import java.util.Scanner;

import sortgrade.view.MainMenu;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenuView = new MainMenu(scanner);
        mainMenuView.printExitMessage();
    }
}
