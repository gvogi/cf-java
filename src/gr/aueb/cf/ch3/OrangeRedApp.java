package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * We have a plane with two fuel tanks.
 * pilot gives true in a console
 * if one of the tanks has < 1/4 fuel
 * and then it lights an orange indicator,
 * if we give two true values, a red.*/
public class OrangeRedApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean orangeOn = false;
        boolean redOn = false;
        boolean isTank1LTOneQuarter = false;
        boolean isTank2LTOneQuarter = false;

        System.out.println("Please insert if tank1/tank2 are less than 1/4 (true/false):");
        isTank1LTOneQuarter = in.nextBoolean();
        isTank2LTOneQuarter = in.nextBoolean();

        orangeOn = isTank1LTOneQuarter || isTank2LTOneQuarter;
        redOn = isTank1LTOneQuarter && isTank2LTOneQuarter;

        System.out.println("Orange on: " + orangeOn);
        System.out.println("Red on: " + redOn);
    }
}
