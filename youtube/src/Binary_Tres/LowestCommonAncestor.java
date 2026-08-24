package Binary_Tres;

public class LowestCommonAncestor {
    static void main(String[] args) {

        /*
        Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”



Example 1:


Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of nodes 5 and 1 is 3.
Example 2:


Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
Example 3:

Input: root = [1,2], p = 1, q = 2
Output: 1


Constraints:

The number of nodes in the tree is in the range [2, 105].
-109 <= Node.val <= 109
All Node.val are unique.
p != q
p and q will exist in the tree.

         */

        TreeNode root = new TreeNode(10);

        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(15);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(7);
        TreeNode e = new TreeNode(12);
        TreeNode f = new TreeNode(20);
        TreeNode g = new TreeNode(6);
        TreeNode h = new TreeNode(8);

        root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;

        b.left = e;
        b.right = f;

        d.left = g;
        d.right = h;

        System.out.println(" LCA for a,b is: "+lowestCommonAncestor(root,a,b).val);
        System.out.println(" LCA for d,g is: "+lowestCommonAncestor(root,d,g).val);
        System.out.println(" LCA for c,h is: "+lowestCommonAncestor(root,c,h).val);
        System.out.println(" LCA for e,f is: "+lowestCommonAncestor(root,e,f).val);
        System.out.println(" LCA for g,h is: "+lowestCommonAncestor(root,g,h).val);

    }

    //METHOD 2

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        /*
         //METHOD 1
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     if(root==null) return null;
    //     if(root==p || root==q) return root;
    //     boolean pleft=exists(root.left,p);
    //     boolean qleft=exists(root.left,q);

    //     //when both lies in left
    //     if(pleft && qleft) return lowestCommonAncestor(root.left,p,q);
    //      // both lies in right
    //     else if(!pleft && !qleft){
    //         return lowestCommonAncestor(root.right,p,q);
    //     }
    //     // when one is in left and other is in right vice versa root is the only ans
    //     else return root;




    // }
    // static boolean exists(TreeNode root,TreeNode p)
    // {
    //     if(root==null) return false;
    //     if(root==p) return true;
    //     return exists(root.left,p) || exists(root.right,p);
    // }
         */

        if(root==null) return null;
        if(root==p || root==q) return root;
        TreeNode l=lowestCommonAncestor(root.left,p,q);
        TreeNode r=lowestCommonAncestor(root.right,p,q);
        // if they both not exists in either left or right
        //then one is in left and other is in right then return root
        if(l!=null && r!=null) return root;
        //if not then left or right
         /*
         when not in left retun right
         if(l==null) return r;
         else return l;
         */
        return (l==null)?r:l;
    }
}
