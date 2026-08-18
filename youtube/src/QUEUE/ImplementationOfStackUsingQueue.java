package QUEUE;
import java.util.*;
class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q=new LinkedList<>();
    }
    //ADD  EFFICIENT

    // public void push(int x) {
    //     q.add(x);

    // }

    // public int pop() {
    //     int n=q.size();
    //     for(int i=0;i<n-1;i++) q.add(q.remove());
    //     int ans=q.remove();
    //     return ans;

    // }

    // public int top() {
    //     int n=q.size();
    //     for(int i=0;i<n-1;i++) q.add(q.remove());
    //     int ans=q.remove();
    //     q.add(ans);
    //     return ans;
    // }

    // public boolean empty() {
    //     if(q.isEmpty()) return true;
    //     return false;

    // }

    //REMOVE EFFICIENT
    public void push(int x) {
        q.add(x);

        // remove and add for q.size-1
        int n=q.size();
        for(int i=0;i<n-1;i++) q.add(q.poll());

    }

    public int pop() {
        return q.remove();

    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        if(q.isEmpty()) return true;
        return false;

    }
}


public class ImplementationOfStackUsingQueue {
    static void main(String[] args) {
        //["MyStack","push","push","top","pop","empty"]
        MyStack s=new MyStack();
        System.out.println(s.empty());
        s.push(1);
        s.push(2);
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.empty());

    }
}
