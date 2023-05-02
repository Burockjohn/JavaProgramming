package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int n1 = arr1.length; // 4
        int n2 = arr2.length; // 3

        int[] arr3 = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }

        while (i < n1) {
            arr3[k++] = arr1[i++];
        }

        while (j < n2) {
            arr3[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(arr3));


    }
}
