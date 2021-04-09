package LeetCode;


import java.util.LinkedList;
import java.util.Queue;

/*用队列实现栈
* 请你仅使用两个队列实现一个后入先出（LIFO）的栈*/
public class Leetcode_225 {
    public static void main(String[] args) {
        MyStack ms=new MyStack();
        ms.push(1);
        ms.push(2);
        System.out.println(ms.top());
        System.out.println(ms.pop());
        System.out.println(ms.empty());
    }
}
class MyStack {
    Queue<Integer> A=new LinkedList<>();
    Queue<Integer> B=new LinkedList<>();


    /** Push element x onto stack. */
    //入栈
    public void push(int x) {
        A.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    //出栈
    public int pop() {
        while(A.size()>1){
            B.offer(A.poll());
        }
        int ret=A.poll();
        swapAB();
        return ret;
    }
    public void swapAB(){
        Queue<Integer> temp=A;
        A=B;
        B=temp;
    }

    /** Get the top element. */
    //取栈顶元素
    public int top() {
        while(A.size()>1){
            B.offer(A.poll());
        }
        int ret=A.peek();
        B.offer(A.poll());
        swapAB();
        return ret;
    }

    /** Returns whether the stack is empty. */
    //判断栈是否为空
    public boolean empty() {
        return A.isEmpty();
    }
}
