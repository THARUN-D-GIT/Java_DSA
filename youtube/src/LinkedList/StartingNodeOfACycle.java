package LinkedList;

public class StartingNodeOfACycle {

    public static void main(String[] args) {

        StartingNodeOfACycle obj = new StartingNodeOfACycle();

        // ==========================
        // Example 1 : Cycle Present
        // ==========================
        //
        // 3 -> 2 -> 0 -> -4
        //      ^         |
        //      |_________|

        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);

        // Create cycle
        head1.next.next.next.next = head1.next;

        ListNode ans1 = obj.detectCycle(head1);

        System.out.println("Example 1");
        if (ans1 != null)
            System.out.println("Cycle starts at node : " + ans1.val);
        else
            System.out.println("No Cycle");


        // ==========================
        // Example 2 : No Cycle
        // ==========================
        //
        // 1 -> 2 -> 3 -> 4 -> 5 -> null

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        ListNode ans2 = obj.detectCycle(head2);

        System.out.println("\nExample 2");
        if (ans2 != null)
            System.out.println("Cycle starts at node : " + ans2.val);
        else
            System.out.println("No Cycle");
    }

    // LeetCode Function
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                while (slow != temp) {
                    slow = slow.next;
                    temp = temp.next;
                }

                return temp;
            }
        }

        return null;
    }
}