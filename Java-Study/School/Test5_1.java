package five;

public class Test5_1 {

	/**
	 * ��дһ���࣬����������һ��������
public  int f��int a��int b��{}//Ҫ�󷵻�a��b�����Լ���ٱ�дһ�����������
 Ҫ��������д����f����������д�ķ���������������������С��������
Ҫ������д�ķ����ķ����������ȵ��ñ����صķ�������a��b �����Լ��m��Ȼ�󽫣�a*b��/m���أ�
��Ӧ�ó���������зֱ�ʹ�ø�������ഴ�����󣬲��ֱ���÷���f�����������������������Լ������С��������
	 * @author ���1801����
	 * ID:1806050126
	 */
	public static void main(String[] args) {
		int p;
		int m;
		A ma=new A();
		ma.f(18,6);
		p=ma.p;
		System.out.println(p);
		B mi=new B();
		mi.f(18,6);
	    m=mi.m;
		System.out.println(m);
	}

}
class A
{
	int p;
    public  int f(int a,int b){
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
 class B extends A
{ int m;

	 public  int f(int a,int b)
	 {
		 A ma=new A();
		 ma.f(a, b);
		 m=a*b/ma.p;
		return m;
	 }




}