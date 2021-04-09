package LeetCode;
/*
* 删除链表给定值
* */
public class Solution_0302 {
    public static void main(String[] args) {
        ListNode head = creat();
        ListNode result = removeElements(head, 3);
        print(result);
    }

    public static void print(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    public static ListNode creat() {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        return a;
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
    }
}
