package five;

public class Test5_1 {

	/**
	 * 编写一个类，该类有如下一个方法：
public  int f（int a，int b）{}//要求返回a和b的最大公约数再编写一个该类的子类
 要求子类重写方法f（）而且重写的方法将返回两个整数的最小公倍数。
要求：在重写的方法的方法体中首先调用被隐藏的方法返回a和b 的最大公约数m，然后将（a*b）/m返回；
在应用程序的主类中分别使用父类和子类创建对象，并分别调用方法f（）计算两个正整数的最大公约数和最小公倍数。
	 * @author 软件1801张鑫
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