package seven;
/**
 * 编写一个程序，输出某年某月的日历页，通过main方法的参数将年和月传递到程序中。
 * @ID 1806050126
 * @author 软件1801张鑫
 */
import java.util.*;

public class Test7_1 {

	public static void main(String[] args) {
		Calendar 日历 = Calendar.getInstance();
		日历.set(2000,9,1);//2000年10月1
		int 星期几=日历.get(Calendar.DAY_OF_WEEK)-1;
		String a[]=new String[星期几+31];
				for(int i=0;i<星期几;i++) {
					a[i] =" ";
				}
		for(int i=星期几,n=1;i<星期几+31;i++) {
			 a[i]=String.valueOf(n) ;
			n++;
		}
	
System.out.printf("%6c%6c%6c%6c%6c%6c%6c\n",'日','一','二','三','四','五','六');
for(int i=0;i<a.length;i++){
	if(i%7==0&&i!=0)
		System.out.println("\n");
	System.out.printf("%3s",a[i]);
}
	}

}
