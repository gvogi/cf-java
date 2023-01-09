package gr.aueb.cf.ch4;

/**
 * Prints 10 rows x 10 stars / each.
 */
public class StarsHV10App {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Η εξωτερική for ορίζει πόσες φορές θα τρέξει η εσωτερική.
// εξωτερική = σε πια γραμμή βρισκόμαστε  φτιάχνει τις στήλες
// εσωτερική = φτιάχνει τις γραμμές