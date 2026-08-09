package LinkedList;

public class Reorder_LL {

    public static void main(String[] args) {
        /*
        You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.



Example 1:


Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]


Constraints:

The number of nodes in the list is in the range [1, 5 * 104].
1 <= Node.val <= 1000
         */

        // EVEN LIST
        // 1 -> 2 -> 3 -> 4 -> null

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);

        a.next = b;
        b.next = c;
        c.next = d;

        Reorder_LL obj = new Reorder_LL();

        System.out.println("Before reorder:");
        obj.printList(a);

        obj.reorderList(a);

        System.out.println("After reorder:");
        obj.printList(a);


        // ODD LIST
        // 10 -> 20 -> 30 -> 40 -> 50 -> null

        ListNode p = new ListNode(10);
        ListNode q = new ListNode(20);
        ListNode r = new ListNode(30);
        ListNode s = new ListNode(40);
        ListNode t = new ListNode(50);

        p.next = q;
        q.next = r;
        r.next = s;
        s.next = t;

        System.out.println("\nBefore reorder:");
        obj.printList(p);

        obj.reorderList(p);

        System.out.println("After reorder:");
        obj.printList(p);
    }


    public void reorderList(ListNode head) {

        if (head == null || head.next == null)
            return;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode b = slow.next;
        slow.next = null;

        b = reverse(b);

        ListNode t1 = head;
        ListNode t2 = b;

        while (t2 != null) {

            ListNode next1 = t1.next;
            ListNode next2 = t2.next;

            t1.next = t2;
            t2.next = next1;

            t1 = next1;
            t2 = next2;
        }
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


    public void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}