package Binary_Tres;
import java.util.*;

public class BTFromIn_and_pre_order {
    static void main(String[] args) {
        /*
        LC-105
        Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.



Example 1:


Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
Example 2:

Input: preorder = [-1], inorder = [-1]
Output: [-1]


Constraints:

1 <= preorder.length <= 3000
inorder.length == preorder.length
-3000 <= preorder[i], inorder[i] <= 3000
preorder and inorder consist of unique values.
Each value of inorder also appears in preorder.
preorder is guaranteed to be the preorder traversal of the tree.
inorder is guaranteed to be the inorder traversal of the tree.
         */
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = buildTree(preorder, inorder);

        System.out.println("Constructed Tree:");
        printTree(root);

    }
    public static  TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        int m=inorder.length;
        return build(0,n-1,0,m-1,preorder,inorder);

    }
    static TreeNode build(int prelo,int prehi,int inlo,int inhi,int[] preorder, int[] inorder)
    {
        if(prelo>prehi|| inlo>inhi) return null; //inlo>inhi is optional
        int val=preorder[prelo];
        TreeNode root=new TreeNode(val);
        int r=-1;
        for(int i=inlo;i<=inhi;i++){
            //locating root node in inorder
            if(inorder[i]==val){ r=i;
                break;
            }
        }
        int cnt=r-inlo;
        root.left= build(prelo+1,prelo+cnt,inlo,r-1,preorder,inorder);
        root.right= build(prelo+cnt+1,prehi,r+1,inhi,preorder,inorder);
        return root;


    }
    // Print tree level by level
    static void printTree(TreeNode root) {

        if (root == null)
            return;

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
