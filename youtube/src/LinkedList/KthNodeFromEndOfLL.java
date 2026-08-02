package LinkedList;
class Node1 {
    int data;
    Node1 next;

    Node1(int x) {
        data = x;
        next = null;
    }
}


public class KthNodeFromEndOfLL {
    public int getKthFromLast(Node1 head, int k) {
        // code here
        // Node temp=head;
        // int len=0;
        // while(temp.next!=null)
        // {

        //     temp=temp.next;
        //     len++;

        // }
        // temp=head;
        // if( k>=1 && k<=len+1){
        // for(int i=0;i<(len-k+1);i++)
        // {
        //     temp=temp.next;
        // }}
        // else return -1;
        // return temp.data;
        //METHOD 2
        Node1 slow=head;
        Node1 fast=head;
        //give lead for fast
        for(int i=0;i<k;i++)
        {
            if(fast==null) return -1;
            fast=fast.next;
        }

        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
    static void main(String[] args) {
        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        head.next.next.next = new Node1(40);
        head.next.next.next.next = new Node1(50);

        int k = 2;

        KthNodeFromEndOfLL obj = new KthNodeFromEndOfLL();

        int ans = obj.getKthFromLast(head, k);

        System.out.println("The " + k + "nd node from the end is: " + ans);

    }
}
