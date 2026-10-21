package HashSetsAndHashMaps;


import java.util.HashMap;

public class AllPairsWithDiffK {

    /*
    All Pairs with Diff k

    Solved

    Difficulty: Easy
    Accuracy: 22.41%
    Submissions: 67K+
    Points: 2

    Given an array arr[] of positive integers. Find the number of
    pairs of integers whose absolute difference equals a given number k.

    Note:
    (a, b) and (b, a) are considered the same.
    Also, the same numbers at different indices are considered different.

    The answer is guaranteed to fit in a 32-bit integer.

    Examples:

    Input: arr[] = [1, 4, 1, 4, 5], k = 3
    Output: 4
    Explanation: There are 4 pairs with absolute difference 3.
    The pairs are {1, 4}, {1, 4}, {4, 1} and {1, 4}.

    Input: arr[] = [8, 16, 12, 16, 4, 0], k = 4
    Output: 5
    Explanation: There are 5 pairs with absolute difference 4.
    The pairs are {8, 12}, {8, 4}, {16, 12}, {12, 16}, {4, 0}.

    Constraints:
    1 <= arr.size() <= 2 * 10^5
    1 <= k <= 2 * 10^5
    0 <= arr[i] <= 10^5
    */

    static int countPairs(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int elem:arr)
        {
            if(!map.containsKey(elem)) map.put(elem,1);
            else map.put(elem,map.get(elem)+1);

        }
        int pairs=0;
        for(int elem:map.keySet())
        {
            int rem1=elem-k;
            int rem2=elem+k;
            //each numbers can form multiple pairs if same value is present mulitple times
            //ex :1
            if(map.containsKey(rem1)) pairs+=(map.get(elem)*map.get(rem1));
            if(map.containsKey(rem2)) pairs+=(map.get(elem)*map.get(rem2));

        }
        //(4,1) (1,4) will be counted twice
        return pairs/2;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 1, 4, 5};
        int k1 = 3;

        System.out.println("Example 1");
        System.out.println("Array: [1, 4, 1, 4, 5]");
        System.out.println("k = " + k1);
        System.out.println("Number of pairs: " + countPairs(arr1, k1));

        System.out.println();

        int[] arr2 = {8, 16, 12, 16, 4, 0};
        int k2 = 4;

        System.out.println("Example 2");
        System.out.println("Array: [8, 16, 12, 16, 4, 0]");
        System.out.println("k = " + k2);
        System.out.println("Number of pairs: " + countPairs(arr2, k2));
    }
}

