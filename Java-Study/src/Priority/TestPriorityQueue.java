package Priority;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class TestPriorityQueue {
    public static void main(String[] args) {
testPriorityQueue2();
    }
    public static void testPriorityQueue(){
        //创建一个空的优先级队列，默认容量为11
        PriorityQueue<Integer> q1=new PriorityQueue<>();

        //创建一个空的优先级队列，底层的容量为100
        PriorityQueue<Integer> q2=new PriorityQueue<>();

        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //用一个ArrayList对象构造优先级队列
        //此时优先级队列已经有3个元素
        PriorityQueue<Integer> q3=new PriorityQueue<>(list);
    }
    public static void testPriorityQueue2(){
        int[] arr={9,5,2,7,4,8,3,6};

        //如果知道元素个数，可以在创建优先级队列时，直接将容量设置好
        //否则在插入时会有不必要的扩容操作，效率较低
        PriorityQueue<Integer> q=new PriorityQueue<>(arr.length);
        //将数组元素插入到优先级队列中
        for(int i:arr){
            q.offer(i);
        }

        //获取优先级最高的元素
        System.out.println(q.peek());//运行结果  2
        //获取优先级队列有效元素个数
        System.out.println(q.size());//运行结果  8

        q.poll();//删除优先级队列中优先级最高的元素

        System.out.println(q.peek());//运行结果  3
        System.out.println(q.size());//运行结果  7

        q.offer(0);//插入元素0
        System.out.println(q.peek());//运行结果  0

    }

}
