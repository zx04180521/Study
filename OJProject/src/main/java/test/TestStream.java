package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream
                =new FileOutputStream("test.txt");
        byte[] a1="hello".getBytes();
        fileOutputStream.write(a1);
        fileOutputStream.close();


        FileInputStream fileInputStream=new FileInputStream("test.txt");
        while(true) {
            int c = fileInputStream.read();
            if(c==-1){
                //c是读取到的字节，读取完毕会返回-1
                break;
            }
            System.out.print((char)c);
        }
        fileInputStream.close();
    }
}
