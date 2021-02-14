package zhangxin;
/**
 * 文件输入流
 * @author 张鑫
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Zx1_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
File f=new File("1.txt");
FileInputStream in=null;
try {
	in=new FileInputStream(f);
	byte b[]=new byte[1024];
	in.read(b);
	System.out.println(new String(b));
} catch (FileNotFoundException e) {
	// TODO 自动生成的 catch 块
	e.printStackTrace();
} catch (IOException e) {
	// TODO 自动生成的 catch 块
	e.printStackTrace();
}
	}

}
