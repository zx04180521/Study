package LeetCode;

import static LeetCode.CreatAndPrintList.creatList;
import static LeetCode.CreatAndPrintList.printList;

/*
* 合并两个排序链表
* */
public class Offer_25 {
    public static void main(String[] args) {
        ListNode l1=creatList();
        ListNode l2=creatList();

        printList(mergeTwoLists(l1,l2));

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur1=l1;
        ListNode cur2=l2;
        ListNode newHead=new ListNode(0);//创建带傀儡的新链表，用于存放新的排序链表
        ListNode newTail=newHead;//记录尾结点位置
        //判断两个链表是否都是空链表
        if(cur1==null&&cur2==null){
            return null;
        }
        //如果cur1为空，则返回l2链表
        if(cur1==null){
            return l2;
        }
        //如果cur2为空，则返回l1链表
        if(cur2==null){
            return l1;
        }
        //比较两个链表数据的大小
        while(cur1!=null&&cur2!=null){
            //链表1的数据小于链表2的数据
            if(cur1.val<cur2.val){
                newTail.next=cur1;//将较小数据存放到新链表
                cur1=cur1.next;//更新链表位置
            }
            //链表1的数据大于等于链表2的数据
            else{
                newTail.next=cur2;//将较小数据存放到新链表
                cur2=cur2.next;//更新链表位置
            }
            newTail=newTail.next;
        }
        //遍历结束之后，判断是否有某一个链表没有遍历完
        if(cur1==null){
            newTail.next=cur2;
        }else{
            newTail.next=cur1;
        }
        return newHead.next;
    }
}
