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
        File dir=new File("E:/ch8"); //����д��D:\ch9������д��D:\\ch9��D/ch9
        FileAccept acceptCondition=new FileAccept("java");
        File fileName[]=dir.listFiles(acceptCondition);
        for(int i=0;i<fileName.length;i++){
            System.out.printf("\n�ļ�����:%s,����:%d", 
                              fileName[i].getName(),fileName[i].length());
        }
        boolean boo=false;
        if(fileName.length>0)
            boo=fileName[0].delete();
        if(boo)
            System.out.printf("\n�ļ�:%s��ɾ��:",fileName[0].getName());
    }
}