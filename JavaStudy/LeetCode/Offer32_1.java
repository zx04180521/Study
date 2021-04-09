package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static LeetCode.CreatTree.creatTree;

public class Offer32_1 {
    public static void main(String[] args) {
        TreeNode root=creatTree();
        System.out.println(Arrays.toString(levelOrder(root)));
    }
    public static int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[0];
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        Queue<Integer> res=new LinkedList<>();
        while(true){
            if(q.isEmpty()){
                break;
            }
            TreeNode temp=q.poll();
            res.add(temp.val);
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        int[] ary=new int[res.size()];
        int a=res.size();
        for(int i=0;i<a;i++){
            ary[i]=res.poll();
        }
        return ary;
    }
}
