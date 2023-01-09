package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Counts the sum of an int.
 * For 123 we get sum == 6.
 */
public class DigitsSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
    int num = 0;
    int sum = 0;
    int digit = 0;
    int digitsCount = 0;

        System.out.println("Please enter a num (int):");
        inputNum = in.nextInt();

        num = inputNum;
        do {
            digit = num % 10;
            sum += digit; // sum = sum + digit
            num = num / 10;
        }while (num != 0);

        System.out.printf("DigitsCount: %d , DigitsSum: %d", digitsCount, sum );
    }
}
