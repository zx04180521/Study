package Object_01;

//final表示该类不能被继承
final public  class Bird extends Animal {
    public Bird(String name){
        this.name=name;
    };

    public void fly(){

        System.out.println(name+"正在飞");
    }
}
