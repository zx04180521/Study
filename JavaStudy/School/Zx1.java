package zhangxin;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Zx1 {

	
	public static void main(String[] args) {
		
		File dir=new File("8.java");
		
		try {
			@SuppressWarnings("unused")
			FileOutputStream out=new FileOutputStream(dir);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	}