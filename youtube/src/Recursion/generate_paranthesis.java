package Recursion;
import java.util.*;

import java.util.Scanner;

public class generate_paranthesis {
    static void main(String[] args) {
        /*
        Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.



Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]


Constraints:

1 <= n <= 8
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  the value of n");
        int n=sc.nextInt();
        List<String> ans=new ArrayList<>();
        generate(n,0,0,"",ans);
        System.out.println(ans);
    }
    public static void generate(int n,int l,int r,String s,List<String> ans)
    {
        if(r==n){
            ans.add(s);
            return;
        }
        if(l<n) generate(n,l+1,r,s+"(",ans);
        if(r<l) generate (n,l,r+1,s+")",ans);
    }
}
