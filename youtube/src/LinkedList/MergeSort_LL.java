package LinkedList;

public class MergeSort_LL {

    public static void main(String[] args) {

        // Test Case: 4 -> 2 -> 1 -> 3 -> 5
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Before: ");
        printList(head);

        ListNode result = sortList(head);

        System.out.print("After : ");
        printList(result);
    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode s = head;
        ListNode f = head;

        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }

        ListNode head2 = s.next;
        s.next = null;

        head = sortList(head);
        head2 = sortList(head2);

        return merger(head, head2);
    }

    public static ListNode merger(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        ListNode i = head1;
        ListNode j = head2;

        while (i != null && j != null) {
            if (i.val <= j.val) {
                k.next = i;
                i = i.next;
            } else {
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }

        if (i == null)
            k.next = j;
        else
            k.next = i;

        return dummy.next;
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
