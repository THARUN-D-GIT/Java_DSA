package BinarySearchTree;
import java.util.*;
public class ValidateBST {
    static boolean flag;
    static void main(String[] args) {
        /*
        Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys strictly less than the node's key.
The right subtree of a node contains only nodes with keys strictly greater than the node's key.
Both the left and right subtrees must also be binary search trees.


Example 1:


Input: root = [2,1,3]
Output: true
Example 2:


Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.


Constraints:

The number of nodes in the tree is in the range [1, 104].
-231 <= Node.val <= 231 - 1
         */
        TreeNode root = new TreeNode(50);

        root.left = new TreeNode(30);
        root.right = new TreeNode(70);

        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);

        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);
        /*
         50
       /  \
     30    70
    / \    / \
   20 40  60 80
         */
        TreeNode root2 = new TreeNode(50);

        root2.left = new TreeNode(30);
        root2.right = new TreeNode(70);

        root2.left.left = new TreeNode(20);
        root2.left.right = new TreeNode(60);

        root2.right.left = new TreeNode(55);
        root2.right.right = new TreeNode(80);
        /*
         50
       /  \
     30    70
    / \    / \
   20 60  55 80
         */

        System.out.println("is root is valid BST?: "+isValidBST(root));
        System.out.println("is root2 is valid BST?: "+isValidBST(root2));



    }

    public static boolean isValidBST(TreeNode root)
    {
        flag=true;
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        return flag;
    }
    static void inorder(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null) return;
        inorder(root.left,arr);
        if(arr.size()>=1 && root.val<=arr.get(arr.size()-1)) flag=false;
        arr.add(root.val);
        inorder(root.right,arr);
    }
}
