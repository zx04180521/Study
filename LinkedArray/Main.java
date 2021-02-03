package LinkedArray;

public class Main {
    //不带傀儡结点的链表
    public static Node creatList() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(3);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;


        return a;
    }

    //带傀儡的链表
    public static Node creatListDummy() {
        Node dummy = new Node(0);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        dummy.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;

        return dummy;
    }

    public static void main(String[] args) {
        Node head = creatList();//创建不带傀儡结点的链表
        Node headDummy = creatListDummy();//创建带傀儡结点的链表
//        simpleOperation(head);//普通链表简单的遍历操作
        basicOperation(head);//链表的基本操作(插入删除)
//        dummyBasicOperation(headDummy);//带傀儡链表的插入操作
    }

    private static void dummyBasicOperation(Node headDummy) {
        Operation_02 operation = new Operation_02();
        Node newNode = new Node(100);//待插入的新节点
        operation.insertDummy(headDummy, newNode);
    }

    private static void basicOperation(Node head) {
        Operation_02 operation = new Operation_02();
        Node newNode = new Node(100);//待插入的新节点
        operation.inset1_2(head,newNode);//将新节点插入到1和2之间
        operation.inset_1(head,newNode);//将新节点插入到1之前
        operation.insetTail(head,newNode);//将新节点尾插
        operation.delete(head, 3);//删除链表中所有的3
        Node node = head.next.next;//获取到第三个结点
        operation.delete(head,node);//删除第三个结点
        operation.delete2(head,2);//给定下标删除
    }


    public static void simpleOperation(Node head) {
        Operation_01 operation = new Operation_01();
        operation.printFor(head);//for循环打印链表
        operation.printWhile(head);//while循环打印链表
        operation.findEnd(head);//寻找链表最后一个元素
        operation.findEndTwo(head);//寻找链表倒数第二个元素
        operation.findN(head, 2);//寻找链表第n个元素
        operation.findEndN(head, 2);//寻找链表倒数第N个元素
        boolean b = operation.contains(head, 3);//判断链表是否包含某个元素
        if (b == true) {
            System.out.println("找到了");
        } else {
            System.out.println("没找到");
        }
    }


}

