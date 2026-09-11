package Heap;
import java.util.*;

public class TopKFrequentElements {
    static void main(String[] args) {
        /*
        LC-347
        Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.



Example 1:

Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,2]

Example 2:

Input: nums = [1], k = 1

Output: [1]

Example 3:

Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2

Output: [1,2]



Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
         */
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;

        int[] result1 = topKFrequent(nums1, k1);

        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("k = " + k1);
        System.out.println("Top K Frequent Elements = " + Arrays.toString(result1));

        System.out.println();


        int[] nums2 = {1};
        int k2 = 1;

        int[] result2 = topKFrequent(nums2, k2);

        System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("k = " + k2);
        System.out.println("Top K Frequent Elements = " + Arrays.toString(result2));

        System.out.println();


        int[] nums3 = {4, 4, 4, 5, 5, 6, 6, 6, 6};
        int k3 = 2;

        int[] result3 = topKFrequent(nums3, k3);

        System.out.println("nums = " + Arrays.toString(nums3));
        System.out.println("k = " + k3);
        System.out.println("Top K Frequent Elements = " + Arrays.toString(result3));
    }
    static class Pair {
        int num;
        int freq;

        Pair(int num, int freq) {
            this.num = num;
            this.freq = freq;
        }

        // Custom comparator
        static class PairComparator implements Comparator<Pair> {
            public int compare(Pair a, Pair b) {
                return a.freq - b.freq;
            }
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> pq =
                new PriorityQueue<>(new Pair.PairComparator());

        for (int num : map.keySet()) {

            pq.add(new Pair(num, map.get(num)));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().num;
        }

        return ans;
    }
}
