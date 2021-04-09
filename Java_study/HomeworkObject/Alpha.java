package HomeworkObject;

class Base {
    Base() {
        System.out.print("Base");
    }
}

public class Alpha extends Base {
    public static void main(String[] args) {
        new Alpha();
        //调用父类无参的构造方法
        new Base();
    }
}
