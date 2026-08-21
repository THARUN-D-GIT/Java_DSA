package Binary_Tres;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        invertTree(root.left);
        return isSameTree(root.left,root.right);
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        // if(!(isSameTree(p.left,q.left))) return false;
        // if(!(isSameTree(p.right,q.right))) return false;
        // return true;

        //OR
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right) ;
    }


    // Prints the tree
    public static void printTree(TreeNode root) {

        if(root == null) {
            System.out.println("null");
            return;
        }

        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {

            TreeNode current = queue.poll();

            if(current == null) {
                System.out.print("null ");
                continue;
            }

            System.out.print(current.val + " ");

            queue.offer(current.left);
            queue.offer(current.right);
        }

        System.out.println();
    }


    // Prints tree and LC result
    public static void checkSymmetric(TreeNode root) {

        System.out.println("Tree:");
        printTree(root);

        SymmetricTree obj = new SymmetricTree();

        System.out.println("Is Symmetric? " + obj.isSymmetric(root));

        System.out.println("--------------------------------");
    }


    public static void main(String[] args) {

        // =========================
        // Example 1 -> TRUE
        // =========================

        TreeNode root1 = new TreeNode(1);

        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);

        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);

        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(3);

        System.out.println("Example 1:");
        checkSymmetric(root1);


        // =========================
        // Example 2 -> FALSE
        // =========================

        TreeNode root2 = new TreeNode(1);

        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);

        root2.left.right = new TreeNode(3);
        root2.right.right = new TreeNode(3);

        System.out.println("Example 2:");
        checkSymmetric(root2);
    }
}