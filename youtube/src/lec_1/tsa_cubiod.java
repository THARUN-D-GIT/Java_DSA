package lec_1;
import java.util.Scanner;

public class tsa_cubiod {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length,breadth,height,of cubiod:");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        double h=sc.nextDouble();
double tsa=((l*b)+(b*h)+(h*l))*2;
        System.out.println("total surface area of cuboid is :"+tsa);
    }
}
