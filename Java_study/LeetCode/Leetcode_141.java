package LeetCode;


import java.util.ArrayList;
import java.util.List;

import static LeetCode.CreatAndPrintList.creatList;
import static LeetCode.CreatAndPrintList.printList;

/*
* 给定一个链表，判断链表中是否有环*/
public class Leetcode_141 {
    public static void main(String[] args) {
        ListNode head=creatList();
        System.out.println(hasCycle(head));
    }
    public static boolean hasCycle(ListNode head) {
        ListNode fast=head;//快指针
        ListNode slow=head;//慢指针
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;//快指针，一次两个节点
            slow=slow.next;//慢指针，一次一个节点
            //判断是否相等
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
