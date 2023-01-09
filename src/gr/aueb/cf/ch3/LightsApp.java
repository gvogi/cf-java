package gr.aueb.cf.ch3;


import java.util.Scanner;

/**
 * Decides if our car lights will light based on three variables
 * if it's raining, if it's dark or we are speeding(speed > 100)
 * This values are user input.
 */
public class LightsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MIN_VELOCITY = 100;
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int velocity = 0;
        boolean lightsOn = false;

        System.out.println("Please insert if it is raining (true/false), " +
        "if it is dark (true/false) and velocity (int):");

        isRaining = in.nextBoolean();
        isDark = in.nextBoolean();
        velocity = in.nextInt();

        isRunning = (velocity > MIN_VELOCITY);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights on: " + lightsOn);
    }
}
