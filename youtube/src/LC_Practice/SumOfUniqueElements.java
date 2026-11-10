package LC_Practice;


import java.util.*;

class SumOfUniqueElements {

    public static int sumOfUnique(int[] nums) {
        int [] freq=new int [101];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        int sum=0;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]==1) sum+=i;
        }
        return sum;

    }

    public static void main(String[] args) {
        /*
        LC-1748
        ou are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.



Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.


Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
         */

        // Test Case 1
        int[] nums1 = {1, 2, 3, 2};
        System.out.println("Test Case 1: " + sumOfUnique(nums1));

        // Test Case 2
        int[] nums2 = {1, 1, 1, 1, 1};
        System.out.println("Test Case 2: " + sumOfUnique(nums2));

        // Test Case 3
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 3: " + sumOfUnique(nums3));

        // Test Case 4
        int[] nums4 = {10, 6, 6, 7, 8, 10};
        System.out.println("Test Case 4: " + sumOfUnique(nums4));
    }
}

