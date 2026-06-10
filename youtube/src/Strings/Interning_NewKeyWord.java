package Strings;

public class Interning_NewKeyWord {
    static void main(String[] args) {
        /*
        String in java is immutable but we can add string to a string using +
        operator in reality it will create a new memory for a whole string
        and the string will point to that address
        string s="tharun"
        s=charan
        first s was pointing to the address of tharun later it will point to the
        address of charan

        STRING INTERNING:
                            creating a memory location of only one
                            if there are more than one variable with same values
                            ex:
                            String s1="guddu"
                            String s2="guddu"
                            both s1&s2 are pointing to the same address
          NEW KEYWORD:
                        to overcome this same memory location we will use "new" keyword
                        String s2=new String ("value")
                        creates a new memory address in heap

         */
        String s="tharun";
        System.out.println(s);
        s+="gowda";
        System.out.println(s);
        String s1="charan";
        System.out.println(s1);

        s1="tharun";
        System.out.println(s1);
        String s2="tharun";
        String s3="tharun";
        s2="ramdev";
        System.out.println(s2+" "+s3);
        String s4=new String("tharun");
        System.out.println(s4);
        /*
        STRING IMMUTABILITY IN JAVA:
                                  can  not change individual charater
                                  ex:
                                  ramesh
                                  u have to chnage m->j
                                  we can not change it directly
                    instead we can use substring concept for this
                    s="ramesh"
                    s=s.substring(0,2)+'j'+s.substring(3)

         */
        String str="Ramesh";
        System.out.println(str.substring(0,2)+'j'+str.substring(3));


    }
}
