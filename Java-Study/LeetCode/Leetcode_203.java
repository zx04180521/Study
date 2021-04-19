package LeetCode;

import static LeetCode.CreatAndPrintList.creatList;
import static LeetCode.CreatAndPrintList.printList;

/*
* 删除链表给定值
* 删除链表中等于给定值 val 的所有节点。
* */
public class Leetcode_203 {
    public static void main(String[] args) {
        ListNode head = creatList();
        ListNode result = removeElements(head, 3);
        printList(result);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val)
                prev.next = cur.next;
            else
                prev = cur;
            cur = cur.next;
        }
        return dummy.next;

//
//        if(head==null){
//            return null;
//        }
//        ListNode prev = head;
//        while (prev.next != null) {
//            if (prev.next.val == val) {
//                prev.next = prev.next.next;
//            }else{
//                prev = prev.next;
//            }
//
//        }
//        if(head.val==val){
//            head=head.next;
//        }
//        return head;

//
//            ListNode dummy=new ListNode(0);
//            dummy.next=head;
//            ListNode cur=dummy;
//            while(cur.next!=null){
//                if(cur.next.val==val)cur.next=cur.next.next;
//                else cur=cur.next;
//            }
//            return dummy.next;



    }
}
