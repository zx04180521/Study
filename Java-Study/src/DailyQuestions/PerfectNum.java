package DailyQuestions;
/*完全数
*  完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加1+2+4+7+14=28。
输入n，请输出n以内(含n)完全数的个数。计算范围, 0 < n <= 500000*/
import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int res = perfectNum(num);
            System.out.println(res);
        }
    }

    public static int perfectNum(int num) {
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            ArrayList<Integer> list = sub(i);
            int sum = 0;
            for (int j = 0; j < list.size(); j++) {
                sum += list.get(j);
            }
            if (sum == i) {
                count++;
            }
        }
        return count;
    }

    //获取因子
    public static ArrayList<Integer> sub(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//将1添加到因子中
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }
        return list;
    }
}
