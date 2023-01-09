package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Reads char using a Scanner.
 */
public class CharScannerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar = ' ';

        System.out.println("Please enter a char:");
        inputChar = in.nextLine().charAt(0);

        System.out.println("Input char: " + inputChar);
    }
}
