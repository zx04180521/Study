package three;

public class Test3_1 {
	/**
	 * ʹ��while ѭ��������1-1000֮���ܱ�3��7ͬʱ����������֮�͡�
	 * @author ���1801����
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
