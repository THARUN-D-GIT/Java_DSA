package LinkedList;

public class SwappingKthNodeFromEndAndStart {

    public static void main(String[] args) {
        /*
        LC:1727
        You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).



Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]
Example 2:

Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]


Constraints:

The number of nodes in the list is n.
1 <= k <= n <= 105
0 <= Node.val <= 100
         */

        // Create the linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.print("Original List : ");
        printList(head);

        SwappingKthNodeFromEndAndStart obj = new SwappingKthNodeFromEndAndStart();
        head = obj.swapNodes(head, k);

        System.out.print("After Swapping : ");
        printList(head);
    }

    // LeetCode Function
    public ListNode swapNodes(ListNode head, int k) {

        ListNode s1 = head;
        ListNode s2 = head;
        ListNode f = head;

        for (int i = 0; i < k - 1; i++) {
            s1 = s1.next;
        }

        for (int i = 0; i < k; i++) {
            f = f.next;
        }

        while (f != null) {
            f = f.next;
            s2 = s2.next;
        }

        int temp = s1.val;
        s1.val = s2.val;
        s2.val = temp;

        return head;
    }

    // Print Linked List
    static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}