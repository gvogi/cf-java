package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates 1 * 2 * 3 .... * n,
 * where n is an int given from the user
 */
public class MulNApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mul = 1;
        int i = 1;
        int n = 0;

        System.out.println("Please insert a number (int)");
        n = in.nextInt();

        while (i <= n) {
            mul *=i;
            i++;
        }

        System.out.println("Mul = " + mul);
    }
}
