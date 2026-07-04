package Recursion;

public class PreInPost {
    static void main(String[] args) {
        pip(2);
        /*
        return
        terminates the function that it has been called

         */
    }
    public static void pip(int n){
        if(n==0) return;
        System.out.print(n+" "); //pre
        pip(n-1);
        System.out.print(n+" "); //in
        pip(n-1);
        System.out.print(n+" "); //post
    }
}
