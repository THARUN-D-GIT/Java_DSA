package Stacks;
import java.util.*;
public class TheCelebrityProblem {
    static void main(String[] args) {
        /*
        A celebrity is a person who is known to all but does not know anyone at a party. A party is being organized by some people. A square matrix mat[][] of size n*n is used to represent people at the party such that if an element of row i and column j is set to 1 it means ith person knows jth person. You need to return the index of the celebrity in the party, if the celebrity does not exist, return -1.

Note: Follow 0-based indexing.

Examples:

Input: mat[][] = [[1, 1, 0],
                [0, 1, 0],
                [0, 1, 1]]
Output: 1
Explanation: 0th and 2nd person both know 1st person and 1st person does not know anyone. Therefore, 1 is the celebrity person.
Input: mat[][] = [[1, 1],
                [1, 1]]
Output: -1
Explanation: Since both the people at the party know each other. Hence none of them is a celebrity person.
Input: mat[][] = [[1]]
Output: 0
Constraints:
1 ≤ mat.size() ≤ 1000
0 ≤ mat[i][j] ≤ 1
mat[i][i] = 1
         */
        int [][] arr={
                {1,1,0},
                {0,1,0},
                {0,1,1}
        };
        int [][] arr2={
                {1,1},
                {1,1}
        };
        System.out.println(celebrity(arr));
        System.out.println(celebrity(arr2));
    }
    public static int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++) st.push(i);
        while(st.size()>1) {
            int a=st.pop();
            int b=st.pop();
            boolean aflag=true,bflag=true;
            if(mat[a][b]==1)
            {
                // a cant be celb
                aflag=false;

            }
            else {
                //mat[a][b] ==0 a dont know b so b cant be celb
                bflag=false;
            }
            if(mat[b][a]==1)
            {
                // b cant be celb
                bflag=false;
            }
            else{
                aflag=false;
            }
            if(aflag) st.push(a);
            if(bflag) st.push(b);
        }
        if(st.isEmpty()) return -1;
        int elem=st.pop();
        for(int j=0;j<n;j++)
        {
            if(mat[elem][j]==1 && elem!=j) return -1;
        }
        for(int i=0;i<n;i++)
        {
            if(mat[i][elem]==0 && i!=elem) return -1;
        }
        return elem;
    }
}
