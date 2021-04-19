package two;

import java.util.Scanner;

public class Test2_1 {

	/**
	 * 编写一个Java应用程序，用户从键盘只能输入整数，程序输出这些整数的乘积。
	  * @author 软件1801张鑫
	 * ID:1806050126
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			int a=1;
			 int  first=0;
		 int sum=1;
			 while(a<4) {
			 System.out.println("请输入第"+a+"个数");
			 	first=scan.nextInt();
			 	sum=first*sum;
				 a++;
			 }
			 System.out.println(sum);

			}

	}

