package NiuKe;

import LeetCode.ListNode;

/*反转链表*/
public class NC78 {
    public static void main(String[] args) {

    }
    public ListNode ReverseList1(ListNode head) {
        ListNode newHead=null;//新链表的头
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur;//使用临时变量记录当前结点
            cur=cur.next;//更新cur
            temp.next=newHead;//将临时变量的结点头插到新链表的头
            newHead=temp;//更新新链表的头
        }
        return newHead;
    }

    public ListNode ReverseList2(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            ListNode nextNode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nextNode;

        }
        return prev;
    }
}
