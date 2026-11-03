package LC_Practice;
import java.util.*;

public class MinimumMovesToEqualArrayElements_3{
    public static int minMoves(int[] nums) {
        int moves = 0;

        Arrays.sort(nums);

        int n = nums.length - 1;
        int elem = nums[n];

        for (int i = 0; i < n; i++) {
            moves += Math.abs(elem - nums[i]);
        }

        return moves;
    }

    public static void main(String[] args) {
        /*
        LC-3736
        LC-POTD:03-11-2026
        You are given an integer array nums.

In one move, you may increase the value of any single element nums[i] by 1.

Return the minimum total number of moves required so that all elements in nums become equal.



Example 1:

Input: nums = [2,1,3]

Output: 3

Explanation:

To make all elements equal:

Increase nums[0] = 2 by 1 to make it 3.
Increase nums[1] = 1 by 1 to make it 2.
Increase nums[1] = 2 by 1 to make it 3.
Now, all elements of nums are equal to 3. The minimum total moves is 3.

Example 2:

Input: nums = [4,4,5]

Output: 2

Explanation:

To make all elements equal:

Increase nums[0] = 4 by 1 to make it 5.
Increase nums[1] = 4 by 1 to make it 5.
Now, all elements of nums are equal to 5. The minimum total moves is 2.



Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
         */

        int[] nums1 = {1, 2, 3};
        System.out.println("Minimum moves to equal nums1: " + minMoves(nums1));

        int[] nums2 = {1, 1, 1};
        System.out.println("Minimum moves to equal nums2: " + minMoves(nums2));

        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println("Minimum moves to equal nums3: " + minMoves(nums3));

        int[] nums4 = {5, 6, 8, 10};
        System.out.println("Minimum moves to equal nums4: " + minMoves(nums4));
    }
}
