package MyStackAndQueue;

public class Main {
    public static void main(String[] args) {
        //测试数组实现队列
//        MyQueue mq=new MyQueue();
//        mq.offer(1);
//        mq.offer(2);
//        mq.offer(3);
//        System.out.println(mq.poll());
//        System.out.println(mq.poll());
//        System.out.println(mq.poll());
//        System.out.println(mq.poll());

        //测试栈实现队列
//        MyQueue_2 mq2=new MyQueue_2();
//        mq2.offer(1);
//        mq2.offer(2);
//        mq2.offer(3);
//        System.out.println(mq2.poll());
//        System.out.println(mq2.peek());
//        System.out.println(mq2.poll());
//        System.out.println(mq2.poll());
//        System.out.println(mq2.poll());


        //测试数组实现栈
        MyStack ms=new MyStack();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());

        //测试链表实现栈
//        MyStack_2 ms1 = new MyStack_2();
//        ms1.push(1);
//        ms1.push(2);
//        ms1.push(3);
//        System.out.println(ms1.pop());
//        System.out.println(ms1.pop());
//        System.out.println(ms1.pop());
//        System.out.println(ms1.pop());

    }
}
