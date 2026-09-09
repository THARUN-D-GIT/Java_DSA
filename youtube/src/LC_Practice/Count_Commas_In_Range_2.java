package LC_Practice;

public class Count_Commas_In_Range_2 {
    static void main(String[] args) {
        /*
        POTD-9th SEP 2026
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

​​​​​​​All numbers from 1 to 998 have fewer than four digits. Therefore, no commas are used.



Constraints:

1 <= n <= 1015
         */
        long[] testCases = {
                999,
                1000,
                1002,
                999999,
                1000000,
                1409752114L,
                1000000000L,
                1000000000000L,
                1000000000000000L
        };

        for (long n : testCases) {
            System.out.println(
                    "n = " + n + " → commas = " + countCommas(n)
            );
        }
    }

    public static long countCommas(long n) {
        long ans = 0;

        if (n < 1000) {
            return 0;
        }

        else if (n <= 999999) {
            ans += n - 999;
        }

        else if (n <= 999999999) {
            ans += 999000;
            ans += 2 * (n - 999999);
        }

        else if (n <= 999999999999L) {
            ans += 999000;
            ans += 1998000000L;
            ans += 3 * (n - 999999999L);
        }

        else if (n <= 999999999999999L) {
            ans += 999000;
            ans += 1998000000L;
            ans += 2997000000000L;
            ans += 4 * (n - 999999999999L);
        }

        else {
            ans += 999000;
            ans += 1998000000L;
            ans += 2997000000000L;
            ans += 3996000000000000L;
            ans += 5 * (n - 999999999999999L);
        }

        return ans;
    }
}
