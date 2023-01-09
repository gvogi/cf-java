package gr.aueb.cf.ch5.Exercises;

import java.util.Scanner;

public class NStarsMenuV2 {

        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {executePrm();}

    public static void executePrm() {
        int choice = 0;
        int stars = 0;

        do {
            printMenu();
            System.out.println("Δώσε επιλογή:");

            choice = getChoice();

            if ((choice >= 1) && (choice <= 5)) {
                System.out.println("Δώσε αριθμό αστεριών:");
                stars = numOfStars();
            }

            switch (choice) {
                case 1:
                    nStarsRow(stars);
                    System.out.println();
                    break;
                case 2:
                    nStarsColumn(stars);
                    break;
                case 3:
                    nStarsTable(stars);
                    break;
                case 4:
                    nStarsAsc(stars);
                    break;
                case 5:
                    nStarsDesc(stars);
                    break;
                case 6:
                    System.out.println("Program Terminated!");
                    break;
                default:
                    System.out.println("Λάθος επιλογή!");
                    break;
            }
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

    public static int getChoice() { return sc.nextInt(); }

    public static int numOfStars() { return sc.nextInt(); }

    public static void nStarsRow(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }

    public static void nStarsColumn(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.println("*");
        }
    }

    public static void nStarsTable(int stars) {
        for (int i = 1; i <= stars; i++) {
            nStarsRow(stars);
            System.out.println();
        }
    }

    public static void nStarsDesc(int stars) {
        for (int i = stars; i >=1 ; i--) {
            nStarsRow(i);
            System.out.println();
        }
    }

    public static void nStarsAsc(int stars) {
        for (int i = 1; i <= stars; i++) {
            nStarsRow(i);
            System.out.println();
        }
    }
}
