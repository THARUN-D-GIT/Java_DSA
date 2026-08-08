package LinkedList;

public class Circular_Linked_List {

    /*
     Circular Linked List:

     In a normal Linked List:

     1 -> 2 -> 3 -> null

     In a Circular Linked List:

     1 -> 2 -> 3
     ^         |
     |_________|

     The last node points back to the first node (head).

     Therefore, while traversing, we cannot use:

         temp != null

     because temp will never become null.

     We stop when temp comes back to head.
    */

    public static void printList(Node head) {

        System.out.print(head.val + " ");

        Node temp = head.next;

        while (temp != head) {

            System.out.print(temp.val + " ");

            temp = temp.next;
        }

        System.out.println();
    }


    public static void main(String[] args) {

        // Example 1
        // 1 -> 2 -> 3 -> back to 1

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.next = third;
        third.next = head;

        System.out.print("Circular LL: ");
        printList(head);


        // Example 2
        // 10 -> 20 -> 30 -> 40 -> back to 10

        head = new Node(10);
        second = new Node(20);
        third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = head;

        System.out.print("Circular LL: ");
        printList(head);


        // Example 3
        // Single node
        // 100 -> back to 100

        head = new Node(100);
        head.next = head;

        System.out.print("Circular LL: ");
        printList(head);
    }
}