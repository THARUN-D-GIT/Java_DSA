package Heap;
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class IsCBT {
    static int s;
    public boolean isCompleteTree(TreeNode root) {
        s=size(root);
        return isCbt(root,1);

    }
    static int size(TreeNode root)
    {
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    static boolean isCbt(TreeNode root,int idx)
    {
        if(root==null) return true;
        if(idx>s) return false;
        return isCbt(root.left,2*idx) &&  isCbt(root.right,2*idx+1);


    }
    static void main(String[] args) {
        /*
        LC-958
        Given the root of a binary tree, determine if it is a complete binary tree.

In a complete binary tree, every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.



Example 1:


Input: root = [1,2,3,4,5,6]
Output: true
Explanation: Every level before the last is full (ie. levels with node-values {1} and {2, 3}), and all nodes in the last level ({4, 5, 6}) are as far left as possible.
Example 2:


Input: root = [1,2,3,4,5,null,7]
Output: false
Explanation: The node with value 7 isn't as far left as possible.


Constraints:

The number of nodes in the tree is in the range [1, 100].
1 <= Node.val <= 1000
         */
        // Example 1: [1,2,3,4,5,6]
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.right.left = new TreeNode(6);

        System.out.println("Example 1: " + new IsCBT().isCompleteTree(root1));


        // Example 2: [1,2,3,4,5,null,7]
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.right = new TreeNode(7);

        System.out.println("Example 2: " + new IsCBT().isCompleteTree(root2));
    }

}
