package five;
/**
 * ���ȱ�дһ��������࣬Ҫ��ó��������3������ķ�����
 * Ȼ��ֱ��������������3�����ࡣ
 * Ҫ����Ӧ�ó����������ʹ����Щ���ഴ����������������ת�Ͷ�����÷���f������g������h������
 * 1806050126
 * @author ���1801����
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