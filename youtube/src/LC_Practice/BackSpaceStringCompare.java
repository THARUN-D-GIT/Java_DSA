package LC_Practice;
import java.util.*;

public class BackSpaceStringCompare {
    static void main(String[] args) {
        /*
        LC-844
        Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.



Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".


Constraints:

1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.


Follow up: Can you solve it in O(n) time and O(1) space?
         */
        String s1 = "ab#c";
        String t1 = "ad#c";

        String s2 = "ab##";
        String t2 = "c#d#";

        String s3 = "a#c";
        String t3 = "b";

        String s4 = "a##c";
        String t4 = "#a#c";

        System.out.println("Test Case 1:");
        System.out.println("s = \"" + s1 + "\", t = \"" + t1 + "\"");
        System.out.println("Output: " + backspaceCompare(s1, t1));

        System.out.println("\nTest Case 2:");
        System.out.println("s = \"" + s2 + "\", t = \"" + t2 + "\"");
        System.out.println("Output: " + backspaceCompare(s2, t2));

        System.out.println("\nTest Case 3:");
        System.out.println("s = \"" + s3 + "\", t = \"" + t3 + "\"");
        System.out.println("Output: " + backspaceCompare(s3, t3));

        System.out.println("\nTest Case 4:");
        System.out.println("s = \"" + s4 + "\", t = \"" + t4 + "\"");
        System.out.println("Output: " + backspaceCompare(s4, t4));
    }
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!='#') st1.push(ch);
            else if(st1.size()>0) st1.pop();
        }
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(ch!='#') st2.push(ch);
            else if(st2.size()>0)  st2.pop();
        }
        while(st1.size()>0 && st2.size()>0)
        {
            if(st1.pop()!=st2.pop()) return false;
        }
        return st1.size()==st2.size(); // to check if both are empty or not
    }

}
