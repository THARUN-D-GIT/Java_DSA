package LinkedList;

import java.util.ArrayList;

public class Palindrome_LL {

    public static void main(String[] args) {
        /*
        Given the head of a singly linked list, return true if it is a palindrome or false otherwise.



Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false


Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9

         */

        // -------- Test Case 1 (Palindrome) --------
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);

        System.out.println("Test Case 1");
        System.out.print("Input      : ");
        printList(head1);
        System.out.println("Palindrome : " + isPalindrome(head1));

        System.out.println();

        // -------- Test Case 2 (Not Palindrome) --------
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.println("Test Case 2");
        System.out.print("Input      : ");
        printList(head2);
        System.out.println("Palindrome : " + isPalindrome(head2));
    }

    public static boolean isPalindrome(ListNode head) {

        // METHOD 1
//        ListNode temp = head;
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        while (temp != null) {
//            arr.add(temp.val);
//            temp = temp.next;
//        }
//
//        int n = arr.size();
//        int i = 0, j = n - 1;
//
//        while (i < j) {
//            int a = arr.get(i);
//            int b = arr.get(j);
//
//            if (a != b)
//                return false;
//
//            i++;
//            j--;
//        }
//
//        return true;

        // METHOD 2
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        head2 = reverse(head2);

        ListNode i = head;
        ListNode j = head2;

        while (j != null) {
            if (i.val != j.val)
                return false;

            i = i.next;
            j = j.next;
        }

        return true;
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