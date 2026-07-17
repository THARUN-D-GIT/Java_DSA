package MERGE_SORT;

import java.util.Arrays;

public class CyclicSort {
    /*
    only works when an array contains element from 0 to n-1 for n sized array

     */

    static void cyclicSort(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {

                // Swap
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;

            } else {

                i++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 1, 4};

        cyclicSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
