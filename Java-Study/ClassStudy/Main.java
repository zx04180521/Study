package ClassStudy;

public class Main {
    public static void main(String[] args) {
        System.out.println(Test.count);
        Test.change();
        System.out.println(Test.count);
    }
}

class Test {
    public static int count=10;
    public  int a=10;
    public  static void change(){
        count=100;
        //a=100;报错，静态方法不可以访问非静态数据成员
    }
}
