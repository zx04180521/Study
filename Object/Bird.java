package Object;

//final表示该类不能被继承
final public  class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    public void fly(){
        System.out.println(name+"正在飞");
    }
}
