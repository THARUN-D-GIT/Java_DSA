package Heap;

import java.util.*;

public class SmallestRangeCoveringElementsFromKLists {

    // LC 632
    /*
    ou have k lists of sorted integers in non-decreasing order. Find the smallest range that includes at least one number from each of the k lists.

We define the range [a, b] is smaller than range [c, d] if b - a < d - c or a < c if b - a == d - c.



Example 1:

Input: nums = [[4,10,15,24,26],[0,9,12,20],[5,18,22,30]]
Output: [20,24]
Explanation:
List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
List 2: [0, 9, 12, 20], 20 is in range [20,24].
List 3: [5, 18, 22, 30], 22 is in range [20,24].
Example 2:

Input: nums = [[1,2,3],[1,2,3],[1,2,3]]
Output: [1,1]


Constraints:

nums.length == k
1 <= k <= 3500
1 <= nums[i].length <= 50
-105 <= nums[i][j] <= 105
nums[i] is sorted in non-decreasing order.
     */
    public class Triplet implements Comparable<Triplet> {
        int ele;
        int row;
        int col;

        Triplet(int ele, int row, int col) {
            this.ele = ele;
            this.row = row;
            this.col = col;
        }

        public int compareTo(Triplet t) {
            return this.ele - t.ele;
        }
    }

    public int[] smallestRange(List<List<Integer>> arr) {
        int k = arr.size();

        PriorityQueue<Triplet> pq = new PriorityQueue<>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            max = Math.max(max, arr.get(i).get(0));
            min = Math.min(min, arr.get(i).get(0));

            pq.add(new Triplet(arr.get(i).get(0), i, 0));
        }

        int[] ans = new int[2];

        int a = min;
        int b = max;

        while (true) {

            Triplet top = pq.remove();

            int ele = top.ele;
            int row = top.row;
            int col = top.col;

            if (max - ele < b - a) {
                a = ele;
                b = max;
            }

            if (col == arr.get(row).size() - 1)
                break;

            int next = arr.get(row).get(col + 1);

            max = Math.max(max, next);

            pq.add(new Triplet(next, row, col + 1));
        }

        ans[0] = a;
        ans[1] = b;

        return ans;
    }

    public static void main(String[] args) {

        SmallestRangeCoveringElementsFromKLists obj =
                new SmallestRangeCoveringElementsFromKLists();

        List<List<Integer>> arr1 = Arrays.asList(
                Arrays.asList(4, 10, 15, 24, 26),
                Arrays.asList(0, 9, 12, 20),
                Arrays.asList(5, 18, 22, 30)
        );

        int[] ans1 = obj.smallestRange(arr1);

        System.out.println("Example 1:");
        System.out.println("Range = [" + ans1[0] + ", " + ans1[1] + "]");


        List<List<Integer>> arr2 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 2, 3)
        );

        int[] ans2 = obj.smallestRange(arr2);

        System.out.println("\nExample 2:");
        System.out.println("Range = [" + ans2[0] + ", " + ans2[1] + "]");
    }
}
