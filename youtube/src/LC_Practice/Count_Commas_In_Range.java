package LC_Practice;

public class Count_Commas_In_Range {
    static void main(String[] args) {
        /*
        LC-3870
        You are given an integer n.

Return the total number of commas used when writing all integers from [1, n] (inclusive) in standard number formatting.

In standard formatting:

A comma is inserted after every three digits from the right.
Numbers with fewer than 4 digits contain no commas.


Example 1:

Input: n = 1002

Output: 3

Explanation:

The numbers "1,000", "1,001", and "1,002" each contain one comma, giving a total of 3.

Example 2:

Input: n = 998

Output: 0

Explanation:

All numbers from 1 to 998 have fewer than four digits. Therefore, no commas are used.



Constraints:

1 <= n <= 105
         */

        int[] testCases = {999, 1000, 1001, 1500, 9999, 10000, 50000};

        System.out.println("LC-3870: Count Commas");
        System.out.println("----------------------");

        for (int n : testCases) {
            int result = countCommas(n);
            System.out.println("n = " + n + " -> Commas = " + result);


        }
        /*
        POTD-8th SEP 2026
        LC-3870: Count Commas
----------------------
n = 999 -> Commas = 0
n = 1000 -> Commas = 1
n = 1001 -> Commas = 2
n = 1500 -> Commas = 501
n = 9999 -> Commas = 9000
n = 10000 -> Commas = 9001
n = 50000 -> Commas = 49001
         */
    }
        public static int countCommas ( int n){
            if (n < 1000) return 0;

            // return n-1000+1;
            return n - 999;
        }

}
