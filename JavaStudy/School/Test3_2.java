package three;

public class Test3_2 {
/**
 * ����1+2��++3��+4��.......�ӵ�10���20��֮�͡�
 * @author ���1801����
 * ID:1806050126
 */
	public static void main(String[] args)
	{
		
		 int i,j;
		 int p=1;
		 int sum=0;
		 
		 for(i=10;i<=20;i++)
		 {
			 for(j=1;j<=i;j++)
			 {
				 p=p*j;
				 
			 }
			 
			 sum=sum+p;
			 
		 }
		
		System.out.println(sum);
		
	}

}
