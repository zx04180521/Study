package LeetCode;
/*二叉搜索树中的第K大结点*/
public class Offer_54 {
    public static void main(String[] args) {

    }
//方法一
    static int i=0;
    public static int kthLargest(TreeNode root, int k) {
        int size= size(root);
        int[] res=new int[size];
        i=0;
        preOrder(root,res);
        return res[k-1];
    }
    public static void preOrder(TreeNode root,int[] res){
        if(root==null){
            return ;
        }

        preOrder(root.right,res);
        res[i]=root.val;
        i++;
        preOrder(root.left,res);
    }
    public static int size(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+size(root.left)+size(root.right);
    }







//方法二
//    static int k;
//    static int res=0;
//    public int kthLargest(TreeNode root, int k) {
//        this.k=k;
//        order(root);
//        return res;
//    }
//    public static void order(TreeNode root){
//        if(root==null){
//            return ;
//        }
//        // if(k==0){
//        //     return;
//        // }
//        order(root.right);
//        k=k-1;
//        if(k==0){
//            res=root.val;
//        }
//        order(root.left);
//    }

}
