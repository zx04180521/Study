package DailyQuestions;

import java.util.Scanner;

/*在Fibonacci数列中的数我们称为Fibonacci数。给你一个N，你想让其变为一个Fibonacci数，
每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。*/
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = minStep(num);
        System.out.println(res);
    }

    public static int minStep(int num) {
        if (num <= 3) {
            return 0;
        }
        int fib1 = 0;
        int fib2 = 1;
        int fib3 = 0;
        while(fib3<num) {
            fib3 = fib1 + fib2;//当前项
            fib1 = fib2;//上一项
            fib2 = fib3;
        }
        int res1=fib3-num;
        int res2=num-fib1;
        return res1>res2 ? res2:res1;
    }
}
