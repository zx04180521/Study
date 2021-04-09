package three;

public class Test3_2 {
/**
 * 计算1+2！++3！+4！.......从第10项到第20项之和。
 * @author 软件1801张鑫
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
