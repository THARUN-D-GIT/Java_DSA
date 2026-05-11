package extra;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Max {
    static void main(String[] args) {
        int max_val;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of elements in an array:");
        int n=sc.nextInt();
        int A[] =new int[n];
        System.out.println("enter the elements one by one ");

        for(int i=0;i<n;i++)
        {
          A[i]=sc.nextInt();
        }
        max_val=A[0];
        for(int i=1;i<A.length;i++){
             if(A[i]>max_val){
                 max_val=A[i];
             }
        }
        System.out.println("max value is:"+max_val);
    }
}
