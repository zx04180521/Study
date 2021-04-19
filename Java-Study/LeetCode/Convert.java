package LeetCode;
/*输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
要求不能创建任何新的结点，只能调整树中结点指针的指向。*/
public class Convert {
    public static void main(String[] args) {

    }
    public TreeNode convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        if(pRootOfTree.left==null&&pRootOfTree.right==null){
            return pRootOfTree;
        }
        TreeNode leftHead=convert(pRootOfTree.left);
        TreeNode leftTail=leftHead;
        while(leftTail!=null&&leftTail.right!=null){
            leftTail=leftTail.right;
        }
        if(leftHead!=null){
            leftTail.right=pRootOfTree;
            pRootOfTree.left=leftTail;
        }
        TreeNode rightHead=convert(pRootOfTree.right);
        if(rightHead!=null){
            rightHead.left=pRootOfTree;
            pRootOfTree.right=rightHead;
        }
        return leftHead!=null? leftHead:pRootOfTree;
    }
}
