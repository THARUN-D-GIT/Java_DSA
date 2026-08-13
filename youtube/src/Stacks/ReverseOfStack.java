package Stacks;
import java.util.*;
public class ReverseOfStack {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);st.push(40);st.push(50);
        System.out.println("Original array: ");
        print(st);
        System.out.println();
        System.out.println("Reversed array: ");
        reverseStack(st);
        print(st);


    }
    public static void reverseStack(Stack<Integer> st) {

        // code here
        int [] arr=new int[st.size()];
        int i=0;
        while(st.size()>0)
        {
            arr[i++]=st.pop();
        }
        i=0;
        while(i<arr.length)
        {
            st.push(arr[i++]);
        }



    }
    //method to print stack without using inbuild function
    public static void print(Stack<Integer> st) {
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>0)
        {
            int top=st.pop();
            System.out.print(top+" ");
            st2.push(top);
        }
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
    }
}
