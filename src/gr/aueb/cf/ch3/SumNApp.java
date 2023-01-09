package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Reads from standard input an int
 * and finds the sum from 1 - n.
 */
public class SumNApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        int n = 0;

        System.out.println("Please insert a number (int)");
        n = in.nextInt();

        while (i <= n) {
            sum +=i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
