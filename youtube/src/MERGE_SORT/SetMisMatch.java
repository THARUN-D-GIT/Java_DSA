package MERGE_SORT;

public class SetMisMatch {
    static void main(String[] args) {
        /*
        You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.



Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]


Constraints:

2 <= nums.length <= 104
1 <= nums[i] <= 104

         */
        int [] arr={1,2,2,4};
        int [] ans= findErrorNums(arr);
        for(int elem:ans) System.out.print(elem+" ");

    }
    public  static int[] findErrorNums(int[] arr) {
        int i=0;
        int [] ans=new int[2];
        while(i<arr.length)
        {
            int idx=arr[i]-1;
            if(arr[i]==i+1 || arr[idx]==arr[i]) i++;
            else swap(arr,i,idx);
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            {
                ans[0]=arr[i];
                ans[1]=i+1;
            }
        }
        return ans;

    }
    public static void swap(int [] arr,int i,int idx)
    {
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}
