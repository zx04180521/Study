package Priority;

import java.util.Arrays;

public class MyPriorityQueue {
    public static void main(String[] args) {
        MyPriorityQueue m=new MyPriorityQueue();
        m.offer(6);//插入元素
        m.offer(5);//插入元素
        m.offer(4);//插入元素
        m.offer(3);//插入元素

        int[] arr={9,2,7};
        m.creatHeap(arr);//将数组插入到优先级队列中

        System.out.println(m.peek());//打印优先级最高的元素
        m.poll();//删除优先级最高的元素
        System.out.println(m.peek());//运行结果 3
        m.poll();//删除优先级最高的元素
        System.out.println(m.peek());//运行结果 4

    }
    private int[] arr = new int[100];//用于存储插入的数据
    private int size = 0;//记录数组有效元素个数

    //重写toString方法
    @Override
    public String toString() {
        //将数组中的有效元素拷贝到新数组并返回
        int[] newArr=Arrays.copyOf(arr,size);
        return Arrays.toString(newArr);
    }


    //向下调整
    public  void shiftDown(int[] arr, int index, int size) {
        int parent = index;//需要调整的位置
        int child = 2 * parent + 1;//chile标记parent的左孩子节点
        while (child < size) {
            if (child + 1 < size && arr[child] > arr[child + 1]) {
                //判断parent左右孩子的大小关系，让child标记较小的孩子节点
                child = child + 1;
            }
            //判断parent和child位置的元素的大小关系，
            //如果arr[child] < arr[parent]，则交换位置
            if (arr[child] < arr[parent]) {
                int tmp = arr[child];
                arr[child] = arr[parent];
                arr[parent] = tmp;
            } else {
                //否则arr[parent]就已经找到了合适的位置结束循环
                break;
            }
            parent = child;//更新parent标记的位置
            child = 2 * parent + 1;//更新child标记的位置,继续下次循环
        }
    }

    //向上调整
    public  void shiftUp(int[] arr, int size, int index) {
        int child = index;//让child标记要调整元素的位置
        int parent = (child - 1) / 2;//child位置的父亲位置
        while (child > 0) {
            //如果arr[child] < arr[parent]，则交换位置
            if (arr[child] < arr[parent]) {
                int temp = arr[child];
                arr[child] = arr[parent];
                arr[parent] = temp;
            } else {
                //否则就找到的index位置元素该在的位置
                break;
            }
            child = parent;//更新child位置，进行下次循环
            parent = (child - 1) / 2;//更新parent位置，进行下次循环
        }
    }

    //使用数组创建堆（向下调整）
    public  void creatHeap(int newArr[]) {
        for(int i:newArr){
            arr[size++]=i;
        }
        for (int i = (size - 1 - 1) / 2; i >= 0; i--) {
            shiftDown(arr, i, size);
        }
    }

    //使用数组创建堆（向上调整）
    public  void creatHeap2(int arr[]) {
        for (int x : arr) {
            offer(x);
        }
    }

    //向堆中插入元素
    public  void offer(int val) {
        if (size >= arr.length) {
            return;
        }
        arr[size++] = val;
        shiftUp(arr, size, size - 1);
    }

    //获取堆顶元素
    public  Integer peek() {
        if (size == 0) {
            return null;
        }
        int res = arr[0];
        return res;
    }

    //删除堆顶元素
    public  Integer poll() {
        if (size == 0) {
            return null;
        }
        int res = arr[0];
        //交换操作
        int temp = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = temp;
        size--;//堆的有效元素个数减一就实现了删除元素
        shiftDown(arr, 0, size);//对堆顶元素进行向下调整
        return res;
    }

}
