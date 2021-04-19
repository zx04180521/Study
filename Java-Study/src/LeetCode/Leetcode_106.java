package LeetCode;

import java.util.ArrayList;
import java.util.List;

/*根据一棵树的中序遍历与后序遍历构造二叉树。*/
public class Leetcode_106 {
    public static void main(String[] args) {

    }
    static int index=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index=0;
        List<Integer> inorderList=new ArrayList<>();
        for(int i:inorder){
            inorderList.add(i);
        }
        return build(inorderList,postorder);
    }
    public static TreeNode build(List<Integer> inorder,int[] postorder){
        if(inorder.isEmpty()){
            return null;
        }
        int cur=inorder.indexOf(postorder[index]);
        TreeNode le=build(inorder.subList(0,cur),postorder);
        TreeNode ri=build(inorder.subList(cur+1,inorder.size()),postorder);
        TreeNode root=new TreeNode(postorder[index]);
        index++;
        root.left=le;
        root.right=ri;
        return root;
    }
}
