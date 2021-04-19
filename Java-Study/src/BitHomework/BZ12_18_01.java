package BitHomework;

import java.util.Scanner;

public class BZ12_18_01 {
    public static void main(String[] args) {
        //数组偶数元素位于奇数元素之后
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
//        parity(arr);


        //求三个数的最大值
//        Scanner sc=new Scanner(System.in);
//        System.out.print("请输入第一个数：");
//        int a1=sc.nextInt();
//        System.out.print("请输入第二个数：");
//        int a2=sc.nextInt();
//        System.out.print("请输入第三个数：");
//        int a3=sc.nextInt();
//        System.out.println("三个数中最大的是："+max3(a1,a2,a3));


        //最大值重载
//        Scanner sc=new Scanner(System.in);
//        System.out.print("请输入第一个整数：");
//        int a1=sc.nextInt();
//        System.out.print("请输入第二个整数：");
//        int a2=sc.nextInt();
//        System.out.print("请输入第一个小数：");
//        double b1=sc.nextDouble();
//        System.out.print("请输入第二个小数：");
//        double b2=sc.nextDouble();
//        System.out.println("整数中最大值："+max(a1,a2));
//        System.out.println("小数中最大值："+max(b1,b2));
//        System.out.printf("两个小数和一个整数的大小关系：");
//        relation(b1,b2,a1);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入第一个整数：");
//        int a1 = sc.nextInt();
//        System.out.print("请输入第二个整数：");
//        int a2 = sc.nextInt();
//        System.out.print("请输入第一个小数：");
//        double b1 = sc.nextDouble();
//        System.out.print("请输入第二个小数：");
//        double b2 = sc.nextDouble();
//        System.out.print("请输入第三个小数：");
//        double b3 = sc.nextDouble();
//        System.out.println("整数和：" + sum(a1, a2));
//        System.out.println("小数和" + sum(b1, b2, b3));


    }
    //================================方法实现===============================


    private static int sum(int a1, int a2) {
        return a1 + a2;
    }

    private static double sum(double a1, double a2, double a3) {
        return a1 + a2 + a3;
    }


    //数组偶数元素位于奇数元素之后
    public static void parity(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] % 2 == 0) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    //最大值重载
    public static void relation(double a1, double a2, int b1) {
        double ma1 = a1 > a2 ? a1 : a2;
        double ma2 = ma1 > b1 ? ma1 : b1;//最大值
        double mi1 = a1 > a2 ? a2 : a1;
        double mi2 = mi1 > b1 ? b1 : mi1;//最小值
        double mid = a1 + a2 + b1 - ma2 - mi2;
        System.out.println(mi2 + "<" + mid + "<" + ma2);
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }


    //求三个数的最大值
    public static int max3(int n1, int n2, int n3) {
        int m1 = max2(n1, n2);
        return max2(m1, n3);

    }

    private static int max2(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }


}



