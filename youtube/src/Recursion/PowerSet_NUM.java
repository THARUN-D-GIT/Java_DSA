package Recursion;
import java.util.*;

public class PowerSet_NUM {
    static void main(String[] args) {
        /*
        Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]


Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
         */
        int [] nums={1,2,4,5,3};

        List<List<Integer>> ans=new ArrayList<>();
        power(nums,0,new ArrayList<>(),ans);
        System.out.println("All possible subsets of this array are: ");
        System.out.println(ans);
        //total number of subsets should be 2^n where n is the siz of the array
        System.out.println(ans.size());
    }
    public static void power(int [] nums,int idx,List<Integer> current,List<List<Integer>> ans)
    {
        if(idx==nums.length){
            ans.add(new ArrayList<>(current));
            return;

        }
        //exclude curerent element
        power(nums,idx+1,current,ans);
        //adding element to current list
        current.add(nums[idx]);
        power(nums,idx+1,current,ans);
        // remove the element at last index because the there is a case present where it was not included so it should not be carried forward
        current.remove(current.size()-1);

//        power(nums,list,idx+1,)
    }
}
