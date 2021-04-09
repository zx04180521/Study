package MyStackAndQueue;


import java.util.Stack;

//链表实现对列
class MyQueue {
    Stack<Character> stack = new Stack<>();
    ListNode head = null;
    ListNode tail = null;
    //入队操作
    public boolean offer(int value) {
        ListNode newHead = new ListNode(value);
        //当队列为空时
        if (head == null) {
            head = newHead;
            tail = newHead;
            return true;
        }
        tail.next = newHead;//尾插新节点
        tail = newHead;//更新尾结点
        return true;
    }

    //出队操作
    public Integer poll() {
        //当链表为空时
        if (head == null) {
            return null;
        }

        int ret = head.val;//记录头结点元素
        head = head.next;//删除头结点
        //当删除头结点之后，如果头结点为null
        if (head == null) {
            tail = null;//将尾结点赋值为null
        }
        return ret;
    }

    //取队首元素
    public Integer peek() {
        if (head == null) {
            return null;
        }
        int ret = head.val;
        return ret;
    }
}
