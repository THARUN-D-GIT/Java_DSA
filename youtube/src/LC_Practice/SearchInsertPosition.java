package LC_Practice;


public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int l = 0, h = nums.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) l = mid + 1;
            else h = mid - 1;
        }

        return l;
    }

    public static void main(String[] args) {
        /*
        LC-35 search insert position
        Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
         */
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5)); // 2
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2)); // 1
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7)); // 4
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 0)); // 0
    }
}

