package Stacks;

import java.util.Stack;

public class parenthesesChecker {
    static void main(String[] args) {
        String s="({[]})";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {
        int n=s.length();
        if(n%2==1) return false;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++)
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
        return (st.size()==0);
        // is ame as if size==0 true else false

    }
    public static  boolean SameStyle(char a,char b)
    {
        if((a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}')) return true;
        return false;
    }
}
