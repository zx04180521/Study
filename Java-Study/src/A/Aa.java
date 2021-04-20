package A;

public class Aa extends Ba {
    public int aa = 1;

    public static void main(String[] args) {
        int i=0;
        for (; i < 10; i++) {
            System.out.println(i);
//            break;
        }
        System.out.println(i);

//        Ba a=new Aa();

        //    System.out.println(a.aa);
//        System.out.println(a.bb);
    }
}

class Ba {
    public int bb = 0;

}
