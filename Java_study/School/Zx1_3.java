package zhangxin;
/**
 * 文件输出流
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Zx1_3{

	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args)  {
		// TODO 自动生成的方法存根

	File f=new File("1.txt");
	try {
		FileOutputStream out=new FileOutputStream(f);
		
		byte b[]="你见过洛杉矶凌晨4点的样子吗".getBytes();
		out.write(b);
	} 
	catch (FileNotFoundException e)
	{		
		e.printStackTrace();
	} 
	
catch (IOException e)
	{
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}

}
}
