package nine;

/**
 * �ļ�������
 * @author ���1801 ����
 * @ ID 1806050126
 *
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test9_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
File f=new File("1.txt");
FileInputStream in=null;
try {
	in=new FileInputStream(f);
	byte b[]=new byte[1024];
	in.read(b);
	System.out.println(new String(b));
} catch (FileNotFoundException e) {
	// TODO �Զ����ɵ� catch ��
	e.printStackTrace();
} catch (IOException e) {
	// TODO �Զ����ɵ� catch ��
	e.printStackTrace();
}
	}

}
