package LeetCode;
/*两数相加*/
public class LeetCode_2 {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1=l1;
        ListNode cur2=l2;
        ListNode newHead=new ListNode(0);
        ListNode newTail=newHead;
        int temp=0;
        while(cur1!=null||cur2!=null||temp!=0){
            int val1= (cur1==null?0:cur1.val);
            int val2=(cur2==null? 0: cur2.val);
            int sum=val1+val2+temp;
            temp=sum/10;
            newTail.next=new ListNode(sum%10);
            newTail=newTail.next;
            if(cur1!=null)cur1=cur1.next;
            if(cur2!=null)cur2=cur2.next;
        }
        return newHead.next;
    }
}
