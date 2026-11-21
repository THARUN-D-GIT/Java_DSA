package HashSetsAndHashMaps;


import java.util.*;

class CountKDivPairs {

    public static int countKdivPairs(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int rem = arr[i] % k;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        int pairs = 0;

        // Check for zero remainders
        int zero = map.getOrDefault(0, 0);
        pairs += zero * (zero - 1) / 2;

        // Check for half remainders if k is even
        if (k % 2 == 0 && map.containsKey(k / 2)) {
            int halfcount = map.get(k / 2);
            pairs += halfcount * (halfcount - 1) / 2;
            map.remove(k / 2);
        }

        pairs *= 2;

        for (int elem : map.keySet()) {
            int rem = k - elem;

            if (map.containsKey(rem)) {
                pairs += map.get(elem) * map.get(rem);
            }
        }

        return pairs / 2;
    }

    public static void main(String[] args) {

        // Example 1
        int[] arr1 = {2, 2, 1, 7, 5, 3};
        int k1 = 4;
        System.out.println("Example 1: " + countKdivPairs(arr1, k1));

        // Example 2
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int k2 = 3;
        System.out.println("Example 2: " + countKdivPairs(arr2, k2));

        // Example 3
        int[] arr3 = {5, 10, 15, 20};
        int k3 = 5;
        System.out.println("Example 3: " + countKdivPairs(arr3, k3));

        // Example 4
        int[] arr4 = {1, 2, 3};
        int k4 = 7;
        System.out.println("Example 4: " + countKdivPairs(arr4, k4));
    }
}

