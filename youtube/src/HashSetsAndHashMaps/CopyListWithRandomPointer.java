package HashSetsAndHashMaps;


import java.util.HashMap;

class CopyListWithRandomPointer {

    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node copyRandomList(Node head) {

        Node dummy = new Node(-1);
        Node temp = head;
        Node temp1 = dummy;

        while (temp != null) {
            Node t1 = new Node(temp.val);
            temp1.next = t1;
            temp = temp.next;
            temp1 = temp1.next;
        }

        temp = head;
        temp1 = dummy.next;

        Node head1 = dummy.next;

        HashMap<Node, Node> map = new HashMap<>();
        map.put(null, null);

        while (temp != null && temp1 != null) {
            map.put(temp, temp1);
            temp = temp.next;
            temp1 = temp1.next;
        }

        temp = head;

        while (temp != null) {
            temp1 = map.get(temp);
            temp1.random = map.get(temp.random);
            temp = temp.next;
        }

        return head1;
    }

    static Node createList(int[] values, int[] randomIndices) {

        if (values.length == 0) return null;

        Node[] nodes = new Node[values.length];

        for (int i = 0; i < values.length; i++) {
            nodes[i] = new Node(values[i]);
        }

        for (int i = 0; i < values.length - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }

        for (int i = 0; i < values.length; i++) {
            if (randomIndices[i] != -1) {
                nodes[i].random = nodes[randomIndices[i]];
            }
        }

        return nodes[0];
    }

    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            int randomVal = (temp.random != null)
                    ? temp.random.val : -1;

            System.out.print(
                    "[" + temp.val + ", " + randomVal + "] "
            );

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        /*
        LC-138 Copy list with random pointers
        A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.

Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.

For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.

Return the head of the copied linked list.

The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:

val: an integer representing Node.val
random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
Your code will only be given the head of the original linked list.



Example 1:


Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
Example 2:


Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]
Example 3:



Input: head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]

         */

        // Example 1
        Node head1 = createList(
                new int[]{7, 13, 11, 10, 1},
                new int[]{-1, 0, 4, 2, 0}
        );

        System.out.println("Example 1:");
        printList(copyRandomList(head1));

        // Example 2
        Node head2 = createList(
                new int[]{1, 2},
                new int[]{1, 1}
        );

        System.out.println("Example 2:");
        printList(copyRandomList(head2));

        // Example 3
        Node head3 = createList(
                new int[]{3, 3, 3},
                new int[]{-1, 0, -1}
        );

        System.out.println("Example 3:");
        printList(copyRandomList(head3));

        // Example 4 - Empty list
        Node head4 = null;

        System.out.println("Example 4:");
        printList(copyRandomList(head4));
    }
}
