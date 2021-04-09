package LeetCode;

import static LeetCode.CreatAndPrintList.creatList;
import static LeetCode.CreatAndPrintList.printList;

/*
* 链表相交
*
给定两个（单向）链表，判定它们是否相交并返回交点
* 请注意相交的定义基于节点的引用，而不是基于节点的值。
* 换句话说，如果一个链表的第k个节点与另一个链表的第j个节点是同一节点（引用完全相同），则这两个链表相交。
* */
public class Interview_0207 {
    public static void main(String[] args) {
        ListNode headA=creatList();
        ListNode headB=creatList();
        printList(getIntersectionNode(headA,headB));
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA=0,countB=0;
        ListNode curA=headA,curB=headB;
        //循环遍历，求出链表长度
        while(curA!=null){
            curA=curA.next;
            countA++;
        }
        while(curB!=null)     {
            curB=curB.next;
            countB++;
        }
        curA=headA;
        curB=headB;
//判断长度，将较长的链表向后遍历长度差个节点
        if(countA>countB){
            for(int i=0;i<countA-countB;i++){
                curA=curA.next;
            }

        }else{
            for(int i=0;i<countB-countA;i++){
                curB=curB.next;
            }
        }
//循环遍历，判断节点引用是否相同
        while(curA!=null&&curB!=null){
            if(curA==curB){
                return curA;//如果相同则返回该结点
            }
            curA=curA.next;
            curB=curB.next;
        }
        return null;//跳出while循环说明没有公共结点
    }
}
