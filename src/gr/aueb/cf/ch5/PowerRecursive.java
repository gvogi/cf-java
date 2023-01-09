package gr.aueb.cf.ch5;

public class PowerRecursive {

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }

    public static int power(int a, int n) {
       /* if (n == 0) {
            return 1;
        }else {
            return a * power(a, n-1);
        }*/

        return (n == 0) ? 1 : a * power(a, n-1);
    }
}
