package MERGE_SORT;

public class ReversePairs {
        static int count;

        public static int reversePairs(int[] nums) {
            count = 0;
            merge_sort(nums);
            return count;
        }

    static void main(String[] args) {
            int [] arr={1,4,5,6,2};
        System.out.println(reversePairs(arr));
    }

        public static void merge_sort(int[] arr) {

            if (arr.length <= 1)
                return;

            int mid = arr.length / 2;

            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];

            for (int i = 0; i < mid; i++)
                left[i] = arr[i];

            for (int i = mid; i < arr.length; i++)
                right[i - mid] = arr[i];

            merge_sort(left);
            merge_sort(right);

            inversion(left, right);

            merger(left, right, arr);
        }

        public static void inversion(int[] left, int[] right) {

            int i = 0;
            int j = 0;

            while (i < left.length && j < right.length) {

                if ((long) left[i] > 2L * right[j]) {
                    count += (left.length - i);
                    j++;
                } else {
                    i++;
                }
            }
        }

        public static void merger(int[] left, int[] right, int[] arr) {

            int i = 0, j = 0, k = 0;

            while (i < left.length && j < right.length) {

                if (left[i] <= right[j]) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }

            while (i < left.length)
                arr[k++] = left[i++];

            while (j < right.length)
                arr[k++] = right[j++];
        }
    }

