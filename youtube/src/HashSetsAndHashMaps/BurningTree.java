package HashSetsAndHashMaps;


import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Pair {
    TreeNode node;
    int level;

    Pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}

public class BurningTree {

    static TreeNode target;
    static HashMap<TreeNode, TreeNode> parent;

    public static int amountOfTime(TreeNode root, int start) {
        int time = 0;
        target = null;
        parent = new HashMap<>();

        dfs(root, start);

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(target, 0));

        HashSet<TreeNode> burned = new HashSet<>();
        burned.add(target);

        while (!q.isEmpty()) {
            Pair front = q.remove();

            int lvl = front.level;
            time = Math.max(time, lvl);

            TreeNode node = front.node;

            if (node.left != null && !burned.contains(node.left)) {
                q.add(new Pair(node.left, lvl + 1));
                burned.add(node.left);
            }

            if (node.right != null && !burned.contains(node.right)) {
                q.add(new Pair(node.right, lvl + 1));
                burned.add(node.right);
            }

            if (parent.containsKey(node) &&
                    !burned.contains(parent.get(node))) {

                q.add(new Pair(parent.get(node), lvl + 1));
                burned.add(parent.get(node));
            }
        }

        return time;
    }

    private static void dfs(TreeNode root, int start) {
        if (root == null) return;

        if (root.val == start) {
            target = root;
        }

        if (root.left != null) {
            parent.put(root.left, root);
        }

        if (root.right != null) {
            parent.put(root.right, root);
        }

        dfs(root.left, start);
        dfs(root.right, start);
    }

    public static void main(String[] args) {
        /*
        Lc-2385
        You are given the root of a binary tree with unique values, and an integer start. At minute 0, an infection starts from the node with value start.

Each minute, a node becomes infected if:

The node is currently uninfected.
The node is adjacent to an infected node.
Return the number of minutes needed for the entire tree to be infected.



Example 1:


Input: root = [1,5,3,null,4,10,6,9,2], start = 3
Output: 4
Explanation: The following nodes are infected during:
- Minute 0: Node 3
- Minute 1: Nodes 1, 10 and 6
- Minute 2: Node 5
- Minute 3: Node 4
- Minute 4: Nodes 9 and 2
It takes 4 minutes for the whole tree to be infected so we return 4.
Example 2:


Input: root = [1], start = 1
Output: 0
Explanation: At minute 0, the only node in the tree is infected so we return 0.


Constraints:

The number of nodes in the tree is in the range [1, 105].
1 <= Node.val <= 105
Each node has a unique value.
A node with a value of start exists in the tree.
         */

        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.left.right.left = new TreeNode(9);
        root1.left.right.right = new TreeNode(2);
        root1.right.left = new TreeNode(10);
        root1.right.right = new TreeNode(6);

        System.out.println("Example 1: " + amountOfTime(root1, 3));

        // Example 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);

        System.out.println("Example 2: " + amountOfTime(root2, 2));

        // Example 3
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.left.left = new TreeNode(3);

        System.out.println("Example 3: " + amountOfTime(root3, 1));

        // Example 4
        TreeNode root4 = new TreeNode(1);

        System.out.println("Example 4: " + amountOfTime(root4, 1));
    }
}

