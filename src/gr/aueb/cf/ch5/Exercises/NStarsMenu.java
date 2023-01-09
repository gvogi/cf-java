package gr.aueb.cf.ch5.Exercises;

import java.util.Scanner;

/**
 * User chooses printing action from a menu and Num
 * of stars that will be printed in the console.
 */
public class NStarsMenu {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        executePrm();
    }

    public static void executePrm() {
        int choice = 0;
        int stars = 0;
        int printResult = 0;

        do {
            printMenu();
            System.out.println("Δώσε επιλογή:");

            choice = getChoice();

            if ((choice >= 1) && (choice <= 5)) {
                System.out.println("Δώσε αριθμό αστεριών:");
                stars = numOfStars();
            }

            printResult = getResult(choice, stars);

        } while (choice != 6);

        System.out.println("Thank you!");
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα απο τα παρακάτω:");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια:");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα:");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια:");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n:");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1:");
        System.out.println("6. Έξοδος από το πρόγραμμα:");
    }


    public static int getChoice() {
        return sc.nextInt();
    }

    public static int numOfStars() {
        return sc.nextInt();
    }

    public static void printStarInRow() {
        System.out.print("*");
    }

    public static void printStarInColumn() {
        System.out.println("*");
    }

    public static void printLine() {
        System.out.println();
    }

    public static int nStarsRow(int stars) {
        for (int i = 1; i <= stars; i++) {
            printStarInRow();
        }
        return 0;
    }

    public static int nStarsColumn(int stars) {
        for (int i = 1; i <= stars; i++) {
            printStarInColumn();
        }
        return 0;
    }

    public static int nStarsTable(int stars) {
        for (int i = 1; i <= stars; i++) {
            for (int j = 1; j <= stars; j++) {
                printStarInRow();
            }
            printStarInColumn();
        }
        return 0;
    }

    public static int nStarsDesc(int stars) {
        for (int i = 1; i <= stars; i++) {
            for (int j = i; j <= stars; j++) {
                printStarInRow();
            }
            printLine();
        }
        return 0;
    }

    public static int nStarsAsc(int stars) {
        for (int i = 1; i <= stars; i++) {
            for (int j = 1; j <= i; j++) {
                printStarInRow();
            }
            printLine();
        }
        return 0;
    }

    public static int getResult(int choice, int stars) {
        int printResult = 0;

        switch (choice) {
            case 1:
                printResult = nStarsRow(stars);
                printLine();
                break;
            case 2:
                printResult = nStarsColumn(stars);
                break;
            case 3:
                printResult = nStarsTable(stars);
                break;
            case 4:
                printResult = nStarsAsc(stars);
                break;
            case 5:
                printResult = nStarsDesc(stars);
                break;
            case 6:
                System.out.println("Program Terminated!");
                break;
            default:
                System.out.println("Λάθος επιλογή!");
                break;
        }
        return printResult;
    }
}