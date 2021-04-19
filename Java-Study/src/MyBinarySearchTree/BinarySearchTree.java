package MyBinarySearchTree;


public class BinarySearchTree {
    static class BinarySearchNode{
        private int key;
        private int value;
        BinarySearchNode left;
        BinarySearchNode right;

        public BinarySearchNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private static BinarySearchNode root=null;
    public static Integer get(int key){
        BinarySearchNode cur=root;
        while(cur!=null){
            if(cur.key==key){
                return cur.value;
            }else if(cur.key>key){
                cur=cur.left;
            }else{
                cur=cur.right;
            }
        }
        return null;
    }
    public static void put(int key,int value){
        BinarySearchNode cur=root;
        BinarySearchNode parent=null;
        while(cur!=null){
            if(cur.key>key){
                parent=cur;
                cur=cur.left;
            }else if(cur.key<key){
                parent=cur;
                cur=cur.right;
            }else{
                cur.value=value;
            }
        }
        BinarySearchNode newNode=new BinarySearchNode(key,value);
        if(parent.key>key){
            parent.left=newNode;
        }else{
            parent.right=newNode;
        }
    }
    public static void delete(int key){
        BinarySearchNode cur=root;
        BinarySearchNode parent=null;
        while(cur!=null) {
            if (key > cur.key) {
                parent = cur;
                cur = cur.right;
            } else if (key < cur.key) {
                parent = cur;
                cur = cur.left;
            } else {
                _delete(parent, cur);
            }
        }
    }
    public static void _delete(BinarySearchNode parent,BinarySearchNode cur){
        if(cur.left==null){
            if(cur==root){
                root=cur.right;
            }
            if(cur==parent.left){
                parent.left=cur.right;
            }
            if(cur==parent.right){
                parent.right=cur.right;
            }
        }else if(cur.right==null){
            if(cur==root){
                root=cur.left;
            }
            if(cur==parent.left){
                parent.left=cur.left;
            }
            if(cur==parent.right){
                parent.right=cur.left;
            }
        }else{
            BinarySearchNode goat=cur.right;
            BinarySearchNode parentGoat=cur;
            while(goat!=null){
                parentGoat=goat;
                goat=goat.left;
            }
            cur.key=goat.key;
            cur.value=goat.value;
            if(goat==parentGoat.left){
                parentGoat.left=goat.right;
            }else{
                parentGoat.right=goat.right;
            }
        }

    }

}
