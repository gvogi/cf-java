package gr.aueb.cf.ch6.MyTests;

import java.util.Arrays;
import java.util.Comparator;

public class CararkexSort {

   /* public static void main(String[] args) {
       int[][] arriveDepartParkedCarsArr =

    }*/

    public static void main(String[] args) {
        int[][] arr = {
                {1012, 1},
                {1136, 0},
                {1317, 1},
                {1417, 0},
                {1015, 1},
                {1020, 0}
        };
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        printTwoDimensionArray(arr);
        findParkedAtSameTime(arr);
    }

    public static void printTwoDimensionArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void findParkedAtSameTime(int[][] arr) {
        int sameTimeParked = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k][1] == 1) {
                sameTimeParked++;
            }else break;
        }
        System.out.printf("%d\n",sameTimeParked);
    }

}