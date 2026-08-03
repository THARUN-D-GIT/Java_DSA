package LinkedList;

public class CycleInLL {

    public static void main(String[] args) {

        CycleInLL obj = new CycleInLL();

        // ==========================
        // Example 1 : Cycle Present
        // ==========================

        // 3 -> 2 -> 0 -> -4
        //      ^         |
        //      |_________|

        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);

        // Create cycle
        head1.next.next.next.next = head1.next;

        System.out.println("Example 1");
        System.out.println("Cycle Present : " + obj.hasCycle(head1));



        // ==========================
        // Example 2 : No Cycle
        // ==========================

        // 1 -> 2 -> 3 -> 4 -> 5 -> null

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        System.out.println("\nExample 2");
        System.out.println("Cycle Present : " + obj.hasCycle(head2));
    }

    // LeetCode Function
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }
}