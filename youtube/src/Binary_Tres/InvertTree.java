package Binary_Tres;

public class InvertTree {
    static void main(String[] args) {
        /*
        Given the root of a binary tree, invert the tree, and return its root.



Example 1:


Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
Example 2:


Input: root = [2,1,3]
Output: [2,3,1]
Example 3:

Input: root = []
Output: []


Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
         */
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;
        print(a);
        System.out.println();
        print(invertTree(a));
    }
    static void print(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val+" ");
        print(root.left);
        print(root.right);

    }
    public static TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        // TreeNode  a1=root.left;
        // TreeNode  a2=root.right;
        // root.left=a2;
        // root.right=a1;

        // invertTree(root.left);
        // invertTree(root.right);
        //post order
        // invertTree(root.left);
        // invertTree(root.right);
        // TreeNode  a1=root.left;
        // TreeNode  a2=root.right;
        // root.left=a2;
        // root.right=a1;

        //INORDER

        /*
        if we use same logic and add swap nodes in between it will be wrong because
        first u will find mirror of left that is right
        then swap left and right child
        now left will be og left only and right will be right only
        at last if we try to mirror right part it will only chnage right part which is wrong

        -> to correct that generate image of same side in both function call
        */
        invertTree(root.left);

        TreeNode  a1=root.left;
        TreeNode  a2=root.right;
        root.left=a2;
        root.right=a1;
        invertTree(root.left);
        return root;


    }
}
