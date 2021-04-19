package LeetCode;
/*最近公共祖先问题*/
public class Offer_68_2 {
    public static void main(String[] args){

    }
    public static TreeNode res=null;
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }

        find(root,p,q);
        return res;
    }
    public static boolean find(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return false;
        }
        int mid=(root==p||root==q)? 1:0;
        int left=find(root.left,p,q)?1:0;
        int right=find(root.right,p,q)?1:0;
        if(mid+left+right==2){
            res=root;
        }
        return mid+right+left>0;
    }
}




