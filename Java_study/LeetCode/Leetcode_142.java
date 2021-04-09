package LeetCode;

import static LeetCode.CreatAndPrintList.creatList;
import static LeetCode.CreatAndPrintList.printList;

/*环形链表
* 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
* 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
* 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。
*/
public class Leetcode_142 {
    public static void main(String[] args) {
        ListNode head=creatList();
        printList(detectCycle(head));

    }
    public static ListNode detectCycle(ListNode head) {
        //排除空链表和只有一个节点的情况
        if(head==null||head.next==null){
            return null;
        }

        ListNode slow=head;//慢指针
        ListNode fast=head;//快指针
        ListNode cur=head;
        //通过循环判断链表是否带环
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                //表示链表带环，结束循环
                break;
            }
        }
        //判断上述while循环结束的原因，只有两个原因
        //第一个原因：如果快指针走到了链表结尾，则返回null
        if(fast==null||fast.next==null){
            return null;
        }
        //第二个原因：链表带环
        //如果链表带环，则 快慢指针相遇的结点 和 链表头结点 距离链表入环的第一个结点是相同的
        //所以只需要同步遍历，直到第一次相遇既为链表入环的第一个结点
        while(cur!=fast){
            cur=cur.next;
            fast=fast.next;
        }
        return fast;
    }
}
