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

public class SegregateEvenOdd_GFG {

    public static void main(String[] args) {
        /*
        Given the head of a singly linked list, rearrange the list in place so that all nodes containing even values appear before nodes containing odd values. Return the head of the modified linked list.

Note: The relative order of the even nodes and the odd nodes should remain unchanged.

Examples:

Input:

Output: 8 -> 2 -> 4 -> 6 -> 17 -> 15 -> 9
Explanation: Since 8, 2, 4, and 6 are even, they appear first in the list, followed by the odd numbers 17, 15, and 9.

Input:

Output: 1 -> 3 -> 5 -> 7
Explanation: There is no even number, so no modification is needed.

Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105


         */

        // Test Case: 17 -> 15 -> 8 -> 12 -> 10 -> 5 -> 4
        Node1 head = new Node1(17);
        head.next = new Node1(15);
        head.next.next = new Node1(8);
        head.next.next.next = new Node1(12);
        head.next.next.next.next = new Node1(10);
        head.next.next.next.next.next = new Node1(5);
        head.next.next.next.next.next.next = new Node1(4);

        System.out.print("Before: ");
        printList(head);

        Node1 result = divide(head);

        System.out.print("After : ");
        printList(result);
    }

    public static Node1 divide(Node1 head) {
        Node1 d1 = new Node1(-1);
        Node1 d2 = new Node1(-1);
        Node1 t1 = d1;
        Node1 t2 = d2;
        Node1 temp = head;

        while (temp != null) {
            if ((temp.data) % 2 == 0) {
                t1.next = temp;
                temp = temp.next;
                t1 = t1.next;
            } else {
                t2.next = temp;
                temp = temp.next;
                t2 = t2.next;
            }
        }

        t1.next = null;
        t2.next = null;

        Node1 temp2 = d1;
        while (temp2.next != null)
            temp2 = temp2.next;

        temp2.next = d2.next;

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