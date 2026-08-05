package LinkedList;

public class OddEven_LL_LC {

    public static void main(String[] args) {
        /*
        Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.



Example 1:


Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
Example 2:


Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]


Constraints:

The number of nodes in the linked list is in the range [0, 104].
-106 <= Node.val <= 106
         */

        // Test Case: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Before: ");
        printList(head);

        ListNode result = oddEvenList(head);

        System.out.print("After : ");
        printList(result);
    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode t1 = d1;
        ListNode t2 = d2;
        ListNode temp = head;
        int count = 1;

        while (temp != null) {
            if ((count) % 2 == 0) {
                t2.next = temp;
                temp = temp.next;
                t2 = t2.next;
                count++;
            } else {
                t1.next = temp;
                temp = temp.next;
                t1 = t1.next;
                count++;
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