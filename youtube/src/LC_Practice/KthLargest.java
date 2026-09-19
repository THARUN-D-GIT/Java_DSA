package LC_Practice;

import java.util.*;

public class KthLargest {

    static class Solution {
        PriorityQueue<Integer> pq;
        int k; //global k

        public Solution(int k, int[] nums) {
            this.k = k; // initialising global k with local k
            pq = new PriorityQueue<>();

            for (int num : nums) {
                pq.add(num);

                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }

        public int add(int val) {
            pq.add(val);

            if (pq.size() > k) {
                pq.poll();
            }

            return pq.peek();
        }
    }

    public static void main(String[] args) {

        int k = 3;
        int[] nums = {4, 5, 8, 2};

        Solution obj = new Solution(k, nums);

        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));
        System.out.println(obj.add(4));

        System.out.println();

        k = 1;
        nums = new int[]{7};

        Solution obj2 = new Solution(k, nums);

        System.out.println(obj2.add(3));
        System.out.println(obj2.add(10));
        System.out.println(obj2.add(5));
    }
}