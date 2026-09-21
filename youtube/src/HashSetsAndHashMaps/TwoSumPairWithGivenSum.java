package HashSetsAndHashMaps;

import java.util.*;

public class TwoSumPairWithGivenSum {

    /*
    Two Sum - Pair with Given Sum

    Solved

    Difficulty: Easy
    Accuracy: 30.61%
    Submissions: 615K+
    Points: 2
    Average Time: 20m

    Given an array arr[] of integers and another integer target.
    Determine if there exist two distinct indices such that the
    sum of their elements is equal to the target.

    Examples:

    Input: arr[] = [0, -1, 2, -3, 1], target = -2
    Output: true
    Explanation: arr[3] + arr[4] = -3 + 1 = -2

    Input: arr[] = [1, -2, 1, 0, 5], target = 0
    Output: false
    Explanation: None of the pair makes a sum of 0

    Input: arr[] = [11], target = 11
    Output: false
    Explanation: No pair is possible as only one element is present in arr[]

    Constraints:

    -2 * 10^5 ≤ target ≤ 2 * 10^5
    1 ≤ arr.size() ≤ 10^5
    -10^5 ≤ arr[i] ≤ 10^5
    */

    public static boolean twoSum(int arr[], int target) {

        HashSet<Integer> hs = new HashSet<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int rem = target - arr[i];

            if (hs.contains(rem))
                return true;

            hs.add(arr[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr1 = {0, -1, 2, -3, 1};
        int target1 = -2;

        int[] arr2 = {1, -2, 1, 0, 5};
        int target2 = 0;

        int[] arr3 = {11};
        int target3 = 11;

        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Target: " + target1);
        System.out.println("Two Sum Exists: " + twoSum(arr1, target1));

        System.out.println();

        System.out.println("Input: " + Arrays.toString(arr2));
        System.out.println("Target: " + target2);
        System.out.println("Two Sum Exists: " + twoSum(arr2, target2));

        System.out.println();

        System.out.println("Input: " + Arrays.toString(arr3));
        System.out.println("Target: " + target3);
        System.out.println("Two Sum Exists: " + twoSum(arr3, target3));
    }
}
