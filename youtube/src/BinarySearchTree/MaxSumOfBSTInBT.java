package BinarySearchTree;
import java.util.*;
class quad_2 {
    long max;
    long min;
    long sum;
    boolean bst;

    quad_2(long max, long min, long sum, boolean bst) {
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.bst = bst;
    }
}

public class MaxSumOfBSTInBT {
    static long max_sum;
    static void main(String[] args) {
         /*
                    5
                   / \
                  4   8
                 /   / \
                3   6   10
                   / \    \
                  7   9    12

            Maximum Sum BST = 27

            BST:
                    8
                   / \
                  6   10
                   \    \
                    9    12

            But 6 -> right 9 is valid, while 7 is
            left child of 6 and violates BST because 7 > 6?
        */

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(3);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(10);

        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(9);

        root.right.right.right = new TreeNode(12);

        System.out.print("Inorder: ");
        printInorder(root);

        System.out.println();

        System.out.println("Maximum Sum BST = " + maxSumBST(root));

    }
    public static int maxSumBST(TreeNode root) {
        max_sum = 0;
        helper(root);
        return (int) max_sum;
    }

    static quad_2 helper(TreeNode root) {

        if (root == null)
            return new quad_2(Long.MIN_VALUE, Long.MAX_VALUE, 0, true);

        quad_2 lst = helper(root.left);
        quad_2 rst = helper(root.right);

        long max = Math.max(root.val, Math.max(lst.max, rst.max));
        long min = Math.min(root.val, Math.min(lst.min, rst.min));

        long sum = root.val + lst.sum + rst.sum;

        boolean bst = lst.bst &&
                rst.bst &&
                lst.max < root.val &&
                rst.min > root.val;

        if (bst)
            max_sum = Math.max(sum, max_sum);

        return new quad_2(max, min, sum, bst);
    }

    // Print tree in inorder
    static void printInorder(TreeNode root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
}
