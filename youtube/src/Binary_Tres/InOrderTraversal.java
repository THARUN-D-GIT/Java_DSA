package Binary_Tres;
import java.util.*;

public class InOrderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        in(root,ans);
        return ans;
    }
    public static void in(TreeNode root,List<Integer> ans)
    {
        if(root==null) return;
        in(root.left,ans);
        ans.add(root.val);
        in(root.right,ans);
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
        System.out.println(inorderTraversal(a));
    }
}
