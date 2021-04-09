package LeetCode;

import java.util.Arrays;

/*
* 打印从1到最大的n位数
* 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
* 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
* */
public class Offer_17 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(2)));
    }
    public static int[] printNumbers(int n) {
        int a=(int)Math.pow(10, n) - 1;
        int[] result=new int[a];
        for(int i=0;i<a;i++){
            result[i]=i+1;
        }
        return result;
    }
}
