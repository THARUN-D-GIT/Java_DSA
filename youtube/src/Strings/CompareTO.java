package Strings;

public class CompareTO {
    static void main(String[] args) {
        //CompareTo():compares 2 strings lexo graphically(dictionary order)
       /*
       raghav, sneha
       compare the first letter of  each string and then check their ASCII value
       if not then compare the next character
       Ex:
       s1=raghav
       s2=aditya
       s1.compareTO(s2)
       output will be the difference between first different character between
       2 String
        */
        String s1="raghav";
        String s2="rajeev ";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));

    }
}
