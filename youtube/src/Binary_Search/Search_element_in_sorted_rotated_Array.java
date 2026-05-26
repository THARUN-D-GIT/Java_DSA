package Binary_Search;

import java.util.Scanner;

public class Search_element_in_sorted_rotated_Array {
    static void main(String[] args) {
        /*
        Given a sorted and rotated array A of N distinct elements which
        are rotated at some point, and given an element K.
         The task is to find the index of the given element K in array A.

Example 1:

Input:
N = 9
A[] = {5,6,7,8,9,10,1,2,3}
K = 10

Output:
5

Explanation:
10 is found at index 5.

Example 2:

Input:
N = 3
A[] = {3,1,2}
K = 1

Output:
1

User Task:

Complete Search() function and return the index of the element K
 if found in the array. If the element is not present, then return -1.
         */
        //Method 1 :finding pivot element and applying Bin srch 2 times
        int [] arr={5,6,7,8,9,10,1,2,3};

        Scanner sc=new Scanner(System.in);

        int n=arr.length;

        int lo=0,hi=n-1;

// FIND PIVOT
        while(lo < hi)
        {
            int mid=lo+(hi-lo)/2;

            if(arr[mid] > arr[hi]){
                lo=mid+1;
            }
            else{
                hi=mid;
            }
        }

        int pivot=lo;

        System.out.println("enter the target element");

        int target=sc.nextInt();

        int ans=-1;

// SEARCH LEFT PART
        if(target >= arr[0] && target <= arr[pivot-1])
        {
            lo=0;
            hi=pivot-1;

            while(lo<=hi)
            {
                int mid=lo+(hi-lo)/2;

                if(arr[mid] > target)
                    hi=mid-1;

                else if(arr[mid] < target)
                    lo=mid+1;

                else{
                    ans=mid;
                    break;
                }
            }
        }

// SEARCH RIGHT PART
        else
        {
            lo=pivot;
            hi=n-1;

            while(lo<=hi)
            {
                int mid=lo+(hi-lo)/2;

                if(arr[mid] > target)
                    hi=mid-1;

                else if(arr[mid] < target)
                    lo=mid+1;

                else{
                    ans=mid;
                    break;
                }
            }
        }

        System.out.println("target element at index: "+ans);
    }
}
