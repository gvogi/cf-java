package gr.aueb.cf.ch6;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArrayCopyApp {

    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[] clone;

//        int[] arr2 = arr;
//        int[] arr3 = arr;

        int[] arrClone = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrClone[i] = arr[i];
        }

        arrClone = shallowCopy(arr);

        //Copy
        clone = Arrays.copyOf(arr, arr.length);

        // Truncate
        clone = Arrays.copyOf(arr, arr.length - 1);

        // Padding with zeros at RHS(Right Hand Side)
        clone = Arrays.copyOf(arr, arr.length + 1);

        System.arraycopy(arr, 0, clone, 0, arr.length);
    }

    public static int[] shallowCopy(int[] arr) {
        return arr;
    }

}
