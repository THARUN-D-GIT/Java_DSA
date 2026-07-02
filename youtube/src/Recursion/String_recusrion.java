package Recursion;

import java.util.ArrayList;

public class String_recusrion {
    static void main(String[] args) {
        String s="Kartikeya";
        System.out.println(s);
        change(s);
        System.out.println(s);
        /*
            STRING:
        when we send a string as parameter for a method
        ->it will send a copy of it not original (PASS BY REFERENCE)
        ->changes made inside the method it will not reflect the main method
            STRING ARRAYLIST AND ARRAY OF STRING:
                    ->THESE 2 DATA STRUCTURES ARE "PASS BY VALUE"
                    ->changes made in a method will reflect in original data structure
                    ot main method also
         */
        String [] sarr={"tarun","krish","bhuvan","vivek"};
        for(int i=0;i<sarr.length;i++)
            System.out.print(sarr[i]+" ");
        System.out.println();
        ArrayList<String> arr1=new ArrayList<>();
        arr1.add("Ramesh");
        arr1.add("raghav");
        arr1.add("Aamir");
        arr1.add("kartikeya");
        System.out.println(arr1);
        change2(arr1);
        System.out.println(arr1);

    }
    public static void change(String s){
        s="lavish";
    }
    public static void change2(ArrayList<String> arr1){
        arr1.add("viplab");
    }
}
