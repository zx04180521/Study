package five;
/**
 * ���ȱ�дһ���࣬Ҫ�����ʵ��һ���ӿڣ��ýӿ���3������ķ�����
 * Ҫ����Ӧ�ó����������ʹ�ø��ഴ�����󣬲�ʹ�ýӿڻص������÷���f������g������h������
 * 1806050126
 * @author ���1801����
 *
 */
public class Test5_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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