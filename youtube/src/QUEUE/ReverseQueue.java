package QUEUE;
import java.util.*;
public class ReverseQueue {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        reverseQueue(q);
        System.out.println(q);
    }
    public static  void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> st=new Stack<>();
        while(!(q.isEmpty()))
        {
            st.add(q.poll());
        }
        while(!(st.isEmpty())) q.add(st.pop());
    }
}
