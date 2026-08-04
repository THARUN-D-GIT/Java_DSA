package LinkedList;

public class RemoveDuplicatesFromSortedList_2 {

    public static void main(String[] args) {
        /*
        Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.



Example 1:


Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]
Example 2:


Input: head = [1,1,1,2,3]
Output: [2,3]


Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
         */

        // Test Case: 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        System.out.print("Before: ");
        printList(head);

        ListNode result = deleteDuplicates(head);

        System.out.print("After : ");
        printList(result);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode i = head;

        while (i != null) {
            if (i.next == null || i.val != i.next.val) {
                temp.next = i;
                temp = i;
                i = i.next;
            } else {
                ListNode j = i.next;
                while (j != null && j.val == i.val) {
                    j = j.next;
                }
                i = j;
            }
        }
        temp.next = i;
        return dummy.next;
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