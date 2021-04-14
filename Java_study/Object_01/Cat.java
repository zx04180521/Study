package Object_01;

public class Cat extends Animal {

    public Cat(){

    }
    public Cat(String name) {
        super(name);

    }

    public void eat(String food) {
        System.out.println("我是小猫");
        System.out.println(name + "在吃" + food);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public void jump() {
        System.out.println(super.name + "正在跳");

    }
}
