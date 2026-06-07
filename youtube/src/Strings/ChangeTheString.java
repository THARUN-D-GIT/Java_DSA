package Strings;

public class ChangeTheString {
    static void main(String[] args) {
        /*
        Given a string s, the task is to change the complete string to uppercase or lowercase depending on the case of the first character.

Examples:

Input: s = "abCD"
Output: "abcd"
Explanation: The first letter (a) is lowercase. Hence, the complete string is made lowercase.
Input: s = "Abcd"
Output: "ABCD"
Explanation: The first letter (A) is uppercase. Hence, the complete string is made uppercase.
         */
        String s1="aBCd";
        String s2="AbCD";
        System.out.println(change(s1));
        System.out.println(change(s2));



    }
    public static String change(String s){
        if(!s.isEmpty() && Character.isLowerCase(s.charAt(0)))
            return s.toLowerCase();
       return s.toUpperCase();
    }

}
