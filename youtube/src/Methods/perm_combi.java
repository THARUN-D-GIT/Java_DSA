package Methods;

import java.util.Scanner;

public class perm_combi {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("enter the value of r");
        int r = sc.nextInt();
        p_and_c(n,r);

    }
    public static int fact(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac *=i;
        }
        return fac;

    }
    public static void p_and_c(int n,int r){
        if(n>r){
        System.out.println("perumation equal to");
        System.out.println((fact(n))/(fact (n-r)));
        System.out.println("combinations equal to");
        System.out.println((fact(n))/((fact (n-r))*fact(r)));}
        else{
            System.out.println("n should be greater  than r ");
        }
    }

}
