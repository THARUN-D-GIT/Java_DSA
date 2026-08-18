package QUEUE;
import java.util.*;
class MyQueue {
    Stack<Integer>st;
    Stack<Integer> help;


    public MyQueue() {
        st=new Stack<>();
        help=new Stack<>();

    }

    // public void push(int x) {
    //     st.push(x);

    // }

    // public int pop() {
    //     // push n-1 element form main to helper except bottom
    //     while(st.size()>1) help.push(st.pop());
    //     int ans=st.pop();
    //     //push back
    //     while(!(help.isEmpty())) st.push(help.pop());
    //     return ans;

    // }

    // public int peek() {
    //      // push n-1 element form main to helper except bottom
    //     while(st.size()>1) help.push(st.pop());
    //     int ans=st.peek();
    //     //push back
    //     while(!(help.isEmpty())) st.push(help.pop());
    //     return ans;
    // }

    // public boolean empty() {
    //     if(st.isEmpty()) return true;
    //     return false;

    // }
    public void push(int x) {
        while(!(st.isEmpty())) help.push(st.pop());
        st.push(x);
        while(!(help.isEmpty())) st.push(help.pop());

    }

    public int pop() {
        int ans=st.pop();
        return ans;

    }

    public int peek() {
        return st.peek();
    }

    public boolean empty() {
        if(st.isEmpty()) return true;
        return false;

    }
}



public class  ImplementationOfStackUsingQueue_2{
    static void main(String[] args) {
        //["MyQueue","push","push","peek","pop","empty"]
        MyQueue q = new MyQueue();
        System.out.println(q.empty());
        q.push(1);
        q.push(2);
        System.out.println( q.peek());
        System.out.println( q.pop());
        System.out.println(q.empty());

    }
}

