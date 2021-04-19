package LeetCode;
/*二叉搜索树的最近公共祖先*/
public class Offer_68 {
    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root.val>q.val&&root.val>p.val){
            return lowestCommonAncestor(root.left,p,q);
        }else if(root.val<q.val&&root.val<p.val){
            return lowestCommonAncestor(root.right,p,q);

        }else{
            return root;
        }

    }
}
