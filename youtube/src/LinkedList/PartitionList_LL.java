package LinkedList;

public class PartitionList_LL {

    public static void main(String[] args) {
        /*
        Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.



Example 1:


Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]
Example 2:

Input: head = [2,1], x = 2
Output: [1,2]


Constraints:

The number of nodes in the list is in the range [0, 200].
-100 <= Node.val <= 100
-200 <= x <= 200

         */

        // Test Case: 1 -> 4 -> 3 -> 2 -> 5 -> 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        int x = 3;

        System.out.print("Before: ");
        printList(head);

        ListNode result = partition(head, x);

        System.out.println("x = " + x);
        System.out.print("After : ");
        printList(result);
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode t1 = d1;
        ListNode t2 = d2;
        ListNode temp = head;

        while (temp != null) {
            if (temp.val < x) {
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

        ListNode temp2 = d1;
        while (temp2.next != null)
            temp2 = temp2.next;

        temp2.next = d2.next;

        return d1.next;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }

        System.out.println();
    }
}