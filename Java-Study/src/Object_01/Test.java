package Object_01;
/*
*动态绑定
**/

class A {
    public A() {
        fun();//触发动态绑定，调用A里面的fun
    }

    public void fun() {
        System.out.println("A.fun");
    }
}

class B extends A {
    int num = 1;
    public void fun(){
        System.out.println("B.fun "+num);
    }
}
public class Test {
    public static void main(String[] args) {
        B t = new B();
    }
}
