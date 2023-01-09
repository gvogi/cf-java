package gr.aueb.cf.ch2;

import java.util.Scanner;

/***
 * Converts an amount in Euros to:
 * 500euro, euro100, euro 50, euro 20, euro 10,
 * euro 5, remaining euros*/
public class EurosAppJava {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputEuros =0;
        int euros500 = 0;
        int euros100 = 0;
        int euros50 = 0;
        int euros20 = 0;
        int euros10 = 0;
        int euros5 = 0;
        int remainingEuros = 0;

        System.out.println("Please insert amount in Euros:");
        inputEuros = in.nextInt();
        remainingEuros = inputEuros;

        euros500 = remainingEuros / 500;
        remainingEuros = remainingEuros % 500;

        euros100 = remainingEuros / 100;
        remainingEuros = remainingEuros % 100;

        euros50 = remainingEuros / 50;
        remainingEuros = remainingEuros % 50;

        euros20 = remainingEuros / 20;
        remainingEuros = remainingEuros % 20;

        euros10 = remainingEuros / 10;
        remainingEuros = remainingEuros % 10;

        euros5 = remainingEuros / 5;
        remainingEuros = remainingEuros % 5;

        System.out.println("Euros: " + inputEuros + ":");
        System.out.printf("euro500: %d, euros100: %d, euros50: %d" ,euros500, euros100, euros50);
        System.out.printf("euros20: %d, euros10: %d, euros5: %d\n", euros20, euros10, euros5);
        System.out.println("Remaining euros: " + remainingEuros);
    }
}
