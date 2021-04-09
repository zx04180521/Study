package MyStackAndQueue;

//数组实现栈
class MyStack{
    int[] data=new int[100];
    int size=0;
    //入栈操作
    public void push(int value){
        //数组空间已满
        if(size>=data.length){
            return;
        }
        data[size++]=value;
    }
    //出栈操作
    public Integer pop(){
        //栈为空时
        if(size==0){
            return null;
        }
        size--;
        return data[size];
    }
    //取栈顶元素
    public Integer peek(){
        if(size==0){
            return null;
        }
        return data[size-1];
    }
}

