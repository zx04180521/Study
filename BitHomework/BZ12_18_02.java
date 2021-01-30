package BitHomework;

import java.util.Scanner;

public class BZ12_18_02 {
    public static void main(String[] args) {
        //只有一个元素没有重复，找出这个元素
//        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5};
//        frequency(arr);


        //求斐波那契数列第n项
        Scanner scanner = new Scanner(System.in);
        System.out.print("您要查询第几项：");
        int n = scanner.nextInt();
        //System.out.printf("1.递归，数列的第%d项是：%d\n", n, fs1(n));
        System.out.printf("2.循环，数列的第%d项是：%d", n, fs2(n));

        //阶乘求和
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("您要计算几项阶乘和：");
//        int n=scanner.nextInt();
//        System.out.printf("1-%d项的阶乘和是：%d",n,FactorialSum(n));
    }


    //================================方法实现===============================


    //阶乘求和
    public static int Factorial(int i) {
        int f = 1;
        for (int j = 1; j <= i; j++) {
            f = f * j;
        }
        return f;
    }

    private static int FactorialSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + Factorial(i);
        }
        return sum;
    }


    //斐波那契数列
    public static long fs2(int n) {
        long a1 = 1;
        long a2 = 1;
        long a3 = 0;
        if (n <= 2) {
            return 1;
        } else {
            for (int i = 0; i < n - 2; i++) {
                a3 = a1 + a2;
                a1 = a2;
                a2 = a3;

            }

        }
        return a3;
    }

    public static long fs1(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fs1(n - 1) + fs1(n - 2);
        }


    }


    public static void frequency(int[] a) {
        for (int i = 0; i < a.length; i++) {

            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) count++;
            }
            if (count == 1) System.out.println(a[i]);

        }
    }
}
