package Strings;

public class StringReverse {
    static void main(String[] args) {
        StringBuilder sb=new StringBuilder("charan");
        System.out.println(sb);
        int i=0,j=sb.length()-1;

        while(i<=j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;


        }
        System.out.println(sb);
        //INBUILT METHOD
        sb.reverse();
        //should print original because we all ready reversed it once
        System.out.println(sb);
    }
}
