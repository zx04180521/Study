package four;

public class Test4_1 {
	/**
	 * ��дһ���࣬���ഴ���Ķ���������Ӣ����ĸ��
	 * @author ���1801����
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
