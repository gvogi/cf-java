package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

        System.out.println("Please insert an int");
        inputStr = in.nextLine();

        if (isInt(inputStr)) {
            num = Integer.parseInt(inputStr);
            System.out.println("Input number: " + num);
        } else {
            System.out.println("Error in parsing");
        }
    }

    /**
     * Returns true if source string evaluates to integer
     *
     * @param str    input string
     * @return       true if it evaluates to int,
     *               false otherwise
     */
    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
