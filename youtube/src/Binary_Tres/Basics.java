package Binary_Tres;
 class Node
{
    int val;
    Node left;
    Node right;
    Node(int val)
    {
        this.val=val;
    }
}
public class Basics {
     public static void display(Node root)
     {
         if(root==null) return;
         System.out.print(root.val+" ");
         display(root.left); // all left child values
         display(root.right);

         // all right child values
//         display(root.left); // all left child values
//         System.out.print(root.val+" ");
//         display(root.right); // all right child values
      // Like this there can be multiple ways total of 6



     }
    static void main(String[] args) {
        /*
                1
              /   \
             2     3
            / \   / \
           4   5 6   7
         */
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
//        for non zero we r using 0
//        Node d=new Node(0);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        /*
not necessery because default values are null only
        d.left=d.right=null;
        e.left=e.right=null;
        g.left=g.right=null;
        f.left=f.right=null;
*/
        display(a);
        System.out.println();
        System.out.println("size of tree is: "+size(a));
        System.out.println("sum of values is: "+sumBT(a));
       System.out.println("product value of each node is: "+ProductBT(a));
        //System.out.println("product of non zero values is: "+nonzero(a));
        System.out.println("Max value in tree: "+findMax(a));
        System.out.println("Min value in tree: "+findMin(a));

    }
    public static int size(Node root)
    {
        if(root==null) return 0;
        /*
        int leftsize=size(root.left);
        int rightsize=size(root.right);
        return 1+leftsize+rightsize;
         */
        return 1 + size(root.left) + size(root.right);
    }
    static int sumBT(Node root) {
        // code here
        if(root==null) return 0;
        return root.val+sumBT(root.right)+sumBT(root.left);
    }
    static int ProductBT(Node root)
    {
        if(root==null) return 1;
        return root.val*ProductBT(root.left)*ProductBT(root.right);
    }
    static int nonzero(Node root)
    {
        if(root==null) return 1;
        int left=nonzero(root.left);
        int right=nonzero(root.right);
        if(root.val==0) return left*right;
        else return root.val*left*right;
    }
    public static int findMax(Node root) {
        // code here
        if(root==null) return Integer.MIN_VALUE;
        return Math.max( Math.max(root.val,findMax(root.left)) ,findMax(root.right));
    }

    public static int findMin(Node root) {
        // code here
        if(root==null) return Integer.MAX_VALUE;
        return Math.min( Math.min(root.val,findMin(root.left)) ,findMin(root.right));
    }
}

