package Strings;

public class LongestCommonPrefix {
    static void main(String[] args) {
        /*
        basically the aim is to find the longest common string among given string array elements
        Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
         */
        String [] arr={ "flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        int n=s.length();
        String s1="";
        int i=0,j=0;
        for(i=0;i<n;i++)
        {
            for( j=0;j<strs.length;j++)
            {
                if(i>strs[j].length()-1) return s1;
                else if(s.charAt(i)!=strs[j].charAt(i))
                    return s1;

            }
            s1+=s.charAt(i);
        }
        return s1;
    }
}
