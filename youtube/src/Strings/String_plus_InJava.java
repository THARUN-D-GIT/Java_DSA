package Strings;

public class String_plus_InJava {
    static void main(String[] args) {
        /*
        adding + string//char/int in java

         */
        String s1="Tharun";
        System.out.println(s1);
        s1+="gowda";
        System.out.println(s1);
        s1+=10;
        System.out.println(s1);
        s1+='a';
        System.out.println(s1);
        s1+='\n';
        System.out.println(s1);

        s1+='n';
        System.out.println(s1);
        String s2="Tharun";
        System.out.println(s2+10+20);
        // output tharun1020 because operation are performed from left to right
        System.out.println('A'+2+s2);
        // output is 67tharun because char+int =char
        System.out.println(10+20+s2);
    }
}
