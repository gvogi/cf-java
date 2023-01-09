package gr.aueb.cf.ch6.MyTests;

public class GetLowHighIndexOfTest {
    static final int KEY = 8;
    static int low;
    static int high;
//    static int[] lowHighArr = {low, high};
//    static int[] lowHighArr;

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};

        printArr(getLowAndHighIndexOf(arr, KEY));

//        System.out.println();
//
//        printLowHighIndex();
    }



// sxolia
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int[] lowHighArr = {0, 0};
//        int[] lowHighArr = new int[2];
//        lowHighArr [0] = 0;
//        lowHighArr [1] = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.printf("i = %d\n", i);
            if (arr[i] == KEY) {
                low = i;
                lowHighArr[0] = low;
                System.out.printf("low = %d\n", low);
                for (int j = low; j <= arr.length - 1; j++) {
                    System.out.printf("j = %d\n", j);
                    if (arr[j] == KEY) {
                        high = j;
                        lowHighArr[1] = high;
                        System.out.printf("high = %d\n", high);
                    }
                }

                break;
            }
        }

        return lowHighArr;
    }

//    public static void printLowHighIndex() {
//        System.out.printf("For key %d in Array, low, high indexes are: %d, %d\n ", KEY,low ,high);
//    }

    public static void printArr(int[] lowHighArr) {
        for (int item : lowHighArr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}



