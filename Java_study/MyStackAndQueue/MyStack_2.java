package MyStackAndQueue;

//链表实现栈
public class MyStack_2{
    ListNode head=null;//头结点

    //入栈
    public void push(int value){
        ListNode newHead=new ListNode(value);
        //当链表为空时
        if(head==null){
            head=newHead;
            return;
        }
        //头插操作
        newHead.next=head;
        head=newHead;
    }

    //出栈操作
    public Integer pop(){
        //当链表为空
        if(head==null){
            return null;
        }
        //头删操作
        int ret=head.val;
        head=head.next;
        return ret;
    }
    //取栈顶元素
    public Integer peek(){
        if(head==null){
            return null;
        }
        return head.val;
    }
}

