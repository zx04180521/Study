package LeetCode;

import static LeetCode.CreatTree.creatTree;

/*二叉树的深度*/
public class Offer_55_1 {
    public static void main(String[] args) {
        TreeNode root=creatTree();
        System.out.println( maxDepth(root));
    }
    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftHigh=maxDepth(root.left);
        int rightHigh=maxDepth(root.right);

        return 1+(leftHigh>rightHigh? leftHigh:rightHigh);
    }
}
