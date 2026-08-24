package Binary_Tres;
import java.util.ArrayList;

public class PathFromRootWithSum {
    static void main(String[] args) {

        Gnode root = new Gnode(10);

        Gnode a = new Gnode(28);
        Gnode b = new Gnode(13);

        Gnode c = new Gnode(14);
        Gnode d = new Gnode(15);

        Gnode e = new Gnode(21);
        Gnode f = new Gnode(22);
        Gnode g = new Gnode(23);
        Gnode h = new Gnode(24);

        root.left = a;
        root.right = b;

        b.left = c;
        b.right = d;

        c.left = e;
        c.right = f;

        d.left = g;
        d.right = h;
        System.out.println("paths for sum 38 are : "+printPaths(root,38));

    }
    public static ArrayList<ArrayList<Integer>> printPaths(Gnode root, int sum) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        dfs(root,arr,ans,sum);
        return ans;

    }
    static void dfs(Gnode root,ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> ans,int sum)
    {
        if(root==null) return;
        arr.add(root.data);
        // if(sum==0)
        // {
        //     ans.add(new ArrayList<>(arr));
        //     //return not works for neg num ex:3

        // } not needed

        if(sum==root.data)  ans.add(new ArrayList<>(arr));

        dfs(root.left,arr,ans,sum-root.data);
        dfs(root.right,arr,ans,sum-root.data);
        arr.remove(arr.size()-1);
    }
}
