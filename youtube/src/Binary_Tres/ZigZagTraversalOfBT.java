package Binary_Tres;
import java.util.*;

public class ZigZagTraversalOfBT {
    static void main(String[] args) {
        /*
        Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []


Constraints:

The number of nodes in the tree is in the range [0, 2000].
-100 <= Node.val <= 100
         */
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);

        root.left.right.right = new TreeNode(80);
        root.right.right.right = new TreeNode(90);

        // Run Zigzag Level Order
        List<List<Integer>> result = zigzagLevelOrder(root);

        System.out.println(result);


    }
    public  static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return ans;
        q.add(root);

        int curr=0;
        while(!(q.isEmpty()))
        {
            List<Integer> lev=new ArrayList<>();
            int n=q.size();
            if(curr%2!=0){
                for(int i=n-1;i>=0;i--)
                {
                    TreeNode front=q.poll();
                    lev.add(0,front.val);
                    if(front.left!=null) q.add(front.left);
                    if(front.right!=null) q.add(front.right);
                }

            }
            else{
                for(int i=0;i<n;i++ ){
                    TreeNode front=q.poll();
                    lev.add(front.val);
                    if(front.left!=null) q.add(front.left);
                    if(front.right!=null) q.add(front.right);
                }
            }
            ans.add(lev);
            curr++;
        }

        return ans;
    }
}
