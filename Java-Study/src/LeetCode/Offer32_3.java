package LeetCode;
/*之字型打印链表*/
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Offer32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.add(root);//将根节点存放到s1中
        while (!s1.isEmpty() || !s2.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            if (!s1.isEmpty()) {
                while (!s1.isEmpty()) {
                    TreeNode temp = s1.peek();
                    l.add(temp.val);//将节点的值存放到顺序表中
                    s1.pop();//出栈
                    if (temp.left != null) {
                        s2.add(temp.left);//将节点的左孩子存放到s2中
                    }
                    if (temp.right != null) {
                        s2.add(temp.right);//将节点的右孩子存放到s2中
                    }
                }
            } else {
                while (!s2.isEmpty()) {
                    TreeNode temp = s2.peek();
                    l.add(temp.val);//将节点的值存放到顺序表中
                    s2.pop();
                    if (temp.right != null) {
                        s1.add(temp.right);//将节点的右孩子存放到s1中
                    }
                    if (temp.left != null) {
                        s1.add(temp.left);//将节点的左孩子存放到s2中
                    }
                }
            }
            list.add(l);
        }
        return list;
    }
}
