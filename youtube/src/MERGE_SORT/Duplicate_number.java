package MERGE_SORT;

public class Duplicate_number {
    static void main(String[] args) {
        /*

        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.



Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3


Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more
         */
        int [] arr={3,1,3,4,2};
       int n= findDuplicate(arr);
        System.out.println(n);

    }
    public static int findDuplicate(int[] arr) {
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]==i+1) i++;
            else{
                int idx=arr[i]-1;
                if(arr[i]==arr[idx]) return arr[idx];
                else{
                    swap(arr,i,idx);
                }
            }
        }
        return 0;

    }
    public static void swap(int [] arr,int i,int idx)
    {
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}
