package LinkedList;

public class FlattenMultiLevelDLL {

    public static void main(String[] args) {

        /*
         * BEFORE FLATTENING:
         *
         * 1 ⇄ 2 ⇄ 3 ⇄ 4 ⇄ 5 ⇄ 6
         *         |
         *         ↓
         *         7 ⇄ 8 ⇄ 9 ⇄ 10
         *             |
         *             ↓
         *             11 ⇄ 12
         *
         *
         * AFTER FLATTENING:
         *
         * 1 ⇄ 2 ⇄ 3 ⇄ 7 ⇄ 8 ⇄ 11 ⇄ 12 ⇄ 9 ⇄ 10 ⇄ 4 ⇄ 5 ⇄ 6
         */


        // Main level
        Node3 head = new Node3(1);
        Node3 n2 = new Node3(2);
        Node3 n3 = new Node3(3);
        Node3 n4 = new Node3(4);
        Node3 n5 = new Node3(5);
        Node3 n6 = new Node3(6);

        head.next = n2;
        n2.prev = head;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        n4.next = n5;
        n5.prev = n4;

        n5.next = n6;
        n6.prev = n5;


        // Child list of 3
        Node3 n7 = new Node3(7);
        Node3 n8 = new Node3(8);
        Node3 n9 = new Node3(9);
        Node3 n10 = new Node3(10);

        n7.next = n8;
        n8.prev = n7;

        n8.next = n9;
        n9.prev = n8;

        n9.next = n10;
        n10.prev = n9;

        n3.child = n7;


        // Child list of 8
        Node3 n11 = new Node3(11);
        Node3 n12 = new Node3(12);

        n11.next = n12;
        n12.prev = n11;

        n8.child = n11;


        FlattenMultiLevelDLL obj = new FlattenMultiLevelDLL();

        // BEFORE
        System.out.println("BEFORE FLATTENING:");
        obj.display(head);


        // FLATTEN
        head = obj.flatten(head);


        // AFTER
        System.out.println("\nAFTER FLATTENING:");
        obj.display(head);
    }


    // Display DLL
    public void display(Node3 head) {

        Node3 temp = head;

        while (temp != null) {
            System.out.print(temp.val);

            if (temp.next != null) {
                System.out.print(" <-> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }


    // Flatten multilevel DLL
    public Node3 flatten(Node3 head) {

        if (head == null)
            return head;

        Node3 curr = head;

        while (curr != null) {

            if (curr.child == null) {

                curr = curr.next;

            } else {

                Node3 fwd = curr.next;

                Node3 c = flatten(curr.child);

                curr.child = null;

                curr.next = c;
                c.prev = curr;

                Node3 temp = c;

                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = fwd;

                if (fwd != null) {
                    fwd.prev = temp;
                }
            }
        }

        return head;
    }
}


// Node3 class
class Node3 {

    int val;
    Node3 prev;
    Node3 next;
    Node3 child;

    Node3(int val) {
        this.val = val;
    }
}