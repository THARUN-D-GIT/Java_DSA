package QUEUE;
import java.util.*;
public class ReverseFirstKElementInQueue {
    public static void main(String[] args) {
        /*
        Given an integer k and a queue of integers, we need to reverse the order of the first k elements of the queue, leaving the other elements in the same relative order.

Only following standard operations are allowed on queue.

enqueue(x) : Add an item x to rear of queue
dequeue() : Remove an item from front of queue
size() : Returns number of elements in queue.
front() : Finds front item.
Note:

The above operations represent the general processings.
In-built functions of the respective languages can be used to solve the problem.
If the size of queue is smaller than the given k , then return the original queue.
Examples:

Input: q = [1, 2, 3, 4, 5], k = 3
Output: [3, 2, 1, 4, 5]
Explanation: After reversing the first 3 elements from the given queue the resultant queue will be [3, 2, 1, 4, 5]
Input: q = [4, 3, 2, 1], k = 4
Output: [1, 2, 3, 4]
Explanation: After reversing the first 4 elements from the given queue the resultant queue will be [1, 2, 3, 4]
Constraints:

1 ≤ q.size(), q[i], k ≤ 105
         */
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        System.out.println(reverseFirstK(q,3));
    }
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        int n=q.size();
        if(k>n) return q;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++) st.add(q.poll());
        while(!(st.isEmpty())) q.add(st.pop());
        for(int i=0;i<n-k;i++)
        {
            q.add(q.poll());
        }
        return q;

    }
}
