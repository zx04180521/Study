package compile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CommandUtil {
    //run方法主要用于进行创建线程并执行命令
    //cmd表示要执行的命令，比如javac
    //stdoutFile指定标准输出写到哪个文件
    //stderrFile指定标准错误写到那个文件中
    public static int run(String cmd, String stdoutFile,
                          String stderrFile) throws IOException, InterruptedException {
        //java中对于多进程的操作比较粗糙，不方便进行精细化的操作
        //但是当前业够用
        //使用Runtime这样的类来创建进程
        //注意Runtime比较特殊，使用的时候不需要手动创建实例，而是使用现有的实际就可以了
        //一个java程序中，Runtime的实例只有一个，不应该有多个，成为"单例模式"
        //Process对象其实就是用来表示新创建出来的进程
        //新进程创建出来之后，新的进程和当前的进程是一个并列关系，并发执行，
        // 但是执行的先后顺序不确定
        Process process=Runtime.getRuntime().exec(cmd);
        //当新的进程跑起来时候。就需要获取新的进程的输出结果
        if(stdoutFile!=null) {
            //读入写出
            //getInputStream()得到的标准输出
            // 通过这个对象，就可以读取到新进程的标准输出内容
            InputStream stdoutFrom = process.getInputStream();

            FileOutputStream stdoutTo=new FileOutputStream(stdoutFile);
            //接下来就从新进程一次读取每个字节，写入到stdoutFile文件中
            while(true){
                int c=stdoutFrom.read();
                if(c==-1){
                    break;
                }
                stdoutTo.write(c);
            }
            //文件读写完毕，关闭文件
            stdoutFrom.close();
            stdoutTo.close();
        }
        if(stderrFile!=null){
            //getErrorStream()得到的是标准错误
            InputStream stderrFrom=process.getErrorStream();
            FileOutputStream stderrTo=new FileOutputStream(stderrFile);
            while(true){
                int c=stderrFrom.read();
                if(c==-1){
                    break;
                }
                stderrTo.write(c);
            }
            stderrFrom.close();
            stderrTo.close();
        }
        //等待新进程结束并获取到退出码
        int exitCode=process.waitFor();
        return exitCode;
    }

    public static void main(String[] args) {
        try {
            int ret=run("javac","./stdout.txt","./stderr.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
