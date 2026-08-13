package Stacks;
import java.util.*;

public class Basics {
    static void main(String[] args) {
        Stack<String> st=new Stack<>();
        //st.pop(); //stack underflow or empty stack exception
        st.push("Tarun");
        st.push("Karthik");
        st.push("Shreyas");
        st.push("Parth");
        System.out.println(st.size());
        System.out.println(st); //A.s=O(n)
        st.pop();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.pop()); //removes top most element and deletes top most

    }

}
