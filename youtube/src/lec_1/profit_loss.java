package lec_1;

import java.util.Scanner;

public class profit_loss {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the cost");
        double c= sc.nextDouble();
        System.out.println("selling price");
        double s = sc.nextDouble();
        if(s-c>0){
            System.out.println("seller made a profit");
            System.out.println("profit is :"+(s-c));
            System.out.println("percentage of profit is:"+((s-c)/c)*100);


        }
        else{
            System.out.println("seller is in loss");
            System.out.println("loss is:"+(Math.abs(s-c)));
            /* need to add no loss and no profit condition
            use only if statements (3) or else if
            extra question was to ADD profit or loss percentage
             */
            System.out.println("percentage of loss  is:"+((s-c)/c)*100);

        }
    }
}
