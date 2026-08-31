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
        System.out.println("using method 2:");
        System.out.println(inorderTraversal_2(a));
    }
    //Method 2 iterative way
    public static  List<Integer> inorderTraversal_2(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null) return ans;
        TreeNode cur=root;
        while(st.size()>0 || cur!=null)
        {
            if(cur!=null)
            {
                if(cur.left!=null)
                {
                    st.push(cur);
                    cur=cur.left;
                }
                else{
                    //curr.left==null print and go right
                    ans.add(cur.val);
                    cur=cur.right;
                }
            }
            //cur.right==null
            else{
                TreeNode top=st.pop();
                ans.add(top.val);
                cur=top.right;
            }
        }
        return ans;

    }
}
