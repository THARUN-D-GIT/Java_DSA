package BinarySearchTree;

public class RangeSumBST {
    static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        root.right.right = new TreeNode(18);

        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(4);
        /*
                 10
               /    \
              5      15
             / \       \
            3   7       18
           / \
          2   4
         */

        System.out.println("sum of values in range 7,15 for above tree is: "+rangeSumBST(root,7,15));
    }
    public static  int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        if(root.val>high) return rangeSumBST(root.left,low,high);
        else if(root.val<low) return rangeSumBST(root.right,low,high);
        else return root.val+ rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);

    }
}
