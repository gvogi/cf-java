package gr.aueb.cf.ch6;

public class MinMaxApp {

    public static void main(String[] args) {

        int[] arr = {4, 8, 3, 9};
        int minPosition = 0;
        int maxPosition = 0;
        int minValue = arr[minPosition];
        int maxValue = arr[maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > minValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        System.out.printf("MinValue: %d, MinPosition: %d\n",
                minValue, (minPosition + 1));
        System.out.printf("MaxValue: %d, MaxPosition: %d",
                maxValue, (maxPosition + 1));
    }
}
