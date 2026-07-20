package MERGE_SORT;
import java.util.*;

public class AllDisappeaingNumbers {
    static void main(String[] args) {
        /*
        Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.



Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]


Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
         */
        int [] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public  static ArrayList<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<arr.length)
        {
            int idx=arr[i]-1;
            if(arr[i]==i+1 || arr[idx]==arr[i]) i++;
            else{
                swap(arr,i,idx);;
            }
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            {
                ans.add(i+1);
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
