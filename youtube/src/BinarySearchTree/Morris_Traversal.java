package BinarySearchTree;

import java.util.ArrayList;

public class Morris_Traversal {
    static void main(String[] args) {
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
        System.out.println("inorder traversal of above tree is: ");
        System.out.println(inorder(root));


    }
    public static ArrayList<Integer> inorder(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        TreeNode cur = root;
        while (cur != null) {
            if(cur.left != null) {
                //find predecessor
                TreeNode pred = cur.left;
                while(pred.right != null && pred.right != cur) {
                    pred = pred.right;
                }
                if(pred.right==null)
                {
                    //dummy connection
                    pred.right=cur;
                    cur=cur.left;
                }
                else{
                    //pred.right=curr
                    //unlink
                    pred.right=null;
                    ans.add(cur.val);
                    cur=cur.right;
                }

            }
            else{
                ans.add(cur.val);
                cur = cur.right;
            }
        }
        return ans;
    }
}
