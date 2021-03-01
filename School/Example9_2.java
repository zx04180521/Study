package nine;

import java.awt.*;
import java.io.*;
public class Example9_2{
    public static void main(String args[]){
        try{  Runtime ce=Runtime.getRuntime();
              ce.exec("javac Example9_1.java");
              File file=new File("C:\\windows","Notepad.exe");
              ce.exec(file.getAbsolutePath());
        }
        catch(Exception e){System.out.println("cuo");} 
    } 
}
