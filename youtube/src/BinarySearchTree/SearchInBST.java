package BinarySearchTree;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class SearchInBST {
    static void main(String[] args) {
        /*
        You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.



Example 1:


Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]
Example 2:


Input: root = [4,2,7,1,3], val = 5
Output: []


Constraints:

The number of nodes in the tree is in the range [1, 5000].
1 <= Node.val <= 107
root is a binary search tree.
1 <= val <= 107
         */
        TreeNode root = new TreeNode(50);

        TreeNode a = new TreeNode(30);
        TreeNode b = new TreeNode(70);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(40);
        TreeNode e = new TreeNode(60);
        TreeNode f = new TreeNode(80);
        TreeNode g = new TreeNode(35);
        TreeNode h = new TreeNode(65);

        root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;

        b.left = e;
        b.right = f;

        d.left = g;
        e.right = h;

        /*
                 50
               /    \
             30      70
            /  \    /  \
          20   40  60   80
              /       \
             35        65
         */
        System.out.println(searchBST(root, 35).val);
        System.out.println(searchBST(root, 65).val);
        System.out.println(searchBST(root, 45));


    }
    public static TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val==val) return root;
        else if(root.val>val){
            // go left
            return searchBST(root.left,val);
        }
        else  return searchBST(root.right,val);
        // else return null;



    }
}
