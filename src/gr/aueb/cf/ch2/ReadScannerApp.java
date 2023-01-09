package gr.aueb.cf.ch2;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Reads 2 ints from standars input (keyboard)
 * and prints the sum
 */
public class ReadScannerApp {
//Δήλωση - αρχικοποίηση.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

//        Εντολές
        System.out.println("Please insert a number (int):");
        num1 = sc.nextInt();

        System.out.println("Please insert another number:");
        num2 = sc.nextInt();

        sum = num1 + num2;

//        Εκτύπωση αποτελέσματος.
        System.out.printf("Sum of %d + %d = %d", num1, num2, sum);
    }

}
