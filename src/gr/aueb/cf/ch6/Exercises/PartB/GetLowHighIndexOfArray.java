package gr.aueb.cf.ch6.Exercises.PartB;

/**
 * Returns an array with low & high indexes,
 * of an array value of choice, from a given array.
 */
public class GetLowHighIndexOfArray {
    static final int KEY = 8;
    static int low;
    static int high;

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
//        int[] arr = new int[] {1,2,4,4,4,4};

        printArr(getLowAndHighIndexOf(arr, KEY));
    }

    /**
     *
     * @param arr    The given array
     * @param KEY    The array value we want the low, high indexes
     * @return       An Array with the indexes
     */
    public static int[] getLowAndHighIndexOf (int[] arr, int KEY){
        int[] lowHighArr = {0, 0};

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == KEY) {
                low = i;
                lowHighArr[0] = low;
            for (int j = low; j <= arr.length - 1; j++) {
                if (arr[j] == KEY) {
                    high = j;
                    lowHighArr[1] = high;
                }
            }

            break;
            }
        }

        return lowHighArr;
    }

    public static void printArr ( int[] lowHighArr){
        for (int item : lowHighArr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}