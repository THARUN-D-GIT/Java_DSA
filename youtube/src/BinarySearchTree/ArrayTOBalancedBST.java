package BinarySearchTree;

public class ArrayTOBalancedBST {
    static void main(String[] args) {
        /*
        LC-108
        Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.



Example 1:


Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:


Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in a strictly increasing order.
         */

        int[] nums = {-10, -3, 0, 5, 9};

        TreeNode root = sortedArrayToBST(nums);

        System.out.println("BST:");
        printTree(root);

    }
    public static  TreeNode sortedArrayToBST(int[] nums) {
        //lo=0;hi=n-1;
        int n=nums.length;
        return convert(nums,0,n-1);

    }
    static TreeNode convert(int [] arr,int lo,int hi)
    {
        if(lo>hi) return null;
        int mid=(lo+hi)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=convert(arr,lo,mid-1);
        root.right=convert(arr,mid+1,hi);
        return root;
    }
    // Print tree sideways
    static void printTree(TreeNode root) {
        printTree(root, 0);
    }

    static void printTree(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        // Print right subtree first
        printTree(root.right, level + 1);

        // Indentation
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }

        System.out.println(root.val);

        // Print left subtree
        printTree(root.left, level + 1);
    }

}
