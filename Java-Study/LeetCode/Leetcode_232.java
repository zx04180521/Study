package LeetCode;

import java.util.Stack;

/*用栈实现队列
* 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
* 实现 MyQueue 类：
void push(int x) 将元素 x 推到队列的末尾
int pop() 从队列的开头移除并返回元素
int peek() 返回队列开头的元素
boolean empty() 如果队列为空，返回 true ；否则，返回 false
*/
public class Leetcode_232 {
    public static void main(String[] args) {
        MyQueue mq=new MyQueue();
        mq.push(1);
        mq.push(2);
        System.out.println(mq.peek());
        System.out.println(mq.pop());
        System.out.println(mq.empty());

    }
}
class MyQueue {
    Stack<Integer> A=new Stack<>();
    Stack<Integer> B=new Stack<>();
    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!B.isEmpty()){
            A.push(B.pop());
        }
        A.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!A.isEmpty()){
            B.push(A.pop());
        }
        return B.pop();
    }

    /** Get the front element. */
    public int peek() {
        while(!A.isEmpty()){
            B.push(A.pop());
        }
        return B.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return A.isEmpty()&&B.isEmpty();
    }
}
