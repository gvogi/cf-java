package gr.aueb.cf.ch4;

/**
 * 1 star 1 row
 * 2 stars 2nd row
 * .
 * .
 * 10 stars 10th row
 */
public class StarsAscApp {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
