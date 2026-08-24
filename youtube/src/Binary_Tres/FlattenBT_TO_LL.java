package Binary_Tres;

public class FlattenBT_TO_LL {
    static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(15);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(7);
        TreeNode e = new TreeNode(12);
        TreeNode f = new TreeNode(20);
        TreeNode g = new TreeNode(6);
        TreeNode h = new TreeNode(8);

        root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;

        b.left = e;
        b.right = f;

        d.left = g;
        d.right = h;
        System.out.println("tree before flattening: ");
    print(root);
    flatten(root);
        System.out.println("tree after flattening:  ");
    print(root);

    }


    //METHOD 2 USING RECURSION
    public static  void flatten(TreeNode root) {
        /*
            METHOD 1
              // public void flatten(TreeNode root) {
    //     if(root==null) return;
    //     ArrayList<TreeNode> ans=new ArrayList<>();
    //     preOrder(root,ans);
    //     TreeNode temp=root;
    //     for(int i=1;i<=ans.size()-1;i++)
    //     {
    //         temp.right=ans.get(i);
    //         temp.left=null;
    //         temp=temp.right;
    //     }
    //     // making last node right also null
    //     temp.right=null;

    // }
    // static void preOrder(TreeNode root,ArrayList<TreeNode> ans)
    // {
    //     if(root==null) return;
    //     ans.add(root);
    //     preOrder(root.left,ans);
    //     preOrder(root.right,ans);
    // }
         */
        if(root==null) return;
        TreeNode left=root.left;
        TreeNode right=root.right;
        root.left=null;
        root.right=null;
        flatten(left);
        flatten(right);
        //connecintg
        root.right=left;
        //tarvelling till end of left to connect it to right subtre
        TreeNode temp=root;
        while(temp.right!=null) temp=temp.right;
        temp.right=right;

    }
    static void print(TreeNode root) {
        TreeNode curr = root;

        while (curr != null) {
            System.out.print(curr.val);

            if (curr.right != null)
                System.out.print(" -> ");

            curr = curr.right;
        }

        System.out.println();
    }
}
