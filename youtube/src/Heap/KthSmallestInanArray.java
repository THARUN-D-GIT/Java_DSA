package Heap;
import java.util.*;

public class KthSmallestInanArray {
    static void main(String[] args) {
        /*
        Given an integer array arr[] and an integer k, find and return the kth smallest element in the given array.
Note: The kth smallest element is determined based on the sorted order of the array.

Examples :

Input: arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4
Output: 5
Explanation: 4th smallest element in the given array is 5.
Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output: 7
Explanation: 3rd smallest element in the given array is 7.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105
1 ≤ k ≤  arr.size()
         */
        int[] arr1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;

        int[] arr2 = {7, 10, 4, 3, 20, 15};
        int k2 = 4;

        int[] arr3 = {12, 3, 5, 7, 19, 1};
        int k3 = 2;

        int[] arr4 = {8, 6, 2, 9, 1, 5};
        int k4 = 5;

        int[] arr5 = {20, 10, 30, 5, 15, 25};
        int k5 = 1;


        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println(k1 + "th smallest = " + kthSmallest(arr1, k1));

        System.out.println();


        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println(k2 + "th smallest = " + kthSmallest(arr2, k2));

        System.out.println();


        System.out.println("Array 3: " + Arrays.toString(arr3));
        System.out.println(k3 + "th smallest = " + kthSmallest(arr3, k3));

        System.out.println();


        System.out.println("Array 4: " + Arrays.toString(arr4));
        System.out.println(k4 + "th smallest = " + kthSmallest(arr4, k4));

        System.out.println();


        System.out.println("Array 5: " + Arrays.toString(arr5));
        System.out.println(k5 + "th smallest = " + kthSmallest(arr5, k5));

    }
    public  static int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int elem:arr)
        {
            pq.add(elem);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
}
