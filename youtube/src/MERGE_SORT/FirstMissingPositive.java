package MERGE_SORT;

import java.util.Scanner;

public class FirstMissingPositive {
    static void main(String[] args) {
        /*
        Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.



Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.


Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1


         */
        System.out.println("enter the element of the array and enter the size of the array first");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the first missing positive numbers in the array: "+firstMissingPositive(arr));
    }
    public  static int firstMissingPositive(int[] arr) {
        int i=0;
        int n=arr.length;
        while(i<n)
        {
            int idx=arr[i]-1;
            if(arr[i]<=0 || arr[i]>n || arr[i]==i+1 || arr[i]==arr[idx]) i++;
            else swap(arr,i,idx);
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1) return i+1;
        }

        return n+1;
    }
    public static void swap(int [] arr,int i,int idx)
    {
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}
