package BinarySearchTree;

public class DeleteNodesInBST {
    static void main(String[] args) {
        /*
        Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

Basically, the deletion can be divided into two stages:

Search for a node to remove.
If the node is found, delete the node.


Example 1:


Input: root = [5,3,6,2,4,null,7], key = 3
Output: [5,4,6,2,null,null,7]
Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.

Example 2:

Input: root = [5,3,6,2,4,null,7], key = 0
Output: [5,3,6,2,4,null,7]
Explanation: The tree does not contain a node with value = 0.
Example 3:

Input: root = [], key = 0
Output: []


Constraints:

The number of nodes in the tree is in the range [0, 104].
-105 <= Node.val <= 105
Each node has a unique value.
root is a valid binary search tree.
-105 <= key <= 105


Follow up: Could you solve it with time complexity O(height of tree)?
         */
        // Creating tree directly
        TreeNode root = new TreeNode(50);

        root.left = new TreeNode(30);
        root.right = new TreeNode(70);

        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.left.right.right = new TreeNode(45);

        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        System.out.println("===== BEFORE =====");
        printTree(root, 0);

        int target = 50;

        root = deleteNode(root, target);

        System.out.println("\n===== AFTER DELETING " + target + " =====");
        printTree(root, 0);

    }
    public static    TreeNode deleteNode(TreeNode root, int target) {
        if(root==null) return null;
        if(root.val>target){
            // go left
            root.left=deleteNode(root.left,target);
        }
        else if(root.val<target)
        {
            // go right
            root.right=deleteNode(root.right,target);
        }
        else{
            // target found;
            // case 1 leaf node
            if(root.left==null && root.right==null) return null;
            //case 2 for 1 chiild node
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            //case 3 when 2 child nodes
            TreeNode pred=root.left;
            while(pred.right!=null) pred=pred.right;
            //copy value for root
            root.val=pred.val;
            //then deete pred from left subtree
            root.left=deleteNode(root.left,pred.val);

        }
        return root;
    }
    // Print tree
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
