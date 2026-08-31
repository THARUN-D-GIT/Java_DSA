package Binary_Tres;
import java.util.*;

public class TreeBoundaryTraversal {
    static void main(String[] args) {
        /*
        geeksforgeeks
search icon
Courses
Tutorials
Practice
Jobs
My Profile


Change Language




Tree Boundary Traversal
Solved
Difficulty: MediumAccuracy: 23.33%Submissions: 582K+Points: 4Average Time: 35m
Given a root of a Binary Tree, return its boundary traversal in the following order:

Left Boundary: Nodes from the root to the leftmost non-leaf node, preferring the left child over the right and excluding leaves.
Leaf Nodes: All leaf nodes from left to right, covering every leaf in the tree.
Reverse Right Boundary: Nodes from the root to the rightmost non-leaf node, preferring the right child over the left, excluding leaves, and added in reverse order.
Note: The root is included once, leaves are added separately to avoid repetition, and the right boundary follows traversal preference not the path from the rightmost leaf.

Examples:

Input: root = [1, 2, 3, 4, 5, 6, 7, N, N, 8, 9, N, N, N, N]
Output: [1, 2, 4, 8, 9, 6, 7, 3]
Explanation:

Input: root = [1, N, 2, N, 3, N, 4, N, N]
Output: [1, 4, 3, 2]
Explanation:

Left boundary: [1] (as there is no left subtree)
Leaf nodes: [4]
Right boundary: [3, 2] (in reverse order)
Final traversal: [1, 4, 3, 2]
Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105


         */
        // Creating the tree
        Gnode root = new Gnode(1);

        root.left = new Gnode(2);
        root.right = new Gnode(3);

        root.left.left = new Gnode(4);
        root.left.right = new Gnode(5);

        root.right.left = new Gnode(6);
        root.right.right = new Gnode(7);

        root.left.right.left = new Gnode(8);
        root.left.right.right = new Gnode(9);

        // Print tree
        System.out.println("Tree (Level Order):");
        printTree(root);

        // Boundary traversal
        ArrayList<Integer> result = boundaryTraversal(root);

        System.out.println("Boundary Traversal:");
        System.out.println(result);
    }
    public static  ArrayList<Integer> boundaryTraversal(Gnode root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        //add root element
        ans.add(root.data);
        //handling when size is 1
        if(root.left==null && root.right==null) return ans;
        LeftBound(root.left,ans);
        LeafNode(root,ans);
        RightBound(root.right,ans);
        return ans;


    }
    static void  LeftBound(Gnode root,ArrayList<Integer> ans)
    {
        if(root==null) return;
        //avoid adding of leaf node to counter duplicat of leaf in left bound and leaf
        if(root.left==null && root.right==null) return;
        ans.add(root.data);
        if(root.left!=null) LeftBound(root.left,ans);
            //else (root.ight!null)
        else{
            LeftBound(root.right,ans);
        }
    }
    static void LeafNode(Gnode root,ArrayList<Integer> ans)
    {
        if(root==null) return;
        if(root.left==null && root.right==null) ans.add(root.data);
        LeafNode(root.left,ans);
        LeafNode(root.right,ans);
    }
    static void RightBound (Gnode root,ArrayList<Integer> ans)
    {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        if(root.right!=null)  RightBound(root.right,ans);
        else RightBound(root.left,ans);
        ans.add(root.data);
    }
    static void printTree(Gnode root) {
        if (root == null) return;

        Queue<Gnode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Gnode curr = q.poll();

            System.out.print(curr.data + " ");

            if (curr.left != null)
                q.add(curr.left);

            if (curr.right != null)
                q.add(curr.right);
        }

        System.out.println();
    }
}
