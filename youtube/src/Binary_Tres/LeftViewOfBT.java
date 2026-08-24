package Binary_Tres;
import java.util.*;

public class LeftViewOfBT {
    static void main(String[] args) {
        /*
    Given the root of a binary tree. Return the left view of the binary tree. The left view of a binary tree is the set of nodes visible when the tree is viewed from the left side.

Note: If the tree is empty, return an empty list.

Examples :

Input: root = [1, 2, 3, 4, 5, N, N]

Output:[1, 2, 4]
Explanation: From the left side of the tree, only the nodes 1, 2, and 4 are visible.

Input: root = [1, 2, 3, N, N, 4, N, N, 5, N, N]

Output: [1, 2, 4, 5]
Explanation: From the left side of the tree, only the nodes 1, 2, 4, and 5 are visible.

Constraints:
0 ≤ number of nodes ≤ 105
0 ≤ node -> data ≤ 105
         */
        Gnode root = new Gnode(20);

        root.left = new Gnode(10);
        root.right = new Gnode(30);

        root.left.left = new Gnode(5);
        root.left.right = new Gnode(15);

        root.right.left = new Gnode(25);

        root.left.left.right = new Gnode(8);

        root.left.right.left = new Gnode(12);

        root.right.left.right = new Gnode(28);

        /*
               20
             /    \
           10      30
          /  \     /
         5   15   25
          \  /      \
           8 12      28
         */
        System.out.println("Left view for above tree is: "+leftView(root));

    }
    public static ArrayList<Integer> leftView(Gnode root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        view(root,0,ans);
        return ans;

    }
    static void view(Gnode root,int level,ArrayList<Integer> ans)
    {
        if(root==null) return;
        if(level>=ans.size()) ans.add(root.data);
        else ans.set(level,root.data);
        view(root.right,level+1,ans);
        view(root.left,level+1,ans);
    }
}
