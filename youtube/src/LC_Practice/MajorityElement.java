package LC_Practice;


import java.util.*;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int cnt = nums.length / 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        int ans = 0;

        for (int elem : map.keySet()) {
            if (map.get(elem) > cnt) {
                ans = elem;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        /*
        Lc-169 Majority element
        Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
The input is generated such that a majority element will exist in the array.
         */

        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int[] nums3 = {1, 1, 1, 2, 3};
        int[] nums4 = {5, 5, 5, 5, 2, 3, 4};

        System.out.println("Example 1: " + majorityElement(nums1));
        System.out.println("Example 2: " + majorityElement(nums2));
        System.out.println("Example 3: " + majorityElement(nums3));
        System.out.println("Example 4: " + majorityElement(nums4));
    }
}

