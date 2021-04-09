package LeetCode;

import static LeetCode.CreatTree.creatTree;

public class Offer_55_2 {
    public static void main(String[] args) {
        TreeNode root=creatTree();
        System.out.println(isBalanced(root));
    }
    public static boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int leftHigh=getHigh(root.left);
        int rightHigh=getHigh(root.right);
        if(leftHigh-rightHigh>1||rightHigh-leftHigh>1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public static int getHigh(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHigh=getHigh(root.left);
        int rightHigh=getHigh(root.right);
        return 1+ (leftHigh>rightHigh?leftHigh:rightHigh);
    }
}
