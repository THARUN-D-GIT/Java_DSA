package LC_Practice;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElementsII {

    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int low = 0, high = n - 1;

        int mid = nums[(low + high) / 2];

        long move = 0;

        for (int i = 0; i < n; i++) {
            move += Math.abs((long) mid - nums[i]);
        }

        return (int) move;
    }

    public static void main(String[] args) {
        /*
        LC-462
        Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

In one move, you can increment or decrement an element of the array by 1.

Test cases are designed so that the answer will fit in a 32-bit integer.



Example 1:

Input: nums = [1,2,3]
Output: 2
Explanation:
Only two moves are needed (remember each move increments or decrements one element):
[1,2,3]  =>  [2,2,3]  =>  [2,2,2]
Example 2:

Input: nums = [1,10,2,9]
Output: 16


Constraints:

n == nums.length
1 <= nums.length <= 105
-109 <= nums[i] <= 109
         */

        int[] nums1 = {1, 2, 3};
        System.out.println(minMoves2(nums1));  // 2

        int[] nums2 = {1, 10, 2, 9};
        System.out.println(minMoves2(nums2));  // 16

        int[] nums3 = {1, 0, 0, 8, 6};
        System.out.println(minMoves2(nums3));  // 14

        int[] nums4 = {5, 5, 5, 5};
        System.out.println(minMoves2(nums4));  // 0
    }
}
