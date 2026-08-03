package LinkedList;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {

        RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();

        // ===================================
        // Example 1 : Normal Case
        // 1 -> 1 -> 2 -> 3 -> 3
        // Expected : 1 -> 2 -> 3
        // ===================================
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(3);

        System.out.print("Example 1 (Before) : ");
        printList(head1);

        head1 = obj.deleteDuplicates(head1);

        System.out.print("Example 1 (After)  : ");
        printList(head1);



        // ===================================
        // Example 2 : No Duplicates
        // 1 -> 2 -> 3 -> 4
        // Expected : 1 -> 2 -> 3 -> 4
        // ===================================
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);

        System.out.print("\nExample 2 (Before) : ");
        printList(head2);

        head2 = obj.deleteDuplicates(head2);

        System.out.print("Example 2 (After)  : ");
        printList(head2);



        // ===================================
        // Example 3 : All Nodes Same
        // 5 -> 5 -> 5 -> 5
        // Expected : 5
        // ===================================
        ListNode head3 = new ListNode(5);
        head3.next = new ListNode(5);
        head3.next.next = new ListNode(5);
        head3.next.next.next = new ListNode(5);

        System.out.print("\nExample 3 (Before) : ");
        printList(head3);

        head3 = obj.deleteDuplicates(head3);

        System.out.print("Example 3 (After)  : ");
        printList(head3);



        // ===================================
        // Example 4 : Single Node
        // 10
        // Expected : 10
        // ===================================
        ListNode head4 = new ListNode(10);

        System.out.print("\nExample 4 (Before) : ");
        printList(head4);

        head4 = obj.deleteDuplicates(head4);

        System.out.print("Example 4 (After)  : ");
        printList(head4);



        // ===================================
        // Example 5 : Empty List
        // null
        // Expected : null
        // ===================================
        ListNode head5 = null;

        System.out.print("\nExample 5 (Before) : ");
        printList(head5);

        head5 = obj.deleteDuplicates(head5);

        System.out.print("Example 5 (After)  : ");
        printList(head5);



        // ===================================
        // Example 6 : Duplicates at Beginning
        // 1 -> 1 -> 1 -> 2 -> 3
        // Expected : 1 -> 2 -> 3
        // ===================================
        ListNode head6 = new ListNode(1);
        head6.next = new ListNode(1);
        head6.next.next = new ListNode(1);
        head6.next.next.next = new ListNode(2);
        head6.next.next.next.next = new ListNode(3);

        System.out.print("\nExample 6 (Before) : ");
        printList(head6);

        head6 = obj.deleteDuplicates(head6);

        System.out.print("Example 6 (After)  : ");
        printList(head6);



        // ===================================
        // Example 7 : Duplicates at End
        // 1 -> 2 -> 3 -> 3 -> 3
        // Expected : 1 -> 2 -> 3
        // ===================================
        ListNode head7 = new ListNode(1);
        head7.next = new ListNode(2);
        head7.next.next = new ListNode(3);
        head7.next.next.next = new ListNode(3);
        head7.next.next.next.next = new ListNode(3);

        System.out.print("\nExample 7 (Before) : ");
        printList(head7);

        head7 = obj.deleteDuplicates(head7);

        System.out.print("Example 7 (After)  : ");
        printList(head7);
    }


    // ==========================
    // Your LeetCode Function
    // (Unchanged)
    // ==========================
    public ListNode deleteDuplicates(ListNode head) {
        // ListNode temp=head;
        // while( temp!=null && temp.next!=null)
        // {
        //     if(temp.val==temp.next.val){
        //         temp.next=temp.next.next;
        //     }
        //     else temp=temp.next;
        // }
        // return head;
        ListNode i=head;
        ListNode j=head;
        while(j!=null)
        {
            if(i.val==j.val) j=j.next;
            else {
                i.next=j;
                i=j;
            }
        }
        if(head!=null) i.next=j;
        //this is for last node values
        return head;

    }


    static void printList(ListNode head) {

        if(head==null){
            System.out.println("null");
            return;
        }

        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }
}