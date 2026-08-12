package LinkedList;

public class DeepCopyOfListWithRandomPointer {

    public static void main(String[] args) {

        /*
         * LeetCode 138 - Copy List with Random Pointer
         *
         *
         * BEFORE:
         *
         *       ┌──────────────┐
         *       ↓              │
         *  1 -> 2 -> 3 -> 4
         *  ↑    │         │
         *  │    └─────────┘
         *  │
         *  └─────────────────
         *
         *
         * Each node contains:
         *
         *        val
         *         |
         *         ↓
         *     +-------+
         *     |   1   |
         *     | next  | -----> next node
         *     |random | -----> any node / null
         *     +-------+
         *
         *
         * STEP 1:
         * Create a normal deep copy.
         *
         * Original:
         * 1 -> 2 -> 3
         *
         * Copy:
         * 1' -> 2' -> 3'
         *
         *
         * STEP 2:
         * Merge original and copied nodes alternately.
         *
         * 1 -> 1' -> 2 -> 2' -> 3 -> 3'
         *
         *
         * STEP 3:
         * Connect random pointers.
         *
         * If:
         * 1.random = 3
         *
         * Then:
         * 1'.random = 3'
         *
         * We get 3' using:
         *
         * 1.random.next
         *
         *
         * STEP 4:
         * Split the merged list.
         *
         * Original:
         * 1 -> 2 -> 3
         *
         * Copy:
         * 1' -> 2' -> 3'
         *
         *
         * FINAL:
         *
         * Original List:
         * 1 -> 2 -> 3
         *
         * Deep Copy:
         * 1' -> 2' -> 3'
         */


        // Creating original list
        Node4 head = new Node4(1);
        head.next = new Node4(2);
        head.next.next = new Node4(3);
        head.next.next.next = new Node4(4);


        // Random connections
        head.random = head.next.next;                  // 1 -> 3
        head.next.random = head;                       // 2 -> 1
        head.next.next.random = head.next.next.next;  // 3 -> 4
        head.next.next.next.random = head.next;       // 4 -> 2


        System.out.println("ORIGINAL LIST:");
        display(head);


        // Copy
        Node4 copy = copyRandomList(head);


        System.out.println("\nCOPIED LIST:");
        display(copy);
    }


    // STEP 1
    // Create a normal deep copy
    public static Node4 deepcopy(Node4 head) {

        Node4 temp1 = head;

        Node4 head2 = new Node4(-1);   // dummy node
        Node4 temp2 = head2;

        while (temp1 != null) {

            Node4 t = new Node4(temp1.val);

            temp2.next = t;
            temp2 = temp2.next;

            temp1 = temp1.next;
        }

        return head2.next;
    }


    // STEP 2
    // Merge original and copied list
    public static void merge(Node4 head, Node4 head2) {

        Node4 t1 = head;
        Node4 t2 = head2;

        while (t1 != null && t2 != null) {

            Node4 next1 = t1.next;
            Node4 next2 = t2.next;

            t1.next = t2;
            t2.next = next1;

            t1 = next1;
            t2 = next2;
        }
    }


    // STEP 3
    // Connect random pointers of copied nodes
    public static void randomconnection(Node4 head) {

        Node4 temp1 = head;

        while (temp1 != null) {

            Node4 copy = temp1.next;

            if (temp1.random == null) {
                copy.random = null;
            } else {
                copy.random = temp1.random.next;
            }

            temp1 = temp1.next.next;
        }
    }


    // STEP 4
    // Split original and copied lists
    public static Node4 split(Node4 head) {

        Node4 original = head;
        Node4 copy = head.next;

        Node4 copyHead = copy;

        while (original != null) {

            original.next = original.next.next;

            if (copy.next != null) {
                copy.next = copy.next.next;
            }

            original = original.next;

            if (copy.next != null) {
                copy = copy.next;
            }
        }

        return copyHead;
    }


    public static Node4 copyRandomList(Node4 head) {

        if (head == null)
            return null;


        // STEP 1:
        // Create normal deep copy
        Node4 head2 = deepcopy(head);


        // STEP 2:
        // Merge original and copied nodes
        merge(head, head2);


        // STEP 3:
        // Connect random pointers
        randomconnection(head);


        // STEP 4:
        // Split the merged list
        head2 = split(head);


        return head2;
    }


    // Display list
    public static void display(Node4 head) {

        Node4 temp = head;

        while (temp != null) {

            System.out.print("[" + temp.val + "]");

            if (temp.random != null) {
                System.out.print("(random -> " + temp.random.val + ")");
            } else {
                System.out.print("(random -> null)");
            }

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}


// Node4 class
class Node4 {

    int val;
    Node4 next;
    Node4 random;

    public Node4(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}