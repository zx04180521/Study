package five;
/**
 * 首先编写一个类，要求该类实现一个接口，该接口有3个抽象的方法：
 * 要求：在应用程序的主类中使用该类创建对象，并使用接口回调来调用方法f（）、g（）和h（）；
 * 1806050126
 * @author 软件1801张鑫
 *
 */
public class Test5_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Q q=new W();
q.f(4);
q.f(5, 6);
q.h(1.2);
	}

}
interface Q
{
	public abstract void f(int x);
	public abstract void f(int x,int y);
	public abstract double h(double x);
}
class W implements Q
{
	public void f(int x) {
		System.out.println(x);
	};
	public void f(int x,int y) {
		System.out.printf("x=%d y=%d\n",x,y);
	};
	public double h(double x) {
		System.out.println(x);
	return 0;
	};
}