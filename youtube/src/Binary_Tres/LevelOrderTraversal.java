package Binary_Tres;
import java.util.*;
class pair{
    int level;
    Node node;
    pair(Node node,int level){
        this.level=level;
        this.node=node;
    }
}
public class LevelOrderTraversal {
    static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;

        //for LC
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        root1.left.left = new TreeNode(4);
        root1.left.left.left = new TreeNode(5);
        root1.left.left.right = new TreeNode(6);

        root1.right.left = new TreeNode(7);
        root1.right.right = new TreeNode(8);
        root1.right.right.right = new TreeNode(9);


        levelOrder(a);
        System.out.println(levelOrder(root1));

    }
    static void levelOrder(Node root) {
      Queue<Node> q = new LinkedList<>();
      q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.val+" ");
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
        System.out.println();

    }
    static void LevelOrderLineWise(Node root){
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root,0));
        int currLevel = 0;
        while(!q.isEmpty()){
            pair front=q.poll();
            if(front.level!=currLevel){ // important to because it help in add new linr
               // currLevel=front.level;
                currLevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left!=null) q.add(new pair(front.node.left,front.level+1));
            if(front.node.right!=null) q.add(new pair(front.node.right,front.level+1));
        }
        System.out.println();

    }
    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();
                level.add(node.val);

                if (node.left != null)
                    q.add(node.left);

                if (node.right != null)
                    q.add(node.right);
            }

            ans.add(level);
        }

        return ans;
    }
}
