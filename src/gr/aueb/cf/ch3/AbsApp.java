package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Finds the abs value of an int
 * a positives abs is the number itself, while the abs of a negative
 * is the same positive
 */
public class AbsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please insert a num:");
        num = in.nextInt();

        abs = (num > 0) ? num : -num;

        System.out.printf("Abs(%d) = %d", num, abs);
    }
}
