package Binary_Search;

public class Kth_missing_element {
    static void main(String[] args) {
        /*
        Kth Missing Positive Number in a Sorted Array
Difficulty: MediumAccuracy: 53.02%Submissions: 55K+Points: 4
Given a sorted array of distinct positive integers arr[], You need to find the kth positive number that is missing from the arr[].

Examples:

Input: arr[] = [2, 3, 4, 7, 11], k = 5
Output: 9
Explanation: Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.
Input: arr[] = [1, 2, 3], k = 2
Output: 5
Explanation: Missing are 4, 5, 6… and 2nd missing number is 5.
Input: arr[] = [3, 5, 9, 10, 11, 12], k = 2
Output: 2
Explanation: Missing are 1, 2, 4, 6… and 2nd missing number is 2.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ k ≤ 105
1 ≤ arr[i] ≤ 106
         */
        int [] arr={1,2,3};
        int k=2;
        int i = kthMissing(  arr, k);
        System.out.println(i);

    }
    public static int kthMissing(int[] arr, int k) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low + k;
    }
}
