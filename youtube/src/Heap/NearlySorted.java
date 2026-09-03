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
