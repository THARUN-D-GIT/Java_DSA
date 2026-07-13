package MERGE_SORT;

public class ReversePairs {

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    static int mergeSort(int[] arr, int lo, int hi) {

        if (lo >= hi)
            return 0;

        int mid = lo + (hi - lo) / 2;

        int count = 0;

        count += mergeSort(arr, lo, mid);
        count += mergeSort(arr, mid + 1, hi);

        // Count reverse pairs
        int j = mid + 1;

        for (int i = lo; i <= mid; i++) {

            while (j <= hi && (long) arr[i] > 2L * arr[j]) {
                j++;
            }

            count += j - (mid + 1);
        }

        merge(arr, lo, mid, hi);

        return count;
    }

    static void merge(int[] arr, int lo, int mid, int hi) {

        int[] temp = new int[hi - lo + 1];

        int i = lo;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= hi) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= hi)
            temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++) {
            arr[lo + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 3, 1};

        ReversePairs obj = new ReversePairs();

        System.out.println(obj.reversePairs(arr));
    }
}
