package Binary_Search;

import java.util.Scanner;

public class Search_element_in_sorted_rotated_Array_2 {
    static void main(String[] args) {
        //Method 2
        /*
        check for the sorted part
        if left part is sorted then check for the element is smaller than the mid
        element if yes check in left part else in right part
        if right is  sorted do the oolta of left
        for checking for sort or not
        if arr[mid]>arr[lo] left is  sorted
        else right is sorted
         */
        Scanner sc=new Scanner(System.in);
        int [] arr={5,6,7,8,9,10,1,2,3};
        int n=arr.length;
        System.out.println("enter the target element:");
        int target=sc.nextInt();

        int lo=0,hi=n-1;int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }

            else if(arr[mid]>arr[lo])
            {
                //left part is sorted
                if(arr[mid]>target && arr[lo]<=target)
                {
                    hi=mid-1;
                }
                else lo=mid+1;
            }
            else{
                if(arr[mid]<target && arr[hi]>=target)
                {
                    lo=mid+1;
                }
                else hi=mid-1;

            }
        }
        System.out.println("target found at index:"+ans);
    }
}
