package gr.aueb.cf.ch6.Exercises.PartB;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Finds and prints the number of cars that were parked at the same time.
 *
 * @author GVogiatzis
 */
public class GetCarsParkedAtSameTime {
    static int[][] arr = {{1012, 1136}, {1317, 1417},
            {1015, 1020}};

    public static void main(String[] args) {

        System.out.println(findParkedAtSameTime(arriveDepartTimeArr()));
    }

    /**
     *          Creates a new [n][2] array with the arrivals or departures
     *          on one column and index 1 or 0 for arrival or departure
     *          on the other column and sorts it by time asc order
     *
     * @return  the new sorted array
     */
    public static int[][] arriveDepartTimeArr(){
        int x = arr.length * 2; // Row size of the new array to fit Arrival-departure time indexes 1, 0 ,
//        from given arrays of any row size
        int y = arr[0].length;// column size of the new array
        int k = 0;
        int d = 0;

        int[][] arriveDepartTimeArr = new int[x][y];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arriveDepartTimeArr[k][d] = arr[i][j];
                d++;
                if (j == 0) {
                    arr[i][j] = 1;
                    arriveDepartTimeArr[k][d] = arr[i][j];
                } else if (j == 1) {
                    arr[i][j] = 0;
                    arriveDepartTimeArr[k][d] = arr[i][j];
                }

                k++;
                d--;
            }
        }
// instead of writing a big sorting function, I found this method on stackoverflow and adjusted it.
        Arrays.sort(arriveDepartTimeArr, Comparator.comparingInt(arr -> arr[0]));

        return arriveDepartTimeArr;
    }

    /**
     *
     * @param arr  a sorted by time (Arrival/departure) asc array
     * @return     The number of parked cars at the same time
     */
    public static int findParkedAtSameTime(int[][] arr) {
        int count = 0;
        int tmp = 0;
        int sameTimeParked = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                    tmp = count;
                    if (tmp > sameTimeParked)
                        sameTimeParked = tmp;
                } else count = 0;
            }
        }

        return sameTimeParked;
    }
}
