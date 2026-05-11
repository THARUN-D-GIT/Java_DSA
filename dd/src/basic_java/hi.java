package basic_java;
import java.util.Scanner;

public class hi {
    static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int og=n;
        while (n > 0) {
            int digit = n % 10;
            sum += (digit*digit*digit);
            n = n / 10;
        }
        if (sum == og) {
            System.out.println("number is armstrong");
        }
        else
        System.out.println("not a armstrong");
    }
}
