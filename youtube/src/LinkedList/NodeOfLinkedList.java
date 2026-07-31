package LinkedList;

//import java.util.LinkedList;

class Node{
    int val;
    Node next;  // default value null
    // contains complete details of an another node(next)
    //it stores the reference for the next node in 'next'
    Node(int val){
        this.val=val;
    }
}

public class NodeOfLinkedList {
    static void main(String[] args) {
        /*
a= LinkedList.Node@8efb846
b=LinkedList.Node@2a84aee7
 a.next=b=LinkedList.Node@2a84aee7

 b and a.next is same this proofs that the nodes are interlinked


         */

        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        // linking nodes together
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        System.out.println(a);//LinkedList.Node@8efb846
        System.out.println(b);//LinkedList.Node@2a84aee7
        System.out.println(a.next);  //LinkedList.Node@2a84aee7
        System.out.println(c);
        System.out.println(a.next.next);
        System.out.println(a.next.next.next.val);

    }
}
