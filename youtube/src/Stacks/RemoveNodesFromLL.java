package Stacks;

import java.util.Stack;

public class RemoveNodesFromLL {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // METHOD 1
    static ListNode removeNodes(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        ListNode temp=head;

        while(temp!=null)
        {
            // if(st.isEmpty())
            // {
            //     st.push(temp);

            // }
            // else{
            //     if(temp.val<=st.peek().val)
            //     {
            //         st.push(temp);

            //     }
            //     else{
            //         while((st.size()>0) &&(st.peek().val<temp.val)) st.pop();
            //         st.push(temp);
            //     }
            // }
            // temp=temp.next;
            // OR

            while(st.size()>0 && st.peek().val<temp.val) st.pop();
            st.push(temp);
            temp=temp.next;
        }
        //   ListNode ans=null;
        //         while(!(st.isEmpty()))
        //         {
        //            ListNode a=st.pop();
        //             a.next=ans;
        //             ans=a;
        //         }
        //NOTE THAT temp WILL ALSO BE IN NULL
        while(!(st.isEmpty()))
        {
            ListNode a=st.pop();
            a.next=temp;
            temp=a;
        }
        //return ans;
        return temp;
    }

    // METHOD 2
    static ListNode removeNodesMethod2(ListNode head) {

        ListNode temp = reverse(head);
        ListNode i = temp;
        ListNode j = temp.next;

        while (j != null) {

            if (i.val > j.val)
                j = j.next;

            else {
                i.next = j;
                i = j;
                j = j.next;
            }
        }

        i.next = null;

        ListNode ans = reverse(temp);
        return ans;
    }

    static ListNode reverse(ListNode head) {

        ListNode c = head;
        ListNode p = null;
        ListNode f = null;

        while (c != null) {

            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }

        return p;
    }

    static void print(ListNode head) {
        ListNode temp = head;

        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        /*
        You are given the head of a linked list.

Remove every node which has a node with a greater value anywhere to the right side of it.

Return the head of the modified linked list.



Example 1:


Input: head = [5,2,13,3,8]
Output: [13,8]
Explanation: The nodes that should be removed are 5, 2 and 3.
- Node 13 is to the right of node 5.
- Node 13 is to the right of node 2.
- Node 8 is to the right of node 3.
Example 2:

Input: head = [1,1,1,1]
Output: [1,1,1,1]
Explanation: Every node has value 1, so no nodes are removed.


Constraints:

The number of the nodes in the given list is in the range [1, 105].
1 <= Node.val <= 105
         */

        // 5 -> 2 -> 13 -> 3 -> 8
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        System.out.println("Before:");
        print(head);

        head = removeNodes(head);

        System.out.println("After:");
        print(head);
    }
}