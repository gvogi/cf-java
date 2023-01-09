package gr.aueb.cf.ch3;

/**
 * Prints 10 rows with 10 stars each.
 **/
public class Stars10X10 {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i <= 10) {
            j = 1;
            while (j <= 10) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}