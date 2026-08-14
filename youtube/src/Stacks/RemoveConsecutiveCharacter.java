package Stacks;
import java.util.*;
public class RemoveConsecutiveCharacter {
    static void main(String[] args) {
        /*
        Given a string s, consisting of lowercase alphabets. Remove consecutive duplicate characters from the string.

Example:

Input: s = "aabb"
Output: "ab"
Explanation: The character 'a' at index 2 is the same as 'a' at index 1, so it is removed.Similarly, the character 'b' at index 4 is the same as 'b' at index 3, so it is removed. The final string is "ab".
Input: s = "aabaa"
Output: "aba"
Explanation: The character 'a' at index 2 is the same as 'a' at index 1, so it is removed. The character 'a' at index 5 is the same as 'a' at index 4, so it is removed. The final string is "aba".
Input: s = "aaaa"
Output: "a"
Explanation: "aaaa" => "aaa" => "aa" => "a"
Constraints:
1 ≤ n ≤ 106
All characters in the string are lowercase English alphabets.


         */
        String s="aaaaabbcccdaa";
        System.out.println(removeDuplicates(s));

    }
    public static String removeDuplicates(String s) {
        // code here
        int n=s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder ans =new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(st.isEmpty()) st.push(c);
            else{
                char top=st.peek();
                if(top!=c)  st.push(c);

            }
        }
        while(!(st.isEmpty()))
        {
            ans.append(st.pop());
        }
        ans.reverse();
        //   String ans2=ans.toString();
        //     return ans2; or
        return ans.toString();
    }
}
