package five;
/**
 * 首先编写一个抽象的类，要求该抽象的类有3个抽象的方法：
 * 然后分别给出这个抽象类的3个子类。
 * 要求：在应用程序的主类中使用这些子类创建对象，再让它们上转型对象调用方法f（）、g（）和h（）；
 * 1806050126
 * @author 软件1801张鑫
 *
 */
public class Test5_2 {

	public static void main(String[] args) {
Aa a;
a=new Bb();
a.f(4);
a.f(5,4);
a.h(1.2);
	}

}
abstract class Aa
{
	public abstract void f(int x);
	public abstract void f(int x,int y);
	public abstract double h(double x);
}
class Bb extends Aa
{
	public void f(int x) {
		System.out.println(x);
	}

	public void f(int x, int y) {
		
		System.out.printf("x=%d y=%d\n",x,y);
		
	}

	public double h(double x) {
		System.out.println(x);
		return 0;
	}

}