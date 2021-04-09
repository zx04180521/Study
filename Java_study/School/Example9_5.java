package nine;

import java.io.*;
public class Example9_5{
    public static void main(String args[ ]){
        File readFile=new File("Student.txt"), writeFile=new File("ello.txt");
        try{  FileReader inOne=new FileReader("Student.txt");
             BufferedReader inTwo= new BufferedReader(inOne);
             FileWriter tofile=new FileWriter("ello.txt");
             BufferedWriter out= new BufferedWriter(tofile);
             String s=null;
             int i=0;
             while((s=inTwo.readLine())!=null){
                 i++;
                 out.write(i+" "+s);
                 out.newLine();
             }
             out.flush();
             out.close();
             tofile.close();
             inOne=new FileReader("ello.txt");
             inTwo= new BufferedReader(inOne);
             while((s=inTwo.readLine())!=null){
                System.out.println(s);
             } 
             inOne.close();
             inTwo.close();
        }
        catch(IOException e){
             System.out.println(e);
        }  
    }
}