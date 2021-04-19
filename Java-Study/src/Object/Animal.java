package Object;


public class Animal {

    public String name;


    public Animal(String name) {
        this.name = name;

    }

    public void eat(String food) {
        System.out.println("我是小动物");
        System.out.println(name + "正在吃" + food);
    }

}

