package Recursion;

public class GlobalVariable {
    static int x=20;
    static int y=10;

    static void main(String[] args) {
        /*
        GLOBAL VARIABLE:
                        A VARIABLE WHICH CAN BE ACCESSED AND MODIFIED BY ALL THE
                        METHOD IN THE CLASS IS CALLED GLOBAL VARIABLE
                        ->it should be declared just directly after the class
                        ->static int or any character or datatype
                        -> if the method contains a variable with same name (local variable)
                        then the local variable will be given more preference
                        for ex: y variable in this class

         */
        // here y is a local variable which has higher preference them global variable
        int y=10;
        System.out.println(x+" "+y);

        fun();
        System.out.println(x+" "+y);


    }
    public static void fun(){
        x=10;
        y=20;
    }
}
