package Binary_Search;

import java.util.Scanner;

public class Arranging_coins {
    static void main(String[] args) {
       /* You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

                Given the integer n, return the number of complete rows of the staircase you will build.



        Example 1:


        Input: n = 5
        Output: 2
        Explanation: Because the 3rd row is incomplete, we return 2.
        Example 2:


        Input: n = 8
        Output: 3
        Explanation: Because the 4th row is incomplete, we return 3.


        Constraints:

        1 <= n <= 231 - 1

        */
        /*
        the no of stairs will be complete only if the given number is a perfect sum of first n
        integers
        so using the fromula
        n=((k)(k+1))/2;
        we will get k=sqrt(8*n+1)-1;
        using long to avoid integer overflow


         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        long m=n;
        System.out.println("number of rows which can  be filled using the given coins is:");
        System.out.println((sqrt(8*n+1)-1)/2);

    }
    // Functions for sqrt
    public static int sqrt(long n){
        long lo=0,hi=n-1;
        if(n==0){
            return 0;
        }

        else {

            while(lo<=hi)
            {
                long mid=lo+(hi-lo)/2;
                if(mid==n/mid) return (int)mid;
                else if(mid>n/mid) hi=mid-1;
                else lo=mid+1;
            }
        }
        return (int) hi;
    }

}
