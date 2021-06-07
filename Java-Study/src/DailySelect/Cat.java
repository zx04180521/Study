package DailySelect;

abstract class Animal {
    abstract void say();
    abstract void say1();
}

public class Cat extends Animal {
    public Cat() {
        System.out.printf("I am a cat");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
    }

    @Override
    void say() {

    }

    @Override
    void say1() {

    }
}
