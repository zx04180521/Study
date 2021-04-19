package five;
/**
 * 上转型对象
 * @author 张鑫
 *
 */
public class Example5_8 {

	public static void main(String[] args) {
		A a=new  B();
		a.n= 1.3;
		a.m=200;
		a.f();
		a.g();
		B b=(B)a;
		b.n=555;
		b.cry();
		

	}

}
class A
{
double n;
int m;
void f() {
	System.out.printf("子类的继承方法f（）。n=%f,m=%d\n",n,m);}
	void g() {
		System.out.printf("你好，n=%f,m=%d\n",n,m);
	
}                          

}
class B extends A{
	int n=12;
	void g() {
		System.out.printf("子类重写方法g（），n=%d,m=%d\n",n,m);
	}
	void cry() {
		
		System.out.printf("子类新增方法，n=%d,m=%d\n",n,m);
	}
}
