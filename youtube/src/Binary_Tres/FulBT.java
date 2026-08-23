package Binary_Tres;

public class FulBT {
    static void main(String[] args) {
        /*
        public boolean isFullTree(Node root) {
        // code here
        if(root==null || (root.left==null && root.right==null)) return true;
        if(root.left==null || root.right==null) return false;
        return isFullTree(root.left) && isFullTree(root.right);

    }
         */
        Gnode root1 = new Gnode(10);

        root1.left = new Gnode(20);
        root1.right = new Gnode(30);

        root1.left.left = new Gnode(40);
        root1.left.right = new Gnode(50);

        root1.right.left = new Gnode(60);
        root1.right.right = new Gnode(70);
        System.out.println("Root 1 is full BT?:"+isFullTree(root1));

        Gnode root2 = new Gnode(10);

        root2.left = new Gnode(20);
        root2.right = new Gnode(30);

        root2.left.left = new Gnode(40);
        root2.left.right = new Gnode(50);

        root2.right.right = new Gnode(60);
        System.out.println("Root 2 is full BT?:"+isFullTree(root2));

    }
    public static boolean isFullTree(Gnode root) {
        // code here
        if(root==null || (root.left==null && root.right==null)) return true;
        if(root.left==null || root.right==null) return false;
        return isFullTree(root.left) && isFullTree(root.right);

    }
}
