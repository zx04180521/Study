package MyStackAndQueue;

/*数组实现队列*/
class MyQueue_2{
    int[] data =new int[100];
    int size=0;
    int head=0;
    int tail=0;
    //入队操作
    public boolean offer(int value){
        if(size==data.length){
            return false;
        }
        data[tail++]=value;
        //当为下标等于数组长度时，既此时已经超出数组下标范围
        if(tail==data.length){
            tail=0;
        }
        size++;
        return true;
    }
    //出队操作
    public Integer poll(){
        if(size==0){
            return null;
        }
        int ret=data[head++];
        if(head==data.length){
            head=0;
        }
        size--;
        return ret;
    }
    //获取队首元素
    public Integer peek(){
        if(size==0){
            return null;
        }
        return data[head];
    }
}

