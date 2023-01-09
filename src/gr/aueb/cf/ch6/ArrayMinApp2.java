package gr.aueb.cf.ch6;

public class ArrayMinApp2 {

    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 5};

        int minValue = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        System.out.printf("MinValue: %d, MinPosition: %d",
                minValue, (minPosition + 1));
    }
}
