package Heap;
import java.util.*;

public class KthLargestElement {
    static void main(String[] args) {
        /*
        LC-215
        Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?



Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4


Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104
         */
        int[] arr1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;

        int[] arr2 = {7, 10, 4, 3, 20, 15};
        int k2 = 4;

        int[] arr3 = {12, 3, 5, 7, 19, 1};
        int k3 = 2;

        int[] arr4 = {8, 6, 2, 9, 1, 5};
        int k4 = 5;

        int[] arr5 = {20, 10, 30, 5, 15, 25};
        int k5 = 1;


        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println(k1 + "th largest = " + findKthLargest(arr1, k1));

        System.out.println();

        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println(k2 + "th largest = " + findKthLargest(arr2, k2));

        System.out.println();

        System.out.println("Array 3: " + Arrays.toString(arr3));
        System.out.println(k3 + "th largest = " + findKthLargest(arr3, k3));

        System.out.println();

        System.out.println("Array 4: " + Arrays.toString(arr4));
        System.out.println(k4 + "th largest = " + findKthLargest(arr4, k4));

        System.out.println();

        System.out.println("Array 5: " + Arrays.toString(arr5));
        System.out.println(k5 + "th largest = " + findKthLargest(arr5, k5));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int elem:nums)
        {
            pq.add(elem);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
}
