package LeetCode;

import static LeetCode.CreatAndPrintList.creatList;
import static LeetCode.CreatAndPrintList.printList;

/*
* 分割链表
* 编写程序以 x 为基准分割链表，使得所有小于 x 的节点排在大于或等于 x 的节点之前。
* 如果链表中包含 x，x 只需出现在小于 x 的元素之后(如下所示)。
* 分割元素 x 只需处于“右半部分”即可，其不需要被置于左右两部分之间。
* */
public class Interview_0204 {
    public static void main(String[] args) {
        ListNode head=creatList();
        printList(partition(head,4));
    }
    public static ListNode partition(ListNode head, int x) {
        if(head==null)return null;//为空链表
        if(head.next==null) return head;//只有一个节点
        ListNode min =new ListNode(0);//创建小于给定值的链表
        ListNode minTail=min;
        ListNode max=new ListNode(0);//创建大于给定值的链表
        ListNode maxTail=max;
        ListNode cur=head;
        //比较链表节点与给定值并存入相应链表
        while(cur!=null){
            if(cur.val<x){
                minTail.next=new ListNode(cur.val);//后插入链表
                minTail=minTail.next;
            }else{
                maxTail.next=new ListNode(cur.val);//后插入链表
                maxTail=maxTail.next;
            }

            cur=cur.next;
        }
        minTail.next=max.next;//将两个链表拼接起来
        return min.next;
    }
}
