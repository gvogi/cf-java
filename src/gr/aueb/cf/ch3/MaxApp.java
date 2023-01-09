package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Finds MaX between two inputs.
 */
public class MaxApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int max = 0;

        System.out.println("Please insert two ints:");
        num1 = in.nextInt();
        num2 = in.nextInt();

//        max = (num1 > num2) ? num1 : num2;

        System.out.printf("Max(%d, %d) = %d", num1, num2, (num1 > num2) ? num1 : num2);
    }
}
