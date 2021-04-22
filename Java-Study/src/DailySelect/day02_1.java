package DailySelect;

public class day02_1 {
    public static void main(String[] args) {
        M m=new M();
        m.m();
        M.m();
        m.mm();
//        M.mm();//错误
    }
}

//使用类名和对象分别调用类方法和实例方法
class M{
    public static void m(){
        System.out.println("a");
    }
    public void mm(){
        System.out.println("aa");
    }
}
