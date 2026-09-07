package Heap;
import java.util.*;

public class KClosetElements {
    static void main(String[] args) {
        /*
        LC-658
        Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b


Example 1:

Input: arr = [1,2,3,4,5], k = 4, x = 3

Output: [1,2,3,4]

Example 2:

Input: arr = [1,1,2,3,4,5], k = 4, x = -1

Output: [1,1,2,3]



Constraints:

1 <= k <= arr.length
1 <= arr.length <= 104
arr is sorted in ascending order.
-104 <= arr[i], x <= 104
         */
        int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 4;
        int x1 = 3;

        System.out.println("Example 1:");
        System.out.println("Array = " + Arrays.toString(arr1));
        System.out.println("k = " + k1 + ", x = " + x1);
        System.out.println("K Closest Elements = " +
                findClosestElements(arr1, k1, x1));


        int[] arr2 = {1, 2, 3, 4, 5};
        int k2 = 4;
        int x2 = -1;

        System.out.println("\nExample 2:");
        System.out.println("Array = " + Arrays.toString(arr2));
        System.out.println("k = " + k2 + ", x = " + x2);
        System.out.println("K Closest Elements = " +
                findClosestElements(arr2, k2, x2));


        int[] arr3 = {1, 1, 1, 10, 10, 10};
        int k3 = 1;
        int x3 = 9;

        System.out.println("\nExample 3:");
        System.out.println("Array = " + Arrays.toString(arr3));
        System.out.println("k = " + k3 + ", x = " + x3);
        System.out.println("K Closest Elements = " +
                findClosestElements(arr3, k3, x3));
    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> {
                    int distA = Math.abs(a - x);
                    int distB = Math.abs(b - x);

                    if (distA != distB) {
                        return Integer.compare(distB, distA);
                    }

                    return Integer.compare(b, a);
                }
        );

        for (int num : arr) {
            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }

        Collections.sort(ans);

        return ans;
    }
}
