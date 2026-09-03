package Heap;
import java.util.*;

public class NearlySorted {
    public static void nearlySorted(int[] arr, int k) {

        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);

            if (pq.size() > k) {
                arr[idx] = pq.remove();
                idx++;
            }
        }

        while (!pq.isEmpty())
            arr[idx++] = pq.poll();
    }

    public static void main(String[] args) {
        /*
        Given an array arr[], where each element is at most k positions away from its correct position in the sorted order.
Your task is to restore the sorted order of arr[] by rearranging the elements in place.

Note: Don't use any sort() method.

Examples:

Input: arr[] = [2, 3, 1, 4], k = 2
Output: [1, 2, 3, 4]
Explanation: All elements are at most k = 2 positions away from their correct positions.
Element 1 moves from index 2 to 0
Element 2 moves from index 0 to 1
Element 3 moves from index 1 to 2
Element 4 stays at index 3
Input: arr[]= [7, 9, 14], k = 1
Output: [7, 9, 14]
Explanation: All elements are already stored in the sorted order.
Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ k < arr.size()
1 ≤ arr[i] ≤ 106


         */

        int[] arr1 = {2, 1, 3, 5, 4, 6, 7, 8};
        int k1 = 2;

        int[] arr2 = {6, 5, 3, 2, 8, 10, 9};
        int k2 = 3;

        System.out.println("Before:");
        for(int ele : arr1) System.out.print(ele+" ");
        System.out.println();
        for(int ele : arr2) System.out.print(ele+" ");
        System.out.println();


        nearlySorted(arr1, k1);
        nearlySorted(arr2, k2);

        System.out.println("\nAfter:");
        for(int ele : arr1) System.out.print(ele+" ");
        System.out.println();
        for(int ele : arr2) System.out.print(ele+" ");
        System.out.println();
    }
}
