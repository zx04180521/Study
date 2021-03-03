package nine;

import java.io.*;
public class Example9_3{
    @SuppressWarnings({ "resource", "unused" })
	public static void main(String args[ ]){
        File file=new File("hello.txt");
       byte b[]="qwe".getBytes();    
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
			out.write(b);
			out.close();
			FileInputStream in=new FileInputStream(file);
			byte b2[]=new byte[111];
			in.read(b2);
			System.out.println(new String(b2));
		} 
		catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		

		
}
}
