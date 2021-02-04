package three;

public class Test3_1 {
	/**
	 * 使用while 循环语句计算1-1000之间能被3和7同时整除的整数之和。
	 * @author 软件1801张鑫
	 * ID:1806050126
	 */
	public static void main(String[] args) {
	int sum=0;
	int i=1;
while(i<=1000)
{
	if(i%3==0&&i%7==0){
		sum=sum+i;
		
	
	}
		i++;
	
}
	System.out.println("sum="+sum);
}
}
