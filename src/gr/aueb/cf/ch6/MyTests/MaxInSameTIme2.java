package gr.aueb.cf.ch6.MyTests;

public class MaxInSameTIme2 {

        static int [][]arr = {{1012, 1136},
                {1317, 1417},
                {1015, 1020}};

        static int[] hRow = new int[2];
        static int[] vRow = new int [6];
        static int c = 0;
        static int d = 0;

        public static void main(String[] args) {



            printArr(InSameTimeSpaceParkedCars());


        }

        public static int[][] InSameTimeSpaceParkedCars() {


//    int d = 0;
            int[][] hvRow = new int [hRow[d]][vRow[c]];

            for (int i = 0; i < arr.length; i++) {
                System.out.printf("arr[i] = %d\n", i);
                System.out.println();
//                if (i == 0) {
////                        arriveDepart = 0;
////                        c = arriveDepart;
////                        arr[0][j] = 1;
//                    c = 0;
//                    System.out.printf("c0 = %d\n", c);
////                        return c;
//                }

                for (int j = 0; j < arr.length - 1; j++) {
                    System.out.printf("arr[j] = %d\n", j);
                    System.out.println();
//                    if (j == 0) {
////                        arriveDepart = 1;
////                        c = arriveDepart;
//                        arr[i][0] = 1;
//                        c = 1;
//                        System.out.printf("c1 = %d\n", c);
//                    }
//                     else if (i == 0) {
////                        arriveDepart = 0;
////                        c = arriveDepart;
////                        arr[0][j] = 1;
//                        c = 0;
//                        System.out.printf("c0 = %d\n", c);
////                        return c;
//                    }
                    hRow[d] = arr[i][j];
                    System.out.printf("hRow[d] = %d\n", hRow[d]);
                    System.out.println();
                    vRow[c] = arr[i][j];
//                    d++;
//                    c++;
//                    System.out.printf("d = %d\n", d);
//                    System.out.printf("c = %d\n", c);
                    System.out.println();

//                    vRow[0] = 1;
//                    vRow[1] = 0;
//                    vRow[2] = 1;
//                    vRow[3] = 0;
//                    vRow[4] = 1;
//                    vRow[5] = 0;
//                    vRow[c] = arr[i][j];


                    System.out.printf("vRow[c] = %d\n", vRow[c]);
                    printArr(hvRow);
//                    c++;

                }

            }

            return hvRow;
        }

        public static void printArr(int[][] hvRow) {
            for (int[] row : hvRow) {
                for (int column : row) {
                    System.out.print(column + " ");
                }
                System.out.println();
            }
        }





}
