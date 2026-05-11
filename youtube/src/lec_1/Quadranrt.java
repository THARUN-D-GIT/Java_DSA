package lec_1;

import java.util.Scanner;

public class Quadranrt {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter co-ordinates of x and y");
        double x= sc.nextDouble();
        double y=sc.nextDouble();
        if(x ==0 && y==0)
            System.out.println("lies in origin");
        else if (x==0)
            System.out.println("lies in y axix");
        else if(y==0)
            System.out.println("lies in x axis");
        else if (x>0 && y>0)
            System.out.println("lies in 1st quadrant");
        else if (x>0 && y<0)
            System.out.println("lies in 4th quadrant");
        else if (x<0 && y>0)
            System.out.println("lies in 2nd quadtrant");
        else
            System.out.println("lies in 3rd quadrant");

    }
}
