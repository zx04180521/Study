package LeetCode;
/*二叉树的中序遍历*/

import java.util.ArrayList;
import java.util.List;

import static LeetCode.CreatTree.creatTree;

public class Leetcode_94 {
    public static void main(String[] args) {
        TreeNode root = creatTree();
        System.out.println(inorderTraversal(root));
    }

    //方法一
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public static void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    //方法二
    public static List<Integer> inorderTraversal_2(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return new ArrayList<>();
        }
        res.addAll(inorderTraversal(root.left));
        res.add(root.val);
        res.addAll(inorderTraversal(root.right));
        return res;
    }

}
