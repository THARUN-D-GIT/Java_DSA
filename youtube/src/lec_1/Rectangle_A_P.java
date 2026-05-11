package lec_1;

import java.util.Scanner;

public class Rectangle_A_P {
    static void main(String[] args) {

        /* question take l and b as a input and find whether the area of rectangle is greater than its perimeter */
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length  of rectangle");
        double l=sc.nextDouble();
        System.out.println("enter the breadth of rectangle ");
        double b= sc.nextDouble();
        double area=l*b;
        double perimeter = 2*(l+b);
        if(area>perimeter)
            System.out.println("area is greater");
        else if (perimeter>area)
            System.out.println("perimeter is greater");
        else
            System.out.println("both are equal");


    }
}

