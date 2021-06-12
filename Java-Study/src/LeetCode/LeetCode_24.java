package LeetCode;

public class LeetCode_24 {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            //退出条件
            return head;
        }
        ListNode nextNode=head.next;
        head.next=swapPairs(nextNode.next);
        nextNode.next=head;
        return nextNode;
    }
    public ListNode swapPairs2(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode cur=head;
        ListNode dummy=new ListNode(0);//傀儡结点
        dummy.next=head;
        head=head.next;//第二个节点才是最后需要返回的头结点
        while(cur!=null&&cur.next!=null){
            ListNode nextNode=cur.next.next;//使用临时变量记录需要交换的两个节点的下一个几点
            cur.next.next=cur;//让需要交换的第二个节点的next指向第一个结点
            dummy.next=cur.next;//傀儡结点指向交换前的第二个节点，也是交换后的第一个结点
            cur.next=nextNode;//让交换前的第一个结点的next指向刚刚记录的临时结点
            dummy=cur;//更新傀儡结点
            cur=nextNode;//更新cur
        }
        return head;
    }
}
