package LinkedList;

//class Node1 {
//    int data;
//    Node1 next;
//
//    Node1(int x) {
//        data = x;
//        next = null;
//    }
//}

public class PartitionList_GFG {

    public static void main(String[] args) {
        /*
        Given the head of a linked list and an integer x, rearrange the list such that:
All nodes with values less than x appear first,
Followed by nodes with values equal to x,
Followed by nodes with values greater than x.
The relative order of nodes within each partition must remain unchanged, and the rearrangement should be performed in-place.

Examples:
Input: head: 1->4->2->10, x = 3

Output: 1->2->4->10

Explanation: Nodes with value less than 3 come first, then equal to 3 and then greater than 3.
Input: head: 1->4->3->2->5->2->3, x = 3

Output: 1->2->2->3->3->4->5

Explanation: Nodes with a value less than 3 come first, then equal to 3 and then greater than 3.
Constraints:
1 ≤ size of linked list ≤ 105
1 ≤ data of node ≤ 105
1 ≤ x ≤ 105
         */

        // Test Case: 1 -> 4 -> 3 -> 2 -> 5 -> 2
        Node1 head = new Node1(1);
        head.next = new Node1(4);
        head.next.next = new Node1(3);
        head.next.next.next = new Node1(2);
        head.next.next.next.next = new Node1(5);
        head.next.next.next.next.next = new Node1(2);

        int x = 3;

        System.out.print("Before: ");
        printList(head);

        Node1 result = partition(head, x);

        System.out.println("x = " + x);
        System.out.print("After : ");
        printList(result);
    }

    public static Node1 partition(Node1 head, int x) {
        Node1 d1 = new Node1(-1); // less than
        Node1 d2 = new Node1(-1); // equal to
        Node1 d3 = new Node1(-1); // greater than

        Node1 t1 = d1;
        Node1 t2 = d2;
        Node1 t3 = d3;
        Node1 temp = head;

        while (temp != null) {
            if (temp.data < x) {
                t1.next = temp;
                temp = temp.next;
                t1 = t1.next;
            } else if (temp.data > x) {
                t3.next = temp;
                temp = temp.next;
                t3 = t3.next;
            } else {
                t2.next = temp;
                temp = temp.next;
                t2 = t2.next;
            }
        }

        t1.next = null;
        t2.next = null;
        t3.next = null;

        Node1 temp2 = d1;

        while (temp2.next != null)
            temp2 = temp2.next;

        temp2.next = d2.next;

        while (temp2.next != null)
            temp2 = temp2.next;

        temp2.next = d3.next;

        return d1.next;
    }

    public static void printList(Node1 head) {
        Node1 temp = head;

        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }

        System.out.println();
    }
}