package compile;

import Util.FileUtil;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

//用这个类表示一个完整的编译运行过程
public class Task {
    //此处罗列出需要的临时文件（用于进程间通信） 文件名约定
    //所有的临时文件要放到这个目录中
    private String WORK_DIR;
    //要编译执行的类的名字，影响到源代码的文件名
    private String CLASS = "Solution";
    //要编译执行的文件名
    private String CODE;
    //程序标准输出放置的文件
    private String STDOUT;
    //程序标准错误放置的文件
    private String STDERR;
    //程序编译出错详细信息放置的文件
    private String COMPILE_ERROR;

    public Task(){
        //生成唯一ID,根据这个id拼装出目录的名字
        WORK_DIR="./tmp/"+ UUID.randomUUID().toString()+"/";
        CODE=WORK_DIR+CLASS+".java";
        STDOUT=WORK_DIR+"stdout.txt";
        STDERR=WORK_DIR+"stderr.txt";
        COMPILE_ERROR=WORK_DIR+"compile_error.txt";
    }

    //Question表示用户提交的代码
    //Answer表示代码的编译运行结果
    public Answer compileAndRun(Question question) throws IOException, InterruptedException {
        Answer answer=new Answer();
        File file=new File(WORK_DIR);
        if(!file.exists()){
            //创建对应的目录
            file.mkdirs();
        }
        //1.先准备需要用到的临时文件
        //  要编译的原代码的文件
        //  编译出错要放到一个文件中
        //  最终的运行标准输出 标准错误分别放到文件中
        FileUtil.writeFile(CODE,question.getCode());
        //2.构造编译指令(javac),并进行执行，预期得到的结果
        //  就是一个.class文件，以及编译出错文件
        //-d 表示 生成的 .class 文件的放置位置
        // javac -encoding utf-8 ./tmp/UUID/Solution.java -d ./tmp/UUID/
        String compileCmd=String.format("javac -encoding utf-8 %s -d %s",CODE,WORK_DIR);
        System.out.println(compileCmd);
        CommandUtil.run(compileCmd,null,COMPILE_ERROR);
        //此处需要判断一下编译是否出错，判断COMPILE_ERROR是否为空即可
        String compileError=FileUtil.readFile(COMPILE_ERROR);
        if(!compileError.equals("")){
            //得到的compileError不为空，说明编译出错
            answer.setError(1);
            answer.setReason(compileError);
            return answer;
        }
        //3.构造运行指令(java)，并进行执行，预期得到的结果
        //  就是这个代码标准输出文件 和 标准错误文件
        String runCmd=String.format("java -classpath %s %s",WORK_DIR,CLASS);
        System.out.println(runCmd);
        CommandUtil.run(runCmd,STDOUT,STDERR);
        String runErr=FileUtil.readFile(STDERR);
        if(!runErr.equals("")){
            answer.setError(2);
            answer.setReason(runErr);
            return answer;
        }
        //4.把最终结果构造成 Answer 对象，并返回
        String stdOut=FileUtil.readFile(STDOUT);
        answer.setError(0);
        answer.setStdout(stdOut);
        return answer;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Task task=new Task();
        Question question=new Question();
        question.setCode("public class Solution {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"hello\");\n" +
                "    }\n" +
                "}");
        System.out.println(task.compileAndRun(question));
    }
}
