package Binary_Tres;
import java.util.*;

public class RightViewOfBT {
    static void main(String[] args) {
        /*
        Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.



Example 1:

Input: root = [1,2,3,null,5,null,4]

Output: [1,3,4]

Explanation:



Example 2:

Input: root = [1,2,3,4,null,null,null,5]

Output: [1,3,4,5]

Explanation:



Example 3:

Input: root = [1,null,3]

Output: [1,3]

Example 4:

Input: root = []

Output: []



Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
         */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(7);

        root.left.right.left = new TreeNode(8);

        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        /*
              1
            /   \
           2     3
          / \     \
         4   5     7
            /     / \
           8     9  10
         */
        System.out.println("right view of the above tree is: "+rightSideView(root));

    }
    public  static List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        view(root,0,ans);
        return ans;


    }
    static void view(TreeNode root,int level,List<Integer> ans)
    {
        if(root==null) return;
        //adding elemets to arry till all level are filled
        if(level>=ans.size()) ans.add(root.val);
        else{
            ans.set(level,root.val);
        }
        view(root.left,level+1,ans);
        view(root.right,level+1,ans);
    }
}
