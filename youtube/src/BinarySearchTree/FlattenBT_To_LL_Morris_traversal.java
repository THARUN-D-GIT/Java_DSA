package BinarySearchTree;

public class FlattenBT_To_LL_Morris_traversal {
    static void main(String[] args) {
        //already done using recursion and other method LC-114
        //this is using morris traversal
          /*
                 1
                / \
               2   5
              / \   \
             3   4   6
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(6);

        System.out.println("Before Flattening:");
        printTree(root);

        flatten(root);

        System.out.println("\nAfter Flattening:");
        printFlattened(root);

    }
    public  static void flatten(TreeNode root) {
        TreeNode cur=root;
        while(cur!=null)
        {
            if(cur.left!=null)
            {
                //pred can be found
                TreeNode pred=cur.left;
                while(pred.right!=null) pred=pred.right;
                pred.right=cur.right;
                cur.right=cur.left;
                cur.left=null;
                // cur=cur.right;
            }
            //    else{
            //     cur=cur.right;
            //    }
            cur=cur.right;

        }
    }
    // Prints the original tree sideways
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

    // Prints the flattened linked list
    static void printFlattened(TreeNode root) {

        TreeNode cur = root;

        while (cur != null) {

            System.out.print(cur.val);

            if (cur.left != null)
                System.out.print("(LEFT NOT NULL)");

            if (cur.right != null)
                System.out.print(" -> ");

            cur = cur.right;
        }

        System.out.println();
    }
}
