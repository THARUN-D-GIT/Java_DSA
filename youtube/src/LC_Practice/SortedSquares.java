package LC_Practice;

import java.util.Arrays;

public class SortedSquares {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int i = 0, j = n - 1;
        int k = ans.length - 1;

        while (i <= j) {
            int a = nums[i] * nums[i];
            int b = nums[j] * nums[j];

            if (a > b) {
                ans[k] = a;
                i++;
                k--;
            } else {
                ans[k] = b;
                j--;
                k--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] nums2 = {-7, -3, 2, 3, 11};
        int[] nums3 = {-5, -3, -2, -1};

        System.out.println(Arrays.toString(sortedSquares(nums1)));
        System.out.println(Arrays.toString(sortedSquares(nums2)));
        System.out.println(Arrays.toString(sortedSquares(nums3)));
    }
}
