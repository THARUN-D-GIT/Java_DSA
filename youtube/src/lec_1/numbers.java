package lec_1;

import java.util.Scanner;

public class numbers {
    static void main(String[] args) {
        double s=5/4;
        System.out.println(s);
        double s2= 5.0/4;
        System.out.println(s2);
        // simple interest problem
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter principle amount ,rate of interest,time period in months one by one");
        double p=sc.nextDouble();
        double r =sc.nextDouble();
        double t =sc.nextDouble();
        double si=(p*r*t*12)/100;
        System.out.println("simple interest amount is :"+si);


    }
}
