package gr.aueb.cf.ch6.Exercises;

/**+
 * Finds the second smaller value of an array.
 */
public class NextToMinValueExercise {

    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 3, 12, 6, 9};

        bubbleSort(arr);
        printArray(arr);

        System.out.printf("The second smaller number in the array is %d: ", arr[arr.length - 2]);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp;

        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }

        System.out.println();
    }
}