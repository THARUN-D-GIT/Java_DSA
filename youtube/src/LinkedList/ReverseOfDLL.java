package LinkedList;

public class ReverseOfDLL {

    public static void main(String[] args) {

        // Creating DLL:
        // 1 <-> 2 <-> 3 <-> 4

        Node2 head = new Node2(1);
        Node2 second = new Node2(2);
        Node2 third = new Node2(3);
        Node2 fourth = new Node2(4);

        head.next = second;

        second.prev = head;
        second.next = third;

        third.prev = second;
        third.next = fourth;

        fourth.prev = third;


        // BEFORE REVERSAL
        System.out.print("Before reversal: ");

        Node2 temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();


        // Reverse DLL
        head = reverse(head);


        // AFTER REVERSAL
        System.out.print("After reversal: ");

        temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }


    /*
    // METHOD 1: Using three pointers

    public static Node2 reverse(Node2 head) {

        Node2 c = head;
        Node2 p = null;
        Node2 f = null;

        while (c != null) {

            f = c.next;
            c.next = p;
            c.prev = f;

            p = c;
            c = f;
        }

        return p;
    }
    */


    // METHOD 2: Two Pointer Technique

    public static Node2 reverse(Node2 head) {

        if (head == null || head.next == null)
            return head;

        Node2 c = head;
        Node2 temp = null;

        while (c != null) {

            temp = c.prev;

            c.prev = c.next;
            c.next = temp;

            c = c.prev;
        }

        return temp.prev;
    }
}