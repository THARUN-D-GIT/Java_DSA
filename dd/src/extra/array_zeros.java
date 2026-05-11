package extra;
import java.util.Scanner;

public class array_zeros {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements of the array");
        int [] arr=new int[5];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            System.out.println(arr);



    }
}
