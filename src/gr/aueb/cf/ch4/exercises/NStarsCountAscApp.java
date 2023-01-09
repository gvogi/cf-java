package gr.aueb.cf.ch4.exercises;

import java.util.Scanner;

/**
 * User inserts how many stars to print in ascending order.
 */
public class NStarsCountAscApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert number of stars to print (int):");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

