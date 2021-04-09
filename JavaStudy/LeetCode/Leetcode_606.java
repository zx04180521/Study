package LeetCode;
/*根据二叉树创建字符串
你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
*/
public class Leetcode_606 {
    public static void main(String[] args) {

    }
    public String tree2str(TreeNode t) {
        StringBuffer stringBuffer=new StringBuffer();
        if(t==null){
            return "";
        }
        build(t,stringBuffer);
        stringBuffer.deleteCharAt(0);
        stringBuffer.deleteCharAt(stringBuffer.length()-1);
        return stringBuffer.toString();
    }
    public static void build(TreeNode root,StringBuffer stringBuffer){
        if(root==null){
            return ;
        }
        stringBuffer.append("(");
        stringBuffer.append(root.val);

        build(root.left,stringBuffer);
        if(root.left==null&&root.right!=null){
            stringBuffer.append("()");}
        build(root.right,stringBuffer);
        stringBuffer.append(")");
    }
}
