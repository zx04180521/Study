package LeetCode;

/*设计循环双端队列*/
public class Leetcode_641 {
    public static void main(String[] args) {
        MyCircularDeque circularDeque = new MyCircularDeque(3); // 设置容量大小为3
        System.out.println(circularDeque.insertLast(1));// 返回 true
        System.out.println(circularDeque.insertLast(2));			        // 返回 true
        System.out.println(circularDeque.insertFront(3));;		        // 返回 true
        System.out.println(circularDeque.insertFront(4)); 			        // 已经满了，返回 false
        System.out.println(circularDeque.getRear());  				// 返回 2
        System.out.println(circularDeque.isFull());				        // 返回 true
        System.out.println(circularDeque.deleteLast());			        // 返回 true
        System.out.println(circularDeque.insertFront(4));;		        // 返回 true
        System.out.println(circularDeque.getFront());//返回4

    }
}
class MyCircularDeque {
    int[] ary;
    int size=0;
    int head=0;
    int tail=1;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        ary=new int[k];
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(size==ary.length){
            return false;
        }
        ary[head--]=value;
        if(head==-1){
            head=ary.length-1;
        }
        size++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(size==ary.length){
            return false;
        }
        ary[tail++]=value;
        if(tail==ary.length){
            tail=0;
        }
        size++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(size==0){
            return false;
        }
        head++;
        if(head==ary.length){
            head=0;
        }
        size--;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(size==0){
            return false;
        }
        tail--;
        if(tail<0){
            tail=ary.length-1;
        }
        size--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(size==0){
            return -1;
        }
        if(head==ary.length-1){
            return ary[0];
        }
        return ary[head+1];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(size==0){
            return -1;
        }
        if(tail==0){
            return ary[ary.length-1];
        }
        return ary[tail-1];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size==0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size==ary.length;
    }
}