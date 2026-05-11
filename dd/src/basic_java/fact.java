package basic_java;
import java.util.Scanner;

public class fact {
    public static int fact_1(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return fact_1(n - 1) * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int n = sc.nextInt();

        System.out.println("factorial of a number is:" + fact_1(n));

    }
}

