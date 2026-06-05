package Strings;

import java.util.Scanner;

public class String_basic {
    static void main(String[] args) {
       /* String str="abc";
        System.out.println(str);
        //String input
        /*
        There are 2 types to take input
        sc.next() =takes input only till there is a space given
        sc.nextLine()=takes full input
         */
       /* System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(st);
        String st2=sc.next();
        System.out.println(st2);

        //printing particular character of a string
        /*
        for example :
                      String s=  Tharun D
                                 01234567
                        printing u
           we will use string name.charAt(idx no)
           s.charAt(5);
           length of String
           S.length() -> () is important

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String st3=sc.next();
        System.out.println(st3+" "+st3.length());
        System.out.println(st3.charAt(5));

    }
}
