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
         display(root.right); // all right child values
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


    }
}
