package loops;

import java.util.Scanner;

public class CompositeNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
      /*  for(int i=2;i<n;i++)
        {
            if(n%i==0)
                System.out.println("number is composite");
            break;
        }
        this can identify the composite number but can't print prime number
        so we use boolean variable to check the status and then print prime or composite
       */
        boolean flag=true;//means number is prime
/*for(int i=2;i<n;i++)
{
    if(n%i==0)
        flag=false;
    break;
}
if(n==1) System.out.println("neither p nor c");
else if(flag==true) System.out.println("prime");
else System.out.println("composite");
This is also good but we can decrease number of itterations using
square root logic
Every number has factors in pairs and square root of any number lies in between
these factors so we can use square root functions
 */
        System.out.println("factors of number are except 1 ");
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                //System.out.println("factors of number are except 1 ");
                System.out.println(i);
            System.out.println(n/i);
                flag=false;
            break;
        }
        if(n==1) System.out.println("neither p nor c");
        else if(flag==true) System.out.println("prime");
        else System.out.println("composite");

    }
}
