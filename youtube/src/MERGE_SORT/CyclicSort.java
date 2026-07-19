package MERGE_SORT;

import java.util.Arrays;

public class CyclicSort {
    /*
    only works when an array contains elements from 0 to n-1 for n sized array
    steps:
    -> check the element at current index; if it equals idx, i++
    else:
    -> find the correct home position for arr[i] (which is arr[i] itself)
    -> swap arr[i] with arr[idx]
     */
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 6, 8, 2, 1, 7, 0};   // valid: 0..8, each exactly once
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        cycle_sort(arr);
        System.out.println("array after sorting");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void cycle_sort(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int idx = arr[i];
            if (arr[i] == i) {
                i++;
            } else if (arr[i] == arr[idx]) {
                // duplicate safeguard: avoids infinite loop if value already at home
                i++;
            } else {
                swap(arr, i, idx);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}