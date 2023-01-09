package gr.aueb.cf.ch6.MyTests;

/**
 * Returns the position of the max element in an array.
 */
public class ArrayMaxExercise2 {

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 8, 6, 4, 12, 9};
        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        System.out.printf("Max value: %d, Max Position: %d", maxValue, maxPosition + 1);
    }
}
