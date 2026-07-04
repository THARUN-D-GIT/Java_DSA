package Recursion;
import java.util.*;

public class PowerSet_Or_Subsets {
    static void main(String[] args) {
        /*
           SKIP OR PICK RECURSION:
                    here we will have to scenario one
                    1.use recursion
                    2.skip recursion for the present element
                EXAMPLE:ADA SUBSET ,KNAPSACK USING BRANCH AND BOUND LIKE THAT
         */

        //PROBLEM STATEMENT
        /*
        You are given a string. You need to return the power-set (in any order) of the string.
Note: The string s contains lowercase letter of alphabet.

Examples:

Input: s = a
Output: ["","a"]
Explanation: empty string and "a" are only sets.
Input: s = abc
Output: ["", "a", "ab", "abc", "ac", "b", "bc", "c"]
Explanation: empty string, a, ab, abc, ac, b, bc, c are the sets.
Constraints:
1 ≤ s.length() ≤ 10
         */
        String s="abc";
        List<String> list=new ArrayList<>();

        subset("",s,0,list);
        Collections.sort(list);
        System.out.println(list);

    }
    public static void subset(String ans,String s,int idx, List<String> list)
    {
        if(idx==s.length()) {
           if(ans.length()!=1)  list.add(ans);
           return;
        }
            char ch=s.charAt(idx);
            subset(ans+ch,s,idx+1,list); //pick
            subset(ans,s,idx+1,list);
    }
}
