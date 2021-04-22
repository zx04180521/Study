package DailySelect;

public class day02_2 {
    public static void main(String[] args) {
        Qq qq=new Qq();

    }
}
class Q{
    public Q(){
        System.out.println("父类构造方法");
    }
}
class Qq extends Q{
    public Qq(int q){
        System.out.println("子类含参构造方法");
    }
    public Qq(){
        this(1);
        System.out.println("子类构造方法");
    }


}