
package LinkedList;

public class AddTwo_LL {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode t2 = l2;
        ListNode t1 = l1;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        int carry = 0;

        while (t1 != null || t2 != null) {

            int val1 = 0;
            int val2 = 0;

            if (t1 != null)
                val1 = t1.val;

            if (t2 != null)
                val2 = t2.val;

            int sum = val1 + val2 + carry;

            if (sum > 9)
                carry = 1;
            else
                carry = 0;

            sum %= 10;

            ListNode a = new ListNode(sum);

            temp.next = a;
            temp = temp.next;

            if (t1 != null)
                t1 = t1.next;

            if (t2 != null)
                t2 = t2.next;
        }

        if (carry == 1) {
            ListNode c = new ListNode(carry);
            temp.next = c;
            temp = temp.next;
        }

        return reverse(dummy.next);
    }

    public static ListNode reverse(ListNode head) {

        ListNode p = null;
        ListNode f = null;
        ListNode c = head;

        while (c != null) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }

        return p;
    }

    // Create Linked List
    static ListNode createList(int[] arr) {

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    // Print Linked List
    static void printList(ListNode head) {

        while (head != null) {

            System.out.print(head.val);

            if (head.next != null)
                System.out.print(" -> ");

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        /*
                LC-445
        You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.



Example 1:


Input: l1 = [7,2,4,3], l2 = [5,6,4]
Output: [7,8,0,7]
Example 2:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [8,0,7]
Example 3:

Input: l1 = [0], l2 = [0]
Output: [0]


Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
         */

        // Example 1
        ListNode l1 = createList(new int[]{3, 4, 2});
        ListNode l2 = createList(new int[]{4, 6, 5});

        System.out.print("LL1: ");
        printList(l1);

        System.out.print("LL2: ");
        printList(l2);

        ListNode sum = addTwoNumbers(l1, l2);

        System.out.print("SUM: ");
        printList(sum);


        System.out.println();


        // Example 2
        // 999 + 1 = 1000

        l1 = createList(new int[]{9, 9, 9});
        l2 = createList(new int[]{1});

        System.out.print("LL1: ");
        printList(l1);

        System.out.print("LL2: ");
        printList(l2);

        sum = addTwoNumbers(l1, l2);

        System.out.print("SUM: ");
        printList(sum);


        System.out.println();


        // Example 3
        // 999 + 999 = 1998

        l1 = createList(new int[]{9, 9, 9});
        l2 = createList(new int[]{9, 9, 9});

        System.out.print("LL1: ");
        printList(l1);

        System.out.print("LL2: ");
        printList(l2);

        sum = addTwoNumbers(l1, l2);

        System.out.print("SUM: ");
        printList(sum);


        System.out.println();


        // Example 4
        // Different lengths
        // 123 + 7890 = 8013

        l1 = createList(new int[]{1, 2, 3});
        l2 = createList(new int[]{7, 8, 9, 0});

        System.out.print("LL1: ");
        printList(l1);

        System.out.print("LL2: ");
        printList(l2);

        sum = addTwoNumbers(l1, l2);

        System.out.print("SUM: ");
        printList(sum);
    }
}