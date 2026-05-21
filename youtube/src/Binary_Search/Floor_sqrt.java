package Binary_Search;

import java.util.Scanner;

public class Floor_sqrt {
    static void main(String[] args) {
        /*
        find the nearest square root less than number for any given positive integer
        for ex:
        x=4 ans=2;
        x=15 ans=3 nearest perfect sqrt is 3

         */
        int root=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        /*for(int i=1;i<=n;i++)
        {
            if(i*i>n) break;
            root=i;
        }
        System.out.println(root);

         */
        /*
        using binary search approach
         */
        int lo=1,hi=n;
        int idx=0;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if((mid*mid)>n) hi=mid-1;
            else if(mid*mid<n) {
               idx=mid;
                lo=mid+1;
            }
            else   {idx=mid;
                break;}
        }
        System.out.println(idx);
    }
}
