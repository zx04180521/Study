package zhangxin;
/**
 * 加密文本
 * @author 张鑫
 */
import java.util.Scanner;

public class Zx1_1 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Scanner reader=new Scanner(System.in);
String s=reader.nextLine();
char a[]=s.toCharArray();
for(int i=0;i<a.length;i++) {
	a[i]=(char)(a[i]^'w');
}
String secret=new String(a);
System.out.println("密文"+secret);
for(int i=0;i<a.length;i++) {
	a[i]=(char)(a[i]^'w');
}
String se=new String(a);
System.out.println("原文"+se);
	}

}
