package LinkedList;

public class MaximumTwinSum {

    public static void main(String[] args) {
        /*
        package LinkedList;

public class MaximumTwinSum {

    public static void main(String[] args) {

        // Test Case: 5 -> 4 -> 2 -> 1
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.print("Input            : ");
        printList(head);

        int result = pairSum(head);

        System.out.println("Maximum Twin Sum : " + result);
    }

    public static int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        head2 = reverse(head2);

        ListNode temp1 = head;
        ListNode temp2 = head2;

        int sum = 0;

        while (temp1 != null) {
            int t1 = temp1.val;
            int t2 = temp2.val;

            if ((t1 + t2) >= sum)
                sum = t1 + t2;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return sum;
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
         */

        // Test Case: 5 -> 4 -> 2 -> 1
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.print("Input            : ");
        printList(head);

        int result = pairSum(head);

        System.out.println("Maximum Twin Sum : " + result);
    }

    public static int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        head2 = reverse(head2);

        ListNode temp1 = head;
        ListNode temp2 = head2;

        int sum = 0;

        while (temp1 != null) {
            int t1 = temp1.val;
            int t2 = temp2.val;

            if ((t1 + t2) >= sum)
                sum = t1 + t2;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return sum;
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