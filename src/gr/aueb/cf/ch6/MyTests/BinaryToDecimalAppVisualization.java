package gr.aueb.cf.ch6.MyTests;

public class BinaryToDecimalAppVisualization {

    public static void main(String[] args) {
        int[] vector = {0, 0, 0, 0, 1, 1, 1, 0};
        int decimal = binaryToDecimal(vector);
        System.out.println("Value: " + decimal);
    }

    public static int binaryToDecimal(int[] binaryVector) {
        int decimal = 0; // sum
        int n;  // length

        if (binaryVector == null) {
            throw new IllegalArgumentException();
        }

        n = binaryVector.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.printf("i = %d\n", i);
            decimal = decimal + binaryVector[i] * (int) Math.pow(2, n - 1 - i);
//            System.out.printf("decimal = %d, binaryVector[i] = %d, Math.pow = %d \n", decimal, binaryVector[i], (int) Math.pow(2, n - 1 - i));
            System.out.printf("decimal %d = decimal %d + binaryVector[i] %d * Math.pow %d \n", decimal, decimal, binaryVector[i], (int) Math.pow(2, n - 1 - i));

        }
        return decimal;
    }
}
