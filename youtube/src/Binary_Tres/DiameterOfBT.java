package Binary_Tres;

public class DiameterOfBT {
    static int max;
    static void main(String[] args) {
        /*
        LC-543
        Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.



Example 1:


Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
Example 2:

Input: root = [1,2]
Output: 1


Constraints:

The number of nodes in the tree is in the range [1, 104].
-100 <= Node.val <= 100

         */
        TreeNode root1 = new TreeNode(1);

        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        root1.right.right = new TreeNode(6);

        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(8);


        TreeNode root2 = new TreeNode(1);

        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        root2.left.left = new TreeNode(4);
        root2.left.left.left = new TreeNode(5);

        root2.left.left.left.left = new TreeNode(6);
        root2.left.left.left.right = new TreeNode(7);
        System.out.println("Diameter for root1 is: "+diameterOfBinaryTree(root1));
        System.out.println("Diameter for root2 is: "+diameterOfBinaryTree(root2));

    }
// public int diameterOfBinaryTree(TreeNode root) {
    //     if(root==null) return 0;
    //     int d1=level(root.left)+level(root.right);
    //     int b=diameterOfBinaryTree(root.left);
    //     int c=diameterOfBinaryTree(root.right);
    //     return Math.max(d1,Math.max(b,c));

    // }
    // static int level(TreeNode root)
    // {
    //     if(root==null) return 0;
    //     return 1+Math.max(level(root.left),level(root.right));
    // }
    public static int diameterOfBinaryTree(TreeNode root) {
        max=0;
        level(root);
        return max;

    }
    static int level(TreeNode root)
    {
        if(root==null) return 0;
        int left=level(root.left);
        int right=level(root.right);
        max=Math.max(max,left+right);
        return 1+Math.max(left,right);
    }

}
