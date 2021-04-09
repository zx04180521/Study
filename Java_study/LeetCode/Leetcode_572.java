package LeetCode;
/*判断一个树是不是另一个树的子树*/
import static LeetCode.CreatTree.creatTree;

public class Leetcode_572 {
    public static void main(String[] args) {
        TreeNode s=creatTree();
        TreeNode t=creatTree();
        System.out.println(isSubtree(s,t));
    }
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null){
            return false;
        }
        if(same(s,t)){
            return true;
        }
        return isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    public static boolean same(TreeNode s,TreeNode t){
        if(s==null&&t==null){
            return true;
        }
        if(s==null||t==null){
            return false;
        }
        if(s.val!=t.val){
            return false;
        }
        return same(s.left,t.left)&&same(s.right,t.right);
    }
}
