package gr.aueb.cf.ch6;

public class ArrayMinApp {

    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 7, 99};

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        System.out.printf("Min value: %d, Min position: %d", minValue, (minPosition + 1));
    }
}
