package gr.aueb.cf.ch6.MyTests;

public class ArrayMaxExerciseVisualization {

    public static void main(String[] args) {
//        int [] arr = {2, 5, 3, 8, 6, 4, 12, 9};
//        int maxPosition;
//        int maxPosition = 0;
//        int[] arr = {8, 3, 2, 5};
//        int[] arr = {1, 7, 3, 6, 9};
//        int[] arr = {50, 75, 10, 33, 12, 61, 13};

//        getMaxPosition(arr, 0, arr.length - 1);
        printMaxPosition ();
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = high;
        int maxValue;

        if ((low < 0) || (high > arr.length - 1)) {
            System.out.println("Wrong array dimensions");
            return -1;
        }

        maxValue = arr[high];
        System.out.printf("Max value %d\n", arr[high]);
        for (int i = high; i >= low; i--) {
            System.out.printf("i = %d\n", i);
            if (arr[i] > maxValue) {
                System.out.printf("%d > %d\n", arr[i], maxValue);
                maxPosition = i;
                System.out.printf("Max position %d\n", i);

                maxValue = arr[i];
                System.out.printf("Max value %d\n", arr[i]);

            }

        }


//        System.out.printf("Max position is %d: ", maxPosition + 1);
        return maxPosition;


    }

    public static void printMaxPosition (){
        int[] arr = {50, 75, 10, 33, 12, 61, 13};
        System.out.printf("Max position is %d: ", getMaxPosition(arr, 0, arr.length - 1) + 1);
    }
}
