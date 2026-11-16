package LC_Practice;


import java.util.Arrays;

public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int low = 0, high = n - 1;

        for (int i = 0; i < n; i++) {

            int a = nums[low] * nums[low];
            int b = nums[high] * nums[high];

            if (a > b) {
                ans[n - i - 1] = a;
                low++;
            } else {
                ans[n - 1 - i] = b;
                high--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        /*
        Lc-977 Square of sorted array
        Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
         */

        int[] nums1 = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums1)));

        int[] nums2 = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares(nums2)));

        int[] nums3 = {-5, -3, -2, -1};
        System.out.println(Arrays.toString(sortedSquares(nums3)));

        int[] nums4 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(sortedSquares(nums4)));
    }
}

