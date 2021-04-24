package DailySelect;

class HelloA{
    public HelloA()
    {
        System.out.println("I’m A class ");
    }
    static
    {
        System.out.println("static A");
    }
}
public class HelloB extends HelloA{
    HelloA a=new HelloA();
    public HelloB()
    {
        System.out.println("I’m B class");
    }
    static{
        System.out.println("static B");
    }

    public static void main (String[] args){
        new HelloB();
    }
}