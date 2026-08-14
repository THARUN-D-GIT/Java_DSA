package Stacks;
import java.util.*;

public class BaeBallGame {
    static void main(String[] args) {
//        String [] s={"5","2","C","D","+"};
//        String [] s={"5","-2","4","C","D","9","+","+"};
        String [] s={"1","C"};
       int  ans= calPoints(s);
        System.out.println(ans);

    }
    public  static int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int n=operations.length;
        for(int  i=0;i<n;i++)
        {
            String s=operations[i];
            if(s.equals("C")) st.pop();
            else if(s.equals("D")) st.push(2*st.peek());
            else if(s.equals("+"))
            {
                int top=st.pop();
                int sum=top+st.peek();
                st.push(top);
                st.push(sum);
            }
            else st.push(Integer.parseInt(s));


        }
        int ans=0;
        while(!(st.isEmpty())) {
            ans+=st.pop();
        }
        return ans;

    }
}
