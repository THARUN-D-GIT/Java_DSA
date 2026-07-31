package LinkedList;
//we will use class node
class LinkedList{
    Node head; //default value is null
    Node tail;
    int size;
    void addAtTail(int value){
       Node temp=new Node(value);
       //when the linked list is new or empty
       if(tail==null) head=tail=temp; //first tail=temp and them head=tail
       else{
       tail.next=temp;
       tail=temp;
       }
       size++;
   }
   void display(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
       System.out.println();

   }
   void addAtHead(int value){
        Node temp=new Node(value);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
   }
   void deleteAtHead(){
        if(head==null) {
            System.out.println("LL is empty");
            return;
        }
        head=head.next;
        //for 1 size LL
       if(head==null) tail=null;
       size--;
   }
//   Boolean search(int value){
//        if(head==null) return false;
//        Node temp=head;
//       while(temp!=null){
//           if(temp.val==value) return true;
//           temp=temp.next;
//       }
//       return false;
//   }
   int search(int value)
   {
       if(head==null) return -1;
       Node temp=head;
       int idx=0;
       while(temp!=null){
           if(temp.val==value) return idx;
           idx++;
           temp=temp.next;
       }
       return -1;
   }
}
public class LinkedListDataStructure {
    static void main(String[] args) {
LinkedList ll=new LinkedList();
ll.deleteAtHead();
    ll.addAtTail(20);
        ll.addAtTail(10);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.display();
        ll.addAtHead(35);
        ll.display();
        ll.addAtHead(77); ll.display();
        ll.deleteAtHead();
        ll.display();
        System.out.println("size of linked list "+ll.size);
        System.out.println(ll.search(40));

    }
}
