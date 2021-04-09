package five;
/**
 * 类实现接口
 * @author 张鑫
 *
 */
public class Example5_11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Aa a=new Aa();
Bb b=new Bb();
System.out.println(a.MAX);
System.out.println(a.f(10)+" "+a.g(12, 6));
System.out.println(b.MAX);
System.out.println(b.f(10)+" "+b.g(4, 8));
	}

}
interface Computable{
	final int MAX=100;
	int f(int x);
	public abstract int g(int x,int y);
}
class Aa implements Computable{
	public int f(int x) {
		return x*x;}
		public int g(int x,int y) {
			return x+y;
	}
}
class Bb implements Computable{
	public int f(int x) {
		return x*x*x;
	}
	public int g(int x,int y) {
		return x*y;
	}
	
}















