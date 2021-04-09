package four;
/**
 * 引用类型参数
 * @author 张鑫
 *
 */
public class Example4_8 {

	public static void main(String[] args) {
		Tom cat=new Tom();
		Jerry jerry=new Jerry(2);
		System.out.println("在调用方法f之前，Jerry的成员leg的值："+jerry.getLeg());
        cat.f(jerry);
System.out.println("在调用方法f后，jerry的成员leg的值是："+jerry.getLeg());
	}

}
class Jerry{
	int leg;
	Jerry(int n)
	{		
		leg=n;
	}
	void setLeg(int n) 
	{
		leg=n;
	}
	int getLeg()
	{
		return leg;
	}	
}
class Tom{
	
	void f(Jerry mouse) {
		mouse.setLeg(12);
		System.out.println("在执行方法f时，参数mouse修改了自己的leg的值");
		System.out.println("当前参数mouse的成员leg的值："+mouse.getLeg());
		mouse=null;
		
	}
}
