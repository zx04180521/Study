package LeetCode;


import LinkedList.Node;

import static LinkedList.Main.creatList;

public class Solution_0204 {
    public static void main(String[] args) {
        Node head=creatList();
//        print(head);
        print(reverseList(head));
    }

//反转链表
    private static Node reverseList(Node head) {
//         方法一：逐个将旧链表的节点插入到新链表
         Node new_head = null;  //新链表的尾节点
         while(head!=null){
             Node tmp = head;  //记录节点
             head = head.next;  //遍历后移
             tmp.next = new_head;  //将节点放入新链表表头
             new_head = tmp;  //更新新链表的表头
         }
         return new_head;



//方法二：遍历，一次将当前结点指向前一个结点
//        if(head==null){
//            return head;
//        }
//        if(head.next==null){
//            return head;
//        }
//        Node newHead=null;
//        Node prevNode=null;
//        Node curNode=head;
//        while (curNode!=null){
//            Node nextNode=curNode.next;
//            if(nextNode==null){
//                newHead=curNode;
//            }
//            curNode.next=prevNode;
//            prevNode=curNode;
//            curNode=nextNode;
//
//        }
//        return newHead;
    }

    public static void print(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(" " + cur.val);
            cur = cur.next;
        }
    }


}
