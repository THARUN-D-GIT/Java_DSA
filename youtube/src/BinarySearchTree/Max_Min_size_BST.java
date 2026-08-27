package BinarySearchTree;
class Quad{
    int max;
    int min;
    int sum;
    int size;
    Quad(int max,int min,int sum,int size){
        this.max=max;
        this.min=min;
        this.sum=sum;
        this.size=size;

    }
}
class Node2 {
    int data;
    Node2 left, right;

    public Node2(int d) {
        data = d;
        left = right = null;
    }
}



public class Max_Min_size_BST {
    static void main(String[] args) {
        Node2 root = new Node2(25);

        root.left = new Node2(12);
        root.right = new Node2(40);

        root.left.left = new Node2(7);
        root.left.right = new Node2(18);

        root.left.right.left = new Node2(15);

        root.right.right = new Node2(50);

        root.right.right.left = new Node2(45);
        root.right.right.right = new Node2(60);

        Quad ans=helper_2(root);
        System.out.println("max:"+ans.max);
        System.out.println("min:"+ans.min);
        System.out.println("sum:"+ans.sum);
        System.out.println("size:"+ans.size);
    }
    static Quad helper_2(Node2 root){
        if(root==null) return new  Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,0);
        Quad lst=helper_2(root.left);
        Quad rst=helper_2(root.right);
        int max=Math.max(root.data,Math.max(lst.max,rst.max));
        int min=Math.min(root.data,Math.min(lst.min,rst.min));
        int sum=root.data+lst.sum+rst.sum;
      int size=1+rst.size+lst.size;
       return new Quad(max,min,sum,size);

    }
}
