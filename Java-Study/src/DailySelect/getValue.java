package DailySelect;

public class getValue {
    public static void main(String[] args) {
        int res=getValue(2);
        System.out.println(res);
    }
    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }
}
