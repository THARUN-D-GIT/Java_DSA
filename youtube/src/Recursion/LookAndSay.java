package Recursion;

public class LookAndSay {
    static void main(String[] args) {
        /*
        The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the run-length encoding of countAndSay(n - 1).
Run-length encoding (RLE) is a string compression method that works by replacing each maximal group of consecutive identical characters with the concatenation of the length of the group followed by the character itself. For example, to compress the string "3322251" we replace "33" with "23", replace "222" with "32", replace "5" with "15", and replace "1" with "11". Thus the compressed string becomes "23321511".

Given a positive integer n, return the nth element of the count-and-say sequence.



Example 1:

Input: n = 4

Output: "1211"

Explanation:

countAndSay(1) = "1"
countAndSay(2) = RLE of "1" = "11"
countAndSay(3) = RLE of "11" = "21"
countAndSay(4) = RLE of "21" = "1211"
Example 2:

Input: n = 1

Output: "1"

Explanation:

This is the base case.
         */
        System.out.println(countAndSay(4));
        System.out.println(countAndSay2(4));
    }
    //using String Builder and loop
    public static  String countAndSay(int n) {

        String ans = "1";

        for (int i = 2; i <= n; i++) {

            StringBuilder temp = new StringBuilder();
            int count = 1;

            for (int j = 1; j < ans.length(); j++) {

                if (ans.charAt(j) == ans.charAt(j - 1)) {
                    count++;
                } else {
                    temp.append(count);
                    temp.append(ans.charAt(j - 1));
                    count = 1;
                }
            }

            // Append the last group
            temp.append(count);
            temp.append(ans.charAt(ans.length() - 1));

            ans = temp.toString();
        }

        return ans;
    }
    //using recursion
    public static  String countAndSay2(int n) {
        if (n == 1) {
            return "1";
        }

        String prev = countAndSay(n - 1);
        return generateNext(prev);
    }

    private static String generateNext(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                ans.append(count);
                ans.append(s.charAt(i - 1));
                count = 1;
            }
        }

        // Last group
        ans.append(count);
        ans.append(s.charAt(s.length() - 1));

        return ans.toString();
    }

}
