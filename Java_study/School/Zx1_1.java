package zhangxin;
/**
 * �����ı�
 * @author ����
 */
import java.util.Scanner;

public class Zx1_1 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
Scanner reader=new Scanner(System.in);
String s=reader.nextLine();
char a[]=s.toCharArray();
for(int i=0;i<a.length;i++) {
	a[i]=(char)(a[i]^'w');
}
String secret=new String(a);
System.out.println("����"+secret);
for(int i=0;i<a.length;i++) {
	a[i]=(char)(a[i]^'w');
}
String se=new String(a);
System.out.println("ԭ��"+se);
	}

}
