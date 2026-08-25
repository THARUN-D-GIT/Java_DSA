package BinarySearchTree;

public class KthSmallestElementInBST {
    static int k2;
    static int ans;

    static void main(String[] args) {
        /*
        Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.



Example 1:


Input: root = [3,1,4,null,2], k = 1
Output: 1
Example 2:


Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3


Constraints:

The number of nodes in the tree is n.
1 <= k <= n <= 104
0 <= Node.val <= 10
         */
        TreeNode root = new TreeNode(50);

        root.left = new TreeNode(30);
        root.right = new TreeNode(70);

        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);

        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        root.left.left.left = new TreeNode(10);
        root.left.left.right = new TreeNode(25);

        root.left.right.right = new TreeNode(45);
        /*
                 50
               /    \
             30      70
            /  \    /  \
          20   40  60   80
         / \    \
        10 25    45
         */
        System.out.println("the 6th smallest element in the above tree is:"+kthSmallest(root,6));
        System.out.println("the 3rd smallest element in the above tree is:"+kthSmallest(root,3));


    }


    //METHOD 2 without using ArrayList
    public static int kthSmallest(TreeNode root, int k) {
        k2=k;
        ans=-1;
        inOrder(root);
        return ans;

        //Methiod 1
        // public int kthSmallest(TreeNode root, int k) {
        //     ArrayList<Integer> arr=new ArrayList<>();
        //     inOrder(root,arr);
        //     return arr.get(k-1);

        // }
        // void inOrder(TreeNode root,ArrayList<Integer> arr)
        // {
        //     if(root==null) return;
        //     inOrder(root.left,arr);
        //     arr.add(root.val);
        //     inOrder(root.right,arr);
        // }

    }
    static void inOrder(TreeNode root)
    {
        if(root==null) return;
        inOrder(root.left);
        k2--;
        if(k2==0) ans=root.val;
        inOrder(root.right);
    }
}
