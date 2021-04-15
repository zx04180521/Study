package BinaryTree;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;
/*非递归版本的二叉树遍历*/
import static BinaryTree.CreatTree.creatTree;

public class OrderNoR {
    public static void main(String[] args) {


        TreeNode root=creatTree();
        preOrderNoR(root);//非递归的先序遍历
        System.out.println();
        inOrderNoR(root);
        System.out.println();
        postOrderNoR(root);
    }
    public static void p(String s){
        System.out.println(s);
    }

    //非递归的先序遍历
    public static void preOrderNoR(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            System.out.print(temp.val+" ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
    }
    public static void inOrderNoR(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        while(true){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            if(stack.isEmpty()){
                break;
            }
            TreeNode top=stack.pop();
            System.out.print(top.val+" ");
            root=top.right;
        }
    }


    public static void postOrderNoR(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        TreeNode prev=null;
        while(true){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            if(stack.isEmpty()){
                break;
            }
            TreeNode top=stack.peek();
            if(top.right==null||prev==top.right){
                System.out.print(top.val+" ");
                stack.pop();
                prev=top;
            }else{
                cur=top.right;
            }
        }
    }
}
