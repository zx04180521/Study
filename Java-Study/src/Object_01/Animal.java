package Object_01;


public class Animal {

    public String name;


    public Animal(String name) {
        this.name = name;

    }

    public Animal() {

    }

    public void eat(String food) {
        System.out.println("我是小动物");
        System.out.println(name + "正在吃" + food);
    }

}

