package HashSetsAndHashMaps;

import java.util.*;

public class CountDistinctInArray {

    /*
    Count Distinct in Array

    Difficulty: Easy
    Accuracy: 73.07%
    Submissions: 32K+
    Points: 2

    Given an integer array arr[], return the count of all the
    distinct elements in an array.

    Examples:

    Input: arr[] = [2, 2, 3, 2]
    Output: 2
    Explanation: Distinct elements are {2, 3}

    Input: arr[] = [12, 1, 14, 3, 16]
    Output: 5
    Explanation: Distinct elements are {12, 1, 14, 3, 16}

    Input: arr[] = [1, 1, 1, 1]
    Output: 1
    Explanation: Only one distinct element {1}

    Constraints:

    1 ≤ arr.size() ≤ 10^5
    -10^5 ≤ arr[i] ≤ 10^5
    */

    public static int countDistinct(int arr[]) {

        int n = arr.length;

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }

        return hs.size();


        /*
        // Using ArrayList

        // Gives TLE error

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!(ans.contains(arr[i])))
                ans.add(arr[i]);
            else
                continue;
        }

        return ans.size();
        */
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 2, 3, 2};
        int[] arr2 = {12, 1, 14, 3, 16};
        int[] arr3 = {1, 1, 1, 1};

        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Distinct Count: " + countDistinct(arr1));

        System.out.println();

        System.out.println("Input: " + Arrays.toString(arr2));
        System.out.println("Distinct Count: " + countDistinct(arr2));

        System.out.println();

        System.out.println("Input: " + Arrays.toString(arr3));
        System.out.println("Distinct Count: " + countDistinct(arr3));
    }
}
