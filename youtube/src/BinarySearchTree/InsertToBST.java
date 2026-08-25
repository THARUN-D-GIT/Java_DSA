package BinarySearchTree;
import java.util.*;

public class InsertToBST {
    static void main(String[] args) {
        /*

        LC-701
        You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.



Example 1:


Input: root = [4,2,7,1,3], val = 5
Output: [4,2,7,1,3,5]
Explanation: Another accepted tree is:

Example 2:

Input: root = [40,20,60,10,30,50,70], val = 25
Output: [40,20,60,10,30,50,70,null,null,25]
Example 3:

Input: root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
Output: [4,2,7,1,3,5]


Constraints:

The number of nodes in the tree will be in the range [0, 104].
-108 <= Node.val <= 108
All the values Node.val are unique.
-108 <= val <= 108
It's guaranteed that val does not exist in the original BST.
         */
        TreeNode root = new TreeNode(50);

        root.left = new TreeNode(30);
        root.right = new TreeNode(70);

        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);

        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        root.left.right.left = new TreeNode(35);

        root.right.left.right = new TreeNode(65);
        /*
                 50
               /    \
             30      70
            /  \    /  \
          20   40  60   80
              /       \
             35        65
         */
        System.out.println("tree before inserting:");
            print(root);
            insertIntoBST(root,45);
        System.out.println("tree after inserting 45:");
        print(root);
    }
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) {
            TreeNode ans= new TreeNode(val);
            return ans;
        }
        attach(root,val);
        return root;

        //Method 2
        //without helper function
//        if(root==null) return new TreeNode(val);
//        else if(root.val<val) root.right=insertIntoBST(root.right,val);
//        else  root.left=insertIntoBST(root.left,val);
//        return root;


    }
   static  void attach(TreeNode root,int val)
    {
        if(root==null) return;
        if(root.val<val)
        {
            // go right if lefts right is empty then insert
            if(root.right==null) root.right=new TreeNode(val);
            else attach(root.right,val);

        }
        else{
            if(root.left==null) root.left=new TreeNode(val);
            else attach(root.left,val);
        }
    }
    static void print(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            while (size-- > 0) {
                TreeNode curr = q.poll();

                System.out.print(curr.val + " ");

                if (curr.left != null)
                    q.add(curr.left);

                if (curr.right != null)
                    q.add(curr.right);
            }

            System.out.println();
        }
    }
}
