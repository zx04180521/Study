package LeetCode;

import java.util.Stack;

public class Interview_30 {
    public static void main(String[] args) {

    }
class MinStack {

        /** initialize your data structure here. */
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> minStack=new Stack<>();


        public void push(int x) {
            stack.push(x);
            if(minStack.isEmpty()){
                minStack.push(x);
            }else{
                minStack.push(Math.min(x,minStack.peek()));
            }

        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return minStack.peek();
        }
    }

}
