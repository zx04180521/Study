package LeetCode;

import java.util.List;

import static LeetCode.CreatAndPrintList.creatList;
import static LeetCode.CreatAndPrintList.printList;

/*删除排序链表中的重复元素Ⅱ
* 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字
* */
public class Leetcode_82 {
    public static void main(String[] args) {
        ListNode head=creatList();
        printList(deleteDuplicates(head));
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;
        ListNode newHead=new ListNode(0);//创建带傀儡的新链表
        ListNode newTail=newHead;//记录链表的尾结点
        while(cur!=null){
            //判断当前结点与下一个结点是否相同
            if(cur.next!=null&&cur.val==cur.next.val){
                //当下一个结点与当前结点相同时，跳过当前结点，直到下一个节点与当前结点不相同
                while(cur!=null&&cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
            }else{
                //将只出现一次的结点放入新链表
                newTail.next=new ListNode(cur.val);
                newTail=newTail.next;
            }
            cur=cur.next;
        }
        return newHead.next;//返回新链表，因为带傀儡，所以从第二个节点返回
    }
}
