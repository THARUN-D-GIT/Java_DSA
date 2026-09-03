package Heap;

import java.util.*;

class Solution {

    class Triplet implements Comparable<Triplet> {
        int dist;
        int x;
        int y;

        public Triplet(int dist, int x, int y) {
            this.dist = dist;
            this.x = x;
            this.y = y;
        }

        public int compareTo(Triplet t) {
            return Integer.compare(this.dist, t.dist);
        }
    }

    public int[][] kClosest(int[][] points, int k) {

        // k smallest -> max heap
        PriorityQueue<Triplet> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int[] point : points) {

            int x = point[0];
            int y = point[1];

            int dist = x * x + y * y;

            pq.add(new Triplet(dist, x, y));

            if (pq.size() > k)
                pq.poll();
        }

        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            Triplet t = pq.poll();

            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }

        return ans;
    }
}

public class KClosetPointToOrigin {

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[][] points1 = {
                {1, 3},
                {-2, 2},
                {5, 8},
                {0, 1}
        };

        int[][] points2 = {
                {3, 3},
                {5, -1},
                {-2, 4}
        };

        int k1 = 2;
        int k2 = 2;

        System.out.println("Before:");

        System.out.println(Arrays.deepToString(points1));
        System.out.println(Arrays.deepToString(points2));

        int[][] ans1 = sol.kClosest(points1, k1);
        int[][] ans2 = sol.kClosest(points2, k2);

        System.out.println("\nK Closest Points:");

        System.out.println(Arrays.deepToString(ans1));
        System.out.println(Arrays.deepToString(ans2));
    }
}