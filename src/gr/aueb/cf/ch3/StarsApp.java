package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User gives how many stars will get print out.
 */
public class StarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int i = 1;
//       int i = 0;

        System.out.println("Please insert number of stars:");
        n = in.nextInt();

        while (i <= n) {
            System.out.print("*");
            i++;
        }

//        while (i < n) {
//            System.out.print("*");
//            i++;
//        }

        System.out.println();
    }
}
