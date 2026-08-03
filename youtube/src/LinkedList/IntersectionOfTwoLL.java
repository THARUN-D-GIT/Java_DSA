package LinkedList;

public class IntersectionOfTwoLL {
    public static  ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int len1=0;
        int len2=0;
        while(temp1!=null){
            temp1=temp1.next;
            len1++;
        }
        while(temp2!=null){
            temp2=temp2.next;
            len2++;
        }
        temp1=headA;
        temp2=headB;

        if(len1>len2)
        {
            for(int i=0;i<(len1-len2);i++) temp1=temp1.next;
            while(temp1!=null && temp2!=null)
            {if(temp1==temp2) return temp1;
                temp1=temp1.next;
                temp2=temp2.next;

            }

        }
        else{
            for(int i=0;i<(len2-len1);i++) temp2=temp2.next;
            while(temp2!=null && temp1!=null)
            {
                if(temp2==temp1) return temp1;
                temp1=temp1.next;
                temp2=temp2.next;

            }

        }
        return null;


    }

    public static void main(String[] args) {

        // Common part
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        // List A
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        // List B
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;


        ListNode ans = getIntersectionNode(headA, headB);

        if (ans != null)
            System.out.println("Intersection Node = " + ans.val);
        else
            System.out.println("No Intersection");
    }
}
