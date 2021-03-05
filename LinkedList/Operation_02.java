package LinkedArray;

/*
 * 链表的插入操作
 * 分为带傀儡结点和不带傀儡结点
 * */
public class Operation_02 {
    //打印链表
    public static void print(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    //打印链表
    public static void printDummy(Node head) {
        Node cur = head.next;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    //傀儡链表的头插
    public static void insertDummy(Node headDummy, Node newNode) {
        Node prev = headDummy;
        newNode.next = prev.next;
        prev.next = newNode;
        printDummy(headDummy);
    }


    //将新节点插入到1和2之间
    public static void inset1_2(Node head, Node newNode) {
        Node prev = head;
        newNode.next = prev.next;
        prev.next = newNode;
        print(head);
    }

    //将新节点的头插
    public static void inset_1(Node head, Node newNode) {
        newNode.next = head;
        head = newNode;
        print(head);
    }

    //尾插一个节点
    public static void insetTail(Node head, Node newNode) {
        Node prev = head;
        while (prev != null && prev.next != null) {
            prev = prev.next;
        }
        prev.next = newNode;
        newNode.next = null;
        print(head);

    }

    //删除给定结点
    public static void delete(Node head, Node toDelete) {
        Node prev = head;
        while (prev != null && prev.next != toDelete) {
            prev = prev.next;
        }
        if (prev == null) {
            System.out.println("没找到");
            return;
        }
        prev.next = toDelete.next;
        print(head);
    }


    //删除给定值
    public static void delete(Node head, int val) {
        Node prev = head;
        while (prev != null && prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            }
            prev = prev.next;
        }
        print(head);
    }

    public static int size(Node head) {
        int size = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    //给定下标删除
    public void delete2(Node head, int index) {
        int size = size(head);
        if (index < 0 || index >= size) {
            return;
        }
        if(index==0){
            head=head.next;
        }
        Node prev=head;
        for(int i=0;i<index-1;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        print(head);
    }
}

