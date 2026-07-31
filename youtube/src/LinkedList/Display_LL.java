package LinkedList;
// node class can only be declared once since it is in same package
//class Node{
//    int val;
//    Node next;
//    Node(int val){
//        this.val=val;
//    }
//}

import java.util.Scanner;

public class Display_LL {
    //using recursion
    public static void display2(Node head)
    {
        if(head == null) return;
        System.out.print(head.val+" ");

        display2(head.next);

        // or
//        Node  temp=head;
//        if(temp.next!=null) return;
//        System.out.print(temp.val+" ");
//        display2(temp.next);

        //FOR PRINTING THE LINKED LIST IN REVERSE ORDER
//        if(head == null) return;
//        display2(head.next);
//        System.out.print(head.val+" ");

    }
    public static void display(Node head){
        Node temp=head; // we are not using "new" because
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
        //using for loop
//        for(Node temp1=head;temp1!=null;temp1=temp1.next){
//            System.out.print(temp1.val+" ");
//        }
//        System.out.println();
    }
    public static int get(Node head,int index)
    {
        //using for loop
        for(int i=0;i<index;i++)
        {
            head=head.next;
        }
        return head.val;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
       // Node f=new Node(sc.nextInt());
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
       // e.next=f;
        display(a);
        display2(a);
        //NULL POINTER EXCEPTION
//        Node n=null;
//       n.val=10;
//       n.next=e;
        System.out.println();
        System.out.println(get(a,3));
    }
}
