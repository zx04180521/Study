package MyHashMap;

public class MyHashMap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(2, 1);
        map.put(12, 2);
        map.put(22, 3);
        map.put(32, 4);
        map.put(42, 5);
        map.put(52, 6);
        map.remove(52);
        int index = map.hashCode(52);
        HashNode root=map.array[index];
        map.printNode(root);
        System.out.println(map.get(52));
    }



    static class HashNode {
        int key;
        int val;
        HashNode next;

        public HashNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    HashNode[] array = new HashNode[10];
    private int size = 0;

    //获取当前结点在hash表中的下标
    public int hashCode(int key) {
        return key % array.length;
    }

    //插入元素
    public void put(int key, int val) {
        int index = hashCode(key);
        for (HashNode cur = array[index]; cur != null; cur = cur.next) {
            if (cur.key == key) {
                cur.val = val;
            }
        }
        HashNode newNode = new HashNode(key, val);
        newNode.next = array[index];
        array[index] = newNode;
        size++;

        if (loadFactor() > 0.75) {
            resize();
        }
    }

    //扩容
    public void resize() {
        HashNode[] newArr = new HashNode[2 * array.length];
        for (int i = 0; i < array.length; i++) {
            HashNode next = null;
            for (HashNode cur = array[i]; cur != null; cur = next) {
                next = cur.next;
                int newIndex = hashCode(cur.key);
                cur.next = newArr[newIndex];
                newArr[newIndex] = cur;
            }
        }
        array = newArr;
    }

    //负载系数
    public float loadFactor() {
        return (float) size / array.length;
    }

    //返回key对应的value
    public Integer get(int key) {
        int index = hashCode(key);
        for (HashNode cur = array[index]; cur != null; cur = cur.next) {
            if (cur.key == key) {
                return cur.val;
            }
        }
        return null;
    }

    public void remove(int key) {
        int index = hashCode(key);
//        HashNode dummy=new HashNode(0,0);
//        dummy.next=array[index];
//        for(HashNode prev=dummy;prev!=null&&prev.next!=null;prev=prev.next){
//            if(prev.next.key==key){
//                prev.next=prev.next.next;
//                return;
//            }
//        }

        for (HashNode cur = array[index]; cur != null && cur.next != null; cur = cur.next) {
            if (cur.next.key == key) {
                cur.next = cur.next.next;
                return;
            }
        }
        array[index] = array[index].next;

    }

    //打印key对应数组下标的所有元素
    public void printNode(HashNode root){
        HashNode cur=root;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}

