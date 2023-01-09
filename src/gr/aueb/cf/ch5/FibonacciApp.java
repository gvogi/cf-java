package gr.aueb.cf.ch5;

public class FibonacciApp {

    public static void main(String[] args) {
        System.out.println(fibo(3));

    }

    public static int fibo(int n) {
        if (n < 0) {
            System.out.println("Invalid n");
            return -1;
        }

        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibo(n - 1) + fibo(n - 2);
    }
}
