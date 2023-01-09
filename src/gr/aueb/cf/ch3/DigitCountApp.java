package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the number of digits of an int, dividing repeatedly
 * by 10 until we reach 0.
 */
public class DigitCountApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int digitsCount = 0;

        System.out.println("Please insert an int:");
        inputNum = in.nextInt();

        num = inputNum;
        do {
            digitsCount++;
            num = num / 10;
        }while (num != 0);

        System.out.printf("%d involves %d digits", inputNum, digitsCount);
    }
}
