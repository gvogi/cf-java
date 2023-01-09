package gr.aueb.cf.ch8.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingExceptionInMenu {

    static Scanner sc = new Scanner(System.in);
    static int choice;

    public static void main(String[] args) {
        while (choice != 5) {
            try {
                executePrm();
            } catch (InputMismatchException e) {
                System.out.println("Illegal input, Please enter an int!\n");
            }
        }
    }

    public static void executePrm() throws InputMismatchException {

            printMenu();

            try {

                choice = getChoice();

                switch (choice) {
                    case 1:
                        System.out.println("Please Choose type of resource to Create:\n");
                        break;
                    case 2:
                        System.out.println("Please Choose type of resource to Read:\n");
                        break;
                    case 3:
                        System.out.println("Please Choose type of resource to Update:\n");
                        break;
                    case 4:
                        System.out.println("Please Choose type of resource to Delete:\n");
                        break;
                    case 5:
                        System.out.println("Program Terminated!");
                        break;
                    default:
                        System.out.println("Please enter a valid choice!\n");
                        break;
                }
            } catch (InputMismatchException e) {
                throw e;
            }
    }

    public static void printMenu() {
        System.out.println("Please choose an option:");
        System.out.println("1. Create");
        System.out.println("2. Read");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
    }

    public static int getChoice() throws InputMismatchException {
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            sc.nextLine();
            throw e;
        }
    }
}
