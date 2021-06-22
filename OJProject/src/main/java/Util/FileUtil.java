package Util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
    public static void writeFile(String filePath,String content){
        FileOutputStream fileOutputStream=null;
        try {
             fileOutputStream=new FileOutputStream(filePath);
             fileOutputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static String readFile(String filePath){
        StringBuffer stringBuffer=new StringBuffer();
        FileInputStream fileInputStream=null;
        try {
             fileInputStream=new FileInputStream(filePath);
             while(true){
                 int c=fileInputStream.read();
                 if(c==-1){
                     break;
                 }
                 //每次read方法只能读取到一个字节
                 //read设计成返回int的原因知识为了能多表示 -1 的情况
                 //把结果往StringBuffer里面插的时候要转成char
                 stringBuffer.append((char)c);
             }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringBuffer.toString();
    }
}
