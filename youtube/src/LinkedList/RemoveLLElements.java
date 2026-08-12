package LinkedList;

public class RemoveLLElements {

    public static void main(String[] args) {
        /*
        LC-203
            Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.



Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []


Constraints:

The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50
         */

        // Example:
        // 1 -> 6 -> 6 -> 3 -> 6 -> 4

        ListNode head = new ListNode(1);
        head.next = new ListNode(6);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(4);

        int val = 6;

        // BEFORE
        System.out.print("Before removal: ");

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();


        // Remove elements
        head = removeElements(head, val);


        // AFTER
        System.out.print("After removal: ");

        temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }


    public static ListNode removeElements(ListNode head, int val) {

        if (head == null)
            return null;


        // When the value is at the start of the node
        while (head != null && head.val == val)
            head = head.next;


        // Important:
        // temp must point to the new head
        ListNode temp = head;


        while (temp != null && temp.next != null) {

            if (temp.next.val != val)
                temp = temp.next;

            else {
                temp.next = temp.next.next;
                // temp = temp.next;
            }
        }


        return head;
    }
}