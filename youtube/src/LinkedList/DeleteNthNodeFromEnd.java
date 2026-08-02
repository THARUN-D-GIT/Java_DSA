package LinkedList;

public class DeleteNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;

        for(int i=0;i<n;i++)
        {

            fast=fast.next;
            if(fast==null) return head.next;
        }
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    static void main(String[] args) {
// Creating the linked list:
        // 10 -> 20 -> 30 -> 40 -> 50

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        int n = 2;

        DeleteNthNodeFromEnd obj = new DeleteNthNodeFromEnd();

        head = obj.removeNthFromEnd(head, n);

        // Printing the updated linked list
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    }

