package Heap;

class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


public class IsBT_a_MaxHeap {
    static int s;
    static void main(String[] args) {
        /*
        a max-heap.

A binary tree is considered a max-heap if it satisfies the following conditions:

Completeness: Every level of the tree, except possibly the last, is completely filled, and all nodes are as far left as possible.
Max-Heap Property: The value of each node is greater than or equal to the values of its children.
Examples:

Input: root = [97, 46, 37, 12, 3, 7, 31, 6, 9]

Output: true
Explanation: The tree is complete and satisfies the max-heap property.
Input: root = [97, 46, 37, 12, 3, 7, 31, N, N, 2, 4]

Output: false
Explanation: The tree is not complete and does not follow the Max-Heap Property, hence it is not a max-heap.
Constraints:
1 ≤ number of nodes ≤ 103
1 ≤ node->data ≤ 103
         */
        // Example 1: [97, 46, 37, 12, 3, 7, 31, 6, 9]
        Node root1 = new Node(97);
        root1.left = new Node(46);
        root1.right = new Node(37);
        root1.left.left = new Node(12);
        root1.left.right = new Node(3);
        root1.right.left = new Node(7);
        root1.right.right = new Node(31);
        root1.left.left.left = new Node(6);
        root1.left.left.right = new Node(9);

        System.out.println("Example 1: " + new IsBT_a_MaxHeap().isHeap(root1));


        // Example 2: [97, 46, 37, 12, 3, 7, 31, N, N, 2, 4]
        Node root2 = new Node(97);
        root2.left = new Node(46);
        root2.right = new Node(37);
        root2.left.left = new Node(12);
        root2.left.right = new Node(3);
        root2.right.left = new Node(7);
        root2.right.right = new Node(31);

        root2.left.right.left = new Node(2);
        root2.left.right.right = new Node(4);

        System.out.println("Example 2: " + new IsBT_a_MaxHeap().isHeap(root2));


        // Example 3: Single node
        Node root3 = new Node(50);

        System.out.println("Example 3: " + new IsBT_a_MaxHeap().isHeap(root3));
    }

    public boolean isHeap(Node root) {
        // code here
        s=size(root);
        return isMax(root) && isCbt(root,1); // init value of root=1
    }
    static boolean isMax(Node root)
    {
        if(root==null) return true;
        int leftval=(root.left!=null) ? root.left.data : Integer.MIN_VALUE;
        int rightval=(root.right!=null) ? root.right.data : Integer.MIN_VALUE;
        if(root.data <=leftval || root.data<=rightval) return false;
        return isMax(root.left) && isMax(root.right);
    }
    static int size(Node root)
    {
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    static boolean isCbt(Node root,int idx)
    {
        if(root==null) return true;
        if(idx>s) return false;
        return isCbt(root.left,2*idx) &&  isCbt(root.right,2*idx+1);


    }
}
