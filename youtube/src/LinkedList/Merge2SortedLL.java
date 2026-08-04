package LinkedList;

public class Merge2SortedLL {

    public static void main(String[] args) {
        /*
        You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
         */

        // List 1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // List 2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.print("List 1 : ");
        printList(list1);

        System.out.print("List 2 : ");
        printList(list2);

        ListNode result = mergeTwoLists(list1, list2);

        System.out.print("Merged : ");
        printList(result);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // if(list1==null && list2==null) return null;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        ListNode i = list1;
        ListNode j = list2;

        while (i != null && j != null) {
            if (i.val <= j.val) {
                k.next = i;
                i = i.next;
            } else {
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }

        if (i == null) k.next = j;

        if (j == null) k.next = i;

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