package LC_Practice;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        /*
        LC-33
        There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1


Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104
         */

        int[] arr1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;

        int[] arr2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;

        int[] arr3 = {6, 7, 8, 1, 2, 3, 4, 5};
        int target3 = 5;

        int[] arr4 = {1};
        int target4 = 1;

        int[] arr5 = {1};
        int target5 = 0;

        System.out.println("Test Case 1:");
        System.out.println("Array: [4, 5, 6, 7, 0, 1, 2]");
        System.out.println("Target: " + target1);
        System.out.println("Index: " + search(arr1, target1));

        System.out.println("\nTest Case 2:");
        System.out.println("Array: [4, 5, 6, 7, 0, 1, 2]");
        System.out.println("Target: " + target2);
        System.out.println("Index: " + search(arr2, target2));

        System.out.println("\nTest Case 3:");
        System.out.println("Array: [6, 7, 8, 1, 2, 3, 4, 5]");
        System.out.println("Target: " + target3);
        System.out.println("Index: " + search(arr3, target3));

        System.out.println("\nTest Case 4:");
        System.out.println("Array: [1]");
        System.out.println("Target: " + target4);
        System.out.println("Index: " + search(arr4, target4));

        System.out.println("\nTest Case 5:");
        System.out.println("Array: [1]");
        System.out.println("Target: " + target5);
        System.out.println("Index: " + search(arr5, target5));
    }
    public static  int search(int[] arr, int target) {

        // int idx=-1;
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]==target) idx=i;
        // }
        // return idx;

        //O(logn)
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==target) return mid;
            //left half is sorted
            if(arr[left]<=arr[mid])
            {
                if(arr[left]<=target &&target<arr[mid])right=mid-1;
                else left=mid+1;
            }
            //right half is sorted
            else{
                if(arr[mid]<target && target<=arr[right]) left=mid+1;
                else right=mid-1;
            }
        }
        return -1;
    }
}
