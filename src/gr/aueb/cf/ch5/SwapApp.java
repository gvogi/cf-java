package gr.aueb.cf.ch5;

/**
 * Mutually exchange the values a, b.
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 2;
        int b = 10;

        swap(a, b);

        System.out.println("a =" + a + ", b =" + b);
    }

    /**
     * Mutually exchange the values a, b.
     *
     * @param a first value
     * @param b second value
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }


}
