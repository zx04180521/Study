package LeetCode;

import java.util.ArrayList;
import java.util.List;

import static LeetCode.CreatTree.creatTree;

/*从上到下打印链表*/
public class Offer32_2 {
    public static void main(String[] args) {
        TreeNode root=creatTree();
        System.out.println(levelOrder(root ));
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        int index=0;
        if(root==null){
            return res;
        }
        level(res,root,index);
        return res;
    }
    public static void level(List<List<Integer>> res,TreeNode root,int index){
        if(index==res.size()){
            res.add(new ArrayList<Integer>());
        }
        res.get(index).add(root.val);
        if(root.left!=null){
            level(res,root.left,index+1);
        }
        if(root.right!=null){
            level(res,root.right,index+1);
        }
    }
}
