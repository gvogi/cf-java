package gr.aueb.cf.ch2.exercises;

import java.util.Scanner;

/**
 * Simple Fahrenheit to Celsius Converter.
 */
public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fahrenheit = 0;
        int result = 0;

        System.out.println("Enter a temperature in \u00B0F (int):");
        fahrenheit = sc.nextInt();
        result = (5 * (fahrenheit - 32) / 9);

        System.out.printf("Temperature of %d \u00B0F equals to: %d \u00B0C.", fahrenheit, result);
        sc.close();
    }
}
