package LC_Practice;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class CountNodesEqualToAvgSubTree {
    static void main(String[] args) {
        /*
        LC-2265
        POTD-10-09-2026
        Given the root of a binary tree, return the number of nodes where the value of the node is equal to the average of the values in its subtree.

Note:

The average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.
A subtree of root is a tree consisting of root and all of its descendants.


Example 1:
                 // Tree 1
        //        4
        //       / \
        //      8   5
        //     / \   \
        //    0   1   6


Input: root = [4,8,5,0,1,null,6]
Output: 5
Explanation:
For the node with value 4: The average of its subtree is (4 + 8 + 5 + 0 + 1 + 6) / 6 = 24 / 6 = 4.
For the node with value 5: The average of its subtree is (5 + 6) / 2 = 11 / 2 = 5.
For the node with value 0: The average of its subtree is 0 / 1 = 0.
For the node with value 1: The average of its subtree is 1 / 1 = 1.
For the node with value 6: The average of its subtree is 6 / 1 = 6.
Example 2:


Input: root = [1]
Output: 1
Explanation: For the node with value 1: The average of its subtree is 1 / 1 = 1.


Constraints:

The number of nodes in the tree is in the range [1, 1000].
0 <= Node.val <= 1000
         */
        // Tree 1
        //        4
        //       / \
        //      8   5
        //     / \   \
        //    0   1   6

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(8);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);

        root.right.right = new TreeNode(6);

        System.out.println("Tree 1 → Valid subtree averages = "
                + averageOfSubtree(root));


        // Tree 2
        //      1
        //     / \
        //    2   3

        TreeNode root2 = new TreeNode(1);

        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println("Tree 2 → Valid subtree averages = "
                + averageOfSubtree(root2));


        // Tree 3
        //      5
        //     /
        //    5

        TreeNode root3 = new TreeNode(5);

        root3.left = new TreeNode(5);

        System.out.println("Tree 3 → Valid subtree averages = "
                + averageOfSubtree(root3));

    }
    public  static int averageOfSubtree(TreeNode root) {
        int[] count = new int[1];
        solve(root, count);
        return count[0];
    }

    static int[] solve(TreeNode root, int[] count) {

        if (root == null) {
            return new int[]{0, 0};
        }

        int[] left = solve(root.left, count);
        int[] right = solve(root.right, count);

        int sum = root.val + left[0] + right[0];
        int size = 1 + left[1] + right[1];

        if (root.val == sum / size) {
            count[0]++;
        }

        return new int[]{sum, size};
    }
}
