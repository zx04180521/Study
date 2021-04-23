package DailySelect;

public class day02_3 {
    static int i=0;
    public static int test() {

//        int i = 0;
        i++;
        return i;
    }

    public static void main(String[] args) {
        day02_3 test = new day02_3();
        test.test();
        int j = test.test();
        System.out.println(j);
    }
}
