package LeetCode;
/*重建二叉树
* 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
* 假设输入的前序遍历和中序遍历的结果中都不含重复的数字*/
import java.util.ArrayList;
import java.util.List;

public class Offer_07 {
    public static void main(String[] args) {

    }
    static int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index=0;
        List<Integer> inorderList=new ArrayList<>();
        for(int a:inorder){
            inorderList.add(a);
        }
        return  build(preorder,inorderList);

    }
    public static TreeNode build(int[] preorder,List<Integer> inorder){
        if(inorder.isEmpty()){
            return null;
        }
        TreeNode root=new TreeNode(preorder[index]);
        index++;
        int curIndex=inorder.indexOf(root.val);
        root.left=build(preorder,inorder.subList(0,curIndex));
        root.right=build(preorder,inorder.subList(curIndex+1,inorder.size()));
        return root;

    }
}
