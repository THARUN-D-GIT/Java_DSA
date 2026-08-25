package BinarySearchTree;
// Binary Tree Node Structure
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}


public class CountNodesInRange {
    static void main(String[] args) {
        /*
        Given a Binary Search Tree (BST) and a range l-h (inclusive), your task is to return the number of nodes in the BST whose value lie in the given range.

Examples :

Input: root[] = [10, 5, 50, 1, N, 40, 100], l = 5, h = 45

Output: 3
Explanation: There are three nodes in range [5, 45] =  5, 10 and 40.
Input: root[] = [10, 5, 50, 1, N, 40, 100], l = 10, h = 100

Output: 4
Explanation: There are four nodes in range [10, 100] = 10, 40, 50 and 100.
Input: root[] = [1, 2, 3], l = 23, h = 95

Output: 0
Explanation: There are no nodes in range [23, 95].
Constraints:

1 ≤ root.size(), l, h ≤ 105
         */
        Node root = new Node(50);

        Node a = new Node(30);
        Node b = new Node(70);
        Node c = new Node(20);
        Node d = new Node(40);
        Node e = new Node(60);
        Node f = new Node(80);
        Node g = new Node(35);
        Node h = new Node(65);

        root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;

        b.left = e;
        b.right = f;

        d.left = g;
        e.right = h;
        /*
                  50
               /    \
             30      70
            /  \    /  \
          20   40  60   80
              /       \
             35        65
         */
        int l=35,hi=70;
        System.out.println("Number of nodes in range(l,h): "+getCount(root, l, hi));

    }
     static int getCount(Node root, int l, int h) {
        // code here
        //int count=0;
        if(root==null) return 0;
        if(root.data<l) return getCount(root.right,l,h);
        else if(root.data>h) return getCount(root.left,l,h);
        else {
            // case if(root.data>l && root.data<h)
            return 1+getCount(root.right,l,h)+getCount(root.left,l,h);
        }
    }
}
