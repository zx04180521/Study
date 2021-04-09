package LeetCode;


import java.util.Arrays;

import java.util.Stack;
//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

public class Solution_0301 {
    public static void main(String[] args) {
        ListNode head =creatList();
        System.out.println(Arrays.toString(reversePrint(head)));
    }
    public static ListNode creatList() {
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
    public static int[] reversePrint(ListNode head) {
        ListNode cur=head;
        if(cur==null){
            return  new int[]{};
        }
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        cur=head;
        int[] result=new int[count];
        for(int i=count-1;i>=0;i--){
            result[i]=cur.val;
            cur=cur.next;
        }

        return result;



    }

}


