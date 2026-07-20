package MERGE_SORT;
import java.util.*;

public class ArrayDuplicates {
    static void main(String[] args) {
        /*
        Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.

Note: You can return the elements in any order but the driver code will print them in sorted order.

Examples:

Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3]
Explanation: 2 and 3 occur more than once in the given array.
Input: arr[] = [3, 1, 2]
Output: []
Explanation: There is no repeating element in the array, so the output is empty.
Constraints:
1 ≤ n ≤ 106
1 ≤ arr[i] ≤ n


         */
        int [] arr={2, 3, 1, 2, 3};
        System.out.println (findDuplicates(arr));
    }
    public  static ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        while(i<arr.length)
        {
            int idx=arr[i]-1;
            if(arr[i]==i+1 || arr[idx]==arr[i]) i++;
            else{
                swap(arr,i,idx);
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1) ans.add(arr[i]);
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
