package six;
/**
 * �û��Ӽ�������һ�к������ֵ��ַ���������������ַ�����ȫ�������ַ���
 * @author ���1801����
 * @ID 1806050126
 */
import java.util.Scanner;

public class Test6_1 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("����һ�а������ֵ��ַ�����");
Scanner s1=new Scanner(System.in);
String a=s1.nextLine();
String regex="\\D+";
String b[]=a.split(regex);
for(int i=0;i<b.length;i++) {
	System.out.print(b[i]);
	
}
	}

}
