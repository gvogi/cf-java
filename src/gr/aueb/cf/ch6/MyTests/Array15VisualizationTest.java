package gr.aueb.cf.ch6.MyTests;

public class Array15VisualizationTest {

    public static void main(String[] args) {
        int[][] arr = {{2,7,6}, {9,5,1}, {4,3,8}};

        System.out.printf("It is%s arr15\n", (isArr15(arr) ? "" : " not"));
    }

    public static boolean isArr15(int[][] arr) {
        int hCount = 0;
        int vCount = 0;
        int[] vSum = new  int[3];
        int[] hSum = new  int[3];
        boolean isDiagonal1 = false;
        boolean isDiagonal2 = false;

        if (arr == null) throw new RuntimeException();

        if ((arr[0][0] + arr[1][1] + arr[2][2]) == 15) isDiagonal1 = true;
        if ((arr[0][2] + arr[1][1] + arr[2][0]) == 15) isDiagonal2 = true;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("i %d\n", i);
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("j %d\n", j);
                hSum[i] += arr[i][j];
                System.out.printf("hSum[i] %s\n", hSum[i]);
            }
            System.out.println();

            vSum[0] += arr[i][0];
            System.out.printf("vSum[0] %s\n", vSum[0]);
            vSum[1] += arr[i][1];
            System.out.printf("vSum[1] %s\n", vSum[1]);
            vSum[2] += arr[i][2];
            System.out.printf("vSum[2] %s\n", vSum[2]);

            System.out.println();
        }

        for (int num : hSum) {
            if (num == 15) hCount++;
        }

        for (int num : vSum) {
            if (num == 15) vCount++;
        }

        return (isDiagonal1  && isDiagonal2 && (hCount == 3) && (vCount == 3));
    }
}
