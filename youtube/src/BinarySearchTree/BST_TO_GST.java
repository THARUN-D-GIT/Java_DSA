package BinarySearchTree;

public class BST_TO_GST {
    static int sum;
    static void main(String[] args) {
        /*
        LC-538
        Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus the sum of all keys greater than the original key in BST.

As a reminder, a binary search tree is a tree that satisfies these constraints:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.


Example 1:


Input: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
Example 2:

Input: root = [0,null,1]
Output: [1,null,1]


Constraints:

The number of nodes in the tree is in the range [0, 104].
-104 <= Node.val <= 104
All the values in the tree are unique.
root is guaranteed to be a valid binary search tree.


Note: This question is the same as 1038: https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
         */

  /*
                    5
                  /   \
                 2     13
                / \
               1   3
        */

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(2);
        root.right = new TreeNode(13);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);


        System.out.println("Before conversion:");
        printTree(root);

        convertBST(root);

        System.out.println("\nAfter conversion:");
        printTree(root);

    }

    public  static TreeNode convertBST(TreeNode root) {
        /*
        METHOD 1
         public TreeNode convertBST(TreeNode root) {
             ArrayList<TreeNode> arr=new ArrayList<>();
             inorder(root,arr);

             int sum=0;
             for(int i=arr.size()-1;i>=0;i--)
             {
                 sum+=arr.get(i).val;
                 arr.get(i).val=sum;


             }
             return root;



         }
         static void inorder(TreeNode root,ArrayList<TreeNode> arr)
         {
             if(root==null) return;
             inorder(root.left,arr);
             arr.add(root);
             inorder(root.right,arr);
         }

         */
        sum=0;
        revInorder(root);
        return root;
    }
    static void revInorder(TreeNode root)
    {
        if(root==null) return;
        revInorder(root.right);
        sum+=root.val;
        root.val=sum;
        revInorder(root.left);
    }
    // Print tree sideways
    static void printTree(TreeNode root) {
        printTree(root, 0);
    }

    static void printTree(TreeNode root, int level) {

        if (root == null)
            return;

        printTree(root.right, level + 1);

        for (int i = 0; i < level; i++)
            System.out.print("    ");

        System.out.println(root.val);

        printTree(root.left, level + 1);
    }

}
