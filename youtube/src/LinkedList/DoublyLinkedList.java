package LinkedList;
class Node2{
    int val;
    Node2 next;
    Node2 prev;
    Node2(int x){
        val=x;
    }
}
class dll{
    Node2 head;
    Node2 tail;
    int size;
    void AddAtHead(int x){
        Node2 temp=new Node2(x);
        if(head==null) head=tail=temp;
        else{
            head.prev=temp;
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void addAtTail(int x){
        Node2 temp=new Node2(x);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    void deleteAtHead()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(size==1) head=tail=null;
        head=head.next;
        head.prev=null;
        size--;
    }
    void deleteAtTail()
    {
       // Node2 temp=tail;
        if(tail==null)
        {
            System.out.println("not possible");
            return;
        }
        if(size==1) tail=head=null;
        else{
           tail=tail.prev;
           tail.next=null;
        }
        size--;
    }
    void display(){
        Node2 temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void displayReverse(){
        Node2 temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    void insert(int idx,int val) {
        Node2 a = new Node2(val);
        if (size == 0) AddAtHead(val);
        else if (idx == size ) addAtTail(val);
        else if (idx > size || idx<0) {
            System.out.println("index out of bound");
            return;
        } else {
            Node2 temp = head;
            for (int i = 0; i < idx-1; i++) temp = temp.next;
            a.next=temp.next;
            temp.next=a;
            a.prev=temp;
            a.next.prev=a;
            size++;
        }

    }
    void delete(int idx) {

        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        else if(idx<0 || idx>=size)
        {
            System.out.println("index out of bound");
            return;
        }
        else if(idx==0)
        {
            deleteAtHead();
        }
        else if(idx==size-1) deleteAtTail();


        else{
            Node2 temp = head;
            for(int i=0;i<idx-1;i++) temp=temp.next;
            Node2 a=temp.next;
            temp.next=a.next;
            temp.next.prev=temp;
            size--;
        }

    }
}

public class DoublyLinkedList {
    static void main(String[] args) {
       dll d = new dll();
       d.AddAtHead(1);
       d.AddAtHead(2);
        d.AddAtHead(3);
        d.AddAtHead(4);
        d.AddAtHead(5);
        d.display();
        d.displayReverse();
        d.addAtTail(20);
        d.addAtTail(30);
        d.display();
        d.displayReverse();
        d.deleteAtTail();
        d.display();
        d.deleteAtTail();
        d.display();
        d.deleteAtHead();
        d.display();
        d.insert(2,98);
        d.display();
        d.insert(6,99);
        d.insert(5,67);
        d.display();
        d.delete(5);
        d.display();
        d.delete(3);
        d.display();
        d.delete(7);

    }
}
