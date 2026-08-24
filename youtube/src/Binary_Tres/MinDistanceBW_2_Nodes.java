package Binary_Tres;

public class MinDistanceBW_2_Nodes {
    static void main(String[] args) {
        /*
        Given a binary tree with n nodes and two node values a and b, find the minimum distance between them. The distance is defined as the minimum number of edges between the two nodes. It is guaranteed that both nodes exist in the binary tree and all node values are unique.

Examples :

Input:

a = 2, b = 3
Output: 2
Explanation: The path between node 2 and node 3 is: 2 -> 1 -> 3.The number of edges in this path is 2, so the minimum distance is 2.
Input:

a = 4, b = 7
Output: 4
Explanation: The path between node 4 and node 7 is: 4 -> 2 -> 1 -> 3 -> 7.The number of edges in this path is 4, so the minimum distance is 4.
Constraints:

2 ≤ size of binary tree ≤ 105

         */


        Gnode root = new Gnode(10);

        Gnode a = new Gnode(5);
        Gnode b = new Gnode(15);
        Gnode c = new Gnode(3);
        Gnode d = new Gnode(7);
        Gnode e = new Gnode(12);
        Gnode f = new Gnode(20);
        Gnode g = new Gnode(6);
        Gnode h = new Gnode(8);

        root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;

        b.left = e;
        b.right = f;

        d.left = g;
        d.right = h;

        /*
                10
              /    \
           a(5)    b(15)
           /  \     /  \
        c(3) d(7) e(12) f(20)
             / \
          g(6) h(8)
         */
        //System.out.println("distance between 6,8 is: "+findDist(root,6,8));
        System.out.println("distance between 6,8 is: " + findDist(root,6,8));

        System.out.println("distance between 3,6 is: " + findDist(root,3,6));

        System.out.println("distance between 6,12 is: " + findDist(root,6,12));

        System.out.println("distance between 3,20 is: " + findDist(root,3,20));

        System.out.println("distance between 12,20 is: " + findDist(root,12,20));

        System.out.println("distance between 5,8 is: " + findDist(root,5,8));
    }
    public static  int findDist(Gnode root, int a, int b) {
        // code here
        Gnode LCA=lca(root,a,b);
        int [] dis={0,0};
        dfs(LCA,a,b,0,dis);// 0 is for level

        return dis[0]+dis[1];
    }
   static  Gnode lca(Gnode root, int p, int q) {
        // code here
        if(root==null) return null;
        if(root.data==p || root.data==q) return root;
        Gnode l=lca(root.left,p,q);
        Gnode r=lca(root.right,p,q);
        if(l!=null && r!=null) return root;
        return (l==null) ? r : l;

    }
    static void dfs(Gnode LCA,int a,int b,int level,int [] dis)
    {
        if(LCA==null) return;
        if(LCA.data==a) dis[0]=level;
        if(LCA.data==b) dis[1]=level;
        dfs(LCA.left,a,b,level+1,dis);
        dfs(LCA.right,a,b,level+1,dis);
    }

}
