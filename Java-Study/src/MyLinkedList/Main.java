package MyLinkedList;


import LeetCode.CreatAndPrintList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list= new MyLinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        System.out.println(list);//打印头尾结点
        list.printList(list.head);

    }
}
