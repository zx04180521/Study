package LeetCode;


import static LeetCode.CreatAndPrintList.creatList;
import static LeetCode.CreatAndPrintList.printList;

/*
* 反转链表
* 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点
* */
public class Offer_24 {
    public static void main(String[] args) {
        ListNode head=creatList();
        printList(head);
        System.out.println("==========");
        printList(reverseList_01(head));
        System.out.println("==========");
        printList(reverseList_02(reverseList_01(head)));
    }

    //头插法
    public static ListNode reverseList_01(ListNode head) {
        ListNode newhead=null;//新链表头结点
        ListNode cur=head;//原链表头结点
        while(cur!=null){
            ListNode tmp=new ListNode(cur.val);//记录原链表结点
            tmp.next=newhead;//将原链表结点头插到新链表
            newhead=tmp;//重置新链表头结点
            cur=cur.next;
        }
        return newhead;
    }

    //三指针法
    public static ListNode reverseList_02(ListNode head) {
        ListNode pre=null;//前一个结点
        ListNode cur=head;//当前结点
        while(cur!=null){
            ListNode latter=cur.next;//记录当前结点的下一个结点
            cur.next=pre;//将当前结点的指向逆置
            pre=cur;//结点后移
            cur=latter;//结点后移
        }
        return pre;
    }
}
