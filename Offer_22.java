package LeetCode;

import static LeetCode.CreatAndPrintList.creatList;
import static LeetCode.CreatAndPrintList.printList;

/*
* 链表中倒数第k个节点
* 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，
* 即链表的尾节点是倒数第1个节点。

*例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。
* 这个链表的倒数第 3 个节点是值为 4 的节点

* */
public class Offer_22 {
    public static void main(String[] args) {
        ListNode head= creatList();
        printList(head);
        printList(getKthFromEnd(head,2));
    }
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode cur=head;
        int count=0;//用于保存链表长度
        //通过循环得到链表长度
        while(cur!=null){
            cur=cur.next;//更新当前结点
            count++;
        }
        cur=head;//更新当前结点至头结点
        for(int i=0;i<count-k;i++){
            cur=cur.next;
        }
        return cur;//返回当前结点既倒数第k个节点
    }
}
