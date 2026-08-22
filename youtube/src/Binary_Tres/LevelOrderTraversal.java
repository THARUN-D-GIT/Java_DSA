package Binary_Tres;
import java.util.*;
class pair{
    int level;
    Node node;
    pair(Node node,int level){
        this.level=level;
        this.node=node;
    }
}
public class LevelOrderTraversal {
    static void main(String[] args) {
        Node root1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        root1.left = node2;
        root1.right = node3;

        node2.left = node4;
        node3.right = node5;

        node4.right = node6;
        node6.right = node7;
        levelOrder(root1);

    }
    static void levelOrder(Node root) {
      Queue<Node> q = new LinkedList<>();
      q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.val+" ");
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
        System.out.println();

    }
    static void LevelOrderLineWise(Node root){
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root,0));
        int currLevel = 0;
        while(!q.isEmpty()){
            pair front=q.poll();
            if(front.level!=currLevel){ // important to because it help in add new linr
               // currLevel=front.level;
                currLevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left!=null) q.add(new pair(front.node.left,front.level+1));
            if(front.node.right!=null) q.add(new pair(front.node.right,front.level+1));
        }
        System.out.println();

    }
}
