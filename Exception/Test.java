package Exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        func1();//简单异常捕获
//        func2();//显示异常详情
//        fun3();//捕获多个异常
//        fun4();//捕获所有异常
//        fun5();//加上finally善后工作
    }

    private static void fun5() {
        try {
//            System.out.println("异常前");
            int[] a = {1, 2, 3};
            System.out.println(a[100]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally code");
        }
        //已上代码可写成以下代码
        //将Scanner对象在try()中创建,就能保证在try执行完毕后自动调用Scanner的close方法
        try (Scanner scanner = new Scanner(System.in)) {
            int[] a = {1, 2, 3};
            System.out.println(a[100]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }

    private static void fun4() {
        try {
            System.out.println("异常前");
            int[] a = {1, 2, 3};
            System.out.println(a[100]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("异常后");
    }

    private static void fun3() {
        try {
            int[] a = null;
            System.out.println(a[100]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("这里是数组下标越界异常");
            e.printStackTrace();

        } catch (NullPointerException e) {
            System.out.println("这里是空指针异常");
            e.printStackTrace();
        }
//        catch (ArrayIndexOutOfBoundsException|NullPointerException e)//以上两种捕获可直接这么写
        System.out.println("捕获异常后");
    }

    private static void func2() {
        try {
            System.out.println("异常前");
            int[] a = {1, 2, 3};
            System.out.println(a[100]);//下标越界
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();//显示异常
        }
        System.out.println("异常后");
    }

    private static void func1() {
        try {
            System.out.println("异常前");
            int[] a = {1, 2, 3};
            System.out.println(a[100]);//下标越界
            System.out.println("异常后");//不执行
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("异常");
        }
    }
}