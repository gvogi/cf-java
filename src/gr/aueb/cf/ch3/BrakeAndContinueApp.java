package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * What break and continue does.
 */
public class BrakeAndContinueApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i =1;
        int result = 0;



        while (true) {
            i++;
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        while (i <= 10) {
            i++;
            if (i == 5) continue;
            result +=i;
            System.out.println(i);
        }
    }
}
