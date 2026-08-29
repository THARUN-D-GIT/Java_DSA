package BinarySearchTree;

public class LCA_BST {
    static void main(String[] args) {
        /*
        Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”



Example 1:


Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.
Example 2:


Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
Example 3:

Input: root = [2,1], p = 2, q = 1
Output: 2


Constraints:

The number of nodes in the tree is in the range [2, 105].
-109 <= Node.val <= 109
All Node.val are unique.
p != q
p and q will exist in the BST.
         */
          /*
                    20
                  /    \
                10      30
               /  \    /  \
              5   15  25   35
                 /  \
                12  17
        */

        TreeNode root = new TreeNode(20);

        root.left = new TreeNode(10);
        root.right = new TreeNode(30);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);

        root.right.left = new TreeNode(25);
        root.right.right = new TreeNode(35);

        root.left.right.left = new TreeNode(12);
        root.left.right.right = new TreeNode(17);


        // Case 1
        TreeNode p = root.left;          // 10
        TreeNode q = root.right;         // 30
        System.out.println("LCA of 10 and 30 = "
                + lowestCommonAncestor(root, p, q).val);


        // Case 2
        p = root.left.left;              // 5
        q = root.left.right.right;       // 17
        System.out.println("LCA of 5 and 17 = "
                + lowestCommonAncestor(root, p, q).val);


        // Case 3
        p = root.right.left;              // 25
        q = root.right.right;             // 35
        System.out.println("LCA of 25 and 35 = "
                + lowestCommonAncestor(root, p, q).val);


        // Case 4
        p = root.left;                    // 10
        q = root.left.right;              // 15
        System.out.println("LCA of 10 and 15 = "
                + lowestCommonAncestor(root, p, q).val);


        // Case 5
        p = root.left;                    // 10
        q = root.left.left;               // 5
        System.out.println("LCA of 10 and 5 = "
                + lowestCommonAncestor(root, p, q).val);


        // Case 6
        p = root.left.right.left;         // 12
        q = root.left.right.right;        // 17
        System.out.println("LCA of 12 and 17 = "
                + lowestCommonAncestor(root, p, q).val);


        // Case 7
        p = root;                         // 20
        q = root.left.right.right;        // 17
        System.out.println("LCA of 20 and 17 = "
                + lowestCommonAncestor(root, p, q).val);

    }
    public  static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val>p.val && root.val>q.val) return lowestCommonAncestor(root.left,p,q);
        else if(root.val<p.val && root.val<q.val)
            return lowestCommonAncestor(root.right,p,q);
        else return root;



    }
}
