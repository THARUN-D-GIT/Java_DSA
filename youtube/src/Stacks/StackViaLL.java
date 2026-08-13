package Stacks;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class MyStack{
    Node head;
   int len;
   int peek() throws Exception
   {
       if(head==null) {
           throw new Exception("stack is empty");
       }
       return head.val;
   }
   int pop() throws Exception
   {
       if(head==null) {
           throw new Exception("stack is empty");
       }
       //delete at head
        else {
           int x = head.val;
           head = head.next;
           len--;
           return x;
       }

   }
   void push(int x)
   { // add at head
       Node temp=new Node(x);
       //if len==0
       if(head==null) head=temp;
       else {
           temp.next = head;
           head = temp;
       }
       len++;

   }
   int size()
   {
       return len;
   }
   void print(){
       Node temp=head;
       while(temp!=null){
           System.out.print(temp.val+" ");
           temp=temp.next;
       }
       System.out.println();
   }

}

public class StackViaLL {
    static void main(String[] args) throws Exception {
        MyStack st=new  MyStack();
         // st.pop(); throws error and following code will not run
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.print();
        System.out.println(st.size());
        st.pop();
        st.print();
        System.out.println(st.size());
        System.out.println(st.peek());



    }
}
