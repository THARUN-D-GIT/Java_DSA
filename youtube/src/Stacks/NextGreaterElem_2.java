package Stacks;
import java.util.Stack;

public class NextGreaterElem_2 {
    static void main(String[] args) {
        /*
        LC-503
Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.



Example 1:

Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2;
The number 2 can't find next greater number.
The second 1's next greater number needs to search circularly, which is also 2.
Example 2:

Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]


Constraints:

1 <= nums.length <= 104
-109 <= nums[i] <= 109


         */
        int[]  nums={1,2,3,4,3};
        for(int elem:nums) System.out.print(elem+" ");
        System.out.println();
        int [] ans=nextGreaterElements(nums);
        for(int elem:ans) System.out.print(elem+" ");
    }
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int [] nge=new int [n];
        for(int i=n-1;i>=0;i--) st.push(nums[i]);
        for(int i=n-1;i>=0;i--)
        {
            while(st.size()>0 && nums[i]>=st.peek()) st.pop();
            if(st.size()==0) nge[i]=-1;
            else nge[i]=st.peek();
            st.push(nums[i]);
        }
        return nge;
    }
}
