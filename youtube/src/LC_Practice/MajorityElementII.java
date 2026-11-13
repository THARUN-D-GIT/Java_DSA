package LC_Practice;


import java.util.*;

public class MajorityElementII {

    public static List<Integer> majorityElement(int[] nums) {

        int cnt = nums.length / 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int elem : map.keySet()) {
            if (map.get(elem) > cnt) {
                ans.add(elem);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        /*
        LC-229 Majority element 2
        Given an integer array of size n, find all elements that appear more than ⌊n / 3⌋ times.



Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]


Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
         */

        int[] nums1 = {3, 2, 3};
        int[] nums2 = {1, 1, 1, 3, 3, 2, 2, 2};
        int[] nums3 = {1, 2, 3, 4, 5};
        int[] nums4 = {1, 1, 2, 2, 3, 3};

        System.out.println("Example 1: " + majorityElement(nums1));
        System.out.println("Example 2: " + majorityElement(nums2));
        System.out.println("Example 3: " + majorityElement(nums3));
        System.out.println("Example 4: " + majorityElement(nums4));
    }
}
