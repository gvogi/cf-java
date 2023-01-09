package gr.aueb.cf.ch6.MyTests;

public class MaxInSameTimeSpaceParkedCarsTest {
    static int [][]arr = {{1012, 1136},
            {1317, 1417},
            {1015, 1020}};

    static int[][] hRow = new int[6][4];
    static int c = 0;
    static int d = 0;

    public static void main(String[] args) {



        printArr(InSameTimeSpaceParkedCars());


    }

public static int[][] InSameTimeSpaceParkedCars() {
    int[][] arr2 = new int[6][2];
    int[][] arr4 = new int[1][6];
//int[][] c = new int[6][2];
//    int c = 0;
//    int d = 0;


            for (int i = 0; i < arr.length; i++) {
                System.out.printf("arr[i] = %d\n", i);
                System.out.println();

                for (int j = 0; j < arr[i].length; j++) {
                    System.out.printf("arr[j] = %d\n", j);
                    System.out.println();
                    System.out.printf("Arr[i][j] = %d\n", arr[i][j]);

                    if (j == 0) {
                        System.out.printf("Arr[i][j] = %d\n", arr[i][j]);
//                        arr[j][i] = 1;
                          c = 1;
                        System.out.printf("c1 = %d\n", c);
//                        System.out.printf("Arr[i][j] = %d\n", arr[i][j]);
                    } else if (j == 1) {
                        System.out.printf("Arr[i][j] = %d\n", arr[i][j]);
//                        arr[j][i] = 0;
//                        hRow[d][c] = 0;
                                c = 0;
                        System.out.printf("c0 = %d\n", c);
//                        System.out.printf("Arr[i][j] = %d\n", arr[i][j]);
                    }
//                    arr2 = arr[i][j];
//                    hRow[d][c] = arr[d][c];
//                     arr[i][j] = hRow[d][c];
//                    System.out.printf("hRow[d][c] = %d\n", hRow[d][c]);
//                    System.out.printf("Arr[i][j] = %d\n", arr[i][j]);
//                    d++;

//                    System.out.printf("d = %d\n", d);

                    System.out.println();

                }

            }
//                printArr(hRow);
         return hRow;
//           return arr2;
        }

    public static void printArr(int[][] hRow) {
        for (int[] row : hRow) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }


}
