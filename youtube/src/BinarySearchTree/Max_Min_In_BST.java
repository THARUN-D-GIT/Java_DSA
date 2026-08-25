package BinarySearchTree;
class node {
    int val;
    node left;
    node right;

    node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class Max_Min_In_BST {
    static void main(String[] args) {
        node root = new node(50);

        node a = new node(30);
        node b = new node(70);
        node c = new node(20);
        node d = new node(40);
        node e = new node(60);
        node f = new node(80);
        node g = new node(35);
        node h = new node(65);

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
        System.out.println("Minimum in the above bst: " + findMin(root));
        System.out.println("Maximum in the above bst : " + findMax(root));
    }
    static int findMin(node root) {
        node temp=root;
        while(temp.left!=null) temp=temp.left;
        return temp.val;
    }
    static int findMax(node root) {
        node temp=root;
        while(temp.right!=null) temp=temp.right;
        return temp.val;
    }
}
