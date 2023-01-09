package gr.aueb.cf.ch4;

/**
 * prints 10, 9, 8, ..., 1 stars
 */
public class StarsDesc10App {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
