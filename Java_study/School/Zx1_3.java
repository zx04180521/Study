package zhangxin;
/**
 * �ļ������
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Zx1_3{

	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args)  {
		// TODO �Զ����ɵķ������

	File f=new File("1.txt");
	try {
		FileOutputStream out=new FileOutputStream(f);
		
		byte b[]="�������ɼ��賿4���������".getBytes();
		out.write(b);
	} 
	catch (FileNotFoundException e)
	{		
		e.printStackTrace();
	} 
	
catch (IOException e)
	{
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}

}
}
