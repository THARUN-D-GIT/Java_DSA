package LC_Practice;


import java.util.HashMap;

public class FindLuckyInteger {

    public static int findLucky(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int ans = -1;

        for (int elem : map.keySet()) {

            if (elem == map.get(elem)) {
                if (elem > ans) {
                    ans = elem;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        /*
        LC-1394
        find lucky integer
        Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1.



Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
Example 3:

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.


Constraints:

1 <= arr.length <= 500
1 <= arr[i] <= 500
         */

        int[] arr1 = {2, 2, 3, 4};
        System.out.println(findLucky(arr1)); // 2

        int[] arr2 = {1, 2, 2, 3, 3, 3};
        System.out.println(findLucky(arr2)); // 3

        int[] arr3 = {2, 2, 2, 3, 3};
        System.out.println(findLucky(arr3)); // -1

        int[] arr4 = {5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6};
        System.out.println(findLucky(arr4)); // 5
    }
}

