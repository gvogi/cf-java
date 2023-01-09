package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
* Prints a menu until wwe choose exit.
 */
public class DoWhileMenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Choose one option:");
            System.out.println("1. Enter product:");
            System.out.println("2. Delete product:");
            System.out.println("3. Exit");

            choice = in.nextInt();
        }while (choice != 3);

        System.out.println("Thanks for using our app!");
    }
}
