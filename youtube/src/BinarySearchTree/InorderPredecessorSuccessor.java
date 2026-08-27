package BinarySearchTree;

import java.util.*;

public class InorderPredecessorSuccessor {

    static void main(String[] args) {

        node root = new node(50);

        root.left = new node(30);
        root.right = new node(70);

        root.left.left = new node(20);
        root.left.right = new node(40);

        root.right.left = new node(60);
        root.right.right = new node(80);

        int key = 65;

        ArrayList<node> ans = findPreSuc(root, key);

        System.out.println("Key = " + key);

        System.out.println("Predecessor = " +
                (ans.get(0) != null ? ans.get(0).val : "NULL"));

        System.out.println("Successor = " +
                (ans.get(1) != null ? ans.get(1).val : "NULL"));
    }

    public static ArrayList<node> findPreSuc(node root, int key) {

        node pred = null;
        node suc = null;

        while (root != null) {

            if (root.val == key) {

                // Find predecessor
                if (root.left != null) {

                    node temp = root.left;

                    while (temp.right != null)
                        temp = temp.right;

                    pred = temp;
                }

                // Find successor
                if (root.right != null) {

                    node temp = root.right;

                    while (temp.left != null)
                        temp = temp.left;

                    suc = temp;
                }

                break;
            }

            else if (root.val < key) {

                pred = root;
                root = root.right;
            }

            else {

                suc = root;
                root = root.left;
            }
        }

        ArrayList<node> ans = new ArrayList<>();

        ans.add(pred);
        ans.add(suc);

        return ans;
    }
}