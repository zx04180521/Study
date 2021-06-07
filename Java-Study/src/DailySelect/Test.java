package DailySelect;

public class Test{
    static int cnt = 6;
    static{
        cnt += 9;
    }

    public static void main(String[] args){
        System.out.println("cnt =" + cnt);
    }
    static{
        cnt /=3;
    }
    public static void b(){

    }
    public void c(){

    }

}
class test1{
    public void a(){
        Test.b();
        Test t=new Test();
        t.c();
        t.b();
    }


}