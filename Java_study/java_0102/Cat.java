package java_0102;

public class Cat {
    public String name;
    public String food;
    public static int a=1;
    public int b=1;
    static{
        System.out.println("这里是静态代码块");
    }
    {
        System.out.println("这里是代码块");
    }

    public Cat() {

    }

    public Cat(String name, String food) {
        this.name = name;
        this.food = food;
        eat(name,food);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
    public static void eat(String name, String food){
        System.out.println(name+"吃"+food);
    }
}
