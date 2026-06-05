package Strings;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        int i=0,j=str.length()-1;
        boolean flag=false;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)) {
                flag=true;
            }
            else{
                System.out.println("string is not palindrome");
                break;
            }
            i++;
            j--;
        }
        if(flag) System.out.println("palindrome");
    }
}
