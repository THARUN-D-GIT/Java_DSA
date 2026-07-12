package MERGE_SORT;

public class InversionCount {

    public static long inversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    static long mergeSort(int[] arr, int lo, int hi) {

        if (lo >= hi)
            return 0;

        int mid = lo + (hi - lo) / 2;

        long count = 0;

        count += mergeSort(arr, lo, mid);
        count += mergeSort(arr, mid + 1, hi);
        count += merge(arr, lo, mid, hi);

        return count;
    }

    static long merge(int[] arr, int lo, int mid, int hi) {

        int[] temp = new int[hi - lo + 1];

        int i = lo;
        int j = mid + 1;
        int k = 0;

        long count = 0;

        while (i <= mid && j <= hi) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= hi) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[lo + x] = temp[x];
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {8, 4, 2, 1};

        long ans = inversionCount(arr);

        System.out.println("Inversion Count = " + ans);
    }
}
