package QUEUE;
import java.util.*;

public class Basics {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // or
        //Queue<Integer> q2 = new ArrayDeque<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
    }
}
