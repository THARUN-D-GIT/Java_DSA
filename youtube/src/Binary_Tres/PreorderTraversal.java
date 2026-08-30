package Binary_Tres;
import java.util.*;
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class PreorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        pre(root, ans);
        return ans;

    }

    public static void pre(TreeNode root, List<Integer> ans) {
        if (root == null) return;
        ans.add(root.val);
        pre(root.left, ans);
        pre(root.right, ans);
    }

    static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;
        System.out.println(preorderTraversal(a));
        System.out.println("preorder traversal iterative method");
        System.out.println(preorderTraversal_2(a));
    }

    public static List<Integer> preorderTraversal_2(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root == null) return ans;
        st.push(root);
        while (!(st.isEmpty())) {
            TreeNode top = st.pop();
            ans.add(top.val);
            if (top.right != null) st.push(top.right);
            if (top.left != null) st.push(top.left);
        }
        return ans;
    }
}