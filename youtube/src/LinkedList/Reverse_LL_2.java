package LinkedList;

public class Reverse_LL_2 {

    public static void main(String[] args) {
        /*
        Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.



Example 1:


Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
Example 2:

Input: head = [5], left = 1, right = 1
Output: [5]


Constraints:

The number of nodes in the list is n.
1 <= n <= 500
-500 <= Node.val <= 500
1 <= left <= right <= n

         */

        // Example: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List : ");
        printList(head);
        int left=2;
        int right=3;
        System.out.println("left value: "+left+" right value: "+right);

        head = reverseBetween(head, left,right);

        System.out.print("Modified List : ");
        printList(head);
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        //   ArrayList  arr=new ArrayList<>();
        //  ListNode temp=head;
        //  while(temp!=null)
        //  {
        //     arr.add(temp);
        //     temp=temp.next;
        //  }
        //  int i=left-1;
        //  int j=right-1;
        //  while(i<j)
        //  {
        //     ListNode a=arr.get(i);
        //     ListNode b=arr.get(j);
        //      arr.set(i,b);
        //     arr.set(j,a);

        //     i++;
        //     j--;
        //  }
        //  // connecting them each other important part
        //  for(i=0;i<arr.size();i++)
        //  {
        //     //using ternary operator
        //     // arr.get(i).next=(i==arr.size()-1) ? null:arr.get(i+1);
        //     if(i==arr.size()-1) arr.get(i).next=null;
        //      else arr.get(i).next=arr.get(i+1);
        //  }
        //  return arr.get(0);
        // }

        // method 2
        if(head==null || head.next==null || left==right) return head;

        ListNode d=new ListNode(-1);
        ListNode temp=d;
        temp.next=head;

        for(int i=1;i<=left-1;i++)
        {
            temp=temp.next;
        }

        ListNode tail1=temp;
        ListNode head2=temp.next;

        for(int i=1;i<=(right-left+1);i++)
            temp=temp.next;

        ListNode tail2=temp;
        ListNode head3=temp.next;

        tail1.next=null;
        tail2.next=null;

        reverse(head2);

        tail1.next=tail2;
        head2.next=head3;

        return d.next;
    }

    public static void reverse(ListNode head)
    {
        ListNode p=null;
        ListNode f=null;
        ListNode c=head;

        while(c!=null)
        {
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
    }

    public static void printList(ListNode head)
    {
        ListNode temp=head;

        while(temp!=null)
        {
            System.out.print(temp.val);

            if(temp.next!=null)
                System.out.print(" -> ");

            temp=temp.next;
        }

        System.out.println();
    }
}