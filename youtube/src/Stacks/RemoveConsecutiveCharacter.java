package Stacks;
import java.util.*;
public class RemoveConsecutiveCharacter {
    static void main(String[] args) {
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
