package eight;
/**
 * 模仿例子8-2，编写三个线程，分别在控制台输出信息。
 * @ID1806050126
 * @author 软件1801张鑫
 *
 */
public class Example8_2{
    public static void main(String args[ ]){
        WriteWordThread zhang,wang,li;
        zhang=new WriteWordThread("张小红",200);    //新建线程
        wang=new WriteWordThread("JamsKeven",100); //新建线程
        li=new WriteWordThread("小李",100);//新建线程
        zhang.start();                               //启动线程
        wang.start();                                //启动线程
        li.start();//启动线程
    }
}
class WriteWordThread extends Thread{
    int n=0;
    WriteWordThread(String s,int n){
         setName(s);            //调用Thread类的方法setName为线程起个名字
         this.n=n;
    }
    public void run(){
         for(int i=1;i<=8;i++){
            System.out.println("我是一个线程，我的名字是"+getName());
            try{  sleep(n);
            }
            catch(InterruptedException e) {}
         }
    }
}
