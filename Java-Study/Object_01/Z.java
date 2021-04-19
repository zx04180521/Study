package Object_01;

/*
 *类执行顺序
 **/
public class Z extends X {   Y y = new Y();
    {
        System.out.println("z代码块");
    }



    public Z() {
        System.out.println("Z构造方法");
    }


    public static void main(String[] args) {
        new Z();
    }
}

class X {
    public X() {
        System.out.println("x构造方法");
    }

    Y y = new Y();


}

class Y {
    public Y() {
        System.out.println("y构造方法");
    }
}
