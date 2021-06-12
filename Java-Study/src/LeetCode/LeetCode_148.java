package LeetCode;

public class LeetCode_148 {
    public ListNode sortList(ListNode head) {
        return sortList(head,null);
    }
    public  ListNode sortList(ListNode head,ListNode tail){
        if(head==null){
            return head;
        }
        if(head.next==tail){
            //1.当tail为空时，链表只有head一个节点，则返回head
            //2.tail不为空，链表只有两个节点，则从中间断开，
            //  因为归并排序使用的是前闭后开区间
            head.next=null;
            return head;
        }
        //通过快慢指针法找到链表中间结点
        ListNode slow=head,fast=head;
        while(fast!=tail&&fast.next!=tail){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        //拆
        ListNode list1=sortList(head,mid);//递归的减小链表长度
        ListNode list2=sortList(mid,tail);//递归的减小链表长度
        //合
        return merge(list1,list2);
    }
    //合并两个排序链表
    public static ListNode merge(ListNode list1,ListNode list2){
        ListNode cur1=list1;
        ListNode cur2=list2;
        ListNode newhead=new ListNode(0);//合并后的新链表
        ListNode newtail=newhead;
        while(cur1!=null&&cur2!=null){
            if(cur1.val<=cur2.val){
                //cur1结点的值小于等于cur2结点的值
                newtail.next=cur1;
                cur1=cur1.next;
            }else{
                //cur1结点的值大于cur2结点的值
                newtail.next=cur2;
                cur2=cur2.next;
            }
            newtail=newtail.next;
        }
        if(cur1!=null){
            newtail.next=cur1;
        }else{
            newtail.next=cur2;
        }
        return newhead.next;
    }
}
