package DailyQuestions;
/*数字颠倒*/
import java.util.Scanner;

public class NumReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=n+"";
        StringBuffer strBuf=new StringBuffer(str);
        strBuf.reverse();
        System.out.println(strBuf);
    }
}
