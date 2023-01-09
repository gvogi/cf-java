package gr.aueb.cf.ch3;

/**
 *  Calculates 1 + 2+ 3+....+ 10.
 */
public class Sum10App {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum += i; // or  sum = sum +i;
            i++;
        }

        System.out.println("sum = " + sum);
    }
}
