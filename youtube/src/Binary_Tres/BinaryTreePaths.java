package Binary_Tres;
import java.util.*;
class Gnode {
    int data;
    Gnode left;
    Gnode right;

    Gnode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreePaths {
    static void main(String[] args) {
        Gnode root = new Gnode(1);

        root.left = new Gnode(2);
        root.right = new Gnode(3);

        root.left.left = new Gnode(4);
        root.left.right = new Gnode(5);

        root.right.right = new Gnode(7);

        root.left.right.left = new Gnode(8);
        root.left.right.right = new Gnode(9);
        System.out.println(paths(root));
    }
    public static ArrayList<ArrayList<Integer>> paths(Gnode root) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        dfs(root,arr,ans);
        return ans;
    }
    static void dfs(Gnode root,ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> ans)
    {
        if(root==null) return;
        arr.add(root.data);
        if(root.left==null && root.right==null)
        {
            //adding copy of arr to ans
            ArrayList<Integer> temp=new ArrayList<>();
            temp.addAll(arr); //or for each loop
            ans.add(temp);
        }
        dfs(root.left,arr,ans);
        dfs(root.right,arr,ans);
        arr.remove(arr.size()-1); //back tracking
    }
}
