package LinkedList;

import java.util.ArrayList;

public class MergeKSorted_LL {

    public static void main(String[] args) {
        /*
        You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.



Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted linked list:
1->1->2->3->4->4->5->6
Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
Output: []


Constraints:

k == lists.length
0 <= k <= 104
0 <= lists[i].length <= 500
-104 <= lists[i][j] <= 104
lists[i] is sorted in ascending order.
The sum of lists[i].length will not exceed 104.
         */

        // List 1: 1 -> 4 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        // List 2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // List 3: 2 -> 6
        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        ListNode[] lists = {list1, list2, list3};

        System.out.print("List 1 : ");
        printList(list1);

        System.out.print("List 2 : ");
        printList(list2);

        System.out.print("List 3 : ");
        printList(list3);

        ListNode result = mergeKLists(lists);

        System.out.print("Merged : ");
        printList(result);
    }

    public static ListNode mergeKLists(ListNode[] lists) {

    /*
    ===========================
            METHOD 1
    ===========================

    if (lists.length == 0) return null;

    ArrayList<ListNode> arr = new ArrayList<>();

    for (ListNode n : lists)
        arr.add(n);

    while (arr.size() > 1) {
        ListNode a = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);

        ListNode b = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);

        ListNode c = merge(a, b);
        arr.add(c);
    }

    return arr.get(0);

    */


    /*
    ===========================
            METHOD 2
    ===========================
    */

        if (lists.length == 0) return null;

        ArrayList<ListNode> arr1 = new ArrayList<>();
        ArrayList<ListNode> arr2 = new ArrayList<>();

        for (ListNode n : lists)
            arr1.add(n);

        while ((arr1.size() + arr2.size()) > 1) {

            while (arr1.size() > 1) {

                ListNode a = arr1.get(arr1.size() - 1);
                arr1.remove(arr1.size() - 1);

                ListNode b = arr1.get(arr1.size() - 1);
                arr1.remove(arr1.size() - 1);

                ListNode c = merge(a, b);
                arr2.add(c);
            }

            if (arr1.size() == 1) {
                arr2.add(arr1.get(0));
                arr1.remove(arr1.get(0));
            }

            while (arr2.size() > 1) {

                ListNode a = arr2.get(arr2.size() - 1);
                arr2.remove(arr2.size() - 1);

                ListNode b = arr2.get(arr2.size() - 1);
                arr2.remove(arr2.size() - 1);

                ListNode c = merge(a, b);
                arr1.add(c);
            }

            if (arr2.size() == 1) {
                arr1.add(arr2.get(0));
                arr2.remove(arr2.get(0));
            }
        }

        if (arr1.size() != 0)
            return arr1.get(0);

        return arr2.get(0);
    }

    public static ListNode merge(ListNode head1, ListNode head2) {
        ListNode i = head1;
        ListNode j = head2;
        ListNode d = new ListNode(-1);
        ListNode k = d;

        while (i != null && j != null) {
            if (i.val <= j.val) {
                k.next = i;
                i = i.next;
                k = k.next;
            } else {
                k.next = j;
                j = j.next;
                k = k.next;
            }
        }

        if (i == null)
            k.next = j;
        else
            k.next = i;

        return d.next;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }

        System.out.println();
    }
}
