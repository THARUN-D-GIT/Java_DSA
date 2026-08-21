package Binary_Tres;

public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }

    // Prints both trees and the LC result
    public static void checkTrees(TreeNode p, TreeNode q) {

        System.out.println("Tree 1:");
        printTree(p);

        System.out.println("\nTree 2:");
        printTree(q);

        System.out.println("\nAre both trees same? " + isSameTree(p, q));

        System.out.println("--------------------------------");
    }

    // Level-order printing of the tree
    public static void printTree(TreeNode root) {

        if (root == null) {
            System.out.println("null");
            return;
        }

        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            if (current == null) {
                System.out.print("null ");
                continue;
            }

            System.out.print(current.val + " ");

            queue.offer(current.left);
            queue.offer(current.right);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        /*
        Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.



Example 1:


Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:


Input: p = [1,2], q = [1,null,2]
Output: false
Example 3:


Input: p = [1,2,1], q = [1,1,2]
Output: false


Constraints:

The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104
         */

        // =========================
        // Example 1 -> TRUE
        // =========================

        TreeNode p1 = new TreeNode(1);
        p1.left = new TreeNode(2);
        p1.right = new TreeNode(3);
        p1.left.left = new TreeNode(4);
        p1.left.right = new TreeNode(5);

        TreeNode q1 = new TreeNode(1);
        q1.left = new TreeNode(2);
        q1.right = new TreeNode(3);
        q1.left.left = new TreeNode(4);
        q1.left.right = new TreeNode(5);

        System.out.println("Example 1:");
        checkTrees(p1, q1);


        // =========================
        // Example 2 -> FALSE
        // =========================

        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);
        p2.right = new TreeNode(3);
        p2.left.left = new TreeNode(4);

        TreeNode q2 = new TreeNode(1);
        q2.left = new TreeNode(2);
        q2.right = new TreeNode(3);
        q2.left.right = new TreeNode(4);

        System.out.println("Example 2:");
        checkTrees(p2, q2);
    }
}