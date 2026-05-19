package Binary_Search;

public class Mountain_Array_or_peak_Element {
    static void main(String[] args) {
        /*
        You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.



Example 1:

Input: arr = [0,1,0]

Output: 1

Example 2:

Input: arr = [0,2,1,0]

Output: 1

Example 3:

Input: arr = [0,10,5,2]

Output: 1
         */
        int  [] arr={18,29,38,59,98,100,99,98,90};
        int n=arr.length,idx=-1;
        int lo=0,hi=n-1;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            {
                idx=mid;
                break;
            }
            else if(arr[mid]<arr[mid-1]){
                hi=mid-1;
            }
            else lo=mid+1;


        }
        System.out.println("the peak element and its index are:"+arr[idx]+" "+idx);
/*
in leetcode we can use this
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int low=0,high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]<arr[mid+1]) low=mid+1;
            else high=mid;
        }
        return low;

    }
}
 */
    }
}
