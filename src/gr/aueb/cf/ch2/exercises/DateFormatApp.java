package gr.aueb.cf.ch2.exercises;

import java.util.Scanner;

/**
 * Takes as input 3 int representing a date
 * and prints them in a DD/MM/YY format.
 */
public class DateFormatApp {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Please enter a date (int):");
        System.out.println("Day(1-31), Month(1-12), Year(2 or 4 digits max):");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        System.out.printf("Date is: %02d/%02d/%d", day, month, year);
        sc.close();
    }
}