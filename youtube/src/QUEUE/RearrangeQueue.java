package QUEUE;
import java.util.*;



public class RearrangeQueue {
    static void main(String[] args) {
        /*
        Given a queue q of even size, rearrange the queue by interleaving its first half with the second half.

Interleaving is the process of mixing two sequences by alternating their elements while preserving their relative order.
In other words, Interleaving means place the first element from the first half and then first element from the 2nd half and again second element from the first half and then second element from the 2nd half and so on.

Examples:

Input: q = [2, 4, 3, 1]
Output: [2, 3, 4, 1]
Explanation: We place the first element of the first half 2 and after that place the first element of second half 3 and after that repeat the same process one more time so the resulting queue will be [2, 3, 4, 1]
Input: q = [3, 5]
Output: [3, 5]
Explanation: We place the first element of the first half 3 and first element of the second half 5 so the resulting queue is [3, 5]
Constraints:

1 ≤ q.size() ≤ 103
1 ≤ q[i] ≤ 105

         */
        Queue<Integer> q=new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.add(4);q.add(5);q.add(6);q.add(7);
        q.add(8);
        System.out.println(q);
        rearrangeQueue(q);
        System.out.println(q);
    }
    public  static void rearrangeQueue(Queue<Integer> q) {
        // code here
        //1 2 3 4 5 6 7 8
        //o/p: 1 5 2 6 3 7 4 8
        int n=q.size();
        // Queue<Integer> q1=new LinkedList<>();

        // for(int i=1;i<=n/2;i++)
        // {
        //     q1.add(q.remove());
        // }
        // while(q1.size()>0)
        // {
        //     q.add(q1.remove());
        //     q.add(q.remove());
        // }

        //Method 2 using only one stack
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n/2;i++) st.push(q.poll());
        while(!(st.isEmpty())) q.add(st.pop());
        for(int i=0;i<n/2;i++) st.push(q.poll());
        //Rearrangement
        while(!(st.isEmpty())) {
            q.add(st.pop());
            q.add(q.poll());
        }
        while(!(q.isEmpty())) st.push(q.poll());
        while(!(st.isEmpty())) q.add(st.pop());
    }
}
