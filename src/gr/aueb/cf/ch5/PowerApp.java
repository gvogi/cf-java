package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculates a^n using a method.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int n = 0;
        int result = 0;

        System.out.println("Please insert a and b:");
        a = in.nextInt();
        n = in.nextInt();

        /*
         * Invokes pow with actual parameters a, n
         * pow returns the power of a^n which is
         * assigned t result.
         */
        result = pow(a, n);

        System.out.printf("%d^%d = %d", a, n, result);;
    }

    /**
     * Returns the power of a^n
     * @param a base
     * @param n power
     * @return power of a^n
     */
    public static int pow(int a, int n) {
        // Declaration - initialization
        int power = 1;

        // Commands - flow control
        for (int i = 1; i <= n; i++) {
            power *= a;
        }
        return power;
    }
}
