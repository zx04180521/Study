package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import static BinaryTree.CreatTree.creatTree;

public class Main {
    public static void main(String[] args) {
        TreeNode root=creatTree();
//        System.out.print("前序遍历：");
//        preOrderTraversal(root);
//        System.out.println();
//        System.out.print("中序遍历：");
//        inOrderTraversal(root);
//        System.out.println();
//        System.out.print("后序遍历:");
//        postOrderTraversal(root);
//        System.out.println();
//        getSize_1(root);//结点个数(遍历)
//        System.out.println("结点个数(遍历)："+size);
//        System.out.println("结点个数(子问题)："+getSize_2(root));
//        getLeafSize_1(root);//叶子结点个数（遍历）
//        System.out.println("叶子结点个数（遍历）:"+LeafSize);
//        System.out.println("叶子结点个数（子问题）："+ getLeafSize_2(root));
//        System.out.println("第k层结点个数："+getKLevelSize(root,3));
//        System.out.println(isCompleteTree(root));//判断完全二叉树
//        System.out.println(getDepth(root));
        System.out.println(find(root,2).val);
    }
    //前序遍历
    public static void preOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");//访问根节点
        preOrderTraversal(root.left);//递归根的左子树
        preOrderTraversal(root.right);//递归根的右子树
    }
    //中序遍历
    public static  void inOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);//根的左子树
        System.out.print(root.val+" ");//访问根节点
        inOrderTraversal(root.right);//根的右子树
    }
    //后序遍历
    public static void postOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);//根的左子树
        postOrderTraversal(root.right);//根的右子树
        System.out.print(root.val+" ");//访问根节点
    }

    //求结点个数-遍历思路求解
    static int size=0;//记录节点个数
    public static void getSize_1(TreeNode root){
//        退出条件
        if(root==null){
            return;
        }
        size++;
        getSize_1(root.left);//递归遍历root的左子树
        getSize_1(root.right);//递归遍历root的右子树
    }
    //结点个数-子问题思路求解
    public static int getSize_2(TreeNode root){
        //如果当前结点为空则返回0
        if(root==null){
            return 0;
        }
        return 1+getSize_2(root.right)+getSize_2(root.left);
    }
    //叶子结点个数-子问题思路
    public static int getLeafSize_2(TreeNode root){
        if(root==null){
            //当前节点为空，返回0
            return 0;
        }
        if(root.left==null&&root.right==null){
            //当前节点为叶子节点，返回1
            return 1;
        }
        return getLeafSize_2(root.left)+ getLeafSize_2(root.right);
    }
    //叶子结点个数-遍历思路
    static int LeafSize=0;//记录叶子结点个数
    public static void getLeafSize_1(TreeNode root){
        //退出条件
        if(root==null){
            return;
        }

        if(root.right==null&&root.left==null){
            //当root为叶子节点时
            LeafSize++;
        }
        getLeafSize_1(root.left);//递归遍历root的左子树
        getLeafSize_1(root.right);//递归遍历roo的右子树
    }

    //求第k层结点个数
    public static int getKLevelSize(TreeNode root,int k){
        if(root==null||k<1){
            //节点为空或给的k的值不符合条件
            return 0;
        }
        if(k==1){
            //当k=1说明已经递归到了第k层，返回1
            return 1;
        }
        return getKLevelSize(root.left,k-1)+getKLevelSize(root.right,k-1);
    }

    public static TreeNode find(TreeNode root,int val){
        if(root==null){
            //结点为空，直接返回null
            return null;
        }
        if(root.val==val){
            //如果当前结点的val等于给定val，则返回该结点
            return root;
        }
        TreeNode temp=find(root.left,val);//递归查找root的左子树，记录返回值
        if(temp!=null){
            //如果左子树的返回值不为null，说明在左子树中已经查找到了想要的接待，就直接返回该结点
            return temp;
        }
        return find(root.right,val);//如果左子树中没有查到，则返回右子树的查询结果
    }

    public static int getDepth(TreeNode root){
        if(root==null){
            //当前节点为空，返回0
            return 0;
        }
        int leftHigh=getDepth(root.left);//获取左子数深度
        int rightHigh=getDepth(root.right);//获取右子树深度
        return 1+(leftHigh>rightHigh?leftHigh:rightHigh);//返回左右子树中深度较深的值
    }


    //判断完全二叉树
    public static boolean isCompleteTree(TreeNode root){
        if(root==null){
            return false;
        }
        boolean isLevel2=false;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(true){
            TreeNode cur=queue.poll();
            if(cur==null){
                break;
            }
            if(!isLevel2){
                if(cur.left!=null&&cur.right!=null){
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }else if(cur.left==null&&cur.right!=null){
                    return false;
                }else if(cur.left!=null&&cur.right==null){
                    queue.offer(cur);
                    isLevel2=true;
                }else{
                    isLevel2=true;
                }
            }else{
                if(cur.left!=null||cur.right!=null){
                    return false;
                }
            }
        }
        return true;
    }

}
