package Heap;

import java.util.ArrayList;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BST_To_MaxHeap {

    static int idx;

    public static void convertToMaxHeap(Node root) {
        idx = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        // Store BST elements in sorted order
        inorder(root, ans);

        // Fill the same tree using postorder
        postorder(root, ans);
    }

    static void inorder(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;

        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);
    }

    static void postorder(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;

        postorder(root.left, ans);
        postorder(root.right, ans);

        root.data = ans.get(idx++);
    }

    // Print tree in level order
    static void printLevelOrder(Node root) {
        if (root == null)
            return;

        ArrayList<Node> queue = new ArrayList<>();
        queue.add(root);

        int i = 0;

        while (i < queue.size()) {
            Node current = queue.get(i++);

            System.out.print(current.data + " ");

            if (current.left != null)
                queue.add(current.left);

            if (current.right != null)
                queue.add(current.right);
        }

        System.out.println();
    }

    // Print tree in postorder
    static void printPostorder(Node root) {
        if (root == null)
            return;

        printPostorder(root.left);
        printPostorder(root.right);

        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        /*
         * QUESTION:
         *
         * Given a Binary Search Tree, convert it into a Special Max Heap
         * with the condition that all the values in the left subtree of a
         * node should be less than all the values in the right subtree of
         * the node.
         *
         * This condition is applied on all the nodes in the so converted
         * Max Heap.
         *
         * The tree structure should remain unchanged.
         *
         * Example 1:
         * Input:  root[] = [4, 2, 6, 1, 3, 5, 7]
         * Output: [1, 2, 3, 4, 5, 6, 7]
         *
         * Example 2:
         * Input:  root[] = [5, 3, 8, 2, 4, 7, 9]
         * Output: [2, 3, 4, 5, 7, 8, 9]
         */

        // ---------------------------------------------------------
        // Example 1
        // BST:
        //
        //          4
        //        /   \
        //       2     6
        //      / \   / \
        //     1   3 5   7
        // ---------------------------------------------------------

        Node root1 = new Node(4);

        root1.left = new Node(2);
        root1.right = new Node(6);

        root1.left.left = new Node(1);
        root1.left.right = new Node(3);

        root1.right.left = new Node(5);
        root1.right.right = new Node(7);

        System.out.println("Example 1:");

        System.out.print("Before conversion (Level Order): ");
        printLevelOrder(root1);

        convertToMaxHeap(root1);

        System.out.print("After conversion (Level Order):  ");
        printLevelOrder(root1);

        System.out.print("Postorder: ");
        printPostorder(root1);
        System.out.println("\n");


        // ---------------------------------------------------------
        // Example 2
        // BST:
        //
        //          5
        //        /   \
        //       3     8
        //      / \   / \
        //     2   4 7   9
        // ---------------------------------------------------------

        Node root2 = new Node(5);

        root2.left = new Node(3);
        root2.right = new Node(8);

        root2.left.left = new Node(2);
        root2.left.right = new Node(4);

        root2.right.left = new Node(7);
        root2.right.right = new Node(9);

        System.out.println("Example 2:");

        System.out.print("Before conversion (Level Order): ");
        printLevelOrder(root2);

        convertToMaxHeap(root2);

        System.out.print("After conversion (Level Order):  ");
        printLevelOrder(root2);

        System.out.print("Postorder: ");
        printPostorder(root2);
        System.out.println("\n");


        // ---------------------------------------------------------
        // Example 3
        // Smaller BST
        //
        //       2
        //      / \
        //     1   3
        // ---------------------------------------------------------

        Node root3 = new Node(2);
        root3.left = new Node(1);
        root3.right = new Node(3);

        System.out.println("Example 3:");

        System.out.print("Before conversion (Level Order): ");
        printLevelOrder(root3);

        convertToMaxHeap(root3);

        System.out.print("After conversion (Level Order):  ");
        printLevelOrder(root3);

        System.out.print("Postorder: ");
        printPostorder(root3);
        System.out.println();
    }
}