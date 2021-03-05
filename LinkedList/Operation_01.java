package LinkedArray;
/*
* 普通链表的简单遍历操作
* */
public class Operation_01 {

    //断链表是否包含某个元素
    public static boolean contains(Node head,int e) {

        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.val == e) {
                return true;
            }
        }
        return false;
    }

    //寻找链表倒数第N个元素
    public static void findEndN(Node head,int n) {
        System.out.println("链表倒数第" + n + "个元素");
        int count = 0;//计算链表长度

        for (Node cur = head; cur != null; cur = cur.next) {
            count++;
        }
        Node cur = head;
        for (int i = 1; i < count + 1 - n; i++) {
            cur = cur.next;
        }
        System.out.println(cur.val);
    }

    //寻找链表第n个元素
    public static void findN(Node head,int n) {
        System.out.println("链表第" + n + "个元素");

        Node cur = head;
        for (int i = 1; i < n; i++) {
            cur = cur.next;
        }
        System.out.println(cur.val);

    }

    public static void findEndTwo(Node head) {
        System.out.println("链表倒数第二个元素：");

        for (Node cur = head; cur != null && cur.next != null; cur = cur.next) {
            if (cur.next.next == null) {
                System.out.println(cur.val);
            }
        }

        Node cur = head;
        while (cur != null && cur.next != null) {
            if (cur.next.next == null) {
                System.out.println(cur.val);
            }
            cur = cur.next;
        }
    }


    //寻找链表最后一个元素
    public static void findEnd(Node head) {
        System.out.println("链表最后一个元素：");

        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.next == null) {
                System.out.println(cur.val);
            }
        }
    }

    //while循环打印链表
    public static void printWhile(Node head) {
        System.out.println("while循环打印链表:");

        Node cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    //for循环打印链表
    public static void printFor(Node head) {

        System.out.println("for循环打印链表：");

        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur.val);

        }
    }

}
