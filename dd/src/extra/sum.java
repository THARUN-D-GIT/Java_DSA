package extra;
import java.util.Scanner;

public class sum {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number to check");
        int n=sc.nextInt();
        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                System.out.println("number is not prime");
                break;
            } else
                System.out.println(" a prime");
            break;
        }
    }
}
