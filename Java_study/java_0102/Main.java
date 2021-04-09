package java_0102;

import com.sun.media.jfxmediaimpl.HostUtils;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("小黑", "鱼");
        Cat cat2 = new Cat("小白", "肉");
        System.out.println(cat1);
        System.out.println(Cat.a++);
        System.out.println(Cat.a);
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        System.out.println(cat3.b++);
        System.out.println(cat4.b);
    }
}

