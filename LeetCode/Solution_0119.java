package LeetCode;

import java.util.Arrays;

public class Solution_0119 {
    public static void main(String[] args) {
        //请实现一个函数，把字符串 s 中的每个空格替换成"%20"
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
        System.out.println(replaceSpace2(s));

        //斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
        //答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1
        System.out.println(fib(6));

        //一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
        //答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
        numWays(6);
    }


    //斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
    //答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1

    public static int fib(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        if (n == 0) return 0;
        else if (n <= 2) return 1;
        else {
            for (int j = 0; j < n - 2; j++) {
                c = a + b;
                a = b;
                b = c % 1000000007;
            }
        }
        return b;
    }

    //请实现一个函数，把字符串 s 中的每个空格替换成"%20"
    private static String replaceSpace2(String s) {
        char[] arr = new char[s.length() * 3];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (' ' == c) {
                arr[size++] = '%';
                arr[size++] = '2';
                arr[size++] = '0';
            } else {
                arr[size++] = s.charAt(i);
            }
        }
        return new String(arr, 0, size);
    }

    public static String replaceSpace(String s) {
        return s.replaceAll(" ", "%20");
    }


    //一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
    //答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

    public static int numWays(int n) {
        int a = 1;
        int b = 1;
        int c = 0;

        if (n < 2) return 1;
        else {
            for (int j = 0; j < n - 1; j++) {
                c = a + b;
                a = b;
                b = c % 1000000007;
            }
        }
        return b;
    }
}


