package LeetCode;
/*二叉树的前序遍历*/

import java.util.ArrayList;
import java.util.List;

import static LeetCode.CreatTree.creatTree;

public class Leetcode_114 {
    public static void main(String[] args) {
        TreeNode root = creatTree();
        System.out.println(preorderTraversal(root));
    }

    //方法一
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    public static void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }

    //方法二
    public List<Integer> preorderTraversal_2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }

}
