package Recursion;

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
        subset("",s,0);  // ans="" empty string
        //s string,0 starting index
    }
    public static void subset(String ans,String s,int idx)
    {
        if(idx==s.length()) {

            System.out.print(ans+" ");
            return;
        }
            char ch=s.charAt(idx);
            subset(ans+ch,s,idx+1); //pick
            subset(ans,s,idx+1);  //skip
    }
}
