package Binary_Tres;

public class PerfectBT {
    static void main(String[] args) {
/*
Given a Binary Tree, check whether the given Binary Tree is a prefect Binary Tree or not. A Binary tree is Perfect Binary Tree in which all internal nodes have two children and all leaves are at same level.

Examples:

Input: root[] = [7, 4, 9]


Output: true
Explanation:
As the root node 7 has two children and two leaf nodes 4 and 9 are at same level.
Input: root[] = [7, 3, 8, 2, 5, N, 10, 1, N, N, N, N, N]


Output: false
Constraints:
1 ≤ n ≤ 10^5
1 ≤ data of node ≤ 10^5
 */
        Gnode root2 = new Gnode(10);

        root2.left = new Gnode(20);
        root2.right = new Gnode(30);

        root2.left.left = new Gnode(40);
        root2.left.right = new Gnode(50);

        root2.right.right = new Gnode(60);
        Gnode root1 = new Gnode(10);

        root1.left = new Gnode(20);
        root1.right = new Gnode(30);

        root1.left.left = new Gnode(40);
        root1.left.right = new Gnode(50);

        root1.right.left = new Gnode(60);
        root1.right.right = new Gnode(70);
        System.out.println("Root 2 is perfect BT?:"+isPerfect(root2));
        System.out.println("Root 1 is perfect BT?:"+isPerfect(root1));
    }
   static boolean isPerfect(Gnode root) {
        // code here
        int l=level(root);
        int s=size(root);
        int n=(int) Math.pow(2,l)-1;
        if(s==n) return true;
        return false;

    }
    static int level(Gnode root)

    {
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    static int size(Gnode root)
    {
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
}
