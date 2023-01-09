package gr.aueb.cf.ch6.MyTests;

public class NextToMinVisualizationTest {

    public static void main(String[] args) {
//        int[] arr = {5, 7, 1, 3, 12, 6, 9};
        int[] arr = {50, 75, 10, 33, 12, 61, 13};

        bubbleSort(arr);
//        printArray(arr);
        System.out.printf("The second smaller number in the array is %d: ", arr[arr.length - 2]);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf("i = %d\n", i);
            System.out.print("arr = ");
            printArray(arr);
            for (int j = 0; j < arr.length - 1; j++) {
                System.out.printf("j = %d \n", j);
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                    System.out.print("subarr j = ");
                    printArray(arr);
                }
            }
            System.out.print("arr = ");
            printArray(arr);
            System.out.println();
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp;

        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        System.out.printf("Swap! (tmp = %d, arr[i] = %d, arr[j] = %d)\n", tmp, arr[i], arr[j] );
        System.out.print("subarr j = ");
        printArray(arr);
        System.out.println();
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }

        System.out.println();
    }
}
