package zhangxin;
/**
 * �ļ�������
 * @author ����
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Zx1_4 {

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
