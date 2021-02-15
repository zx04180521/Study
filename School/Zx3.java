package zhangxin3;
/**
 * 冒泡排序法
 */
import java.util.Scanner;

public class Zx3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] boy= new int[10];
		int i;
		int j;
		int k;
		@SuppressWarnings("resource")
		Scanner sa =new Scanner(System.in);
        System.out.println("请输入十个数：");
	for(i=0;i<10;i++) {
		boy[i]=sa.nextInt();
	}
	
	for(i=0;i<9;i++) {
		for(j=0;j<9-i;j++) {
			if (boy[j]<boy[j+1]) 
			{
				k=boy[j];
				boy[j]=boy[j+1];
				boy[j+1]=k;
				
			}
			
			
		}}
	
	
	
	
	for(i=0;i<10;i++) {
		
		System.out.println(boy[i]);
	}
	}

}
