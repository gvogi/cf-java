package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {
    // Οταν το resource όπως ο scanner είναι auto closable
    // αλλιώς πρέπει να χρησιμοποιήσουμε finally
    // Δες το finally app

    public static void main(String[] args) {

        int num = 0;

        try   (Scanner in = new Scanner(System.in)) {
            num = in.nextInt();
            System.out.println(num);
        }catch (InputMismatchException e) {
            e.printStackTrace();
        }
//        finally {
//            try {
//                in.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

        System.out.println("It is not always executed!");
    }
}
