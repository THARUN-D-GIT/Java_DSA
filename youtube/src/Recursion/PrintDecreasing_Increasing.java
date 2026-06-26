package Recursion;

public class PrintDecreasing_Increasing {
    static void main(String[] args) {
        /*
        first print the number in decreasing order then in increasing
        ex:n=5
        5,4,3,2,1,1,2,3,4,5
         */
        int n=5;
        print(n);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1);
        //System.out.println(n);
        // for printing 1 only once
        if(n!=1) System.out.print(n+" ");

    }
}
