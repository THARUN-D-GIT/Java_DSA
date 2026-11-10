package HashSetsAndHashMaps;


import java.util.*;

class TopViewOfBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Pair {
        int dist;
        Node node;

        Pair(Node node,int dist)
        {
            this.node=node;
            this.dist=dist;
        }
    }

    static class Solution {
        public static ArrayList<Integer> topView(Node root) {
            // code here
            ArrayList<Integer> ans=new ArrayList<>();
            HashMap<Integer,Integer> map=new HashMap<>(); //<horizontal distance,value of node>
            Queue<Pair> q=new LinkedList<>();
            if(root==null) return ans;
            q.add(new Pair(root,0));
            int mindist=Integer.MAX_VALUE;
            int maxdist=Integer.MIN_VALUE;
            while(q.size()>0)
            {
                Pair front=q.remove();
                Node node=front.node;
                int dist=front.dist;
                if(!map.containsKey(dist)) map.put(dist,node.data); // if dist is allready present igonre it
                //because only one value for unique distance
                mindist=Math.min(dist,mindist);
                maxdist=Math.max(dist,maxdist);
                if(node.left!=null) q.add(new Pair(node.left,dist-1));
                if(node.right!=null) q.add(new Pair(node.right,dist+1));
            }
            for(int i=mindist;i<=maxdist;i++) ans.add(map.get(i));
            return ans;

        }
    }

    public static void main(String[] args) {
        /*
        Given a binary tree, task is to return its top view. The top view of a binary tree is the set of nodes visible when the tree is viewed from the top.

Return the nodes from the leftmost node to the rightmost node.
If multiple nodes overlap at the same horizontal position, only the topmost (closest to the root) node is included in the view.
Examples:

Input: root = [1, 2, 3]
Output: [2, 1, 3]
Explanation: The Green colored nodes represents the top view in the below Binary tree.

Input: root = [10, 20, 30, 40, 60, 90, 100]
Output: [40, 20, 10, 30, 100]
Explanation: The Green colored nodes represents the top view in the below Binary tree.


Constraints:

1 ≤ size of binary tree, Node.data ≤ 105
         */

        // Test Case 1
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.right = new Node(4);
        root1.left.right.right = new Node(5);
        root1.left.right.right.right = new Node(6);

        // Test Case 2
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.right.left = new Node(6);
        root2.right.right = new Node(7);

        // Test Case 3
        Node root3 = new Node(10);
        root3.left = new Node(20);
        root3.left.left = new Node(30);
        root3.left.left.left = new Node(40);

        // Test Case 4
        Node root4 = null;

        System.out.println("Test Case 1: " + Solution.topView(root1));
        System.out.println("Test Case 2: " + Solution.topView(root2));
        System.out.println("Test Case 3: " + Solution.topView(root3));
        System.out.println("Test Case 4: " + Solution.topView(root4));
    }
}

