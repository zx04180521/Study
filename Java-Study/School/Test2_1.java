package two;

import java.util.Scanner;

public class Test2_1 {

	/**
	 * ��дһ��JavaӦ�ó����û��Ӽ���ֻ���������������������Щ�����ĳ˻���
	  * @author ���1801����
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
			 System.out.println("�������"+a+"����");
			 	first=scan.nextInt();
			 	sum=first*sum;
				 a++;
			 }
			 System.out.println(sum);

			}

	}

