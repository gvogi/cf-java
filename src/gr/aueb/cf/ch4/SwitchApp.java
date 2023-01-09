package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Switch instead of many if else.
 */
public class SwitchApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
        System.out.println("Please select one of the following:");
        System.out.println("1. One-player Game");
        System.out.println("2. Two-player Game");
        System.out.println("3. Team Game");
        System.out.println("4. Exit");
        System.out.println("Please insert your choice");

        choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start one-player Game");
                    break;
                case 2:
                    System.out.println("Start Two-player Game Game");
                    break;
                case 3:
                    System.out.println("Start Team Game");
                    break;
                case 4:
                    System.out.println("Exit Game");
                    break;
                default:
                    System.out.println("Error in choice!");
            }
        } while (choice != 4);

        System.out.println("Game Over Goodbye!");
    }
}
