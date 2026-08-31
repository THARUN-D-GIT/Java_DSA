package Binary_Tres;
import java.util.*;

public class PostOrderTraversal {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        post(root,ans);
        return ans;

    }
    public static void post( TreeNode root,List<Integer> ans)
    {
        if(root==null) return;
        post(root.left,ans);
        post(root.right,ans);
        ans.add(root.val);
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
        System.out.println(postorderTraversal(a));
        System.out.println("using method 2:");
        System.out.println(postorderTraversal_2(a));
    }
    //method 2 using iterative way
    public static List<Integer> postorderTraversal_2(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!(st.isEmpty()))
        {
            TreeNode top=st.pop();
            ans.add(top.val);
            if(top.left!=null) st.push(top.left);
            if(top.right!=null) st.push(top.right);
        }
        Collections.reverse(ans);
        return ans;

    }
}
