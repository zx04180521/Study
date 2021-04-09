package four;

public class Test4_1 {
	/**
	 * 编写一个类，该类创建的对象可以输出英文字母表。
	 * @author 软件1801张鑫
	 * ID:1806050126
	 */
	public static void main(String args[]){
	Zimu z=new Zimu();	
	z.put();
	}

}	
 class Zimu {
 int a=65;
 int i;
 void put(){
	for(i=0;i<26;i++){
	 System.out.print((char)(a+i));
	 System.out.print((char)(a+i+32));
	}
 }
}
