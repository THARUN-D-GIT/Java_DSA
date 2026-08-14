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

    // LC method — unchanged except static
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

    static void print(ListNode head) {
        ListNode temp = head;

        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

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