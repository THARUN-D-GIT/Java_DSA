package MERGE_SORT;

import java.util.Arrays;

public class CountSmallerOnLeft {

    static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    static int[] ans;

    public static int[] countSmallerOnLeft(int[] nums) {

        int n = nums.length;
        ans = new int[n];

        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i], i);
        }

        mergeSort(arr, 0, n - 1);

        return ans;
    }

    static void mergeSort(Pair[] arr, int lo, int hi) {

        if (lo >= hi)
            return;

        int mid = lo + (hi - lo) / 2;

        mergeSort(arr, lo, mid);
        mergeSort(arr, mid + 1, hi);

        merge(arr, lo, mid, hi);
    }

    static void merge(Pair[] arr, int lo, int mid, int hi) {

        Pair[] temp = new Pair[hi - lo + 1];

        int i = lo;
        int j = mid + 1;
        int k = 0;

        int leftSmaller = 0;

        while (i <= mid && j <= hi) {

            if (arr[i].value < arr[j].value) {
                temp[k++] = arr[i++];
                leftSmaller++;
            } else {
                ans[arr[j].index] += leftSmaller;
                temp[k++] = arr[j++];
            }
        }

        while (j <= hi) {
            ans[arr[j].index] += leftSmaller;
            temp[k++] = arr[j++];
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[lo + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int[] arr = {12, 1, 2, 3, 0, 11, 4};

        System.out.println(Arrays.toString(countSmallerOnLeft(arr)));
    }
}
