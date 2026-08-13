package Stacks;

import java.util.Stack;

public class parenthesesChecker {
    static void main(String[] args) {
        String s="({[]})";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='{'||c=='['||c=='(')
            {
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                char top=st.peek();
                if(SameStyle(top,c))  { // top,c because top is at stack and we will
                    //will check if it is opening or not
                    st.pop();
                }
                else return false;
            }
        }
        return true;

    }
    public static  boolean SameStyle(char a,char b)
    {
        if((a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}')) return true;
        return false;
    }
}
