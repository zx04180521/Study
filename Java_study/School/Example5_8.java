package five;
/**
 * ��ת�Ͷ���
 * @author ����
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
	System.out.printf("����ļ̳з���f������n=%f,m=%d\n",n,m);}
	void g() {
		System.out.printf("��ã�n=%f,m=%d\n",n,m);
	
}                          

}
class B extends A{
	int n=12;
	void g() {
		System.out.printf("������д����g������n=%d,m=%d\n",n,m);
	}
	void cry() {
		
		System.out.printf("��������������n=%d,m=%d\n",n,m);
	}
}
