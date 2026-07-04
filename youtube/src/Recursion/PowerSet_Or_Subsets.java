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
