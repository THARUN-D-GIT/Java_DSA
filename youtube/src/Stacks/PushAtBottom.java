package Stacks;

import java.util.Stack;

public class PushAtBottom {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        int elem=50;
        pushAtBottom(st,elem);
        System.out.println(st);
        reverse(st);
        System.out.println(st);

    }
    public static void pushAtBottom(Stack<Integer> st,int elem) {
        if (st.empty()) {
            st.push(elem);
            return;
        }
        int top=st.pop();
        pushAtBottom(st,elem);
        st.push(top);

    }
    public static void reverse(Stack<Integer> st) {
        if(st.size()==1) return;
        int top=st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }
}
