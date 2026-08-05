package LinkedList;

public class ReverseOfLL {
    /*
    Given the head of a singly linked list. Reverse the linked list and return the head of the reversed list.

Examples:

Input:

Output: 4 -> 3 -> 2 -> 1
Explanation: After reversing the linked list

Input:

Output: 8 -> 9 -> 10 -> 7 -> 2
Explanation: After reversing the linked list

Input:

Output: 8
Explanation:

Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105
     */

    public static void main(String[] args) {

        // Test Case: 1 -> 2 -> 3 -> 4 -> 5
        Node1 head = new Node1(1);
        head.next = new Node1(2);
        head.next.next = new Node1(3);
        head.next.next.next = new Node1(4);
        head.next.next.next.next = new Node1(5);

        System.out.print("Before: ");
        printList(head);

        Node1 result = reverseList(head);

        System.out.print("After : ");
        printList(result);
    }

    public static Node1 reverseList(Node1 head) {

        // METHOD 1
//        ArrayList<Node1> arr = new ArrayList<>();
//        Node1 temp = head;
//        while (temp != null) {
//            arr.add(temp);
//            temp = temp.next;
//        }
//
//        int n = arr.size();
//        for (int i = n - 1; i >= 1; i--) {
//            Node1 t1 = arr.get(i);
//            Node1 t2 = arr.get(i - 1);
//            t1.next = t2;
//        }
//        arr.get(0).next = null;
//        return arr.get(n - 1);

        // METHOD 2
        Node1 p = null;
        Node1 f = null;
        Node1 c = head;

        while (c != null) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }

        return p;

        // METHOD 3
//        if (head == null || head.next == null)
//            return head;
//
//        Node1 a = head.next;
//        head.next = null;
//
//        Node1 b = reverseList(a);
//        a.next = head;
//
//        return b;
    }

    public static void printList(Node1 head) {
        Node1 temp = head;

        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }

        System.out.println();
    }
}