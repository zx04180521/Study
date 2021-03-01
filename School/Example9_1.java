package nine;

import java.io.*;
class FileAccept implements FilenameFilter{
    String str=null;
    FileAccept(String s){
       str="."+s;
    }
    public boolean accept(File dir,String name){
       return name.endsWith(str);
    } 
}
public class Example9_1{
    public static void main(String args[ ]){
        File dir=new File("E:/ch8"); //不可写成D:\ch9，可以写成D:\\ch9或D/ch9
        FileAccept acceptCondition=new FileAccept("java");
        File fileName[]=dir.listFiles(acceptCondition);
        for(int i=0;i<fileName.length;i++){
            System.out.printf("\n文件名称:%s,长度:%d", 
                              fileName[i].getName(),fileName[i].length());
        }
        boolean boo=false;
        if(fileName.length>0)
            boo=fileName[0].delete();
        if(boo)
            System.out.printf("\n文件:%s被删除:",fileName[0].getName());
    }
}