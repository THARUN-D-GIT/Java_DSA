package Recursion;

public class Basic {
    static void main(String[] args) {
        /*
        RECURSION:
                    METHOD CALLING ITSELF UNTIL A SPECIFIC CONDITION IS SATISFIED
                    (ALSO CALLED AS BASE CONDITION)
                    -> if there is no condition it will be stack overflow error
                    (infinite) loop error
                    ->it can be stopped by taking an parameter in the function
                    ->A function terminates if the "return" statement is executed or
                    if its all executable parts are done

         */
        //question print  numbers from reverse order
        print(5);

    }
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
}
