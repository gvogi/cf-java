package gr.aueb.cf.ch3;

public class StarsDescApp {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i <= 10) {
            j = 10;
            while (j >= i) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}

//Second solution:

//    int i = 1;
//    int j = 1;
//
//        while (i <= 10) {
//                j = i;
//                while (j <= 10) {
//                System.out.print("*");
//                j++;
//                }
//                System.out.println();
//                i++;