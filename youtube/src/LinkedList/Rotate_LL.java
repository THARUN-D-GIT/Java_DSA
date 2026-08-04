package LinkedList;

public class Rotate_LL {

    public static void main(String[] args) {
        /*
        Given the head of a linked list, rotate the list to the right by k places.



Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]


Constraints:

The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109
         */

        // Test Case: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.print("Before: ");
        printList(head);

        ListNode result = rotateRight(head, k);

        System.out.println("k = " + k);
        System.out.print("After : ");
        printList(result);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        ListNode t = head;
        int len = 0;
        while (t != null) {
            t = t.next;
            len++;
        }

        ListNode s = head;
        ListNode f = head;

        // fr 1 and 0 size
        if (head == null || head.next == null) return head;

        // for 0 rotations
        k %= len;
        if (k <= 0) return head;

        for (int i = 0; i < k + 1; i++) f = f.next;

        while (f != null) {
            s = s.next;
            f = f.next;
        }

        ListNode a = s.next;
        s.next = null;

        ListNode temp = a;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;
        return a;
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