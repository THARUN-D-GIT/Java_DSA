package Binary_Tres;

public class BalancedBT {
    static boolean flag;
    static void main(String[] args) {
        /*
        Given the root of a binary tree, determine if it is height-balanced or not.

Note: A binary tree is considered height-balanced if the absolute difference in heights of the left and right subtrees is at most 1 for every node in the tree.

Examples:

Input: root = [10, 20, 30, 40, 60]

Output: true
Explanation: The height difference between the left and right subtrees at all nodes is at most 1. Hence, the tree is balanced.
Input: root = [1, 2, 3, 4, N, N, N, 5]

Output: false
Explanation: The height difference between the left and right subtrees at node 2 is 2, which exceeds 1. Hence, the tree is not balanced.
Constraints:

1 ≤ no. of nodes in root, root.node->data ≤ 10
         */
        Gnode root2 = new Gnode(10);

        root2.left = new Gnode(20);
        root2.right = new Gnode(30);

        root2.left.left = new Gnode(40);
        root2.left.right = new Gnode(50);

        root2.right.right = new Gnode(60);
        Gnode root1 = new Gnode(10);

        root1.left = new Gnode(20);
        root1.right = new Gnode(30);

        root1.left.left = new Gnode(40);
        root1.left.right = new Gnode(50);

        root1.right.left = new Gnode(60);
        root1.right.right = new Gnode(70);
        System.out.println("is root1 id balanced?: "+isBalanced(root1));

        Gnode root3 = new Gnode(10);

        root3.left = new Gnode(20);
        root3.right = new Gnode(30);

        root3.left.left = new Gnode(40);
        root3.left.left.left = new Gnode(50);
        root3.left.left.left.left = new Gnode(60);
        System.out.println("is root3 id balanced?: "+isBalanced(root3));

    }

    // public boolean isBalanced(Node root) {
    //     // code here
    //     if(root==null) return true;
    //     int left=level(root.left);
    //     int right=level(root.right);
    //     if(Math.abs(left-right)>1) return false;
    //     return isBalanced(root.left) && isBalanced(root.right);
    // }
    // static int level(Node root)

    // {
    //     if(root==null) return 0;
    //     return 1+Math.max(level(root.left),level(root.right));
    // }

    //Method 2 using DP
    public static boolean isBalanced(Gnode root) {
        // code here
        if(root==null) return true;
        flag=true;
        level(root);
        return flag;

    }
    static int level(Gnode root)

    {
        if(root==null) return 0;
        int left=level(root.left);
        int right=level(root.right);
        if(Math.abs(left-right)>1) flag=false;
        return 1+Math.max(left,right);

    }
}
