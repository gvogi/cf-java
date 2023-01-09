package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Decides if it's snowing using two variables:
 * if it's raining and if temperature <0.
 */
public class BooleanDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        int temperature = 0;
        boolean isSnowing = false;

        System.out.println("Please insert if it's raining (true/false):");
        isRaining = in.nextBoolean();

        System.out.println("Please insert temperature (int)");
        temperature = in.nextInt();

        isSnowing = isRaining && (temperature <0);

        System.out.println("Is snowing " + isSnowing);
    }
}
