package eight;
/**
 * ģ������8-2����д�����̣߳��ֱ��ڿ���̨�����Ϣ��
 * @ID1806050126
 * @author ���1801����
 *
 */
public class Test8_1{
    public static void main(String args[ ]){
        WriteWordThread zhang,wang,li;
        zhang=new WriteWordThread("��С��",200);    //�½��߳�
        wang=new WriteWordThread("JamsKeven",100); //�½��߳�
        li=new WriteWordThread("С��",100);//�½��߳�
        zhang.start();                               //�����߳�
        wang.start();                                //�����߳�
        li.start();//�����߳�
    }
}
class WriteWordThread extends Thread{
    int n=0;
    WriteWordThread(String s,int n){
         setName(s);            //����Thread��ķ���setNameΪ�߳��������
         this.n=n;
    }
    public void run(){
         for(int i=1;i<=8;i++){
            System.out.println("����һ���̣߳��ҵ�������"+getName());
            try{  sleep(n);
            }
            catch(InterruptedException e) {}
         }
    }
}
