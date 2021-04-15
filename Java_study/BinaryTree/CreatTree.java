package BinaryTree;

public class CreatTree {
    public static TreeNode creatTree() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        a.left = b;
        a.right = c;
        b.left = d;
        c.right = f;
        b.right = e;
        e.right = g;
        return a;
    }
}
