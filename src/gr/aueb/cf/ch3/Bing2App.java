package gr.aueb.cf.ch3;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

/**
 * Guesses a key num and get a bingo.
 *with a While - do - break
 */
public class Bing2App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int KEY = 10;
        int num = 0;
//        boolean keyIsFound = false;

        while (true) {
            System.out.println("Please guess the key!:");
            num = in.nextInt();

            if (num == KEY) {
//                keyIsFound = true;
                break;
            }else {
                System.out.println("Please try again");
            }
        }

        System.out.println("Congratulations for finding the key!");
    }
}
