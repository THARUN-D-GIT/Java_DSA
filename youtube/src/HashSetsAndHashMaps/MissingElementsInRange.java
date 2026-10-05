package HashSetsAndHashMaps;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingElementsInRange {

    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }

        for (int i = low; i <= high; i++) {
            if (!(hs.contains(i))) {
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        /*
        Given an array arr[] of integers and a range [low, high], find all the numbers within the range that are not present in the array. return the missing numbers in sorted order.

Examples:

Input: arr[] = [10, 12, 11, 15], low = 10, high = 15
Output: [13, 14]
Explanation: Numbers 13 and 14 lie in the range [10, 15] but are not present in the array.
Input: arr[] = [1, 4, 11, 51, 15], low = 50, high = 55
Output: [50, 52, 53, 54, 55]
Explanation: Numbers 50, 52, 53, 54 and 55 lie in the range [50, 55] but are not present in the array.
Constraints:
1 ≤ arr.size(), low, high ≤ 105
1 ≤ arr[i] ≤ 105
edge elements of ranges are also included 2nd example is wrong

         */

        MissingElementsInRange obj = new MissingElementsInRange();

        // Example 1
        int[] arr1 = {10, 12, 11, 15};
        int low1 = 10;
        int high1 = 15;

        System.out.println("Example 1: " +
                obj.missingRange(arr1, low1, high1));


        // Example 2
        int[] arr2 = {1, 3, 5, 7};
        int low2 = 1;
        int high2 = 7;

        System.out.println("Example 2: " +
                obj.missingRange(arr2, low2, high2));


        // Example 3
        int[] arr3 = {2, 4, 6, 8, 10};
        int low3 = 1;
        int high3 = 10;

        System.out.println("Example 3: " +
                obj.missingRange(arr3, low3, high3));
    }
}