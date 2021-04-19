package LeetCode;
/*二叉树的后序遍历*/
import java.util.ArrayList;
import java.util.List;

import static LeetCode.CreatTree.creatTree;

public class Leetcode_145 {
    public static void main(String[] args) {
        TreeNode root=creatTree();
        System.out.println(postorderTraversal(root));
    }

    //方法一
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return new ArrayList<>();
        }
        res.addAll(postorderTraversal(root.left));
        res.addAll(postorderTraversal(root.right));
        res.add(root.val);
        return res;
    }
    //方法二
    public static List<Integer> postorderTraversal_2(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        postorder(root,res);
        return res;
    }
    public static void postorder(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
    }

}
