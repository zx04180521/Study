package LeetCode;

import static LeetCode.CreatAndPrintList.creatList;
import static LeetCode.CreatAndPrintList.printList;


/*
* 删除链表的结点
* 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
* 返回删除后的链表的头节点。
* */
public class Offer_18 {
    public static void main(String[] args) {
        ListNode head= creatList();
        printList(head);
        printList(deleteNode(head,1));

    }

    public static ListNode deleteNode(ListNode head, int val) {
        if(head==null){
            return head;
        }
        if(head.val==val){
            return head.next;
        }
        ListNode cur=head;
        while(cur!=null&&cur.next!=null&&cur.next.val!=val){
            cur=cur.next;
        }
        if(cur!=null){
            cur.next=cur.next.next;
        }
        return head;
    }
}
