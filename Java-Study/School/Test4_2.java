package four;

public class Test4_2 {
	/**
	 * 
��дһ�������ࣺA��B��A�����Ķ�����Լ������������������Լ����B�����Ķ�����Լ�����������С��������Ҫ��B������һ����Ա��������A����������
	 * @author ���1801����
	 * ID:1806050126
	 */
	public static void main(String[] args) {
		int p;
		A ma=new A();
		ma.max(18,18);
		p=ma.p;
		System.out.println(p);
		B mi=new B();
		mi.min(12, 6);
	}
}
class A
{
	int p;
int max(int a,int b)
{
	int m = 1;
if(a>b){
	while(m!=0){
		m=a%b;
		a=b;
		b=m;
		
	}
p=a;

	}
if(a<b){
	
	while(m!=0){
		m=b%a;
		b=a;
		a=m;
		
	}
	p=b;
	
}
if (a==b){
	p=a;
	
}
return p;
}	
	
}
class B
{
void min(int a,int b)
{
	int m;
	A ma=new A();
	ma.max(a, b);
	m=a*b/ma.p;
	System.out.println(m);
}	
}

