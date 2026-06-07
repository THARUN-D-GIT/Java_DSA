package Strings;

public class Concatenation {
    static void main(String[] args) {
        String s1="AbCD";
        String s2="AbCD";
        //concatenaton of string
        System.out.println(s1.concat(s2));
        /*
        a.concat(b) sout (a) not works
        concate created different memory location so assign it first
        a=a.concat(b)
        sout(a)

         */
        /*
String objects are immutable.

concat() does not modify the original string.
It creates a new String object and returns its reference.

s1.concat(s2);      // result ignored
System.out.println(s1); // still "AbCD"

s1 = s1.concat(s2); // store the new reference
System.out.println(s1); // "AbCDAbCD"
*/
        s1.concat(s2);

        System.out.println(s1);
        s1=s1.concat(s2);
        System.out.println(s1);
    }
}
