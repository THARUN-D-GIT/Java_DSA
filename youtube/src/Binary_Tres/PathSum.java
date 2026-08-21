package Binary_Tres;

public class PathSum {

    public static boolean hasPathSum(TreeNode root, int target) {

        if(root==null) return false;

        if(root.left==null && root.right==null){ // finish the path at leaf

            if(target==root.val) return true;

            else return false;
        }

        return hasPathSum(root.left,target-root.val) ||
                hasPathSum(root.right,target-root.val);
    }

    // Prints the tree
    public static void printTree(TreeNode root) {

        if(root == null) {
            System.out.println("null");
            return;
        }

        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {

            TreeNode current = queue.poll();

            if(current == null) {
                System.out.print("null ");
                continue;
            }

            System.out.print(current.val + " ");

            queue.offer(current.left);
            queue.offer(current.right);
        }

        System.out.println();
    }

    // Prints tree, target sum and LC result
    public static void checkPathSum(TreeNode root, int target) {

        System.out.println("Tree:");
        printTree(root);

        System.out.println("Target Sum: " + target);
        System.out.println("Has Path Sum? " + hasPathSum(root, target));

        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        /*
        Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.



Example 1:


Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.
Example 2:


Input: root = [1,2,3], targetSum = 5
Output: false
Explanation: There are two root-to-leaf paths in the tree:
(1 --> 2): The sum is 3.
(1 --> 3): The sum is 4.
There is no root-to-leaf path with sum = 5.
Example 3:

Input: root = [], targetSum = 0
Output: false
Explanation: Since the tree is empty, there are no root-to-leaf paths.


Constraints:

The number of nodes in the tree is in the range [0, 5000].
-1000 <= Node.val <= 1000
-1000 <= targetSum <= 1000

         */

        // =========================
        // Example 1 -> TRUE
        // =========================

        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(8);

        root1.left.left = new TreeNode(11);
        root1.left.left.left = new TreeNode(7);
        root1.left.left.right = new TreeNode(2);

        root1.right.left = new TreeNode(13);
        root1.right.right = new TreeNode(4);
        root1.right.right.right = new TreeNode(1);

        int target1 = 22;

        System.out.println("Example 1:");
        checkPathSum(root1, target1);


        // =========================
        // Example 2 -> FALSE
        // =========================

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(8);

        root2.left.left = new TreeNode(11);
        root2.left.left.left = new TreeNode(7);
        root2.left.left.right = new TreeNode(2);

        root2.right.left = new TreeNode(13);
        root2.right.right = new TreeNode(4);
        root2.right.right.right = new TreeNode(1);

        int target2 = 30;

        System.out.println("Example 2:");
        checkPathSum(root2, target2);
    }
}
