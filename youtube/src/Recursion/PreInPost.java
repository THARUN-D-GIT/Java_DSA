package Recursion;

public class PreInPost {
    static void main(String[] args) {
        pip(3);
        /*
        return
        terminates the function that it has been called
        for better understanding of the problem
        refer class notes pdf concept
        pre in post using Euler tour tree

         */
        /*
        we use this pre in post to generate or call the function simultaneously
        pre -> before calling the function wt task is being performed
        in->function call happens in between 2 function call
        post ->  function call happens at last before terminating the call

         */
    }
    public static void pip(int n){
        if(n==0) return;
        System.out.print(n+" "); //pre
        pip(n-1);
        System.out.print(n+" "); //in
        pip(n-1);
        System.out.print(n+" "); //post
//        System.out.print("pre"+n+" "); //pre
//        pip(n-1);
//        System.out.print("in"+n+" "); //in
//        pip(n-1);
//        System.out.print("post"+n+" "); //post
    }
}
