package gr.aueb.cf.ch3.exercises;

import java.util.Scanner;

/**
 * Repeats an option menu until we choose option 5.
 */
public class LoopMenuApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
        System.out.println("Please select one of the options:");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Update");
        System.out.println("4. Search");
        System.out.println("5. Exit");
        choice = sc.nextInt();

        if (choice == 1) {
                System.out.println("Please Choose What to Insert:");
            }else if (choice == 2) {
                System.out.println("Please Choose What to Delete");
            }else if (choice == 3) {
            System.out.println("Please Choose What to Update");
        }else if (choice == 4) {
            System.out.println("Please Enter Your Search");
        }else if (choice == 5) {
            System.out.println("Program Terminated, Thank you!");
            break;
        }else {
            System.out.println("Invalid option, Please make a new selection!");
            }
        }while (true);
        sc.close();
    }
}
