package LinkedArray;

public class Main {
    public static Node creatList() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        return a;
    }

    public static void main(String[] args) {
//        printFor();//for循环打印链表
//        printWhile();//while循环打印链表
//        findEnd();//寻找链表最后一个元素
//        findEndTwo();//寻找链表倒数第二个元素
//        findN(2);//寻找链表第n个元素
//        findEndN(2);//寻找链表倒数第N个元素
//        boolean b = contains(3);//判断链表是否包含某个元素
//        if (b == true) {
//            System.out.println("找到了");
//        } else {
//            System.out.println("没找到");
//        }
    }

    //断链表是否包含某个元素
    private static boolean contains(int e) {
        Node head = creatList();
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.val == e) {
                return true;
            }
        }
        return false;
    }

    //寻找链表倒数第N个元素
    private static void findEndN(int n) {
        System.out.println("链表倒数第n个元素");
        int count = 0;//计算链表长度
        Node head = creatList();
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
    private static void findN(int n) {
        System.out.println("链表第n个元素");
        Node head = creatList();
        Node cur = head;
        for (int i = 1; i < n; i++) {
            cur = cur.next;
        }
        System.out.println(cur.val);

    }

    private static void findEndTwo() {
        System.out.println("链表倒数第二个元素：");
        Node head = creatList();
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
    private static void findEnd() {
        System.out.println("链表最后一个元素：");
        Node head = creatList();
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.next == null) {
                System.out.println(cur.val);
            }
        }
    }

    //while循环打印链表
    private static void printWhile() {
        System.out.println("while循环打印链表:");
        Node head = creatList();
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    //for循环打印链表
    public static void printFor() {
        Node head = creatList();
        System.out.println("for循环打印链表：");

        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur.val);

        }
    }
}

