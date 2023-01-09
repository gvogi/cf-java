package gr.aueb.cf.ch6.Exercises;

/**
 * Returns the position of the max element in an array.
 */
public class ArrayMaxExercise {

    public static void main(String[] args) {

        printMaxPosition ();
    }

    public static void printMaxPosition (){
        int[] arr = {50, 75, 10, 33, 12, 61, 13};
        System.out.printf("Max position is %d: ", getMaxPosition(arr, 0, arr.length - 1) + 1);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = high;
        int maxValue;

        if ((low < 0) || (high > arr.length - 1)) {
            System.out.println("Wrong array dimensions");
            return -1;
        }

        maxValue = arr[high];
        for (int i = high; i >= low; i--) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;
    }
}
