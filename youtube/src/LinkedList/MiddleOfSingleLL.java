package LinkedList;
class Node1 {
    int data;
    Node1 next;

    Node1(int x) {
        data = x;
        next = null;
    }
}
public class MiddleOfSingleLL {
    int getMiddle(Node1 head) {
        // code here
        int length=0;
        Node1 temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            length++;

        }
        Node1 temp2=head;
        for(int i=0;i<length/2;i++)
        {
            temp2=temp2.next;
        }
        return temp2.data;

    }
    static void main(String[] args) {

    }
}
