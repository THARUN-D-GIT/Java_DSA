package Binary_Tres;

public class FulBT {
    static void main(String[] args) {
        Gnode root1 = new Gnode(10);

        root1.left = new Gnode(20);
        root1.right = new Gnode(30);

        root1.left.left = new Gnode(40);
        root1.left.right = new Gnode(50);

        root1.right.left = new Gnode(60);
        root1.right.right = new Gnode(70);
        System.out.println(isFullTree(root1));

    }
    public static boolean isFullTree(Gnode root) {
        // code here
        if(root==null || (root.left==null && root.right==null)) return true;
        if(root.left==null || root.right==null) return false;
        return isFullTree(root.left) && isFullTree(root.right);

    }
}
