package eight;
/**
 * 模仿例子8-4编写三个线程，让它们共享更多的单元。
 * @ID  1806050126
 * @author 软件1801张鑫
 *
 */
public class Test8_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		  Left targetOfLeft =new Left();    //left线程的目标对象
	        Thread left=new Thread(targetOfLeft);
	        Right targetOfRight =new Right(); //right线程的目标对象 
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
            System.out.printf("\n%s","我在左面写字");
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
            System.out.printf("\n%40s","我在右面写字");
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
			System.out.printf("\n%40s","我在中间写字");
			try { Thread.sleep(800);
		    }
			catch(InterruptedException e) {}
		}
	}
}