package LeetCode;

public class CreatAndPrintList {
    public static ListNode creatList() {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
//        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = null;
//        d.next = null;
        return a;
    }
    public static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
