package eight;
/**
 * ģ������8-4��д�����̣߳������ǹ������ĵ�Ԫ��
 * @ID  1806050126
 * @author ���1801����
 *
 */
public class Test8_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		  Left targetOfLeft =new Left();    //left�̵߳�Ŀ�����
	        Thread left=new Thread(targetOfLeft);
	        Right targetOfRight =new Right(); //right�̵߳�Ŀ����� 
	        Thread right=new Thread(targetOfRight);
	        Center targetOfPaper=new Center();
	        Thread center=new Thread(targetOfLeft);
	        left.start();
	        right.start();
	        center.start();
	        while(true){
	          if(targetOfLeft.n==8||targetOfRight.n==8||targetOfPaper.n==8)
	             System.exit(0);
	        }  
	}
}
class Left implements Runnable{
    int n=0;
    public void run(){
        while(true){
            n++;
            System.out.printf("\n%s","��������д��");
            try {  Thread.sleep(800);
            }
            catch(InterruptedException e) {}
        }
    }
}
class Right implements Runnable{
    int n=0;
    public void run(){
        while(true){
            n++;
            System.out.printf("\n%40s","��������д��");
            try {  Thread.sleep(800);
            }
            catch(InterruptedException e) {}
        }
    }
}
class Center implements Runnable{
	int n=0;
	public void run() {
		while(true) {
			n++;
			System.out.printf("\n%40s","�����м�д��");
			try { Thread.sleep(800);
		    }
			catch(InterruptedException e) {}
		}
	}
}