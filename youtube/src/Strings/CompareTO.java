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
        String s1 = "harshitha";
        String s2 = "harsh";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(compare_to(s1,s2));

    }
        //HW:create a compareto function of ur own
        static int compare_to(String s1,String s2){
           int n1=s1.length();
           int n2=s2.length();
           int i=0,j=0;
           while(i<n1 && i<n2){
               if(s1.charAt(i)!=s2.charAt(j)){
                   return s1.charAt(i)-s2.charAt(j);
               }
               i++;
               j++;

           }
           return n1-n2;
        }


}
