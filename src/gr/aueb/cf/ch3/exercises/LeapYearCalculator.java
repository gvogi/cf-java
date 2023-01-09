package gr.aueb.cf.ch3.exercises;

import java.util.Scanner;

/**
 * Calculates if a given year is leap or not.
 */
public class LeapYearCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearIn = 4;
        final int GREGORIAN_CALENDAR_START = 1582;

        while (true) {
            System.out.println("Enter a Year From the Gregorian Calendar (1582 and after) or 0 to Exit:");
            yearIn = sc.nextInt();

            boolean leapCheck1 = (yearIn % 4) == 0;
            boolean leapCheck2 = (yearIn % 100) != 0;
            boolean leapCheck3 = (yearIn % 400) == 0;
            boolean leapYear = (leapCheck1 && leapCheck2) || leapCheck3;

            if (yearIn == 0) {
                System.out.println("Program Terminated, Thank You!");
                break;
            } else if (yearIn < GREGORIAN_CALENDAR_START) {
                System.out.printf("Year %d is not a Valid Input!%n", yearIn);
            }else if (leapYear) {
                System.out.printf("Year %d is a Leap Year!%n", yearIn);
            }else {
                System.out.printf("Year %d is Not a Leap Year!%n", yearIn);
            }
        }
        sc.close();
    }
}
