package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts euro to usd.
 */
public class EuroUsdConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PARITY = 99; // Ισοτιμία
        int totalUsaCents = 0;
        int inputEuros = 0;
        int usaDollars = 0;
        int usaCents = 0;

        System.out.println("Please insert an amount (Euros)");
        inputEuros = sc.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d euros = %d USA dollars & %d USA cents", inputEuros, usaDollars, usaCents);
    }
}
