package gr.aueb.cf.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Reads integers until we find a negative where it stops.
 * Counts how many positives we have.
 */
public class PositivesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Please insert a positive int (or negative for exit)");
        num = in.nextInt();

        while (num>=0) {
            System.out.println("One positive inserted");
            positivesCount++;
            System.out.println("Please insert a new positive int (or negative for exit)");
            num = in.nextInt();
        }

        System.out.println("A negative was inserted.");
        System.out.println("Positives total count: " + positivesCount);
    }
}
