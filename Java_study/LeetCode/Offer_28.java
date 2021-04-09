package LeetCode;

import static LeetCode.CreatTree.creatTree;

/*对称二叉树*/
public class Offer_28 {
    public static void main(String[] args) {
        TreeNode root=creatTree();
        System.out.println(isSymmetric(root));
    }
    public static boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return mirror(root.left,root.right);
    }
    public static boolean mirror(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return mirror(p.right,q.left)&&mirror(p.left,q.right);
    }
}
