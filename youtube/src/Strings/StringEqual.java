package Strings;

public class StringEqual {
    static void main(String[] args) {
        /*
 String s1="tharun";
        String s2=new String("tharun");
        System.out.println(s1==s2);


        this will give the output false
        but
        String s1="a"
        String s2="a"
        returns true
        because comparator checks the memory location

        but in 1St case the charAt() will return true for each character

        s1.equals(s2)
        compares eaach character then returns true or false based on that

         */
        String s1="tharun";
        String s2=new String("tharun");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
