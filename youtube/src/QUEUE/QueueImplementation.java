package QUEUE;

import java.util.Queue;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
class queue{
    Node head;
    Node tail;
    int size;
   void add(int val)
   {
       Node temp = new Node(val);
       if(head==null || tail==null) head=tail=temp;
       tail.next = temp;
       tail = tail.next;
       size++;
   }
   int peek() throws Exception
   {
       if(head==null)
       {
          throw new Exception("queue is empty");
       }
       return head.val;
   }
   int remove()throws Exception
   {
       if(head==null)
       {
           throw new Exception("queue is empty");
       }
       int ans=head.val;
       head = head.next;
       size--;
       return ans;
   }
   void print()throws Exception
   {
       if(head==null)
       {
           throw new Exception("queue is empty");
       }
       Node temp=head;
       while(temp!=null)
       {
           System.out.print(temp.val+" ");
           temp=temp.next;
       }
       System.out.println();
   }
   int  size()throws Exception
   {
       if(head==null)
       {
           throw new Exception("queue is empty");
       }
       return size;
   }

}

public class QueueImplementation {
    static void main(String[] args) throws Exception {
        queue q = new queue();
      // q.remove();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        q.print();
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.print();
        System.out.println(q.size());


    }
}
