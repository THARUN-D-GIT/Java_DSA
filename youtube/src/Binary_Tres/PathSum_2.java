package Binary_Tres;
import java.util.*;

public class PathSum_2 {
    static void main(String[] args) {
        /*
        Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.

A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.



Example 1:


Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
Output: [[5,4,11,2],[5,8,4,5]]
Explanation: There are two paths whose sum equals targetSum:
5 + 4 + 11 + 2 = 22
5 + 8 + 4 + 5 = 22
Example 2:


Input: root = [1,2,3], targetSum = 5
Output: []
Example 3:

Input: root = [1,2], targetSum = 0
Output: []


Constraints:

The number of nodes in the tree is in the range [0, 5000].
-1000 <= Node.val <= 1000
-1000 <= targetSum <= 1000
         */
        TreeNode root = new TreeNode(5);

        TreeNode a = new TreeNode(4);
        TreeNode b = new TreeNode(8);
        TreeNode c = new TreeNode(11);
        TreeNode d = new TreeNode(13);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(7);
        TreeNode g = new TreeNode(2);
        TreeNode h = new TreeNode(5);
        TreeNode i = new TreeNode(1);

        root.left = a;
        root.right = b;

        a.left = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        e.left = h;
        e.right = i;
        /*
                 5
               /   \
              4     8
             /     / \
            11    13  4
           /  \       / \
          7    2     5   1
         */

        System.out.println("Root to leaf path with sum 22 in the above tree is: "+pathSum(root,22));

    }
    public static List<List<Integer>> pathSum(TreeNode root, int Sum) {

        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        List<Integer> arr=new ArrayList<>();
        dfs(root,arr,ans,Sum) ;
        return ans;

    }
    static void dfs(TreeNode root,List<Integer> arr, List<List<Integer>> ans,int Sum)
    {
        if(root==null) return;
        arr.add(root.val);
        if(root.left==null && root.right==null)
        {
            if(Sum==root.val) ans.add(new ArrayList<>(arr));
            arr.remove(arr.size()-1);
            return;
        }
        dfs(root.left,arr,ans,Sum-root.val);
        dfs(root.right,arr,ans,Sum-root.val);
        arr.remove(arr.size()-1);
    }
}
