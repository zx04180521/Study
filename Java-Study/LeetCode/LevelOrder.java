package LeetCode;
/*给定一个二叉树，返回该二叉树层序遍历的结果，（从左到右，一层一层地遍历）
* 给定的二叉树是{3,9,20,#,#,15,7},

该二叉树层序遍历的结果是
[
[3],
[9,20],
[15,7]
]
 */
import java.util.*;

import static LeetCode.CreatTree.creatTree;

public class LevelOrder {
    public static void main(String[] args) {
        TreeNode root=creatTree();
        System.out.println(levelOrder(root));
    }
    public static ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> res =new ArrayList<ArrayList<Integer>>();
        if(root==null){
            return res;
        }
        int level=0;
        order(root,res,level);
        return res;
    }
    public static void order(TreeNode root, ArrayList<ArrayList<Integer>> res, int index){
        if(index==res.size()){
            res.add(new ArrayList<Integer>());
        }
        res.get(index).add(root.val);
        if(root.left!=null){
            order(root.left,res,index+1);
        }
        if(root.right!=null){
            order(root.right,res,index+1);
        }
    }
}
