package LeetCode;

import static LeetCode.CreatAndPrintList.creatList;
import static LeetCode.CreatAndPrintList.printList;

/*删除链表中的重复结点
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次
 * */
public class Leetcode_83 {
    public static void main(String[] args) {
        ListNode head = creatList();
        printList(deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode newHead = new ListNode(0);
        ListNode newTail = newHead;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur != null && cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
            } else {
                newTail.next = new ListNode(cur.val);
                newTail = newTail.next;
                cur = cur.next;
            }

        }
        return newHead.next;
    }
}
