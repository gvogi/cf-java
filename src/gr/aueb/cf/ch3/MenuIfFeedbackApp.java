package gr.aueb.cf.ch3;

import java.awt.*;
import java.util.Scanner;

/**
 * Implements a CRUD menu with multiple if-then-else
 */
public class MenuIfFeedbackApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Input");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");

            choice = in.nextInt();

            if (choice == 1) {
                System.out.println("Inserted successfully");
            } else if (choice == 2) {
                System.out.println("successful Search");
            } else if (choice == 3) {
                System.out.println("Deleted successfully");
            } else if (choice == 4) {
                System.out.println("Updated successfully");
            } else if (choice == 5) {
                System.out.println("You choose to Exit?");
            } else {
                System.out.println("Wrong choice!");
            }
        }while (choice != 5);

        System.out.println("Goodbye!");
    }
}
