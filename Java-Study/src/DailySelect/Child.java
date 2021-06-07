package DailySelect;

class Person{
    private String name = "Person";
    int age=0;
}
public class Child extends Person{
    public String grade;
    int a=0;
    public static void main(String[] args){
        Person p = new Child();
        System.out.println(p.age);
    }
}
