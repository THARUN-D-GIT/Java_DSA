package lec_1;
import java.sql.SQLOutput;
import java.util.Scanner;

public class vol_sphere {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the radius of sphere:");
       double radius=sc.nextDouble();
      double vol=(4*Math.PI*Math.pow(radius,3))/3;
       System.out.println("the volume of the sphere is:"+vol);


    }
}
