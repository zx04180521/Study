package six;
/**
 * 用户从键盘输入一行含有数字的字符串，程序输出该字符串中全部数字字符。
 * @author 软件1801张鑫
 * @ID 1806050126
 */
import java.util.Scanner;

public class Test6_1 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("输入一行包含数字的字符串：");
Scanner s1=new Scanner(System.in);
String a=s1.nextLine();
String regex="\\D+";
String b[]=a.split(regex);
for(int i=0;i<b.length;i++) {
	System.out.print(b[i]);
	
}
	}

}
