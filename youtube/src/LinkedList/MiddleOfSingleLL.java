package LinkedList;


public class MiddleOfSingleLL {

    int getMiddle(Node1 head) {
        int length = 0;
        Node1 temp = head;

        while (temp != null) {
            temp = temp.next;
            length++;
        }

        Node1 temp2 = head;

        for (int i = 0; i < length / 2; i++) {
            temp2 = temp2.next;
        }

        return temp2.data;
    }

    public static void main(String[] args) {

        // Creating the linked list
        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        head.next.next.next = new Node1(40);
        head.next.next.next.next = new Node1(50);

        // Creating object of the class
        MiddleOfSingleLL obj = new MiddleOfSingleLL();

        // Calling the method
        int middle = obj.getMiddle(head);

        System.out.println("Middle element: " + middle);
    }
}