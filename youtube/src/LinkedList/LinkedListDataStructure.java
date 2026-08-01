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
   Boolean search2(int value){
        if(head==null) return false;
        Node temp=head;
       while(temp!=null){
           if(temp.val==value) return true;
           temp=temp.next;
       }
       return false;
   }
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
   void insert(int idx,int value){
        if(head==null){addAtHead(value);}
        else if(idx>size || idx<0)  {
            System.out.println("Not possible");
            return;
        }
        else if(idx==size){
            addAtTail(value);
        }
        else {
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            Node t=new Node(value);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
}
int get(int idx)
{
    Node temp=head;
    for(int i=0;i<idx;i++){
        temp=temp.next;
    }
    return temp.val;
}

void delete(int idx)
    {
        Node temp=head;
        if(head==null) {
            System.out.println("LL is empty");
            return;
        }
        else if(idx<0||idx>size){
            System.out.println("invalid index");
        }
        else if(idx==0){
            deleteAtHead();
        }
        else{
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(idx==size-1) tail=temp;
            size--;
    }

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
        ll.insert(3,89);
        ll.display();
        System.out.println(ll.get(5));
       ll. delete(5);
        ll.display();

    }
}
