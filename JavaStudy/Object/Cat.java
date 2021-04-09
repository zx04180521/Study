package Object;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);

    }

    public void eat(String food) {
        System.out.println("我是小猫");
        System.out.println(name + "在吃" + food);
    }

    public void jump() {
        System.out.println(super.name + "正在跳");

    }
}
