package compile;

//表示编译运行的结果
public class Answer {
    //这里的字段就是最终反馈到页面的信息
    //运行结果是否正确
    // 0表示编译运行正常，1 表示编译运行出错，2 表示运行异常
    private int error;
    //如果出错了，原因是什么
    // error 是 1，reason包含了编译错误的信息
    // error 是 2，reason包含了异常的调用栈信息
    private String reason;
    //程序的标准输出
    private String stdout;
    //程序的标准错误
    private String stderr;
    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStdout() {
        return stdout;
    }

    public void setStdout(String stdout) {
        this.stdout = stdout;
    }

    public String getStderr() {
        return stderr;
    }

    public void setStderr(String stderr) {
        this.stderr = stderr;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "error=" + error +
                ", reason='" + reason + '\'' +
                ", stdout='" + stdout + '\'' +
                ", stderr='" + stderr + '\'' +
                '}';
    }
}
