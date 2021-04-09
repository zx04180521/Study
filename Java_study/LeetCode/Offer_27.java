package LeetCode;
/*二叉树的镜像*/
public class Offer_27 {
    public static void main(String[] args) {

    }
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode temp=root.left;
        root.left=mirrorTree(root.right);
        root.right=mirrorTree(temp);
        return root;
    }
}
