package LeetCode;
/*最小栈*/
import java.util.Stack;

public class Leetcode_115 {
    public static void main(String[] args) {

    }
}
class MinStack {
    Stack<Integer> A=new Stack<>();//正常压栈
    Stack<Integer> B=new Stack<>();//将当前栈中最小元素压栈
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        A.push(x);
        if(B.size()==0){
            B.push(x);
        }else if(x<=B.peek()){
            B.push(x);
        }else{
            B.push(B.peek());
        }
    }

    public void pop() {
        A.pop();
        B.pop();
    }

    public int top() {
        return A.peek();
    }

    public int getMin() {
        return B.peek();
    }
}
