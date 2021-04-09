package LeetCode;
/*
* 链表的中间结点
* 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
*如果有两个中间结点，则返回第二个中间结点。
* */
import static LeetCode.CreatAndPrintList.creatList;
import static LeetCode.CreatAndPrintList.printList;

public class Leetcode_876 {
    public static void main(String[] args) {
        ListNode head=creatList();
        printList(middleNode(head));

    }
    public static ListNode middleNode(ListNode head) {
        ListNode cur=head;
        int count=0;//保存链表长度
        //循环遍历统计长度
        while(cur!=null){
            cur=cur.next;//更新结点
            count++;
        }
        cur=head;//将cur更新至头结点
        int mid=count/2;//得到中间结点的位置
        //循环相应次数。得到中间结点
        for(int i=0;i<mid;i++){
            cur=cur.next;
        }
        return cur;//返回中间结点
    }
}
