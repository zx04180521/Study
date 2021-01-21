package Object;
/*
*看静态代码块、普通代码块、代码块之间的执行顺序
**/

class Aa{
    public Aa(){
        System.out.println("执行父类Aa构造方法");
    }
    static {
        System.out.println("执行父类Aa静态代码块");
    }
    {
        System.out.println("执行父类Aa普通代码块");
    }
}
class Aaa extends Aa{
    public Aaa(){
        System.out.println("执行子类Aaa构造方法");
    }
    static {
        System.out.println("执行子类Aaa静态代码块");
    }
    {
        System.out.println("执行子类Aaa普通代码块");
    }
}

public class Static {
    public static void main(String[] args) {
        Aaa a=new Aaa();
        System.out.println("=================");
        Aaa a1=new Aaa();
    }
}
